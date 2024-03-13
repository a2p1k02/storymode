package nodomain.a2p1k02.storymode.item;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;
import nodomain.a2p1k02.storymode.RubyTelling;
import nodomain.a2p1k02.storymode.util.ModTags;

import java.util.List;

public class ModToolTiers {

    public static final Tier RUBY = TierSortingRegistry.registerTier(
            new ForgeTier(5, 1500, 5f, 4f, 25,
                    ModTags.Blocks.NEEDS_RUBY_TOOL, () -> Ingredient.of(ModItems.RUBY.get())),
            new ResourceLocation(RubyTelling.MOD_ID, "ruby"), List.of(Tiers.DIAMOND), List.of());

}
