package dev.wolfieboy09.mmetals.content.item.render;

import com.mojang.blaze3d.vertex.PoseStack;
import dev.wolfieboy09.mmetals.MoltenMetals;
import dev.wolfieboy09.mmetals.api.components.DirtyIngotComponent;
import dev.wolfieboy09.mmetals.registries.MMRDataComponents;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.geom.EntityModelSet;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderDispatcher;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.client.resources.model.BakedModel;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.item.ItemStack;

import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public class DirtyIngotRenderer extends BlockEntityWithoutLevelRenderer {
    public static final DirtyIngotRenderer INSTANCE = new DirtyIngotRenderer(
            Minecraft.getInstance().getBlockEntityRenderDispatcher(),
            Minecraft.getInstance().getEntityModels()
    );

    public static final ModelResourceLocation OVERLAY_MODEL = ModelResourceLocation.standalone(MoltenMetals.byId("item/dirty_ingot_overlay"));

    public DirtyIngotRenderer(BlockEntityRenderDispatcher dispatcher, EntityModelSet modelSet) {
        super(dispatcher, modelSet);
    }

    @Override
    public void renderByItem(ItemStack stack, ItemDisplayContext displayContext,
                             PoseStack poseStack, MultiBufferSource buffer,
                             int light, int overlay) {
        ItemRenderer itemRenderer = Minecraft.getInstance().getItemRenderer();

        DirtyIngotComponent data = stack.get(MMRDataComponents.DIRTY_INGOT.get());
        ItemStack ingot = data != null ? data.ingot() : ItemStack.EMPTY;
        if (ingot.isEmpty()) return;

        BakedModel ingotModel = itemRenderer.getModel(ingot, Minecraft.getInstance().level, null, 0);
        BakedModel overlayModel = Minecraft.getInstance().getModelManager()
                .getModel(OVERLAY_MODEL);

        poseStack.pushPose();

        poseStack.translate(0.5F, 0.5F, 0.5F);
        itemRenderer.render(ingot, displayContext, false, poseStack, buffer, light, overlay, ingotModel);

        final float amount = 0.01F;
        poseStack.translate(-0.001F, 0.01F, amount);
        itemRenderer.render(stack, displayContext, false, poseStack, buffer, light, overlay, overlayModel);

        poseStack.translate(0.0F, 0.0F, -amount * 2);
        itemRenderer.render(stack, displayContext, false, poseStack, buffer, light, overlay, overlayModel);
        poseStack.translate(0,0,0);
        poseStack.popPose();
    }
}