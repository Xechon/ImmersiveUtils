package immersiveutils.init;

import cpw.mods.fml.common.registry.GameRegistry;
import immersiveutils.item.ItemFoodRation;
import immersiveutils.item.ItemLooseRock;
import immersiveutils.item.ItemStoneBrick;
import immersiveutils.ref.StoneType;
import net.minecraft.item.Item;

/**
 * Created by Xechon on 1/1/2017.
 */
public class ModItems {
	public static Item foodRation = new ItemFoodRation().setUnlocalizedName("FoodRation");
	public static Item looseRock = new ItemLooseRock().setFolder("rocks/").setMetaNames(StoneType.stone).setUnlocalizedName("LooseRock");
	public static Item stoneBrick = new ItemStoneBrick().setFolder("rocks/").setUnlocalizedName("ItemStoneBrick");
	
	public static void register() {
		GameRegistry.registerItem(foodRation, foodRation.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(looseRock, looseRock.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(stoneBrick, stoneBrick.getUnlocalizedName().substring(5));
	}
}
