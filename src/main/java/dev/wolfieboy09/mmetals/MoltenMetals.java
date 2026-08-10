package dev.wolfieboy09.mmetals;

import com.mojang.logging.LogUtils;
import dev.wolfieboy09.mmetals.registries.MMRRegistries;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;

@Mod(MoltenMetals.MOD_ID)
public class MoltenMetals {
    public static final String MOD_ID = "molten_metals";
    public static final Logger LOGGER = LogUtils.getLogger();

    public MoltenMetals(IEventBus eventBus, ModContainer container) {
        LOGGER.info("It's time to melt those metals!");
        MMRRegistries.init(eventBus);
    }

    @Contract("_ -> new")
    public static @NotNull ResourceLocation byId(String id) {
        return ResourceLocation.fromNamespaceAndPath(MOD_ID, id);
    }
}
