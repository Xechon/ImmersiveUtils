package immersiveutils.block;

import immersiveutils.ImmersiveUtilsMod;
import net.minecraft.client.renderer.texture.IIconRegister;

/**
 * Created by Xechon on 12/31/2016.
 */
public class BlockStoneBrick extends BlockSmoothStone {
	@Override
	public void registerBlockIcons(IIconRegister iconRegisterer) {
		for(int i = 0; i < names.length; i++)
			icons[i] = iconRegisterer.registerIcon(ImmersiveUtilsMod.MOD_ID + ":rocks/" + names[i] + " Brick");
	}
}
