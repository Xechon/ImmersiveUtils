package immersiveutils;

import com.bioxx.tfc.Tools.ChiselMode_Smooth;
import immersiveutils.init.ModBlocks;
import immersiveutils.ref.StoneType;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

/**
 * Created by Xechon on 1/1/2017.
 */
@SuppressWarnings("StatementWithEmptyBody")
public class ChiselMode_CustomSmooth extends ChiselMode_Smooth{
	public ChiselMode_CustomSmooth() {
		super("Smooth");
	}
	
	@Override
	public boolean onUsedHandler(World world, EntityPlayer player, int x, int y, int z, Block id, int meta, int side,
	                             float hitX, float hitY, float hitZ) {
		super.onUsedHandler(world, player, x, y, z, id, meta, side, hitX, hitY, hitZ);
		
		if(isUltramaficStone(world.getBlock(x, y + 1, z)) && isUltramaficStone(world.getBlock(x, y + 2, z))) {
			return false;
		}
		
		int hasChisel = super.hasChisel(player);
		if(hasChisel >= 0) {
			if(isUltramaficStone(id) && meta < StoneType.stone.length) world.setBlock(x, y, z, ModBlocks.smoothStone,
					meta, 0x2);
			player.inventory.mainInventory[hasChisel].damageItem(1, player);
		}
		return true;
	}
	
	boolean isUltramaficStone(Block block) {
		return block == ModBlocks.anthracite ||
				block == ModBlocks.breccia ||
				block == ModBlocks.eclogite ||
				block == ModBlocks.komatiite ||
				block == ModBlocks.lamprophyre;
	}
}
