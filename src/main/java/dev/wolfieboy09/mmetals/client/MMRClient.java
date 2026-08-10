package dev.wolfieboy09.mmetals.client;

import dev.wolfieboy09.mmetals.MoltenMetals;
import dev.wolfieboy09.mmetals.content.item.render.DirtyIngotRenderer;
import dev.wolfieboy09.mmetals.registries.MMRItems;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.ModelEvent;
import net.neoforged.neoforge.client.event.RegisterItemDecorationsEvent;

@EventBusSubscriber(modid = MoltenMetals.MOD_ID, value = Dist.CLIENT)
public class MMRClient {
    @SubscribeEvent
    public static void registerAdditionalModels(ModelEvent.RegisterAdditional event) {
        event.register(DirtyIngotRenderer.OVERLAY_MODEL);
    }

    @SubscribeEvent
    public static void decorationThing(RegisterItemDecorationsEvent event) {
        event.register(MMRItems.DIRTY_INGOT.asItem(), DirtyIngotRenderer::render);
    }
}
