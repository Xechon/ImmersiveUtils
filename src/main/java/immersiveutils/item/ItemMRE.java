package immersiveutils.item;

import com.bioxx.tfc.Core.TFCTabs;
import com.bioxx.tfc.Food.ItemFoodTFC;
import com.bioxx.tfc.api.Food;
import com.bioxx.tfc.api.TFCItems;
import immersiveutils.ImmersiveUtilsMod;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import java.util.List;

/**
 * Created by Xechon on 1/19/2017.
 */
public class ItemMRE extends Item{
	protected IIcon[] icons;
	
	private ItemStack[] westernBeefDinner;
	private ItemStack[] asianSeafoodDinner;
	private ItemStack[] heartyBreakfast;
	private ItemStack[] fruitSaladDelight;
	private ItemStack[] southernSupper;
			
	public ItemMRE() {
		setHasSubtypes(true);
		setMaxDamage(0);
		setCreativeTab(TFCTabs.TFC_FOODS);
		
		westernBeefDinner = new ItemStack[5];
		ItemStack beef = new ItemStack(TFCItems.beefRaw);
		Food.setCooked(beef, 900);
		Food.setSalted(beef, true);
		westernBeefDinner[0] = ItemFoodTFC.createTag(beef, 5);
		ItemStack wheatBread = new ItemStack(TFCItems.wheatBread);
		Food.setCooked(wheatBread, 900);
		westernBeefDinner[1] = ItemFoodTFC.createTag(wheatBread, 5);
		westernBeefDinner[2] = ItemFoodTFC.createTag(new ItemStack(TFCItems.carrot), 5);
		westernBeefDinner[3] = ItemFoodTFC.createTag(new ItemStack(TFCItems.redApple), 5);
		westernBeefDinner[4] = ItemFoodTFC.createTag(new ItemStack(TFCItems.cheese), 3);
		
		asianSeafoodDinner = new ItemStack[4];
		ItemStack fish = new ItemStack(TFCItems.fishRaw);
		Food.setCooked(fish, 900);
		asianSeafoodDinner[0] = ItemFoodTFC.createTag(fish, 5);
		asianSeafoodDinner[1] = ItemFoodTFC.createTag(new ItemStack(TFCItems.riceGrain), 5);
		asianSeafoodDinner[2] = ItemFoodTFC.createTag(new ItemStack(TFCItems.seaWeed), 5);
		asianSeafoodDinner[3] = ItemFoodTFC.createTag(new ItemStack(TFCItems.onion), 5);
		
		heartyBreakfast = new ItemStack[5];
		ItemStack pork = new ItemStack(TFCItems.porkchopRaw);
		Food.setCooked(pork, 900);
		heartyBreakfast[0] = ItemFoodTFC.createTag(pork, 5);
		heartyBreakfast[1] = ItemFoodTFC.createTag(new ItemStack(TFCItems.potato), 5);
		heartyBreakfast[2] = ItemFoodTFC.createTag(new ItemStack(TFCItems.eggCooked), 5);
		heartyBreakfast[3] = ItemFoodTFC.createTag(wheatBread, 5);
		heartyBreakfast[4] = ItemFoodTFC.createTag(new ItemStack(TFCItems.cheese), 5);
		
		fruitSaladDelight = new ItemStack[4];
		fruitSaladDelight[0] = ItemFoodTFC.createTag(new ItemStack(TFCItems.banana), 5);
		fruitSaladDelight[1] = ItemFoodTFC.createTag(new ItemStack(TFCItems.blueberry), 5);
		fruitSaladDelight[2] = ItemFoodTFC.createTag(new ItemStack(TFCItems.raspberry), 5);
		fruitSaladDelight[3] = ItemFoodTFC.createTag(new ItemStack(TFCItems.orange), 5);
		
		southernSupper = new ItemStack[5];
		ItemStack poultry = new ItemStack(TFCItems.chickenRaw);
		Food.setCooked(poultry, 900);
		southernSupper[0] = ItemFoodTFC.createTag(poultry, 5);
		southernSupper[1] = ItemFoodTFC.createTag(new ItemStack(TFCItems.cornBread), 5);
		ItemStack garlicCheese = ItemFoodTFC.createTag(new ItemStack(TFCItems.cheese), 5);
		Food.setInfusion(garlicCheese, TFCItems.garlic.getUnlocalizedName());
		southernSupper[2] = garlicCheese;
		southernSupper[3] = ItemFoodTFC.createTag(new ItemStack(TFCItems.redApple), 5);
		southernSupper[4] = ItemFoodTFC.createTag(new ItemStack(TFCItems.garlic), 2);
	}
	
	@Override
	public int getDamage(ItemStack stack) {
		return super.getDamage(stack);
	}
	
	@Override
	public void getSubItems(Item item, CreativeTabs creativeTabs, List metaList) {
		metaList.add(new ItemStack(item.setTextureName("Western Beef Dinner"), 1, 0));
		metaList.add(new ItemStack(item.setTextureName("Asian Seafood Dinner"), 1, 1));
		metaList.add(new ItemStack(item.setTextureName("Hearty Breakfast"), 1, 2));
		metaList.add(new ItemStack(item.setTextureName("Fruit Salad Delight"), 1, 3));
		metaList.add(new ItemStack(item.setTextureName("Southern Supper"), 1, 4));
	}
	
	@Override
	public String getUnlocalizedName(ItemStack itemStack) {
		String name = "item.MRE";
		switch (itemStack.getItemDamage()){
			case 0: name += "WesternBeefDinner"; break;
			case 1: name += "AsianSeafoodDinner"; break;
			case 2: name += "HeartyBreakfast"; break;
			case 3: name += "FruitSaladDelight"; break;
			case 4: name += "SouthernSupper"; break;
		}
		return name;
	}
	
	@Override
	public void registerIcons(IIconRegister registerer) {
		icons = new IIcon[5];
		icons[0] = registerer.registerIcon(ImmersiveUtilsMod.MOD_ID + ":food/Western Beef Dinner");
		icons[1] = registerer.registerIcon(ImmersiveUtilsMod.MOD_ID + ":food/Asian Seafood Dinner");
		icons[2] = registerer.registerIcon(ImmersiveUtilsMod.MOD_ID + ":food/Hearty Breakfast");
		icons[3] = registerer.registerIcon(ImmersiveUtilsMod.MOD_ID + ":food/Fruit Salad Delight");
		icons[4] = registerer.registerIcon(ImmersiveUtilsMod.MOD_ID + ":food/Southern Supper");
	}
	
	@Override
	public IIcon getIconFromDamage(int damage) {
		if(damage > 4){
			return super.getIconFromDamage(damage);
		}
		return icons[damage];
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player) {
		switch (itemStack.getItemDamage()){
			case 0: givePlayerItems(player, westernBeefDinner); break;
			case 1: givePlayerItems(player, asianSeafoodDinner); break;
			case 2: givePlayerItems(player, heartyBreakfast); break;
			case 3: givePlayerItems(player, fruitSaladDelight); break;
			case 4: givePlayerItems(player, southernSupper); break;
			default:
				ImmersiveUtilsMod.logger.error("Wrong metadata for MRE.");
		}
		itemStack.stackSize--;
		player.inventoryContainer.detectAndSendChanges();
		return itemStack;
	}
	
	public void givePlayerItems(EntityPlayer player, ItemStack[] items) {
		for(int i = 0; i < items.length; i++) {
			player.inventory.addItemStackToInventory(items[i]);
			items[i].stackSize++;
		}
	}
}
