package io.github.chakyl.botaniaseeds.blocks;

import io.github.chakyl.botaniaseeds.registry.ModElements;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.common.IPlantable;
import vazkii.botania.client.fx.SparkleParticleData;
import vazkii.botania.common.block.BotaniaFlowerBlock;
import vazkii.botania.common.item.material.MysticalPetalItem;
import vazkii.botania.xplat.BotaniaConfig;

public class MysticalFlowerCropBlock extends CropBlock implements IPlantable {
    public static int MAX_AGE = 4;
    public static final IntegerProperty AGE = BlockStateProperties.AGE_4;
    private static final float AABB_OFFSET = 3.0F;
    private static final VoxelShape[] SHAPE_BY_AGE = new VoxelShape[]{Block.box(5.0D, 0.0D, 5.0D, 11.0D, 6.0D, 11.0D), Block.box(5.0D, 0.0D, 5.0D, 11.0D, 10.0D, 11.0D)};
    private static final int BONEMEAL_INCREASE = 1;
    private final Block FLOWER_BLOCK;
    private final DyeColor DYE_COLOR;

    public MysticalFlowerCropBlock(Block flowerBlock, DyeColor dyeColor, BlockBehaviour.Properties properties) {
        super(properties);
        FLOWER_BLOCK = flowerBlock;
        DYE_COLOR = dyeColor;
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
        return switch (DYE_COLOR) {
            case WHITE -> ModElements.WHITE_MYSTICAL_FLOWER_SEED.get();
            case ORANGE -> ModElements.ORANGE_MYSTICAL_FLOWER_SEED.get();
            case MAGENTA -> ModElements.MAGENTA_MYSTICAL_FLOWER_SEED.get();
            case LIGHT_BLUE -> ModElements.LIGHT_BLUE_MYSTICAL_FLOWER_SEED.get();
            case YELLOW -> ModElements.YELLOW_MYSTICAL_FLOWER_SEED.get();
            case LIME -> ModElements.LIME_MYSTICAL_FLOWER_SEED.get();
            case PINK -> ModElements.PINK_MYSTICAL_FLOWER_SEED.get();
            case GRAY -> ModElements.GRAY_MYSTICAL_FLOWER_SEED.get();
            case LIGHT_GRAY -> ModElements.LIGHT_GRAY_MYSTICAL_FLOWER_SEED.get();
            case CYAN -> ModElements.CYAN_MYSTICAL_FLOWER_SEED.get();
            case PURPLE -> ModElements.PURPLE_MYSTICAL_FLOWER_SEED.get();
            case BLUE -> ModElements.BLUE_MYSTICAL_FLOWER_SEED.get();
            case BROWN -> ModElements.BROWN_MYSTICAL_FLOWER_SEED.get();
            case GREEN -> ModElements.GREEN_MYSTICAL_FLOWER_SEED.get();
            case RED -> ModElements.RED_MYSTICAL_FLOWER_SEED.get();
            case BLACK -> ModElements.BLACK_MYSTICAL_FLOWER_SEED.get();
        };
    }

    public void animateTick(BlockState state, Level world, BlockPos pos, RandomSource rand) {
        int hex = MysticalPetalItem.getPetalLikeColor(DYE_COLOR);
        int r = (hex & 0xFF0000) >> 16;
        int g = (hex & 0xFF00) >> 8;
        int b = hex & 0xFF;
        Vec3 offset = state.getOffset(world, pos);
        double x = pos.getX() + offset.x;
        double y = pos.getY() + offset.y;
        double z = pos.getZ() + offset.z;

        if (rand.nextDouble() < BotaniaConfig.client().flowerParticleFrequency() - (1 / (float) MAX_AGE)) {
            SparkleParticleData data = SparkleParticleData.sparkle(rand.nextFloat(), r / 255F, g / 255F, b / 255F, 5);
            world.addParticle(data, x + 0.5, y + 0.2, z + 0.5, 0, 0, 0);
        }
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
