package dev.wolfieboy09.mmetals.registries;

import com.tterrag.registrate.util.entry.ItemEntry;
import dev.wolfieboy09.mmetals.content.item.DirtyIngot;
import net.minecraft.world.item.Item;
import org.jetbrains.annotations.NotNull;

import java.util.function.Function;

import static dev.wolfieboy09.mmetals.registries.MMRRegistries.REGISTRATE;

public final class MMRItems {
    public static final ItemEntry<Item>
        CLAY_BRICK = register("clay_brick"),
        DIRTY_INGOT = register("dirty_ingot", DirtyIngot::new),
        UNFIRED_CERAMIC_MOLD = register("unfired_ceramic_mold"),
        CERAMIC_MOLD = register("ceramic_mold");

    private static <T extends Item> ItemEntry<T> register(String id, Function<Item.Properties, T> factory) {
        return REGISTRATE.item(id, factory::apply).register();
    }

    private static @NotNull ItemEntry<Item> register(String id) {
        return REGISTRATE.item(id, Item::new).register();
    }

    public static void init() {}
}

