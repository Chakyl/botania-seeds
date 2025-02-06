package io.github.chakyl.botaniaseeds.registry;

import io.github.chakyl.botaniaseeds.BotaniaSeeds;
import io.github.chakyl.botaniaseeds.blocks.MysticalFlowerCropBlock;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import vazkii.botania.common.block.BotaniaBlocks;

import java.util.function.Supplier;

public class ModElements {
    public static final DeferredRegister<Block> CROP_BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BotaniaSeeds.MODID);
    public static final DeferredRegister<Item> SEED_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BotaniaSeeds.MODID);

    public static final RegistryObject<Block> WHITE_MYSTICAL_FLOWER_CROP = registerModBlock("white_mystical_flower_crop", () -> new MysticalFlowerCropBlock(BotaniaBlocks.whiteFlower, DyeColor.WHITE, BlockBehaviour.Properties.copy(Blocks.TORCHFLOWER_CROP).sound(SoundType.CROP)));
    public static final RegistryObject<Block> ORANGE_MYSTICAL_FLOWER_CROP = registerModBlock("orange_mystical_flower_crop", () -> new MysticalFlowerCropBlock(BotaniaBlocks.orangeFlower, DyeColor.ORANGE, BlockBehaviour.Properties.copy(Blocks.TORCHFLOWER_CROP).sound(SoundType.CROP)));
    public static final RegistryObject<Block> MAGENTA_MYSTICAL_FLOWER_CROP = registerModBlock("magenta_mystical_flower_crop", () -> new MysticalFlowerCropBlock(BotaniaBlocks.magentaFlower, DyeColor.MAGENTA, BlockBehaviour.Properties.copy(Blocks.TORCHFLOWER_CROP).sound(SoundType.CROP)));
    public static final RegistryObject<Block> LIGHT_BLUE_MYSTICAL_FLOWER_CROP = registerModBlock("light_blue_mystical_flower_crop", () -> new MysticalFlowerCropBlock(BotaniaBlocks.lightBlueFlower, DyeColor.LIGHT_BLUE, BlockBehaviour.Properties.copy(Blocks.TORCHFLOWER_CROP).sound(SoundType.CROP)));
    public static final RegistryObject<Block> YELLOW_MYSTICAL_FLOWER_CROP = registerModBlock("yellow_mystical_flower_crop", () -> new MysticalFlowerCropBlock(BotaniaBlocks.yellowFlower, DyeColor.YELLOW, BlockBehaviour.Properties.copy(Blocks.TORCHFLOWER_CROP).sound(SoundType.CROP)));
    public static final RegistryObject<Block> LIME_MYSTICAL_FLOWER_CROP = registerModBlock("lime_mystical_flower_crop", () -> new MysticalFlowerCropBlock(BotaniaBlocks.limeFlower, DyeColor.LIME, BlockBehaviour.Properties.copy(Blocks.TORCHFLOWER_CROP).sound(SoundType.CROP)));
    public static final RegistryObject<Block> PINK_MYSTICAL_FLOWER_CROP = registerModBlock("pink_mystical_flower_crop", () -> new MysticalFlowerCropBlock(BotaniaBlocks.pinkFlower, DyeColor.PINK, BlockBehaviour.Properties.copy(Blocks.TORCHFLOWER_CROP).sound(SoundType.CROP)));
    public static final RegistryObject<Block> GRAY_MYSTICAL_FLOWER_CROP = registerModBlock("gray_mystical_flower_crop", () -> new MysticalFlowerCropBlock(BotaniaBlocks.grayFlower, DyeColor.GRAY, BlockBehaviour.Properties.copy(Blocks.TORCHFLOWER_CROP).sound(SoundType.CROP)));
    public static final RegistryObject<Block> LIGHT_GRAY_MYSTICAL_FLOWER_CROP = registerModBlock("light_gray_mystical_flower_crop", () -> new MysticalFlowerCropBlock(BotaniaBlocks.lightGrayFlower, DyeColor.LIGHT_GRAY, BlockBehaviour.Properties.copy(Blocks.TORCHFLOWER_CROP).sound(SoundType.CROP)));
    public static final RegistryObject<Block> CYAN_MYSTICAL_FLOWER_CROP = registerModBlock("cyan_mystical_flower_crop", () -> new MysticalFlowerCropBlock(BotaniaBlocks.cyanFlower, DyeColor.CYAN, BlockBehaviour.Properties.copy(Blocks.TORCHFLOWER_CROP).sound(SoundType.CROP)));
    public static final RegistryObject<Block> PURPLE_MYSTICAL_FLOWER_CROP = registerModBlock("purple_mystical_flower_crop", () -> new MysticalFlowerCropBlock(BotaniaBlocks.purpleFlower, DyeColor.PURPLE, BlockBehaviour.Properties.copy(Blocks.TORCHFLOWER_CROP).sound(SoundType.CROP)));
    public static final RegistryObject<Block> BLUE_MYSTICAL_FLOWER_CROP = registerModBlock("blue_mystical_flower_crop", () -> new MysticalFlowerCropBlock(BotaniaBlocks.blueFlower, DyeColor.BLUE, BlockBehaviour.Properties.copy(Blocks.TORCHFLOWER_CROP).sound(SoundType.CROP)));
    public static final RegistryObject<Block> BROWN_MYSTICAL_FLOWER_CROP = registerModBlock("brown_mystical_flower_crop", () -> new MysticalFlowerCropBlock(BotaniaBlocks.brownFlower, DyeColor.BROWN, BlockBehaviour.Properties.copy(Blocks.TORCHFLOWER_CROP).sound(SoundType.CROP)));
    public static final RegistryObject<Block> GREEN_MYSTICAL_FLOWER_CROP = registerModBlock("green_mystical_flower_crop", () -> new MysticalFlowerCropBlock(BotaniaBlocks.greenFlower, DyeColor.GREEN, BlockBehaviour.Properties.copy(Blocks.TORCHFLOWER_CROP).sound(SoundType.CROP)));
    public static final RegistryObject<Block> RED_MYSTICAL_FLOWER_CROP = registerModBlock("red_mystical_flower_crop", () -> new MysticalFlowerCropBlock(BotaniaBlocks.redFlower, DyeColor.RED, BlockBehaviour.Properties.copy(Blocks.TORCHFLOWER_CROP).sound(SoundType.CROP)));
    public static final RegistryObject<Block> BLACK_MYSTICAL_FLOWER_CROP = registerModBlock("black_mystical_flower_crop", () -> new MysticalFlowerCropBlock(BotaniaBlocks.blackFlower, DyeColor.BLACK, BlockBehaviour.Properties.copy(Blocks.TORCHFLOWER_CROP).sound(SoundType.CROP)));

    public static final RegistryObject<Item> WHITE_MYSTICAL_FLOWER_SEED = registerItem("white_mystical_flower_seed", () -> new ItemNameBlockItem(ModElements.WHITE_MYSTICAL_FLOWER_CROP.get(), new Item.Properties()));
    public static final RegistryObject<Item> ORANGE_MYSTICAL_FLOWER_SEED = registerItem("orange_mystical_flower_seed", () -> new ItemNameBlockItem(ModElements.ORANGE_MYSTICAL_FLOWER_CROP.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAGENTA_MYSTICAL_FLOWER_SEED = registerItem("magenta_mystical_flower_seed", () -> new ItemNameBlockItem(ModElements.MAGENTA_MYSTICAL_FLOWER_CROP.get(), new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_BLUE_MYSTICAL_FLOWER_SEED = registerItem("light_blue_mystical_flower_seed", () -> new ItemNameBlockItem(ModElements.LIGHT_BLUE_MYSTICAL_FLOWER_CROP.get(), new Item.Properties()));
    public static final RegistryObject<Item> YELLOW_MYSTICAL_FLOWER_SEED = registerItem("yellow_mystical_flower_seed", () -> new ItemNameBlockItem(ModElements.YELLOW_MYSTICAL_FLOWER_CROP.get(), new Item.Properties()));
    public static final RegistryObject<Item> LIME_MYSTICAL_FLOWER_SEED = registerItem("lime_mystical_flower_seed", () -> new ItemNameBlockItem(ModElements.LIME_MYSTICAL_FLOWER_CROP.get(), new Item.Properties()));
    public static final RegistryObject<Item> PINK_MYSTICAL_FLOWER_SEED = registerItem("pink_mystical_flower_seed", () -> new ItemNameBlockItem(ModElements.PINK_MYSTICAL_FLOWER_CROP.get(), new Item.Properties()));
    public static final RegistryObject<Item> GRAY_MYSTICAL_FLOWER_SEED = registerItem("gray_mystical_flower_seed", () -> new ItemNameBlockItem(ModElements.GRAY_MYSTICAL_FLOWER_CROP.get(), new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_GRAY_MYSTICAL_FLOWER_SEED = registerItem("light_gray_mystical_flower_seed", () -> new ItemNameBlockItem(ModElements.LIGHT_GRAY_MYSTICAL_FLOWER_CROP.get(), new Item.Properties()));
    public static final RegistryObject<Item> CYAN_MYSTICAL_FLOWER_SEED = registerItem("cyan_mystical_flower_seed", () -> new ItemNameBlockItem(ModElements.CYAN_MYSTICAL_FLOWER_CROP.get(), new Item.Properties()));
    public static final RegistryObject<Item> PURPLE_MYSTICAL_FLOWER_SEED = registerItem("purple_mystical_flower_seed", () -> new ItemNameBlockItem(ModElements.PURPLE_MYSTICAL_FLOWER_CROP.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLUE_MYSTICAL_FLOWER_SEED = registerItem("blue_mystical_flower_seed", () -> new ItemNameBlockItem(ModElements.BLUE_MYSTICAL_FLOWER_CROP.get(), new Item.Properties()));
    public static final RegistryObject<Item> BROWN_MYSTICAL_FLOWER_SEED = registerItem("brown_mystical_flower_seed", () -> new ItemNameBlockItem(ModElements.BROWN_MYSTICAL_FLOWER_CROP.get(), new Item.Properties()));
    public static final RegistryObject<Item> GREEN_MYSTICAL_FLOWER_SEED = registerItem("green_mystical_flower_seed", () -> new ItemNameBlockItem(ModElements.GREEN_MYSTICAL_FLOWER_CROP.get(), new Item.Properties()));
    public static final RegistryObject<Item> RED_MYSTICAL_FLOWER_SEED = registerItem("red_mystical_flower_seed", () -> new ItemNameBlockItem(ModElements.RED_MYSTICAL_FLOWER_CROP.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLACK_MYSTICAL_FLOWER_SEED = registerItem("black_mystical_flower_seed", () -> new ItemNameBlockItem(ModElements.BLACK_MYSTICAL_FLOWER_CROP.get(), new Item.Properties()));


    private static <T extends Block> RegistryObject<T> registerModBlock(String name, Supplier<T> block) {
        return CROP_BLOCKS.register(name, block);
    }

    private static <T extends Item> RegistryObject<T> registerItem(String name, Supplier<T> item) {
        return CreativeTab.addToTab(SEED_ITEMS.register(name, item));
    }

    public static void register(IEventBus eventBus) {
        CROP_BLOCKS.register(eventBus);
        SEED_ITEMS.register(eventBus);
    }
}
