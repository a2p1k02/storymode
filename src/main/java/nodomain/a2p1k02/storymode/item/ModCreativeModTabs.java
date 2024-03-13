package nodomain.a2p1k02.storymode.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import nodomain.a2p1k02.storymode.RubyTelling;
import nodomain.a2p1k02.storymode.block.ModBlocks;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RubyTelling.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TABS.register("ruby",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.RUBY.get()))
                    .title(Component.translatable("itemgroup.ruby"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.RUBY.get());
                        pOutput.accept(ModBlocks.RUBY_BLOCK.get());
                        pOutput.accept(ModBlocks.RUBY_ORE.get());
                        pOutput.accept(ModItems.RUBY_SWORD.get());
                        pOutput.accept(ModItems.RUBY_PICKAXE.get());
                        pOutput.accept(ModItems.RUBY_AXE.get());
                        pOutput.accept(ModItems.RUBY_SHOVEL.get());
                        pOutput.accept(ModItems.RUBY_HELMET.get());
                        pOutput.accept(ModItems.RUBY_CHESTPLATE.get());
                        pOutput.accept(ModItems.RUBY_LEGGINGS.get());
                        pOutput.accept(ModItems.RUBY_BOOTS.get());
                        pOutput.accept(ModItems.RUBY_SPAWN_EGG.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
