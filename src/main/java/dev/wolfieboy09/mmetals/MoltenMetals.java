package dev.wolfieboy09.mmetals;

import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;

@Mod(MoltenMetals.MOD_ID)
public class MoltenMetals {
    public static final String MOD_ID = "molten_metals";
    public static final Logger LOGGER = LogUtils.getLogger();

    public MoltenMetals(IEventBus eventBus, ModContainer container) {
        LOGGER.info("It's time to melt those metals!");
    }
}
