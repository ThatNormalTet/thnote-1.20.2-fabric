package net.thnote.thnotemod;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.thnote.thnotemod.screens.crystalizer.CrystalizerScreen;
import net.thnote.thnotemod.screens.ModScreenHandler;
import net.thnote.thnotemod.screens.oremizer.OremizerScreen;

public class ThnoteClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        HandledScreens.register(ModScreenHandler.CRYSTALIZER_SCREEN_HANDLER, CrystalizerScreen::new);
        HandledScreens.register(ModScreenHandler.OREMIZER_SCREEN_HANDLER, OremizerScreen::new);
    }
}
