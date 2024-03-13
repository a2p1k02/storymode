package nodomain.a2p1k02.storymode.event;

import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import nodomain.a2p1k02.storymode.RubyTelling;
import nodomain.a2p1k02.storymode.entity.ModEntities;
import nodomain.a2p1k02.storymode.entity.custom.PersonEntity;

@Mod.EventBusSubscriber(modid = RubyTelling.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.PERSON.get(), PersonEntity.createAttributes().build());
    }
}