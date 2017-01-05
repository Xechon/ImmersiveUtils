package immersiveutils.item;

import immersiveutils.ImmersiveUtilsMod;
import immersiveutils.ref.StoneType;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

/**
 * Created by Xechon on 12/31/2016.
 */
public class ItemStoneBrick extends com.bioxx.tfc.Items.ItemStoneBrick {
	public ItemStoneBrick() {
		metaNames = StoneType.stone;
		metaIcons = new IIcon[metaNames.length];
	}
	
	@Override
	public IIcon getIconFromDamage(int meta) {
		return metaIcons[meta];
	}
	
	@Override
	public void registerIcons(IIconRegister registerer) {
		for(int i = 0; i < metaNames.length; i++)
			metaIcons[i] = registerer.registerIcon(ImmersiveUtilsMod.MOD_ID + ":" + textureFolder +
					metaNames[i] + " Brick");
	}
}
