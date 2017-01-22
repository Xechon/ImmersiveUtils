package immersiveutils.init;

import cpw.mods.fml.common.registry.GameRegistry;
import immersiveutils.item.*;
import immersiveutils.ref.StoneType;
import net.minecraft.item.Item;

/**
 * Created by Xechon on 1/1/2017.
 */
public class ModItems {
	public static Item foodRation = new ItemFoodRation().setUnlocalizedName("FoodRation");
	public static Item looseRock = new ItemLooseRock().setFolder("rocks/").setMetaNames(StoneType.stone).setUnlocalizedName("LooseRock");
	public static Item stoneBrick = new ItemStoneBrick().setFolder("rocks/").setUnlocalizedName("ItemStoneBrick");
	public static Item woodAsh = new ItemWoodAsh().setUnlocalizedName("WoodAsh");
	public static Item mre = new ItemMRE().setUnlocalizedName("MRE");
	
	public static Item tinyAluminumDust         = new ItemOreDust("Aluminum", 25)              .setUnlocalizedName("Tiny Aluminum Dust");
	//public static Item tinyBauxiteDust          = new ItemOreDust("Aluminum", 25)               .setUnlocalizedName("Tiny Bauxite Dust");
	//public static Item tinyElectrumDust         = new ItemOreDust("Electrum", 25)              .setUnlocalizedName("Tiny Electrum Dust");
	//public static Item tinyConstantanDust       = new ItemOreDust("Constantan", 25)          .setUnlocalizedName("Tiny Constantan Dust");
	//public static Item tinyInvarDust            = new ItemOreDust("Invar", 25)                    .setUnlocalizedName("Tiny Invar Dust");
	//public static Item tinyRedAlloyDust         = new ItemOreDust("Red Alloy", 25)             .setUnlocalizedName("Tiny Red Alloy Dust");
	//public static Item tinyRedAlloyMix          = new ItemOreDust("Red Alloy", 25)              .setUnlocalizedName("Tiny Red Alloy Mix");
	public static Item tinyBismuthDust          = new ItemOreDust("Bismuth", 25)                .setUnlocalizedName("Tiny Bismuth Dust");
	//public static Item tinyBismuthBronzeDust    = new ItemOreDust("Bismuth Bronze", 25)   .setUnlocalizedName("Tiny Bismuth Bronze Dust");
	//public static Item tinyBlackBronzeDust      = new ItemOreDust("Black Bronze", 25)       .setUnlocalizedName("Tiny Black Bronze Dust");
	//public static Item tinyBlackSteelDust       = new ItemOreDust("Black Steel", 25)         .setUnlocalizedName("Tiny Black Steel Dust");
	//public static Item tinyBlueSteelDust        = new ItemOreDust("Blue Steel", 25)           .setUnlocalizedName("Tiny Blue Steel Dust");
	//public static Item tinyBrassDust            = new ItemOreDust("Brass", 25)                    .setUnlocalizedName("Tiny Brass Dust");
	//public static Item tinyBronzeDust           = new ItemOreDust("Bronze", 25)                  .setUnlocalizedName("Tiny Bronze Dust");
	public static Item tinyCopperDust           = new ItemOreDust("Copper", 25)                  .setUnlocalizedName("Tiny Copper Dust");
	public static Item tinyGoldDust             = new ItemOreDust("Gold", 25)                      .setUnlocalizedName("Tiny Gold Dust");
	//public static Item tinyWroughtIronDust      = new ItemOreDust("Wrought Iron", 25)       .setUnlocalizedName("Tiny Wrought Iron Dust");
	public static Item tinyLeadDust             = new ItemOreDust("Lead", 25)                      .setUnlocalizedName("Tiny Lead Dust");
	public static Item tinyNickelDust           = new ItemOreDust("Nickel", 25)                  .setUnlocalizedName("Tiny Nickel Dust");
	//public static Item tinyPigIronDust          = new ItemOreDust("Pig Iron", 25)               .setUnlocalizedName("Tiny Pig Iron Dust");
	public static Item tinyPlatinumDust         = new ItemOreDust("Platinum", 25)              .setUnlocalizedName("Tiny Platinum Dust");
	//public static Item tinyRedSteelDust         = new ItemOreDust("Red Steel", 25)             .setUnlocalizedName("Tiny Red Steel Dust");
	//public static Item tinyRoseGoldDust         = new ItemOreDust("Rose Gold", 25)             .setUnlocalizedName("Tiny Rose Gold Dust");
	public static Item tinySilverDust           = new ItemOreDust("Silver", 25)                  .setUnlocalizedName("Tiny Silver Dust");
	//public static Item tinySteelDust            = new ItemOreDust("Steel", 25)                    .setUnlocalizedName("Tiny Steel Dust");
	//public static Item tinySterlingSilverDust   = new ItemOreDust("Sterling Silver", 25) .setUnlocalizedName("Tiny Sterling Silver Dust");
	public static Item tinyTinDust              = new ItemOreDust("Tin", 25)                        .setUnlocalizedName("Tiny Tin Dust");
	public static Item tinyZincDust             = new ItemOreDust("Zinc", 25)                      .setUnlocalizedName("Tiny Zinc Dust");
	
