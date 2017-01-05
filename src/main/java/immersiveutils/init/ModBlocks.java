package immersiveutils.init;

import com.bioxx.tfc.Blocks.Vanilla.BlockCustomWall;
import cpw.mods.fml.common.registry.GameRegistry;
import immersiveutils.block.*;
import immersiveutils.item.ItemBlockStone;
import immersiveutils.ref.StoneType;
import net.minecraft.block.Block;

/**
 * Created by Xechon on 1/1/2017.
 */
public class ModBlocks {
	public static Block anthracite = new BlockAnthracite().setHardness(8F).setBlockName("Anthracite");
	public static Block breccia = new BlockBreccia().setHardness(8F).setBlockName("Breccia");
	public static Block eclogite = new BlockEclogite().setHardness(8F).setBlockName("Eclogite");
	public static Block komatiite = new BlockKomatiite().setHardness(8F).setBlockName("Komatiite");
	public static Block lamprophyre = new BlockLamprophyre().setHardness(8F).setBlockName("Lamprophyre");
	
	public static Block cobblestone = new BlockStoneCobble().setHardness(16F).setBlockName("StoneCobble");
	public static Block smoothStone = new BlockSmoothStone().setHardness(16F).setBlockName("SmoothStone");
	public static Block stoneBrick = new BlockStoneBrick().setHardness(16F).setBlockName("StoneBrick");
	
	public static Block wallEclogite = new BlockCustomWall(eclogite, 1).setBlockName("WallEclogite");
	public static Block wallKomatiite = new BlockCustomWall(komatiite, 1).setBlockName("WallKomatiite");
	public static Block wallCobble = new BlockCustomWall(cobblestone, StoneType.stone.length).setBlockName("WallCobble");
	public static Block wallSmooth = new BlockCustomWall(smoothStone, StoneType.stone.length).setBlockName("WallSmooth");
	public static Block wallBrick = new BlockCustomWall(stoneBrick, StoneType.stone.length).setBlockName("WallBrick");
	
	public static void register() {
		GameRegistry.registerBlock(anthracite, ItemBlockStone.class, anthracite.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(breccia, ItemBlockStone.class, breccia.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(eclogite, ItemBlockStone.class, eclogite.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(komatiite, ItemBlockStone.class, komatiite.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(lamprophyre, ItemBlockStone.class, lamprophyre.getUnlocalizedName().substring(5));
		
		GameRegistry.registerBlock(cobblestone, ItemBlockStone.class, cobblestone.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(smoothStone, ItemBlockStone.class, smoothStone.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(stoneBrick, ItemBlockStone.class, stoneBrick.getUnlocalizedName().substring(5));
		
		GameRegistry.registerBlock(wallEclogite, ItemBlockStone.class, wallEclogite.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(wallKomatiite, ItemBlockStone.class, wallKomatiite.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(wallCobble, ItemBlockStone.class, wallCobble.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(wallSmooth, ItemBlockStone.class, wallSmooth.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(wallBrick, ItemBlockStone.class, wallBrick.getUnlocalizedName().substring(5));
	}
}
