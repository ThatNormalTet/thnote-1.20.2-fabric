package net.thnote.thnotemod.compat;

import me.shedaniel.math.Rectangle;
import me.shedaniel.rei.api.client.plugins.REIClientPlugin;
import me.shedaniel.rei.api.client.registry.category.CategoryRegistry;
import me.shedaniel.rei.api.client.registry.display.DisplayRegistry;
import me.shedaniel.rei.api.client.registry.screen.ScreenRegistry;
import me.shedaniel.rei.api.common.util.EntryStacks;
import net.thnote.thnotemod.block.ModBlocks;
import net.thnote.thnotemod.recipe.CrystalizerRecipe;
import net.thnote.thnotemod.screens.crystalizer.CrystalizerScreen;

public class ThnoteREIClientPlugin implements REIClientPlugin {

    @Override
    public void registerCategories(CategoryRegistry registry) {
        registry.add(new CrystalizerCategory());

        registry.addWorkstations(CrystalizerCategory.CRYSTALIZER, EntryStacks.of(ModBlocks.CRYSTALIZER));
    }

    @Override
    public void registerDisplays(DisplayRegistry registry) {
        registry.registerRecipeFiller(CrystalizerRecipe.class, CrystalizerRecipe.Type.INSTANCE,
                CrystalizerDisplay::new);
    }

    @Override
    public void registerScreens(ScreenRegistry registry) {
        registry.registerClickArea(screen -> new Rectangle(75, 30, 20, 30), CrystalizerScreen.class,
                CrystalizerCategory.CRYSTALIZER);
    }
}
