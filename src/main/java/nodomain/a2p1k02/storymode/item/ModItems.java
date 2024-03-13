package nodomain.a2p1k02.storymode.item;

import net.minecraft.world.item.*;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import nodomain.a2p1k02.storymode.RubyTelling;
import nodomain.a2p1k02.storymode.entity.ModEntities;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, RubyTelling.MOD_ID);

    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe",
            () -> new PickaxeItem(ModToolTiers.RUBY, 1, 3, new Item.Properties()));

    public static final RegistryObject<Item> RUBY_AXE = ITEMS.register("ruby_axe",
            () -> new AxeItem(ModToolTiers.RUBY, 3, 1, new Item.Properties()));

    public static final RegistryObject<Item> RUBY_SHOVEL = ITEMS.register("ruby_shovel",
            () -> new ShovelItem(ModToolTiers.RUBY, 1, 1, new Item.Properties()));

    public static final RegistryObject<Item> RUBY_SWORD = ITEMS.register("ruby_sword",
            () -> new SwordItem(ModToolTiers.RUBY, 2, 2, new Item.Properties()));

    public static final RegistryObject<Item> RUBY_BOOTS = ITEMS.register("ruby_boots",
            () -> new ArmorItem(new ModArmorMaterials(3), ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> RUBY_HELMET = ITEMS.register("ruby_helmet",
            () -> new ArmorItem(new ModArmorMaterials(3), ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<Item> RUBY_LEGGINGS = ITEMS.register("ruby_leggings",
            () -> new ArmorItem(new ModArmorMaterials(4), ArmorItem.Type.LEGGINGS, new Item.Properties()));

    public static final RegistryObject<Item> RUBY_CHESTPLATE = ITEMS.register("ruby_chestplate",
            () -> new ArmorItem(new ModArmorMaterials(6), ArmorItem.Type.CHESTPLATE, new Item.Properties()));

    public static final RegistryObject<Item> RUBY_SPAWN_EGG = ITEMS.register("ruby_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.PERSON, 0xF0ABD1, 0xAE4C82, new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
