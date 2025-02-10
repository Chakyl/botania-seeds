package io.github.chakyl.botaniaseeds.mixin;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import vazkii.botania.common.block.decor.BuriedPetalBlock;

@Mixin(BuriedPetalBlock.class)
public abstract class MixinBuriedPetalBlock {

    /**
     * @author Chakyl
     * @reason Disabling petal duping to encouraging growth using seeds in Botania Seeds
     */
    @Overwrite
    public boolean isValidBonemealTarget(@NotNull LevelReader world, @NotNull BlockPos pos, @NotNull BlockState state, boolean fuckifiknow) {
        return false;
    }

}
