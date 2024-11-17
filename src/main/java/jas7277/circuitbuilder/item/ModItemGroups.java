package jas7277.circuitbuilder.item;

import jas7277.circuitbuilder.Circuitbuilder;
import jas7277.circuitbuilder.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup Circuit_Group = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Circuitbuilder.MOD_ID, "lil_redstone"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.circuit_builder"))
                    .icon(() -> new ItemStack(ModItems.LIL_REDSTONE)).entries((displayContext, entries) -> {
                        entries.add(ModItems.LIL_REDSTONE);
                        entries.add(ModItems.LIL_REPEATER);
                        entries.add(ModBlocks.LIL_REDSTONE_BLOCK);
                        entries.add(ModBlocks.Lil_GLOWSTONE);
                        entries.add(ModBlocks.LIL_CIRCUIT_BASE);
                    }).build());

    public static void registerItemGroups(){
        Circuitbuilder.LOGGER.info("Registering Item Groups for " + Circuitbuilder.MOD_ID);
    }
}
