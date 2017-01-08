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
		int rand;
		
		rand = random.nextInt(100);
		if(rand < 10) {
			rand = random.nextInt(100);
			if (rand < 5) {
				item = TFCItems.gemDiamond;
			} else if(rand < 40){
				item = TFCItems.gemAgate;
			} else{
				item = TFCItems.gemTourmaline;
			}
			
			if (item != null && meta != -1) {
				return new ItemStack(item, 1, meta);
			}
		}
		return null;
	}
}
