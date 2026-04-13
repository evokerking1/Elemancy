package dev.evokerking.elemancy;

import dev.evokerking.elemancy.blocks.crystals.*;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.Function;

public class ElemancyBlocks {
    private static Block register(String name, Function<BlockBehaviour.Properties, Block> blockFactory, BlockBehaviour.Properties settings, boolean shouldRegisterItem) {
        // Create a registry key for the block
        ResourceKey<Block> blockKey = keyOfBlock(name);
        // Create the block instance
        Block block = blockFactory.apply(settings.setId(blockKey));

        // Sometimes, you may not want to register an item for the block.
        // Eg: if it's a technical block like `minecraft:moving_piston` or `minecraft:end_gateway`
        if (shouldRegisterItem) {
            // Items need to be registered with a different type of registry key, but the ID
            // can be the same.
            ResourceKey<Item> itemKey = keyOfItem(name);

            BlockItem blockItem = new BlockItem(block, new Item.Properties().setId(itemKey).useBlockDescriptionPrefix());
            Registry.register(BuiltInRegistries.ITEM, itemKey, blockItem);
        }

        return Registry.register(BuiltInRegistries.BLOCK, blockKey, block);
    }

        private static ResourceKey<Block> keyOfBlock(String name) {
            return ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(ElemancyMod.MOD_ID, name));
        }

        private static ResourceKey<Item> keyOfItem(String name) {
            return ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(ElemancyMod.MOD_ID, name));
        }

    public static void initialize() {
    }

    public static final Block AIR_CRYSTAL = register(AirCrystalBlock.id, AirCrystalBlock::new, BlockBehaviour.Properties.of().sound(SoundType.AMETHYST), true);
    public static final Block EARTH_CRYSTAL = register(EarthCrystalBlock.id, EarthCrystalBlock::new, BlockBehaviour.Properties.of().sound(SoundType.AMETHYST), true);
    public static final Block FIRE_CRYSTAL = register(FireCrystalBlock.id, FireCrystalBlock::new, BlockBehaviour.Properties.of().sound(SoundType.AMETHYST), true);
    public static final Block LIGHT_CRYSTAL = register(LightCrystalBlock.id, LightCrystalBlock::new, BlockBehaviour.Properties.of().sound(SoundType.AMETHYST), true);
    public static final Block SHADOW_CRYSTAL = register(ShadowCrystalBlock.id, ShadowCrystalBlock::new, BlockBehaviour.Properties.of().sound(SoundType.AMETHYST), true);
    public static final Block WATER_CRYSTAL = register(WaterCrystalBlock.id, WaterCrystalBlock::new, BlockBehaviour.Properties.of().sound(SoundType.AMETHYST), true);
}
