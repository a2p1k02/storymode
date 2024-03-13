package nodomain.a2p1k02.storymode;

import com.mojang.logging.LogUtils;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import nodomain.a2p1k02.storymode.block.ModBlocks;
import nodomain.a2p1k02.storymode.entity.ModEntities;
import nodomain.a2p1k02.storymode.entity.client.PersonRenderer;
import nodomain.a2p1k02.storymode.item.ModCreativeModTabs;
import nodomain.a2p1k02.storymode.item.ModItems;
import org.slf4j.Logger;

@Mod(RubyTelling.MOD_ID)
public class RubyTelling
{
    public static final String MOD_ID = "storymode";

    private static final Logger LOGGER = LogUtils.getLogger();

    public RubyTelling() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModCreativeModTabs.register(modEventBus);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        ModEntities.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);

    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModItems.RUBY);
        }

        if (event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
            event.accept(ModItems.RUBY_PICKAXE);
            event.accept(ModItems.RUBY_AXE);
            event.accept(ModItems.RUBY_SHOVEL);
        }

        if (event.getTabKey() == CreativeModeTabs.COMBAT) {
            event.accept(ModItems.RUBY_SWORD);
            event.accept(ModItems.RUBY_BOOTS);
            event.accept(ModItems.RUBY_LEGGINGS);
            event.accept(ModItems.RUBY_HELMET);
            event.accept(ModItems.RUBY_CHESTPLATE);
        }

        if (event.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
            event.accept(ModItems.RUBY_SPAWN_EGG);
        }

        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            event.accept(ModBlocks.RUBY_BLOCK);
            event.accept(ModBlocks.RUBY_ORE);
        }
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            EntityRenderers.register(ModEntities.PERSON.get(), PersonRenderer::new);
        }
    }
}
