package dev.wolfieboy09.mmetals.content.item;

import dev.wolfieboy09.mmetals.api.components.DirtyIngotComponent;
import dev.wolfieboy09.mmetals.registries.MMRDataComponents;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class DirtyIngot extends Item {
    public DirtyIngot(Properties properties) {
        super(properties.component(MMRDataComponents.DIRTY_INGOT, new DirtyIngotComponent(ItemStack.EMPTY)));
    }
}
