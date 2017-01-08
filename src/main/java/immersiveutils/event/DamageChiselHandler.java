package immersiveutils.event;

import com.bioxx.tfc.Handlers.CraftingHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import immersiveutils.init.ModItems;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

import java.util.ArrayList;

/**
 * Created by Xechon on 1/1/2017.
 */
public class DamageChiselHandler {
	@SubscribeEvent
	public void onItemCrafted(PlayerEvent.ItemCraftedEvent event) {
		System.out.println("The event works.");
		if (event.craftMatrix != null) {
			System.out.println("So does this.");
			// Tool Damaging
			if (event.crafting.getItem() == ModItems.stoneBrick) {
				ArrayList<ItemStack> chisels = (ArrayList<ItemStack>) OreDictionary.getOres("itemChisel", false);
				CraftingHandler.handleItem(event.player, event.craftMatrix, chisels);
			}
		}
	}
}
