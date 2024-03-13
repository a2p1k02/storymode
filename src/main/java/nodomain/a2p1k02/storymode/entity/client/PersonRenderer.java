package nodomain.a2p1k02.storymode.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import nodomain.a2p1k02.storymode.RubyTelling;
import nodomain.a2p1k02.storymode.entity.custom.PersonEntity;

public class PersonRenderer extends MobRenderer<PersonEntity, PersonModel<PersonEntity>> {

    public PersonRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new PersonModel<>(pContext.bakeLayer(ModModelLayers.PERSON_LAYER)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(PersonEntity personEntity) {
        return new ResourceLocation(RubyTelling.MOD_ID, "textures/entity/person.png");
    }

    @Override
    public void render(PersonEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pPoseStack,
                       MultiBufferSource pBuffer, int pPackedLight) {

        if (pEntity.isBaby()) {
            pPoseStack.scale(0.5f, 0.5f, 0.5f);
        }

        super.render(pEntity, pEntityYaw, pPartialTicks, pPoseStack, pBuffer, pPackedLight);
    }
}
