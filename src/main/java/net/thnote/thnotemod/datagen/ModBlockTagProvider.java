package net.thnote.thnotemod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.thnote.thnotemod.Thnote;
import net.thnote.thnotemod.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    private static final TagKey<Block> NETHER_ORES = TagKey.of(RegistryKeys.BLOCK, new Identifier(Thnote.MOD_ID, "nether_ores"));
    private static final TagKey<Block> DEEPSLATE_ORES = TagKey.of(RegistryKeys.BLOCK, new Identifier(Thnote.MOD_ID, "deepslate_ores"));

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.RUBY_ORE)
                .add(ModBlocks.RUBY_BLOCK)
                .add(ModBlocks.CRYSTALIZER)
                .add(ModBlocks.OREMIZER)
                .add(ModBlocks.CONDENSED_EMERALD_BLOCK)
                .add(ModBlocks.DEEPSLATE_RUBY_ORE);


        getOrCreateTagBuilder(NETHER_ORES)
                .add(Blocks.NETHER_GOLD_ORE)
                .add(Blocks.NETHER_QUARTZ_ORE)
                .add(Blocks.ANCIENT_DEBRIS);

        getOrCreateTagBuilder(DEEPSLATE_ORES)
                .add(Blocks.DEEPSLATE_COAL_ORE)
                .add(Blocks.DEEPSLATE_COPPER_ORE)
                .add(Blocks.DEEPSLATE_DIAMOND_ORE)
                .add(Blocks.DEEPSLATE_GOLD_ORE)
                .add(Blocks.DEEPSLATE_EMERALD_ORE)
                .add(Blocks.DEEPSLATE_IRON_ORE)
                .add(Blocks.DEEPSLATE_LAPIS_ORE)
                .add(Blocks.DEEPSLATE_REDSTONE_ORE)
                .add(ModBlocks.DEEPSLATE_RUBY_ORE);
    }
}
