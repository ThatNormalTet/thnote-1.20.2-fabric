package net.thnote.thnotemod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.thnote.thnotemod.Thnote;
import net.thnote.thnotemod.block.ModBlocks;

public class ModItemGroups {
    //Crea los tabs de creativo
    public static final ItemGroup ThNoTe_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Thnote.MOD_ID, "thnote"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.thnote"))
                    .icon(() -> new ItemStack(ModItems.RUBY)).entries((displayContext, entries) -> {
                        //Añade items al tab en el orden que se añaden aqui
                        entries.add(ModItems.RUBY);
                        entries.add(ModBlocks.RUBY_ORE);
                        entries.add(ModBlocks.RUBY_BLOCK);
                        entries.add(ModBlocks.CRYSTALIZER);
                        entries.add(ModBlocks.OREMIZER);
                        entries.add(ModBlocks.CONDENSED_EMERALD_BLOCK);
                    }).build());

    public static void registerItemGroups(){
        Thnote.LOGGER.info("Registering item groups for " + Thnote.MOD_ID);
    }
}