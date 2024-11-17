package jas7277.circuitbuilder.item;

import jas7277.circuitbuilder.Circuitbuilder;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item LIL_REDSTONE = registerItem("lil_redstone", new Item(new Item.Settings()));
    public static final Item LIL_REPEATER = registerItem("lil_repeater", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(Circuitbuilder.MOD_ID, name), item);
    }
    public static void registerModItems(){
        Circuitbuilder.LOGGER.info("Registering Mod Items for " + Circuitbuilder.MOD_ID);
    }
}
