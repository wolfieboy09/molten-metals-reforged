package dev.wolfieboy09.mmetals.registries;

import com.tterrag.registrate.Registrate;
import dev.wolfieboy09.mmetals.MoltenMetals;
import net.neoforged.bus.api.IEventBus;

public class MMRRegistries {
    public static final Registrate REGISTRATE = Registrate.create(MoltenMetals.MOD_ID);

    public static void init(IEventBus bus) {
        MMRItems.init();
        MMRDataComponents.DATA_COMPONENTS.register(bus);
    }
}
