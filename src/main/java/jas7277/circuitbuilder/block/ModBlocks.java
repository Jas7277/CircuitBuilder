package jas7277.circuitbuilder.block;

import jas7277.circuitbuilder.Circuitbuilder;
import jas7277.circuitbuilder.block.custom.CircuitBaseBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block LIL_REDSTONE_BLOCK = registerBlock("lil_redstone_block",
            new Block(AbstractBlock.Settings.copy(Blocks.REDSTONE_BLOCK)));
    public static final Block Lil_GLOWSTONE = registerBlock("lil_glowstone",
            new Block(AbstractBlock.Settings.copy(Blocks.GLOWSTONE)));
    public static final Block LIL_CIRCUIT_BASE = registerBlock("lil_circuit_base",
            new CircuitBaseBlock());

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Circuitbuilder.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, new Identifier(Circuitbuilder.MOD_ID, name),
        new BlockItem(block, new Item.Settings()));
    }
    public static void registerModBlocks(){
        Circuitbuilder.LOGGER.info("Registering ModBlocks for " + Circuitbuilder.MOD_ID);
    }
}
