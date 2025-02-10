package io.github.chakyl.botaniaseeds.datagen;

import io.github.chakyl.botaniaseeds.BotaniaSeeds;
import io.github.chakyl.botaniaseeds.blocks.MysticalFlowerCropBlock;
import io.github.chakyl.botaniaseeds.registry.ModElements;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, BotaniaSeeds.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        ModElements.CROP_BLOCKS.getEntries().forEach(entry -> {
            customStageBlock(entry.get(), "cross", new ArrayList<>());
        });
    }
    public void customStageBlock(Block block, String textureKey, List<Integer> suffixes) {
        getVariantBuilder(block).forAllStates(state -> {
            int ageSuffix = state.getValue(MysticalFlowerCropBlock.AGE);
            if (ageSuffix == 5) ageSuffix = 4;
            String stageName = Objects.requireNonNull(ForgeRegistries.BLOCKS.getKey(block)).getPath() + "_stage";
            stageName += suffixes.isEmpty() ? ageSuffix : suffixes.get(Math.min(suffixes.size(), ageSuffix));
            return ConfiguredModel.builder().modelFile(models().singleTexture(stageName, mcLoc("minecraft:block/cross"), textureKey, new ResourceLocation(BotaniaSeeds.MODID, "block/" + stageName)).renderType("cutout")).build();
        });
    }

}
