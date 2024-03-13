package nodomain.a2p1k02.storymode.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import nodomain.a2p1k02.storymode.RubyTelling;
import nodomain.a2p1k02.storymode.entity.custom.PersonEntity;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, RubyTelling.MOD_ID);

    public static final RegistryObject<EntityType<PersonEntity>> PERSON = ENTITY_TYPES.register("person",
            () -> EntityType.Builder.of(PersonEntity::new, MobCategory.CREATURE)
                    .sized(1.f, 1.f).build("person"));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}