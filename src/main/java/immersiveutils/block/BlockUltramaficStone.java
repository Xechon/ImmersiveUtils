package immersiveutils.block;

import com.bioxx.tfc.Blocks.Terrain.BlockCollapsible;
import com.bioxx.tfc.Blocks.Terrain.BlockStone;
import com.bioxx.tfc.api.TFCBlocks;
import com.bioxx.tfc.api.TFCOptions;
import immersiveutils.ImmersiveUtilsMod;
import immersiveutils.init.ModBlocks;
import immersiveutils.init.ModItems;
import immersiveutils.ref.StoneType;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Xechon on 1/1/2017.
 */
public abstract class BlockUltramaficStone extends BlockStone {
	public BlockUltramaficStone(String... name) {
		super(Material.rock);
		dropBlock = ModBlocks.cobblestone;
		names = name;
		icons = new IIcon[names.length];
	}
	
	@Override
	public void registerBlockIcons(IIconRegister iconRegisterer) {
		for(int i = 0; i < names.length; i++)
			icons[i] = iconRegisterer.registerIcon(ImmersiveUtilsMod.MOD_ID + ":" + "rocks/"+names[i]+" Raw");
	}
	
	@Override
	public void getSubBlocks(Item par1, CreativeTabs par2CreativeTabs, List par3List) {
		super.getSubBlocks(par1, par2CreativeTabs, par3List);
	}
	
	@Override
	public Item getItemDropped(int i, Random random, int j) {
		return ModItems.looseRock;
	}
	
	@Override
	public int quantityDropped(Random rand) {return rand.nextInt(2) + 1;}
	
	@Override
	public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
		ArrayList<ItemStack> ret = new ArrayList<ItemStack>();
		
		int count = this.quantityDropped(world.rand);
		for (int i = 0; i < count; i++)
		{
			Item item = getItemDropped(metadata, world.rand, fortune);
			if (item != null)
			{
				int dmg = damageDropped(metadata);
				if(this instanceof BlockLamprophyre) {
					if (dmg == 0) ret.add(new ItemStack(item, 1, dmg));
				}
				else ret.add(new ItemStack(item, 1, dmg));
			}
		}
		
		ItemStack gemStack = dropGem(world.rand, metadata);
		if (gemStack != null)
			ret.add(gemStack);
		
		return ret;
	}
	
	@Override
	public void harvestBlock(World world, EntityPlayer entityplayer, int x, int y, int z, int meta) {
		for (ItemStack itemStack : getDrops(world, x, y, z, meta, 0)) {
			dropBlockAsItem(world, x, y, z, itemStack);
		}
		
		//float seismicModifier = 0.2f;
		float softModifier = 0.1f;
		//TFCBiome biome = (TFCBiome) world.getBiomeGenForCoords(x, z);
		int finalCollapseRatio = TFCOptions.initialCollapseRatio > 0 ? TFCOptions.initialCollapseRatio : 10; //Set to default if invalid value is entered in config.
		
		//Make sure that the player gets exhausted from harvesting this block since we override the vanilla method
		if(entityplayer != null)
		{
			entityplayer.addStat(StatList.mineBlockStatArray[getIdFromBlock(this)], 1);
			entityplayer.addExhaustion(0.075F);
		}
		
		//If we are in a soft sedimentary rock layer then we increase the chance of a collapse by 10%
		if(this == TFCBlocks.stoneSed)
			finalCollapseRatio -= finalCollapseRatio * softModifier;
		
		//First we check the rng to see if a collapse is going to occur
		if (TFCOptions.enableCaveIns && world.rand.nextInt(finalCollapseRatio) == 0)
		{
			//Now we look for a suitable block nearby to act as the epicenter
			int counter = 0;
			while(counter < 100)
			{
				int scanX = -4 + world.rand.nextInt(9);
				int scanY = -2 + world.rand.nextInt(5);
				int scanZ = -4 + world.rand.nextInt(9);
				if(world.getBlock(x+scanX, y+scanY, z+scanZ) instanceof BlockCollapsible &&
						((BlockCollapsible)world.getBlock(x+scanX, y+scanY, z+scanZ)).tryToCollapse(world, x+scanX, y+scanY, z+scanZ, 0))
				{
					triggerCollapse(world, entityplayer, x+scanX, y+scanY, z+scanZ, meta);
					return;
				}
				counter++;
			}
		}
	}
	
	@Override
	public void onBlockDestroyedByExplosion(World world, int i, int j, int k, Explosion ex) {
		world.setBlockToAir(i,j,k);
	}
	
	@Override
	public void onBlockExploded(World world, int x, int y, int z, Explosion explosion) {
		if(world.getBlockMetadata(x,y,z) < StoneType.stone.length) {
			super.onBlockExploded(world, x, y, z, explosion);
		}else{
			for (ItemStack itemStack : getDrops(world, x, y, z, world.getBlockMetadata(x, y, z), 0)) {
				dropBlockAsItem(world, x, y, z, itemStack);
			}
			this.onBlockDestroyedByExplosion(world, x, y, z, explosion);
		}
	}
	
	@Override
	public void onNeighborBlockChange(World world, int i, int j, int k, Block l) {
		if(world.getBlockMetadata(i, j, k) < StoneType.stone.length) dropCarvedStone(world, i, j, k);
	}
	
	@Override
	public void onBlockDestroyedByPlayer(World world, int i, int j, int k, int l) {
		
	}
	
	ItemStack dropGem(Random random, int meta){return null;}
	
	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
		return null;
	}
}
