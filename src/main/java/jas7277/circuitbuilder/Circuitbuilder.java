package jas7277.circuitbuilder;

import jas7277.circuitbuilder.block.ModBlocks;
import jas7277.circuitbuilder.item.ModItemGroups;
import jas7277.circuitbuilder.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class Circuitbuilder implements ModInitializer {
    public static final String MOD_ID = "circuitbuilder";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItems.registerModItems();
        ModItemGroups.registerItemGroups();
        ModBlocks.registerModBlocks();
    }
}
