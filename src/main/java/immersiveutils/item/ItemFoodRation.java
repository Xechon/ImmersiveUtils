package immersiveutils.item;

import com.bioxx.tfc.Core.Player.FoodStatsTFC;
import com.bioxx.tfc.Core.TFC_Core;
import com.bioxx.tfc.Food.ItemFoodTFC;
import com.bioxx.tfc.Items.ItemTerra;
import com.bioxx.tfc.TerraFirmaCraft;
import com.bioxx.tfc.api.Enums.EnumFoodGroup;
import com.bioxx.tfc.api.Food;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Xechon on 12/31/2016.
 */
public class ItemFoodRation extends ItemFoodTFC{
	public ItemFoodRation() {
		super(EnumFoodGroup.Dairy, 0, 0, 0, 0, 0, true, true);
	}
	
	@Override
	public ItemStack onEaten(ItemStack itemStack, World world, EntityPlayer player) {
		FoodStatsTFC foodStats = TFC_Core.getPlayerFoodStats(player);
		if(!world.isRemote && this.isEdible(itemStack) && itemStack.hasTagCompound()) {
			float weight = Food.getWeight(itemStack);
			float decay = Math.max(Food.getDecay(itemStack), 0);
			float eatAmount = Math.min(weight - decay, 5f);
			float stomachDiff = foodStats.stomachLevel + eatAmount - foodStats.getMaxStomach(foodStats.player);
			if(stomachDiff > 0) eatAmount -= stomachDiff;
			float tasteFactor = foodStats.getTasteFactor(itemStack);
			addNutritionAll(foodStats, eatAmount, tasteFactor);
			foodStats.stomachLevel += eatAmount*tasteFactor;
			if(FoodStatsTFC.reduceFood(itemStack, eatAmount)) itemStack.stackSize = 0;
		} else {
			addNutritionAll(foodStats, 1, 1);
			String error = TFC_Core.translate("error.error") + " " + itemStack.getDisplayName() + " " +
					TFC_Core.translate("error.NBT") + " " + TFC_Core.translate("error.Contact");
			TerraFirmaCraft.LOG.error(error);
			TFC_Core.sendInfoMessage(player, new ChatComponentText(error));
		}
		world.playSoundAtEntity(player, "random.burp", 0.5F, world.rand.nextFloat()*0.1F + 0.9F);
		TFC_Core.setPlayerFoodStats(player, foodStats);
		return itemStack;
	}
	
	void addNutritionAll(FoodStatsTFC foodStats, float eatAmount, float tasteFactor){
		foodStats.addNutrition(EnumFoodGroup.Dairy, eatAmount * tasteFactor);
		foodStats.addNutrition(EnumFoodGroup.Fruit, eatAmount * tasteFactor);
		foodStats.addNutrition(EnumFoodGroup.Grain, eatAmount * tasteFactor);
		foodStats.addNutrition(EnumFoodGroup.Protein, eatAmount * tasteFactor);
		foodStats.addNutrition(EnumFoodGroup.Vegetable, eatAmount * tasteFactor);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void addInformation(ItemStack itemStack, EntityPlayer player, List arraylist, boolean flag) {
		 ArrayList<String> arrayList = (ArrayList<String>) arraylist;
		ItemTerra.addSizeInformation(itemStack, arraylist);
		
		if(itemStack.hasTagCompound()) {
			ItemFoodTFC.addFoodHeatInformation(itemStack, arraylist);
			addFoodInformation(itemStack, player, arraylist);
		}else {
			arrayList.add(TFC_Core.translate("gui.badnbt"));
			TerraFirmaCraft.LOG.error(TFC_Core.translate("error.error") + " " + itemStack.getDisplayName() + " " +
			TFC_Core.translate("error.NBT") + " " + TFC_Core.translate("error.Contact"));
		}
	}
	
	@Override
	public void registerIcons(IIconRegister registerer) {
		this.itemIcon = registerer.registerIcon("immersiveutils:" + this.textureFolder + "Food Ration");
	}
}
