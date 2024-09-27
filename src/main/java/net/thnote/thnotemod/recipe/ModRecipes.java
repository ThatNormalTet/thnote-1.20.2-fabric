package net.thnote.thnotemod.recipe;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.thnote.thnotemod.Thnote;

public class ModRecipes {
    public static void registerRecipes(){
        Registry.register(Registries.RECIPE_SERIALIZER, new Identifier(Thnote.MOD_ID, CrystalizerRecipe.Serializer.ID),
                CrystalizerRecipe.Serializer.INSTANCE);
        Registry.register(Registries.RECIPE_TYPE, new Identifier(Thnote.MOD_ID, CrystalizerRecipe.Type.ID),
                CrystalizerRecipe.Type.INSTANCE);
    }
}
