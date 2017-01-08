package immersiveutils.block;

import com.bioxx.tfc.api.TFCItems;
import immersiveutils.ref.StoneType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.Random;

/**
 * Created by Xechon on 12/31/2016.
 */
public class BlockEclogite extends BlockUltramaficStone {
	public BlockEclogite() {
		super(StoneType.Eclogite.name());
	}
	
	@Override
	public int damageDropped(int i) {
		return StoneType.Eclogite.ordinal();
	}
	
	@Override
	ItemStack dropGem(Random random, int meta) {
		Item item = TFCItems.gemDiamond;
		int rand;
		rand = random.nextInt(100);
		if(rand < 10) {
			rand = random.nextInt(10);
			if (rand < 9) {
				item = TFCItems.gemGarnet;
			}
			if (rand < 6) {
				item = TFCItems.gemRuby;
			}
			if (rand < 3) {
				item = TFCItems.gemSapphire;
			}
		}
		
		if(item != null) {
			return new ItemStack(item, 1, meta);
		}
		return null;
	}
}
