package net.thnote.thnotemod.compat;

import me.shedaniel.math.Point;
import me.shedaniel.math.Rectangle;
import me.shedaniel.rei.api.client.gui.Renderer;
import me.shedaniel.rei.api.client.gui.widgets.Widget;
import me.shedaniel.rei.api.client.gui.widgets.Widgets;
import me.shedaniel.rei.api.client.registry.display.DisplayCategory;
import me.shedaniel.rei.api.common.category.CategoryIdentifier;
import me.shedaniel.rei.api.common.display.basic.BasicDisplay;
import me.shedaniel.rei.api.common.util.EntryStacks;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.thnote.thnotemod.Thnote;
import net.thnote.thnotemod.block.ModBlocks;

import java.util.LinkedList;
import java.util.List;

public class CrystalizerCategory implements DisplayCategory<BasicDisplay> {

    public static final Identifier TEXTURE =
            new Identifier(Thnote.MOD_ID, "textures/gui/crystalizer.png");
    public static final CategoryIdentifier<CrystalizerDisplay> CRYSTALIZER =
            CategoryIdentifier.of(Thnote.MOD_ID, "crystalizer");

    @Override
    public CategoryIdentifier<? extends BasicDisplay> getCategoryIdentifier() {
        return CRYSTALIZER;
    }

    @Override
    public Text getTitle() {
        return Text.translatable("rei.crystalizer");
    }

    @Override
    public Renderer getIcon() {
        return EntryStacks.of(ModBlocks.CRYSTALIZER.asItem().getDefaultStack());
    }

    @Override
    public List<Widget> setupDisplay(BasicDisplay display, Rectangle bounds) {
        final Point startPoint = new Point(bounds.getCenterX() - 87, bounds.getCenterY() - 35);
        List<Widget> widgets = new LinkedList<>();
        widgets.add(Widgets.createTexturedWidget(TEXTURE, new Rectangle(startPoint.x, startPoint.y, 175, 82)));


        //Añadir mas para mas inputs
        widgets.add(Widgets.createSlot(new Point(startPoint.x, startPoint.y ))
                .entries(display.getInputEntries().get(0)));

        //Añadir mas para mas outputs
        widgets.add(Widgets.createSlot(new Point(startPoint.x + 20, startPoint.y))
                .markOutput().entries(display.getOutputEntries().get(0)));

        return DisplayCategory.super.setupDisplay(display, bounds);
    }

    @Override
    public int getDisplayHeight() {
        return 90;
    }
}
