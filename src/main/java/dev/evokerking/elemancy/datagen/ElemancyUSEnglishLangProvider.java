package dev.evokerking.elemancy.datagen;

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
        translationBuilder.add(AIR_CRYSTAL, AirCrystalBlock.name);
        translationBuilder.add(EARTH_CRYSTAL, EarthCrystalBlock.name);
        translationBuilder.add(FIRE_CRYSTAL, FireCrystalBlock.name);
        translationBuilder.add(LIGHT_CRYSTAL, LightCrystalBlock.name);
        translationBuilder.add(SHADOW_CRYSTAL, ShadowCrystalBlock.name);
        translationBuilder.add(WATER_CRYSTAL, WaterCrystalBlock.name);
        //#endregion
        
        //#region shard-translations
        translationBuilder.add(AIR_SHARD, AirCrystalShard.name);
        translationBuilder.add(EARTH_SHARD, EarthCrystalShard.name);
        translationBuilder.add(FIRE_SHARD, FireCrystalShard.name);
        translationBuilder.add(LIGHT_SHARD, LightCrystalShard.name);
        translationBuilder.add(SHADOW_SHARD, ShadowCrystalShard.name);
        translationBuilder.add(WATER_SHARD, WaterCrystalShard.name);
        //#endregion

        
    }
}