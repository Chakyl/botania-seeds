package io.github.chakyl.botaniaseeds;

import com.mojang.logging.LogUtils;
import io.github.chakyl.botaniaseeds.registry.CreativeTab;
import io.github.chakyl.botaniaseeds.registry.ModElements;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(BotaniaSeeds.MODID)
public class BotaniaSeeds {
    public static final String MODID = "botania_seeds";
    public static final Logger LOGGER = LogUtils.getLogger();

    public BotaniaSeeds() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModElements.register(modEventBus);
        CreativeTab.TABS.register(modEventBus);

    }
}