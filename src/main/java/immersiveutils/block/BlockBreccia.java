package immersiveutils.block;

import com.bioxx.tfc.api.TFCItems;
import immersiveutils.ref.StoneType;
import net.minecraft.item.Item;

import java.util.Random;

/**
 * Created by Xechon on 12/31/2016.
 */
public class BlockBreccia extends BlockUltramaficStone {
	Random random = new Random();
	public BlockBreccia() {
		super(StoneType.Breccia.name());
	}
	
	@Override
	public int quantityDropped(Random rand) {
		return rand.nextInt(3);
	}
	
	@Override
	public Item getItemDropped(int i, Random random, int j) {
		return TFCItems.looseRock;
	}
	
	@Override
	public int damageDropped(int i) {
		return random.nextInt(16);
	}
}
