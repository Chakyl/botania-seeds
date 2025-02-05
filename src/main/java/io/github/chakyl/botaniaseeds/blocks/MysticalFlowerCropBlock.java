package io.github.chakyl.botaniaseeds.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.common.IPlantable;
import vazkii.botania.common.block.BotaniaFlowerBlock;

public class MysticalFlowerCropBlock extends CropBlock implements IPlantable {
    public static int MAX_AGE = 4;
    public static final IntegerProperty AGE = BlockStateProperties.AGE_4;
    private static final float AABB_OFFSET = 3.0F;
    private static final VoxelShape[] SHAPE_BY_AGE = new VoxelShape[]{Block.box(5.0D, 0.0D, 5.0D, 11.0D, 6.0D, 11.0D), Block.box(5.0D, 0.0D, 5.0D, 11.0D, 10.0D, 11.0D)};
    private static final int BONEMEAL_INCREASE = 1;
    private static Block FLOWER_BLOCK;
    private static Item SEED_ITEM;

    public MysticalFlowerCropBlock(Block flowerBlock, Item seedItem, BlockBehaviour.Properties properties) {
        super(properties);
        FLOWER_BLOCK = flowerBlock;
        SEED_ITEM = seedItem;
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> blockStateBuilder) {
        blockStateBuilder.add(AGE);
    }

    protected  IntegerProperty getAgeProperty() {
        return AGE;
    }

    public int getMaxAge() {
        return MAX_AGE;
    }

    protected Item getBaseSeedId() {
        return SEED_ITEM;
    }

    public BlockState getStateForAge(int age) {
        return age == MAX_AGE ? FLOWER_BLOCK.defaultBlockState() : super.getStateForAge(age);
    }
    public void randomTick(BlockState blockState, ServerLevel level, BlockPos pos, RandomSource randomSource) {
        if (randomSource.nextInt(MAX_AGE + 1) != 0) {
            super.randomTick(blockState, level, pos, randomSource);
        }

    }
    protected  int getBonemealIncrease(Level level) {
        return 1;
    }
}
