package immersiveutils.block;

import com.bioxx.tfc.api.TFCItems;
import immersiveutils.ref.StoneType;
import net.minecraft.item.Item;

import java.util.Random;

/**
 * Created by Xechon on 12/31/2016.
 */
public class BlockLamprophyre extends BlockUltramaficStone {
	Random random = new Random();
	public BlockLamprophyre() {
		super(StoneType.Lamprophyre.name());
	}
	
	@Override
	public Item getItemDropped(int i, Random random, int j) {
		switch(random.nextInt(4)) {
			case 0: return TFCItems.gemAgate;
			case 1: return TFCItems.gemSapphire;
			case 2: return TFCItems.gemBeryl;
			case 3: return TFCItems.gemOpal;
		}
		return null;
	}
	
	@Override
	public int damageDropped(int i) {
		int quality = 0;
		if (random.nextInt(25) == 0) quality = 1;
		else if (random.nextInt(75/2) == 0) quality = 2;
		else if (random.nextInt(75) == 0) quality = 3;
		else if (random.nextInt(150) == 0) quality = 4;
		return quality;
	}
}
