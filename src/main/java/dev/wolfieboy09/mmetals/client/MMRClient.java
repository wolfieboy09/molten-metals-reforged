package dev.wolfieboy09.mmetals.client;

import dev.wolfieboy09.mmetals.MoltenMetals;
import dev.wolfieboy09.mmetals.content.item.render.DirtyIngotRenderer;
import dev.wolfieboy09.mmetals.registries.MMRItems;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.ModelEvent;
import net.neoforged.neoforge.client.extensions.common.IClientItemExtensions;
import net.neoforged.neoforge.client.extensions.common.RegisterClientExtensionsEvent;
import org.jetbrains.annotations.NotNull;

@EventBusSubscriber(modid = MoltenMetals.MOD_ID, value = Dist.CLIENT)
public class MMRClient {
    @SubscribeEvent
    public static void registerAdditionalModels(ModelEvent.RegisterAdditional event) {
        event.register(DirtyIngotRenderer.OVERLAY_MODEL);
    }

    @SubscribeEvent
    public static void clientExtensionStuff(RegisterClientExtensionsEvent event) {
        event.registerItem(new IClientItemExtensions() {
            @Override
            public @NotNull BlockEntityWithoutLevelRenderer getCustomRenderer() {
                return DirtyIngotRenderer.INSTANCE;
            }
        }, MMRItems.DIRTY_INGOT);
    }
}
