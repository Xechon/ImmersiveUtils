package immersiveutils.item;

import net.minecraft.client.renderer.texture.IIconRegister;
import ua.pp.shurgent.tfctech.items.ItemDust;

/**
 * Created by Xechon on 1/19/2017.
 */
public class ItemOreDust extends ItemDust {
	
	public ItemOreDust(String m, int amt) {
		super(m, amt);
	}
	
	@Override
	public void registerIcons(IIconRegister registerer) {
		itemIcon = registerer.registerIcon("immersiveUtils:" + textureFolder + getUnlocalizedName().substring(5));
	}
}
