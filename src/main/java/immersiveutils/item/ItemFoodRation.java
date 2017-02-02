package immersiveutils.item;

import com.bioxx.tfc.Core.Player.FoodStatsTFC;
import com.bioxx.tfc.Core.TFC_Core;
import com.bioxx.tfc.Food.ItemFoodTFC;
import com.bioxx.tfc.Render.Item.FoodItemRenderer;
import com.bioxx.tfc.api.Enums.EnumFoodGroup;
import com.bioxx.tfc.api.Food;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.client.MinecraftForgeClient;

import java.util.List;

/**
 * Created by Xechon on 12/31/2016.
 */
public class ItemFoodRation extends ItemFoodTFC{
	public ItemFoodRation() {
		super(EnumFoodGroup.None, 0, 0, 0, 0, 0, true, false);
	}
	
	@Override
	public ItemStack onEaten(ItemStack itemStack, World world, EntityPlayer player) {
		if(!world.isRemote && this.isEdible(itemStack)) {
			FoodStatsTFC foodstats = TFC_Core.getPlayerFoodStats(player);
			//Add nutrition in all categories.
			addNutritionAll(foodstats, Math.min(Food.getWeight(itemStack) - Math.max(Food.getDecay(itemStack), 0), 5f),
					foodstats.getTasteFactor(itemStack));
		}
		return super.onEaten(itemStack, world, player);
	}
	
	void addNutritionAll(FoodStatsTFC foodStats, float eatAmount, float tasteFactor){
		foodStats.addNutrition(EnumFoodGroup.Dairy, eatAmount * tasteFactor);
		foodStats.addNutrition(EnumFoodGroup.Fruit, eatAmount * tasteFactor);
		foodStats.addNutrition(EnumFoodGroup.Grain, eatAmount * tasteFactor);
		foodStats.addNutrition(EnumFoodGroup.Protein, eatAmount * tasteFactor);
		foodStats.addNutrition(EnumFoodGroup.Vegetable, eatAmount * tasteFactor);
	}
	
	@Override
	public void registerIcons(IIconRegister registerer) {
		this.itemIcon = registerer.registerIcon("immersiveutils:" + this.textureFolder + "Food Ration");
		MinecraftForgeClient.registerItemRenderer(this, new FoodItemRenderer());
	}
	
	@Override
	public void getSubItems(Item item, CreativeTabs creativeTabs, List list) {
		ItemStack stack = ItemFoodTFC.createTag(new ItemStack(item, 1), 5);
		list.add(stack);
	}
}
