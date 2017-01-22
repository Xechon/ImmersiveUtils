package immersiveutils.event;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;
import micdoodle8.mods.galacticraft.core.GalacticraftCore;
import micdoodle8.mods.galacticraft.core.network.PacketSimple;
import net.minecraft.client.settings.KeyBinding;
import org.lwjgl.input.Keyboard;

/**
 * Created by Xechon on 1/14/2017.
 */
public class InputHandler {
	public static KeyBinding keyGalacticraftInventory = new KeyBinding("key.GalacticraftInventory", Keyboard.KEY_G, "ImmersiveUtils");
	
	//@Optional.Method(modid = ImmersiveUtilsMod.MOD_ID)
	@SubscribeEvent public void onKeyInput(InputEvent.KeyInputEvent event) {
		if(FMLClientHandler.instance().getClient().inGameHasFocus && keyGalacticraftInventory.isPressed()) {
			GalacticraftCore.packetPipeline.sendToServer(new PacketSimple(PacketSimple.EnumSimplePacket.S_OPEN_EXTENDED_INVENTORY, new Object[]{}));
		}
	}
}
