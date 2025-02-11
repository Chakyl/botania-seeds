package io.github.chakyl.botaniaseeds.event;

import io.github.chakyl.botaniaseeds.BotaniaSeeds;
import net.minecraft.world.InteractionResult;
import net.minecraftforge.event.entity.player.BonemealEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import vazkii.botania.common.block.decor.BuriedPetalBlock;

public class ServerEvents {
    @Mod.EventBusSubscriber(modid = BotaniaSeeds.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
    public static class ForgeEvents {
        @SubscribeEvent
        public static void onBonemeal(BonemealEvent event) {
            if (event.getBlock().getBlock() instanceof BuriedPetalBlock) {
                event.setCanceled(true);
            }
        }
    }
}