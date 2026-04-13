package dev.evokerking.elemancy.blocks.crystals;

import dev.evokerking.elemancy.annotation.block;
import net.minecraft.world.level.block.Block;

@block
public class WaterCrystalBlock extends Block {

    public static final String id = "water_crystal";
    public static final String name = "Water Crystal";

    public WaterCrystalBlock(Properties properties) {
        super(properties);
    }
}
