package net.thnote.thnotemod.compat.crystalizer;

import me.shedaniel.rei.api.common.category.CategoryIdentifier;
import me.shedaniel.rei.api.common.display.basic.BasicDisplay;
import me.shedaniel.rei.api.common.entry.EntryIngredient;
import me.shedaniel.rei.api.common.util.EntryIngredients;
import me.shedaniel.rei.api.common.util.EntryStacks;
import net.minecraft.recipe.RecipeEntry;
import net.thnote.thnotemod.recipe.CrystalizerRecipe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CrystalizerDisplay extends BasicDisplay {
    public CrystalizerDisplay(List<EntryIngredient> inputs, List<EntryIngredient> outputs) {
        super(inputs, outputs);
    }

    public CrystalizerDisplay(RecipeEntry<CrystalizerRecipe> recipe){
        super(getInputList(recipe.value()), List.of(EntryIngredient.of(EntryStacks.of(recipe.value().getResult(null)))));
    }

    private static List<EntryIngredient> getInputList(CrystalizerRecipe recipe) {
        if(recipe == null) return Collections.emptyList();
        List<EntryIngredient> list = new ArrayList<>();
        //Añadir mas para mas inputs
        list.add(EntryIngredients.ofIngredient(recipe.getIngredients().get(0)));
        return list;
    }

    @Override
    public CategoryIdentifier<?> getCategoryIdentifier() {
        return CrystalizerCategory.CRYSTALIZER;
    }
}
