package dev.wolfieboy09.mmetals.registries;

import dev.wolfieboy09.mmetals.MoltenMetals;
import dev.wolfieboy09.mmetals.api.components.DirtyIngotComponent;
import net.minecraft.core.component.DataComponentType;
import net.minecraft.core.registries.Registries;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public final class MMRDataComponents {
    public static final DeferredRegister.DataComponents DATA_COMPONENTS = DeferredRegister.createDataComponents(Registries.DATA_COMPONENT_TYPE, MoltenMetals.MOD_ID);

    public static final DeferredHolder<DataComponentType<?>, DataComponentType<DirtyIngotComponent>> DIRTY_INGOT = DATA_COMPONENTS.registerComponentType(
            "dirty_ingot",
            builder -> builder
                    .persistent(DirtyIngotComponent.CODEC)
                    .networkSynchronized(DirtyIngotComponent.STREAM_CODEC)
    );
}
