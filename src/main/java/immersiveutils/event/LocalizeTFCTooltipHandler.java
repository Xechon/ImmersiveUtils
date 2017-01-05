package immersiveutils.event;

import com.bioxx.tfc.Items.ItemBlocks.ItemSoil;
import com.bioxx.tfc.api.Constant.Global;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.util.StatCollector;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;

/**
 * Created by Xechon on 1/1/2017.
 */
public class LocalizeTFCTooltipHandler {
	@SubscribeEvent
	void onTooltip(ItemTooltipEvent event) {
		if(event.itemStack.getItem() instanceof ItemSoil && event.toolTip.size() > 2) {
			event.toolTip.set(2, StatCollector.translateToLocal("ItemSoil.tooltip." +
					Global.STONE_ALL[event.itemStack.getItemDamageForDisplay()]));
		}
	}
}
