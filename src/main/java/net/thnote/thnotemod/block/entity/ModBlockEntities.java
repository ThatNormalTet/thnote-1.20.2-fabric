package net.thnote.thnotemod.block.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.thnote.thnotemod.Thnote;
import net.thnote.thnotemod.block.ModBlocks;
import net.thnote.thnotemod.block.entity.blocks.CrystalizerBlockEntity;
import net.thnote.thnotemod.block.entity.blocks.OremizerBlockEntity;

public class ModBlockEntities {
    public static final BlockEntityType<CrystalizerBlockEntity> CRYSTALIZER_BLOCK_ENTITY =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(Thnote.MOD_ID, "crystalizer"),
                    FabricBlockEntityTypeBuilder.create(CrystalizerBlockEntity::new, ModBlocks.CRYSTALIZER).build());
    public static final BlockEntityType<OremizerBlockEntity> OREMIZER_BLOCK_ENTITY =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(Thnote.MOD_ID, "oremizer"),
                    FabricBlockEntityTypeBuilder.create(OremizerBlockEntity::new, ModBlocks.OREMIZER).build());

    public static void registerBlockEntities(){
        Thnote.LOGGER.info("Registering Block Entities for " + Thnote.MOD_ID);
    }
}
