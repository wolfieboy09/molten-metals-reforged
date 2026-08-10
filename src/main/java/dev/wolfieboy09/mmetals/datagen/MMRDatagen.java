package dev.wolfieboy09.mmetals.datagen;

import dev.wolfieboy09.mmetals.MoltenMetals;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;

@EventBusSubscriber(modid = MoltenMetals.MOD_ID)
public class MMRDatagen {
    @SubscribeEvent
    public static void init(GatherDataEvent event) {

    }
}
