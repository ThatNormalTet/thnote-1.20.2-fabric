package net.thnote.thnotemod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.entity.EntityType;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.thnote.thnotemod.Thnote;

public class ModItems {
    //Crear items nuevos
    public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings()));
    public static final Item UOH = registerItem("uoh", new Item(new FabricItemSettings().food(ModFoodComponents.UOH)));
    public static final Item MAGIC_WAND = registerItem("magic_wand", new MagicWand(new FabricItemSettings().maxCount(1)));
    public static final Item SCYTHE = registerItem("scythe", new SwordItem(ModToolMaterial.RUBY, 0, 0, new FabricItemSettings()));

    //Añadir items a cada tabulador del creativo
    private static void addItemsToBuildingBlocksTabItemGroup(FabricItemGroupEntries entries) {

    }
    private static void addItemsToColoredBlocksTabItemGroup(FabricItemGroupEntries entries) {

    }
    private static void addItemsToNaturalTabItemGroup(FabricItemGroupEntries entries) {

    }
    private static void addItemsToFunctionalTabItemGroup(FabricItemGroupEntries entries) {

    }
    private static void addItemsToRedstoneTabItemGroup(FabricItemGroupEntries entries) {

    }
    private static void addItemsToToolsTabItemGroup(FabricItemGroupEntries entries) {

    }
    private static void addItemsToCombatTabItemGroup(FabricItemGroupEntries entries) {

    }
    private static void addItemsToFoodTabItemGroup(FabricItemGroupEntries entries) {

    }
    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(RUBY);
    }
    private static void addItemsToSpawnEggsTabItemGroup(FabricItemGroupEntries entries) {

    }

    //Registra el item (wea tecnica)
    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(Thnote.MOD_ID, name), item);
    }

    public static void registerModItems(){
        Thnote.LOGGER.info("Registering mod items for " + Thnote.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(ModItems::addItemsToBuildingBlocksTabItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(ModItems::addItemsToColoredBlocksTabItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(ModItems::addItemsToNaturalTabItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(ModItems::addItemsToFunctionalTabItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.REDSTONE).register(ModItems::addItemsToRedstoneTabItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModItems::addItemsToToolsTabItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ModItems::addItemsToCombatTabItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::addItemsToFoodTabItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.SPAWN_EGGS).register(ModItems::addItemsToSpawnEggsTabItemGroup);
    }
}
