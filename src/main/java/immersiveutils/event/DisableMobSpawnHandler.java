package immersiveutils.event;

import com.bioxx.tfc.Entities.Mobs.EntityWolfTFC;
import com.bioxx.tfc.api.Entities.IAnimal;
import cpw.mods.fml.common.eventhandler.Event;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.living.LivingSpawnEvent;

/**
 * Created by Xechon on 1/1/2017.
 */
public class DisableMobSpawnHandler {
	@SubscribeEvent
	public void onMobSpawn(LivingSpawnEvent.CheckSpawn event) {
		if(event.entity != null && !(event.entity instanceof EntityPlayer || (event.entity instanceof IAnimal &&
			!(event.entity instanceof EntityWolfTFC)))) {
			event.world.removeEntity(event.entity);
			event.setResult(Event.Result.DENY);
		}
	}
}
