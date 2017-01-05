package immersiveutils.block;

import com.bioxx.tfc.Blocks.Terrain.BlockSmooth;
import com.bioxx.tfc.Core.TFCTabs;
import immersiveutils.ImmersiveUtilsMod;
import immersiveutils.ref.StoneType;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

/**
 * Created by Xechon on 12/31/2016.
 */
public class BlockSmoothStone extends BlockSmooth {
	public BlockSmoothStone() {
		super(Material.rock);
		names = StoneType.stone;
		icons = new IIcon[names.length];
		setCreativeTab(TFCTabs.TFC_BUILDING);
	}
	
	@Override
	public void registerBlockIcons(IIconRegister iconRegisterer) {
		for(int i = 0; i < names.length; i++)
			icons[i] = iconRegisterer.registerIcon(ImmersiveUtilsMod.MOD_ID + ":rocks/" + names[i] + " Smooth");
	}
}
