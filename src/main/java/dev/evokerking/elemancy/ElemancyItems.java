package dev.evokerking.elemancy;

import java.util.function.Function;

import dev.evokerking.elemancy.items.*;
import net.minecraft.client.renderer.item.ClientItem;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;

public class ElemancyItems {
    public static <T extends Item> T registerItem(String name, Function<Item.Properties, T> itemFactory, Item.Properties settings) {
        // Create the item key.
		ResourceKey<Item> itemKey = ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(ElemancyMod.MOD_ID, name));

		// Create the item instance.
		T item = itemFactory.apply(settings.setId(itemKey));

		// Register the item.
		Registry.register(BuiltInRegistries.ITEM, itemKey, item);

		return item;
    }

    public static void initialize() {

    }

    public static final Item AIR_SHARD = registerItem(AirCrystalShard.id, AirCrystalShard::new, new Item.Properties());
    public static final Item EARTH_SHARD = registerItem(EarthCrystalShard.id, EarthCrystalShard::new, new Item.Properties());
    public static final Item FIRE_SHARD = registerItem(FireCrystalShard.id, FireCrystalShard::new, new Item.Properties());
    public static final Item LIGHT_SHARD = registerItem(LightCrystalShard.id, LightCrystalShard::new, new Item.Properties());
    public static final Item SHADOW_SHARD = registerItem(ShadowCrystalShard.id, ShadowCrystalShard::new, new Item.Properties());
    public static final Item WATER_SHARD = registerItem(WaterCrystalShard.id, WaterCrystalShard::new, new Item.Properties());
    public static final Item ELEMINITE_INGOT = registerItem(EleminiteIngot.id, EleminiteIngot::new, new Item.Properties());

}
