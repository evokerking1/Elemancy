package dev.evokerking.elemancy.datagen;

import dev.evokerking.elemancy.ElemancyMod;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;
import org.jspecify.annotations.NonNull;

import dev.evokerking.elemancy.blocks.crystals.AirCrystalBlock;
import dev.evokerking.elemancy.blocks.crystals.EarthCrystalBlock;
import dev.evokerking.elemancy.blocks.crystals.FireCrystalBlock;
import dev.evokerking.elemancy.blocks.crystals.LightCrystalBlock;
import dev.evokerking.elemancy.blocks.crystals.ShadowCrystalBlock;
import dev.evokerking.elemancy.blocks.crystals.WaterCrystalBlock;
import dev.evokerking.elemancy.items.AirCrystalShard;
import dev.evokerking.elemancy.items.EarthCrystalShard;
import dev.evokerking.elemancy.items.FireCrystalShard;
import dev.evokerking.elemancy.items.LightCrystalShard;
import dev.evokerking.elemancy.items.ShadowCrystalShard;
import dev.evokerking.elemancy.items.WaterCrystalShard;

import java.util.concurrent.CompletableFuture;

import static dev.evokerking.elemancy.ElemancyBlocks.*;
import static dev.evokerking.elemancy.ElemancyItems.*;

public class ElemancyUSEnglishLangProvider extends FabricLanguageProvider {
    protected ElemancyUSEnglishLangProvider(FabricPackOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        // Specifying en_us is optional, as it's the default language code
        super(dataOutput, "en_us", registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.@NonNull Provider holderLookup, TranslationBuilder translationBuilder) {
        //#region block-translations
        translationBuilder.add(AIR_CRYSTAL, "Air Crystal");
        translationBuilder.add(EARTH_CRYSTAL, "Earth Crystal");
        translationBuilder.add(FIRE_CRYSTAL, "Fire Crystal");
        translationBuilder.add(LIGHT_CRYSTAL, "Light Crystal");
        translationBuilder.add(SHADOW_CRYSTAL, "Shadow Crystal");
        translationBuilder.add(WATER_CRYSTAL, "Water Crystal");
        //#endregion
        
        //#region shard-translations
        translationBuilder.add(AIR_SHARD, "Air Shard");
        translationBuilder.add(EARTH_SHARD, "Earth Shard");
        translationBuilder.add(FIRE_SHARD, "Fire Shard");
        translationBuilder.add(LIGHT_SHARD, "Light Shard");
        translationBuilder.add(SHADOW_SHARD, "Shadow Shard");
        translationBuilder.add(WATER_SHARD, "Water Shard");
        //#endregion

        //#region misc-translations
        translationBuilder.add(ElemancyMod.ELEMANCY_CREATIVE_TAB_KEY, ElemancyMod.MOD_NAME);
        //#endregion
    }
}