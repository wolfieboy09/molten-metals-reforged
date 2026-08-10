package dev.wolfieboy09.mmetals.content.item.render;

import dev.wolfieboy09.mmetals.MoltenMetals;
import dev.wolfieboy09.mmetals.api.components.DirtyIngotComponent;
import dev.wolfieboy09.mmetals.registries.MMRDataComponents;
import net.minecraft.client.gui.Font;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;

import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public class DirtyIngotRenderer {
    public static final ModelResourceLocation OVERLAY_MODEL = ModelResourceLocation.standalone(MoltenMetals.byId("item/dirty_ingot_overlay"));
    private static final ResourceLocation OVERLAY = MoltenMetals.byId("textures/item/dirty_ingot.png");

    public static boolean render(GuiGraphics guiGraphics, Font font, ItemStack itemStack, int x, int y) {
        DirtyIngotComponent data = itemStack.get(MMRDataComponents.DIRTY_INGOT.get());
        ItemStack ingot = data != null ? data.ingot() : ItemStack.EMPTY;
        if (ingot.isEmpty()) return false;

        guiGraphics.renderItem(ingot, x, y);

        guiGraphics.pose().pushPose();
        guiGraphics.pose().translate(0.0F, 0.0F, 200.0F);
        guiGraphics.blit(OVERLAY, x, y, 0.0F, 0.0F, 16, 16, 16, 16);
        guiGraphics.pose().popPose();

        return true;
    }
}
