package dev.wolfieboy09.mmetals.datagen.recipes;

import com.simibubi.create.api.data.recipe.PressingRecipeGen;
import dev.wolfieboy09.mmetals.MoltenMetals;
import dev.wolfieboy09.mmetals.registries.MMRItems;
import dev.wolfieboy09.mmetals.registries.MMRTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;

import java.util.concurrent.CompletableFuture;

public class MMRPressing extends PressingRecipeGen {
    public MMRPressing(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, MoltenMetals.MOD_ID);
    }

    GeneratedRecipe
    UNFIRED_CERAMIC_MOLD = create("unfired_ceramic_mold", b ->
            b.require(MMRItems.CLAY_BRICK)
                    .require(MMRTags.MMRItemTags.INGOTS.tag)
                    .output(MMRItems.UNFIRED_CERAMIC_MOLD)
                    .output(MMRItems.DIRTY_INGOT));
}
