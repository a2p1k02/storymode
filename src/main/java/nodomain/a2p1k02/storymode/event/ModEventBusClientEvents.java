package nodomain.a2p1k02.storymode.event;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import nodomain.a2p1k02.storymode.RubyTelling;
import nodomain.a2p1k02.storymode.entity.client.ModModelLayers;
import nodomain.a2p1k02.storymode.entity.client.PersonModel;

@Mod.EventBusSubscriber(modid = RubyTelling.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventBusClientEvents {
    @SubscribeEvent
    public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ModModelLayers.PERSON_LAYER, PersonModel::createBodyLayer);
    }
}