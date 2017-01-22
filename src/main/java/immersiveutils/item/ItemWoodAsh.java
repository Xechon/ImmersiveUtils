package immersiveutils.item;

import com.bioxx.tfc.Items.ItemTerra;
import net.minecraft.client.renderer.texture.IIconRegister;

/**
 * Created by Xechon on 1/19/2017.
 */
public class ItemWoodAsh extends ItemTerra {
	@Override
	public void registerIcons(IIconRegister registerer) {
		this.itemIcon = registerer.registerIcon("terrafirmacraft:Graphite Powder");
	}
}
