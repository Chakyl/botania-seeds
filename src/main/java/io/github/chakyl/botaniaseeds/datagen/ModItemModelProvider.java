package io.github.chakyl.botaniaseeds.datagen;

import io.github.chakyl.botaniaseeds.BotaniaSeeds;
import io.github.chakyl.botaniaseeds.registry.ModElements;
import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;


public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, BotaniaSeeds.MODID, exFileHelper);
    }

    @Override
    protected void registerModels() {
        ModElements.SEED_ITEMS.getEntries().forEach(entry -> {

            withExistingParent(entry.getId().getPath(), "item/generated").texture("layer0", "botania_seeds:item/" + entry.getId().getPath());
        });
    }
}
