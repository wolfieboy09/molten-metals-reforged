package dev.wolfieboy09.mmetals.datagen.tags;

import dev.wolfieboy09.mmetals.registries.MMRItems;
import dev.wolfieboy09.mmetals.registries.MMRTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class MMRItemTagProvider extends ItemTagsProvider {
    public MMRItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTags) {
        super(output, lookupProvider, blockTags);
    }

    @Override
    protected void addTags(@NotNull HolderLookup.Provider provider) {
        tag(MMRTags.MMRItemTags.BRICKS.tag)
                .add(MMRItems.CLAY_BRICK.value());

        tag(MMRTags.MMRItemTags.CLAY_BRICKS.tag)
                .add(MMRItems.CLAY_BRICK.value());
    }
}
