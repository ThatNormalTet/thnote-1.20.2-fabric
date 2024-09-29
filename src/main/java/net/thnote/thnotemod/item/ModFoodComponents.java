package net.thnote.thnotemod.item;

import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent UOH = new FoodComponent.Builder().hunger(20).alwaysEdible().saturationModifier(20f).build();
}
