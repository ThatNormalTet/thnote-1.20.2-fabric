package net.thnote.thnotemod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.thnote.thnotemod.Thnote;
import net.thnote.thnotemod.block.customblock.CrystalizerBlock;
import net.thnote.thnotemod.block.customblock.OremizerBlock;

public class ModBlocks {
    //Crea bloques
    public static final Block RUBY_BLOCK = registerBlock("ruby_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).requiresTool()));

    public static final Block RUBY_ORE = registerBlock("ruby_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).requiresTool()));

    public static final Block CRYSTALIZER = registerBlock("crystalizer",
            new CrystalizerBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque()));

    public static final Block OREMIZER = registerBlock("oremizer",
            new OremizerBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque()));
    public static final Block CONDENSED_EMERALD_BLOCK = registerBlock("condensed_emerald_block",
            new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK).requiresTool()));



    //Registra el bloque (wea tecnica)
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Thnote.MOD_ID, name), block);
    }

    //Registra el item del bloque (wea tecnica)
    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, new Identifier(Thnote.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks(){
        Thnote.LOGGER.info("Registering modded blocks for " + Thnote.MOD_ID);
    }
}
