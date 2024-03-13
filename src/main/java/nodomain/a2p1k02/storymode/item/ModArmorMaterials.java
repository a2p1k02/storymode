package nodomain.a2p1k02.storymode.item;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import nodomain.a2p1k02.storymode.RubyTelling;

public class ModArmorMaterials implements ArmorMaterial {

    private final int protection;

    public ModArmorMaterials(int protection) {
        this.protection = protection;
    }

    @Override
    public int getDurabilityForType(ArmorItem.Type type) {
        return 500;
    }

    @Override
    public int getDefenseForType(ArmorItem.Type type) {
        return protection;
    }

    @Override
    public int getEnchantmentValue() {
        return 25;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ARMOR_EQUIP_GOLD;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.of(ModItems.RUBY.get());
    }

    @Override
    public String getName() {
        return RubyTelling.MOD_ID + ":ruby";
    }

    @Override
    public float getToughness() {
        return 2;
    }

    @Override
    public float getKnockbackResistance() {
        return 1;
    }
}
