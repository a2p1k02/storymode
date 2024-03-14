package nodomain.a2p1k02.storymode.item.custom;

import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class GodHealthBook extends Item implements MenuProvider {

    public GodHealthBook(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public @NotNull InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pUsedHand) {
        if (!pLevel.isClientSide) {
            if (pPlayer.getAttribute(Attributes.MAX_HEALTH).getValue() < 200) {
                pPlayer.getAttribute(Attributes.MAX_HEALTH).addPermanentModifier(new AttributeModifier("health", 10, AttributeModifier.Operation.ADDITION));
                pPlayer.sendSystemMessage(Component.translatable("message.storymode.success"));
            } else {
                pPlayer.sendSystemMessage(Component.translatable("message.storymode.failure"));
            }
        }
        return super.use(pLevel, pPlayer, pUsedHand);
    }

    @Override
    public Component getDisplayName() {
        return null;
    }

    @Nullable
    @Override
    public AbstractContainerMenu createMenu(int i, Inventory inventory, Player player) {
        return null;
    }
}
