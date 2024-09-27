package net.thnote.thnotemod;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.thnote.thnotemod.screen.CrystalizerScreen;
import net.thnote.thnotemod.screen.ModScreenHandler;

public class ThnoteClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        HandledScreens.register(ModScreenHandler.CRYSTALIZER_SCREEN_HANDLER, CrystalizerScreen::new);
    }
}
