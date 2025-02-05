package io.github.chakyl.botaniaseeds.registry;

import io.github.chakyl.botaniaseeds.BotaniaSeeds;
import io.github.chakyl.botaniaseeds.blocks.MysticalFlowerCropBlock;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import vazkii.botania.common.block.BotaniaBlocks;

import java.util.function.Supplier;

public class ModElements {
    public static final DeferredRegister<Block> CROP_BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BotaniaSeeds.MODID);
    public static final DeferredRegister<Item> SEED_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BotaniaSeeds.MODID);


    public static final RegistryObject<Block> WHITE_MYSTICAL_FLOWER_SEED = registerModBlock("white_mystical_flower_seed",
            () -> new MysticalFlowerCropBlock(BotaniaBlocks.whiteFlower, Items.BAKED_POTATO, BlockBehaviour.Properties.copy(Blocks.TORCHFLOWER_CROP).sound(SoundType.CROP)));


    private static <T extends Block> RegistryObject<T> registerModBlock(String name, Supplier<T> block) {
        RegistryObject<T> newObject = CROP_BLOCKS.register(name, block);
        registerItem(name, newObject);
        return newObject;
    }

    private static <T extends Block> void registerItem(String name, RegistryObject<T> block) {
        CreativeTab.addToTab(SEED_ITEMS.register(name, () -> new ItemNameBlockItem(block.get(), new Item.Properties())));
    }


    public static void register(IEventBus eventBus) {
        CROP_BLOCKS.register(eventBus);
        SEED_ITEMS.register(eventBus);
    }
}
