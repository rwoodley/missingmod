package com.nrplign.missingmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class GlycerinBlock extends Block {
    public GlycerinBlock() {
        super(Properties.create(Material.IRON)
        );
        setRegistryName("glycerinblock");
    }
}
