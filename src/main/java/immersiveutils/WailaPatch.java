package immersiveutils;

import com.bioxx.tfc.Blocks.BlockCharcoal;
import com.bioxx.tfc.Blocks.BlockPartial;
import com.bioxx.tfc.Blocks.Devices.BlockAnvil;
import com.bioxx.tfc.Blocks.Flora.BlockWaterPlant;
import com.bioxx.tfc.Blocks.Terrain.*;
import com.bioxx.tfc.Blocks.Vanilla.BlockCustomDoor;
import com.bioxx.tfc.Blocks.Vanilla.BlockTorch;
import com.bioxx.tfc.Core.TFC_Core;
import com.bioxx.tfc.TileEntities.*;
import com.bioxx.tfc.WAILA.WAILAData;
import com.bioxx.tfc.api.Constant.Global;
import com.bioxx.tfc.api.TFCBlocks;
import mcp.mobius.waila.api.IWailaConfigHandler;
import mcp.mobius.waila.api.IWailaDataAccessor;
import mcp.mobius.waila.api.IWailaRegistrar;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.StatCollector;

import java.util.List;

/**
 * Created by Xechon on 1/1/2017.
 */
public class WailaPatch extends WAILAData {
	public static void callbackRegister(IWailaRegistrar reg)
	{
		reg.addConfig("TerraFirmaCraft", "tfc.oreQuality");
		
		reg.registerStackProvider(new WAILAData(), BlockAnvil.class);
		reg.registerBodyProvider(new WAILAData(), TEAnvil.class);
		reg.registerNBTProvider(new WAILAData(), TEAnvil.class);
		
		reg.registerHeadProvider(new WAILAData(), TEBarrel.class);
		reg.registerBodyProvider(new WAILAData(), TEBarrel.class);
		reg.registerNBTProvider(new WAILAData(), TEBarrel.class);
		
		reg.registerStackProvider(new WAILAData(), TEBerryBush.class);
		reg.registerBodyProvider(new WAILAData(), TEBerryBush.class);
		reg.registerNBTProvider(new WAILAData(), TEBerryBush.class);
		
		reg.registerBodyProvider(new WAILAData(), TEBlastFurnace.class);
		reg.registerNBTProvider(new WAILAData(), TEBlastFurnace.class);
		
		reg.registerStackProvider(new WAILAData(), TEBloom.class);
		reg.registerBodyProvider(new WAILAData(), TEBloom.class);
		reg.registerNBTProvider(new WAILAData(), TEBloom.class);
		
		reg.registerBodyProvider(new WAILAData(), TEBloomery.class);
		reg.registerNBTProvider(new WAILAData(), TEBloomery.class);
		
		reg.registerStackProvider(new WAILAData(), BlockCharcoal.class);
		reg.registerStackProvider(new WAILAData(), BlockClay.class);
		reg.registerStackProvider(new WAILAData(), BlockClayGrass.class);
		reg.registerStackProvider(new WAILAData(), BlockCobble.class);
		
		reg.registerStackProvider(new WAILAData(), TECrop.class);
		reg.registerBodyProvider(new WAILAData(), TECrop.class);
		reg.registerNBTProvider(new WAILAData(), TECrop.class);
		
		reg.registerStackProvider(new WAILAData(), BlockCustomDoor.class);
		
		reg.registerBodyProvider(new WAILAData(), TEFarmland.class);
		reg.registerNBTProvider(new WAILAData(), TEFarmland.class);
		
		reg.registerBodyProvider(new WAILAData(), TEFirepit.class);
		reg.registerNBTProvider(new WAILAData(), TEFirepit.class);
		
		reg.registerBodyProvider(new WAILAData(), TEForge.class);
		reg.registerNBTProvider(new WAILAData(), TEForge.class);
		
		reg.registerStackProvider(new WAILAData(), TEFruitLeaves.class);
		reg.registerHeadProvider(new WAILAData(), TEFruitLeaves.class);
		reg.registerBodyProvider(new WAILAData(), TEFruitLeaves.class);
		reg.registerNBTProvider(new WAILAData(), TEFruitLeaves.class);
		
		reg.registerStackProvider(new WAILAData(), TEFruitTreeWood.class);
		reg.registerHeadProvider(new WAILAData(), TEFruitTreeWood.class);
		
		reg.registerStackProvider(new WAILAData(), TEIngotPile.class);
		reg.registerHeadProvider(new WAILAData(), TEIngotPile.class);
		reg.registerNBTProvider(new WAILAData(), TEIngotPile.class);
		
		reg.registerBodyProvider(new WAILAData(), TELogPile.class);
		reg.registerNBTProvider(new WAILAData(), TELogPile.class);
		
		reg.registerStackProvider(new WAILAData(), TELoom.class);
		reg.registerBodyProvider(new WAILAData(), TELoom.class);
		reg.registerNBTProvider(new WAILAData(), TELoom.class);
		
		reg.registerStackProvider(new WAILAData(), TEMetalSheet.class);
		reg.registerNBTProvider(new WAILAData(), TEMetalSheet.class);
		
		reg.registerStackProvider(new WAILAData(), TEMetalTrapDoor.class);
		reg.registerBodyProvider(new WAILAData(), TEMetalTrapDoor.class);
		reg.registerNBTProvider(new WAILAData(), TEMetalTrapDoor.class);
		
		reg.registerBodyProvider(new WAILAData(), TENestBox.class);
		reg.registerNBTProvider(new WAILAData(), TENestBox.class);
		
		reg.registerStackProvider(new WAILAData(), TEOilLamp.class);
		reg.registerBodyProvider(new WAILAData(), TEOilLamp.class);
		reg.registerNBTProvider(new WAILAData(), TEOilLamp.class);
		
		reg.registerStackProvider(new WAILAData(), TEOre.class);
		reg.registerHeadProvider(new WAILAData(), TEOre.class);
		reg.registerBodyProvider(new WAILAData(), TEOre.class);
		
		reg.registerStackProvider(new WAILAData(), BlockPartial.class);
		reg.registerNBTProvider(new WAILAData(), BlockPartial.class);
		
		reg.registerBodyProvider(new WAILAData(), TEPottery.class);
		reg.registerNBTProvider(new WAILAData(), TEPottery.class);
		
		reg.registerBodyProvider(new WAILAData(), TESapling.class);
		reg.registerNBTProvider(new WAILAData(), TESapling.class);
		
		reg.registerBodyProvider(new WAILAData(), TESluice.class);
		reg.registerNBTProvider(new WAILAData(), TESluice.class);
		
		reg.registerHeadProvider(new WAILAData(), TESmokeRack.class);
		reg.registerBodyProvider(new WAILAData(), TESmokeRack.class);
		reg.registerNBTProvider(new WAILAData(), TESmokeRack.class);
		
		// Soil
		reg.registerBodyProvider(new WailaPatch(), BlockDirt.class);
		reg.registerBodyProvider(new WailaPatch(), BlockSand.class);
		reg.registerBodyProvider(new WailaPatch(), BlockGrass.class);
		reg.registerBodyProvider(new WailaPatch(), BlockGravel.class);
		
		reg.registerBodyProvider(new WAILAData(), BlockTorch.class);
		reg.registerNBTProvider(new WAILAData(), BlockTorch.class);
		
		reg.registerStackProvider(new WAILAData(), BlockWaterPlant.class);
		reg.registerHeadProvider(new WAILAData(), BlockWaterPlant.class);
		
		reg.registerStackProvider(new WAILAData(), TEWorldItem.class);
		reg.registerNBTProvider(new WAILAData(), TEWorldItem.class);
	}
	
	@Override public List<String> soilBody(ItemStack itemStack, List<String> currenttip, IWailaDataAccessor accessor, IWailaConfigHandler config) {
		Block b = accessor.getBlock();
		int dam = itemStack.getItemDamage();
		if ((b == TFCBlocks.dirt2) || (b == TFCBlocks.sand2) || TFC_Core.isGrassType2(b) || (b == TFCBlocks.gravel2)) dam += 16;
		
		if (dam < Global.STONE_ALL.length) currenttip.add(StatCollector.translateToLocal("ItemSoil.tooltip." + Global.STONE_ALL[dam]));
		else currenttip.add(EnumChatFormatting.DARK_RED + "Unknown");
		
		return currenttip;
	}
}
