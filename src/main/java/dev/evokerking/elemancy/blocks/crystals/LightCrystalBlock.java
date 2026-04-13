package dev.evokerking.elemancy.blocks.crystals;


import dev.evokerking.elemancy.annotation.block;
import net.minecraft.world.level.block.Block;

@block
public class LightCrystalBlock extends Block {

    public static final String id = "light_crystal";
    public static final String name = "Light Crystal";

    public LightCrystalBlock(Properties properties) {
        super(properties);
    }
}