	public static Item smallAluminumDust = new ItemOreDust("Aluminum", 50).setUnlocalizedName("Small Aluminum Dust");
	//public static Item smallBauxiteDust = new ItemOreDust("Aluminum", 50).setUnlocalizedName("Small Bauxite Dust");
	//public static Item smallElectrumDust = new ItemOreDust("Electrum", 50).setUnlocalizedName("Small Electrum Dust");
	//public static Item smallConstantanDust = new ItemOreDust("Constantan", 50).setUnlocalizedName("Small Constantan Dust");
	//public static Item smallInvarDust = new ItemOreDust("Invar", 50).setUnlocalizedName("Small Invar Dust");
	//public static Item smallRedAlloyDust = new ItemOreDust("Red Alloy", 50).setUnlocalizedName("Small Red Alloy Dust");
	//public static Item smallRedAlloyMix = new ItemOreDust("Red Alloy", 50).setUnlocalizedName("Small Red Alloy Mix");
	public static Item smallBismuthDust = new ItemOreDust("Bismuth", 50).setUnlocalizedName("Small Bismuth Dust");
	//public static Item smallBismuthBronzeDust = new ItemOreDust("Bismuth Bronze", 50).setUnlocalizedName("Small Bismuth Bronze Dust");
	//public static Item smallBlackBronzeDust = new ItemOreDust("Black Bronze", 50).setUnlocalizedName("Small Black Bronze Dust");
	//public static Item smallBlackSteelDust = new ItemOreDust("Black Steel", 50).setUnlocalizedName("Small Black Steel Dust");
	//public static Item smallBlueSteelDust = new ItemOreDust("Blue Steel", 50).setUnlocalizedName("Small Blue Steel Dust");
	//public static Item smallBrassDust = new ItemOreDust("Brass", 50).setUnlocalizedName("Small Brass Dust");
	//public static Item smallBronzeDust = new ItemOreDust("Bronze", 50).setUnlocalizedName("Small Bronze Dust");
	public static Item smallCopperDust = new ItemOreDust("Copper", 50).setUnlocalizedName("Small Copper Dust");
	public static Item smallGoldDust = new ItemOreDust("Gold", 50).setUnlocalizedName("Small Gold Dust");
	//public static Item smallWroughtIronDust = new ItemOreDust("Wrought Iron", 50).setUnlocalizedName("Small Wrought Iron Dust");
	public static Item smallLeadDust = new ItemOreDust("Lead", 50).setUnlocalizedName("Small Lead Dust");
	public static Item smallNickelDust = new ItemOreDust("Nickel", 50).setUnlocalizedName("Small Nickel Dust");
	//public static Item smallPigIronDust = new ItemOreDust("Pig Iron", 50).setUnlocalizedName("Small Pig Iron Dust");
	public static Item smallPlatinumDust = new ItemOreDust("Platinum", 50).setUnlocalizedName("Small Platinum Dust");
	//public static Item smallRedSteelDust = new ItemOreDust("Red Steel", 50).setUnlocalizedName("Small Red Steel Dust");
	//public static Item smallRoseGoldDust = new ItemOreDust("Rose Gold", 50).setUnlocalizedName("Small Rose Gold Dust");
	public static Item smallSilverDust = new ItemOreDust("Silver", 50).setUnlocalizedName("Small Silver Dust");
	//public static Item smallSteelDust = new ItemOreDust("Steel", 50).setUnlocalizedName("Small Steel Dust");
	//public static Item smallSterlingSilverDust = new ItemOreDust("Sterling Silver", 50).setUnlocalizedName("Small Sterling Silver Dust");
	public static Item smallTinDust = new ItemOreDust("Tin", 50).setUnlocalizedName("Small Tin Dust");
	public static Item smallZincDust = new ItemOreDust("Zinc", 50).setUnlocalizedName("Small Zinc Dust");
	
