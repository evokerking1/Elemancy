package dev.evokerking.elemancy;

import dev.evokerking.elemancy.items.crystals.*;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;

import java.util.function.Function;

public class ElemancyItems {
    public static <T extends Item> T register(String name, Function<Item.Properties, T> itemFactory, Item.Properties settings) {
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

    public static final Item AIR_CRYSTAL = register("air_crystal", AirCrystalItem::new, new Item.Properties());
    public static final Item EARTH_CRYSTAL = register("earth_crystal", EarthCrystalItem::new, new Item.Properties());
    public static final Item FIRE_CRYSTAL = register("fire_crystal", FireCrystalItem::new, new Item.Properties());
    public static final Item LIGHT_CRYSTAL = register("light_crystal", LightCrystalItem::new, new Item.Properties());
    public static final Item SHADOW_CRYSTAL = register("shadow_crystal", ShadowCrystalItem::new, new Item.Properties());
    public static final Item WATER_CRYSTAL = register("water_crystal", WaterCrystalItem::new, new Item.Properties());
}
