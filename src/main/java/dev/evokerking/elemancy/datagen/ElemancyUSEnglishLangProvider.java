package dev.evokerking.elemancy.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;
import org.jspecify.annotations.NonNull;

import java.util.concurrent.CompletableFuture;

import static dev.evokerking.elemancy.ElemancyBlocks.*;

public class ElemancyUSEnglishLangProvider extends FabricLanguageProvider {
    protected ElemancyUSEnglishLangProvider(FabricPackOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        // Specifying en_us is optional, as it's the default language code
        super(dataOutput, "en_us", registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.@NonNull Provider holderLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(AIR_CRYSTAL, "Air Crystal");
        translationBuilder.add(EARTH_CRYSTAL, "Earth Crystal");
        translationBuilder.add(FIRE_CRYSTAL, "Fire Crystal");
        translationBuilder.add(LIGHT_CRYSTAL, "Light Crystal");
        translationBuilder.add(SHADOW_CRYSTAL, "Shadow Crystal");
        translationBuilder.add(WATER_CRYSTAL, "Water Crystal");
    }
}