	public static void register() {
		GameRegistry.registerItem(foodRation, foodRation.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(looseRock, looseRock.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(stoneBrick, stoneBrick.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(woodAsh, woodAsh.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(mre, mre.getUnlocalizedName().substring(5));
		
		GameRegistry.registerItem(tinyAluminumDust      , tinyAluminumDust      .getUnlocalizedName().substring(5));
		//GameRegistry.registerItem(tinyBauxiteDust       , tinyBauxiteDust       .getUnlocalizedName().substring(5));
		//GameRegistry.registerItem(tinyElectrumDust      , tinyElectrumDust      .getUnlocalizedName().substring(5));
		//GameRegistry.registerItem(tinyConstantanDust    , tinyConstantanDust    .getUnlocalizedName().substring(5));
		//GameRegistry.registerItem(tinyInvarDust         , tinyInvarDust         .getUnlocalizedName().substring(5));
		//GameRegistry.registerItem(tinyRedAlloyDust      , tinyRedAlloyDust      .getUnlocalizedName().substring(5));
		//GameRegistry.registerItem(tinyRedAlloyMix       , tinyRedAlloyMix       .getUnlocalizedName().substring(5));
		GameRegistry.registerItem(tinyBismuthDust       , tinyBismuthDust       .getUnlocalizedName().substring(5));
		//GameRegistry.registerItem(tinyBismuthBronzeDust , tinyBismuthBronzeDust .getUnlocalizedName().substring(5));
		//GameRegistry.registerItem(tinyBlackBronzeDust   , tinyBlackBronzeDust   .getUnlocalizedName().substring(5));
		//GameRegistry.registerItem(tinyBlackSteelDust    , tinyBlackSteelDust    .getUnlocalizedName().substring(5));
		//GameRegistry.registerItem(tinyBlueSteelDust     , tinyBlueSteelDust     .getUnlocalizedName().substring(5));
		//GameRegistry.registerItem(tinyBrassDust         , tinyBrassDust         .getUnlocalizedName().substring(5));
		//GameRegistry.registerItem(tinyBronzeDust        , tinyBronzeDust        .getUnlocalizedName().substring(5));
		GameRegistry.registerItem(tinyCopperDust        , tinyCopperDust        .getUnlocalizedName().substring(5));
		GameRegistry.registerItem(tinyGoldDust          , tinyGoldDust          .getUnlocalizedName().substring(5));
		//GameRegistry.registerItem(tinyWroughtIronDust   , tinyWroughtIronDust   .getUnlocalizedName().substring(5));
		GameRegistry.registerItem(tinyLeadDust          , tinyLeadDust          .getUnlocalizedName().substring(5));
		GameRegistry.registerItem(tinyNickelDust        , tinyNickelDust        .getUnlocalizedName().substring(5));
		//GameRegistry.registerItem(tinyPigIronDust       , tinyPigIronDust       .getUnlocalizedName().substring(5));
		GameRegistry.registerItem(tinyPlatinumDust      , tinyPlatinumDust      .getUnlocalizedName().substring(5));
		//GameRegistry.registerItem(tinyRedSteelDust      , tinyRedSteelDust      .getUnlocalizedName().substring(5));
		//GameRegistry.registerItem(tinyRoseGoldDust      , tinyRoseGoldDust      .getUnlocalizedName().substring(5));
		GameRegistry.registerItem(tinySilverDust        , tinySilverDust        .getUnlocalizedName().substring(5));
		//GameRegistry.registerItem(tinySteelDust         , tinySteelDust         .getUnlocalizedName().substring(5));
		//GameRegistry.registerItem(tinySterlingSilverDust, tinySterlingSilverDust.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(tinyTinDust           , tinyTinDust           .getUnlocalizedName().substring(5));
		GameRegistry.registerItem(tinyZincDust          , tinyZincDust          .getUnlocalizedName().substring(5));
		
		GameRegistry.registerItem(smallAluminumDust      , smallAluminumDust      .getUnlocalizedName().substring(5));
		//GameRegistry.registerItem(smallBauxiteDust       , smallBauxiteDust       .getUnlocalizedName().substring(5));
		//GameRegistry.registerItem(smallElectrumDust      , smallElectrumDust      .getUnlocalizedName().substring(5));
		//GameRegistry.registerItem(smallConstantanDust    , smallConstantanDust    .getUnlocalizedName().substring(5));
		//GameRegistry.registerItem(smallInvarDust         , smallInvarDust         .getUnlocalizedName().substring(5));
		//GameRegistry.registerItem(smallRedAlloyDust      , smallRedAlloyDust      .getUnlocalizedName().substring(5));
		//GameRegistry.registerItem(smallRedAlloyMix       , smallRedAlloyMix       .getUnlocalizedName().substring(5));
		GameRegistry.registerItem(smallBismuthDust       , smallBismuthDust       .getUnlocalizedName().substring(5));
		//GameRegistry.registerItem(smallBismuthBronzeDust , smallBismuthBronzeDust .getUnlocalizedName().substring(5));
		//GameRegistry.registerItem(smallBlackBronzeDust   , smallBlackBronzeDust   .getUnlocalizedName().substring(5));
		//GameRegistry.registerItem(smallBlackSteelDust    , smallBlackSteelDust    .getUnlocalizedName().substring(5));
		//GameRegistry.registerItem(smallBlueSteelDust     , smallBlueSteelDust     .getUnlocalizedName().substring(5));
		//GameRegistry.registerItem(smallBrassDust         , smallBrassDust         .getUnlocalizedName().substring(5));
		//GameRegistry.registerItem(smallBronzeDust        , smallBronzeDust        .getUnlocalizedName().substring(5));
		GameRegistry.registerItem(smallCopperDust        , smallCopperDust        .getUnlocalizedName().substring(5));
		GameRegistry.registerItem(smallGoldDust          , smallGoldDust          .getUnlocalizedName().substring(5));
		//GameRegistry.registerItem(smallWroughtIronDust   , smallWroughtIronDust   .getUnlocalizedName().substring(5));
		GameRegistry.registerItem(smallLeadDust          , smallLeadDust          .getUnlocalizedName().substring(5));
		GameRegistry.registerItem(smallNickelDust        , smallNickelDust        .getUnlocalizedName().substring(5));
		//GameRegistry.registerItem(smallPigIronDust       , smallPigIronDust       .getUnlocalizedName().substring(5));
		GameRegistry.registerItem(smallPlatinumDust      , smallPlatinumDust      .getUnlocalizedName().substring(5));
		//GameRegistry.registerItem(smallRedSteelDust      , smallRedSteelDust      .getUnlocalizedName().substring(5));
		//GameRegistry.registerItem(smallRoseGoldDust      , smallRoseGoldDust      .getUnlocalizedName().substring(5));
		GameRegistry.registerItem(smallSilverDust        , smallSilverDust        .getUnlocalizedName().substring(5));
		//GameRegistry.registerItem(smallSteelDust         , smallSteelDust         .getUnlocalizedName().substring(5));
		//GameRegistry.registerItem(smallSterlingSilverDust, smallSterlingSilverDust.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(smallTinDust           , smallTinDust           .getUnlocalizedName().substring(5));
		GameRegistry.registerItem(smallZincDust          , smallZincDust          .getUnlocalizedName().substring(5));
	}
}
