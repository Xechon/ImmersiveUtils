package immersiveutils.item;

import immersiveutils.ImmersiveUtilsMod;
import immersiveutils.ref.StoneType;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import java.util.List;

/**
 * Created by Xechon on 12/31/2016.
 */
public class ItemLooseRock extends com.bioxx.tfc.Items.ItemLooseRock {
	public ItemLooseRock() {
		metaNames = StoneType.stone;
		icons = new IIcon[metaNames.length];
	}
	
	@Override
	public void registerIcons(IIconRegister registerer) {
		for(int i = 0; i < metaNames.length; i++)
			icons[i] = registerer.registerIcon(ImmersiveUtilsMod.MOD_ID + ":" + textureFolder + metaNames[i]
					+ " Rock");
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack is, World world, EntityPlayer player) {return is;}
	
	@Override
	public void addExtraInformation(ItemStack is, EntityPlayer player, List<String> arraylist) {
		
	}
}
