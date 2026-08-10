package dev.wolfieboy09.mmetals.registries;

import dev.wolfieboy09.mmetals.MoltenMetals;
import net.createmod.catnip.lang.Lang;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

import static dev.wolfieboy09.mmetals.registries.MMRTags.NameSpace.*;

public class MMRTags {
    public enum NameSpace {
        MOD(MoltenMetals.MOD_ID),
        COMMON("c");

        public final String id;
        NameSpace(String id) {
            this.id = id;
        }
    }

    public enum MMRItemTags {
        INGOTS(COMMON, "ingots"),
        BRICKS(COMMON, "bricks"),
        CLAY_BRICKS(COMMON, "bricks/clay");

        public final TagKey<Item> tag;

        MMRItemTags() {
            this(MOD);
        }
        MMRItemTags(NameSpace namespace) {
            this(namespace, null);
        }
        MMRItemTags(NameSpace namespace, String path) {
            ResourceLocation id = ResourceLocation.fromNamespaceAndPath(namespace.id, path == null ? Lang.asId(name()) : path);
            this.tag = ItemTags.create(id);
        }
    }
}
