package net.thnote.thnotemod.compat;

import me.shedaniel.math.Rectangle;
import me.shedaniel.rei.api.client.plugins.REIClientPlugin;
import me.shedaniel.rei.api.client.registry.category.CategoryRegistry;
import me.shedaniel.rei.api.client.registry.display.DisplayRegistry;
import me.shedaniel.rei.api.client.registry.screen.ScreenRegistry;
import me.shedaniel.rei.api.common.util.EntryStacks;
import net.thnote.thnotemod.block.ModBlocks;
import net.thnote.thnotemod.compat.crystalizer.CrystalizerCategory;
import net.thnote.thnotemod.compat.crystalizer.CrystalizerDisplay;
import net.thnote.thnotemod.compat.oremizer.OremizerCategory;
import net.thnote.thnotemod.compat.oremizer.OremizerDisplay;
import net.thnote.thnotemod.recipe.CrystalizerRecipe;
import net.thnote.thnotemod.recipe.OremizerRecipe;
import net.thnote.thnotemod.screens.crystalizer.CrystalizerScreen;
import net.thnote.thnotemod.screens.oremizer.OremizerScreen;

public class ThnoteREIClientPlugin implements REIClientPlugin {

    @Override
    public void registerCategories(CategoryRegistry registry) {
        registry.add(new CrystalizerCategory());
        registry.addWorkstations(CrystalizerCategory.CRYSTALIZER, EntryStacks.of(ModBlocks.CRYSTALIZER));

        registry.add(new OremizerCategory());
        registry.addWorkstations(OremizerCategory.OREMIZER, EntryStacks.of(ModBlocks.OREMIZER));
    }

    @Override
    public void registerDisplays(DisplayRegistry registry) {
        registry.registerRecipeFiller(CrystalizerRecipe.class, CrystalizerRecipe.Type.INSTANCE,
                CrystalizerDisplay::new);

        registry.registerRecipeFiller(OremizerRecipe.class, OremizerRecipe.Type.INSTANCE,
                OremizerDisplay::new);
    }

    @Override
    public void registerScreens(ScreenRegistry registry) {
        registry.registerClickArea(screen -> new Rectangle(75, 30, 20, 30), CrystalizerScreen.class,
                CrystalizerCategory.CRYSTALIZER);

        registry.registerClickArea(screen -> new Rectangle(75, 30, 20, 30), OremizerScreen.class,
                OremizerCategory.OREMIZER);
    }
}