package immersiveutils.block;

import com.bioxx.tfc.api.TFCItems;
import immersiveutils.ref.StoneType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.Random;

/**
 * Created by Xechon on 12/31/2016.
 */
public class BlockKomatiite extends BlockUltramaficStone {
	public BlockKomatiite() {
		super(StoneType.Komatiite.name());
	}
	
	@Override
	public int damageDropped(int i) {
		return StoneType.Komatiite.ordinal();
	}
	
	@Override
	ItemStack dropGem(Random random, int meta) {
		Item item = null;
		
		int rand = random.nextInt(2);
		if(rand == 0) {
			item = TFCItems.gemDiamond;
		} else {item = TFCItems.gemTourmaline;}
		
		if(item != null && meta != -1) {
			return new ItemStack(item, 1, meta);
		}
		return null;
	}
}
