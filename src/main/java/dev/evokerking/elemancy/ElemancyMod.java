package dev.evokerking.elemancy;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ElemancyMod implements ModInitializer {
	public static final String MOD_ID = "elemancy";
	public static final String MOD_NAME = "Elemancy";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("["+MOD_ID+"] Hello from "+MOD_NAME);
		ElemancyBlocks.initialize();
		ElemancyItems.initialize();
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, CUSTOM_CREATIVE_TAB_KEY, CUSTOM_CREATIVE_TAB);

	}

	public static final ResourceKey<CreativeModeTab> CUSTOM_CREATIVE_TAB_KEY = ResourceKey.create(
			BuiltInRegistries.CREATIVE_MODE_TAB.key(), Identifier.fromNamespaceAndPath(MOD_ID, "creative_tab")
	);
	public static final CreativeModeTab CUSTOM_CREATIVE_TAB = FabricCreativeModeTab.builder()
			.icon(() -> new ItemStack(ElemancyItems.AIR_SHARD))
			.title(Component.translatable("creativeTab.elemancy"))
			.displayItems((params, output) -> {
				output.accept(ElemancyItems.AIR_SHARD);
				output.accept(ElemancyItems.EARTH_SHARD);
				output.accept(ElemancyItems.FIRE_SHARD);
				output.accept(ElemancyItems.LIGHT_SHARD);
				output.accept(ElemancyItems.SHADOW_SHARD);
				output.accept(ElemancyItems.WATER_SHARD);


				// The tab builder also accepts Blocks
				output.accept(ElemancyBlocks.AIR_CRYSTAL);
				output.accept(ElemancyBlocks.EARTH_CRYSTAL);
				output.accept(ElemancyBlocks.FIRE_CRYSTAL);
				output.accept(ElemancyBlocks.LIGHT_CRYSTAL);
				output.accept(ElemancyBlocks.SHADOW_CRYSTAL);
				output.accept(ElemancyBlocks.WATER_CRYSTAL);
			}).build();
}