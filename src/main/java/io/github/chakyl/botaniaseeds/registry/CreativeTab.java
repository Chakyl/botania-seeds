package io.github.chakyl.botaniaseeds.registry;

import io.github.chakyl.botaniaseeds.BotaniaSeeds;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import vazkii.botania.common.item.BotaniaItems;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class CreativeTab {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BotaniaSeeds.MODID);

    public static final List<Supplier<? extends ItemLike>> BOTANIA_SEEDS_TAB_ITEMS = new ArrayList<>();

    public static final RegistryObject<CreativeModeTab> BOTANIA_SEEDS_TAB = TABS.register("botania_seeds",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.botania_seeds"))
                    .icon(BotaniaItems.whitePetal::getDefaultInstance)
                    .displayItems((displayParams, output) -> {
                        BOTANIA_SEEDS_TAB_ITEMS.forEach(itemLike -> output.accept(itemLike.get()));
                    })
                    .build()
    );

    public static <T extends Item> RegistryObject<T> addToTab(RegistryObject<T> itemLike) {
        BOTANIA_SEEDS_TAB_ITEMS.add(itemLike);
        return itemLike;
    }
}
