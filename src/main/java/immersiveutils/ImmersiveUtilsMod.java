package immersiveutils;


import com.bioxx.tfc.api.TFCItems;
import com.bioxx.tfc.api.Tools.ChiselManager;
import com.bioxx.tfc.api.Tools.ChiselMode;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLInterModComms;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import immersiveutils.event.DamageChiselHandler;
import immersiveutils.event.DisableMobSpawnHandler;
import immersiveutils.event.InputHandler;
import immersiveutils.event.LocalizeTFCTooltipHandler;
import immersiveutils.init.ModBlocks;
import immersiveutils.init.ModItems;
import immersiveutils.ref.StoneType;
import mcp.mobius.waila.api.impl.ModuleRegistrar;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import org.apache.logging.log4j.Logger;

import java.lang.reflect.Field;
import java.util.List;


/**
 * Created by Xechon on 12/31/2016.
 */
@Mod(modid = ImmersiveUtilsMod.MOD_ID, version = ImmersiveUtilsMod.VERSION, name = "ImmersiveUtils", dependencies =
		"required-after:terrafirmacraft")
public class ImmersiveUtilsMod {
	public static final String MOD_ID = "immersiveutils";
	public static final String VERSION = "0.0.8";
	
	public static Logger logger;
	
	@Mod.EventHandler void preInit(FMLPreInitializationEvent event) {
		logger = event.getModLog();
		
		MinecraftForge.EVENT_BUS.register(new DamageChiselHandler());
		MinecraftForge.EVENT_BUS.register(new DisableMobSpawnHandler());
		MinecraftForge.EVENT_BUS.register(new LocalizeTFCTooltipHandler());
		if(event.getSide() == Side.CLIENT) {
			FMLCommonHandler.instance().bus().register(new InputHandler());
			ClientRegistry.registerKeyBinding(InputHandler.keyGalacticraftInventory);
		}
	}
	
	@Mod.EventHandler void init(FMLInitializationEvent event) {
		ModBlocks.register();
		ModItems.register();
		for(int j = 0; j < StoneType.stone.length; j++) {
			//Bricks
			GameRegistry.addRecipe(new ItemStack(ModBlocks.stoneBrick, 4, j), "PXP", "XPX", "PXP",
					'P', new ItemStack(ModItems.stoneBrick, 1, j), 'X', new ItemStack(TFCItems.mortar, 1));
			GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.stoneBrick, 1, j),
					new ItemStack(ModItems.looseRock, 1, j), "itemChisel"));
			// cobble <-> cobble block
			GameRegistry.addRecipe(new ItemStack(ModBlocks.cobblestone, 1, j), "PP", "PP",'P',
					new ItemStack(ModItems.looseRock, 1, j));
			GameRegistry.addShapelessRecipe(new ItemStack(ModItems.looseRock, 4, j),
					new ItemStack(ModBlocks.cobblestone, 1, j));
			// walls
			GameRegistry.addRecipe(new ItemStack(ModBlocks.wallCobble, 4, j), "RRR", "RRR",'R',
					new ItemStack(ModItems.looseRock, 1, j));
			
			GameRegistry.addRecipe(new ItemStack(ModBlocks.wallBrick, 3, j), "BMB", "MBM", 'B',
					new ItemStack(ModItems.stoneBrick, 1, j), 'M', new ItemStack(TFCItems.mortar, 1));
			GameRegistry.addRecipe(new ItemStack(ModBlocks.wallSmooth, 3, j), "RRR", "RRR", 'R',
					new ItemStack(ModBlocks.smoothStone, 1, j));
		}
		GameRegistry.addRecipe(new ItemStack(ModBlocks.wallEclogite, 3, 0), "RRR", "RRR", 'R',
				new ItemStack(ModBlocks.eclogite, 1, 0));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.wallKomatiite, 3, 0), "RRR", "RRR", 'R',
				new ItemStack(ModBlocks.komatiite, 1, 0));
		
		if(Loader.isModLoaded("Waila"))
			FMLInterModComms.sendMessage("Waila", "register", "immersiveutils.WailaPatch.callbackRegister");
	}
	
	@SuppressWarnings("unchecked")
	@Mod.EventHandler void postInit(FMLPostInitializationEvent event) {
		if (Loader.isModLoaded("Waila"))
			ModuleRegistrar.instance().IMCRequests.remove("com.bioxx.tfc.WAILA.WAILAData.callbackRegister");
		
		try {
			Field field = ChiselManager.class.getDeclaredField("chiselModes");
			field.setAccessible(true);
			
			List<ChiselMode> list = (List<ChiselMode>) field.get(ChiselManager.getInstance());
			list.set(0, new ChiselMode_CustomSmooth());
		} catch (NoSuchFieldException e){
			e.printStackTrace();
		} catch(IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}
