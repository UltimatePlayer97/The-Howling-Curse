package net.systemerror.thehowlingcurse;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TheHowlingCurse implements ModInitializer {
	public static final String MOD_ID = "thehowlingcurse";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		LOGGER.info("The werewolf is entering your world!");
	}
}