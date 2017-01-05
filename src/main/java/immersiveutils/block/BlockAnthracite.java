package immersiveutils.block;

import com.bioxx.tfc.api.TFCItems;
import immersiveutils.ref.StoneType;
import net.minecraft.item.Item;

import java.util.Random;

/**
 * Created by Xechon on 12/31/2016.
 */
public class BlockAnthracite extends BlockUltramaficStone {
	public BlockAnthracite() {
		super(StoneType.Anthracite.name());
	}
	
	@Override
	public int quantityDropped(Random rand) {
		return rand.nextInt(3);
	}
	
	@Override
	public Item getItemDropped(int i, Random random, int j) {
		return TFCItems.coal;
	}
}
