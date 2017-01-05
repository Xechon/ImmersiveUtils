package immersiveutils.item;

import com.bioxx.tfc.Items.ItemBlocks.ItemStone;
import immersiveutils.init.ModBlocks;
import immersiveutils.ref.StoneType;
import net.minecraft.block.Block;

/**
 * Created by Xechon on 12/31/2016.
 */
public class ItemBlockStone extends ItemStone {
	//GameRegistry calls this constructor implicitly
	public ItemBlockStone(Block b) {
		super(b);
		metaNames = (b == ModBlocks.smoothStone || b == ModBlocks.stoneBrick || b == ModBlocks.cobblestone
		|| b == ModBlocks.wallSmooth || b == ModBlocks.wallBrick || b == ModBlocks.wallCobble) ? StoneType.stone : null;
	}
}
