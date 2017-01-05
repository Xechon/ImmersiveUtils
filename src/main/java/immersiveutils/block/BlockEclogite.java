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
		Item item = null;
		
		if(meta == StoneType.Eclogite.ordinal()){
			item = TFCItems.gemDiamond;
			int rand = random.nextInt(10);
			if(rand < 9) {
				item = TFCItems.gemGarnet;
			}
			if(rand < 6) {
				item = TFCItems.gemRuby;
			}
			if(rand < 3) {
				item = TFCItems.gemSapphire;
			}
		}
		
		if(item != null && meta != -1) {
			return new ItemStack(item, 1, meta);
		}
		return null;
	}
}
