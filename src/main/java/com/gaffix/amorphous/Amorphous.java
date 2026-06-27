package com.gaffix.amorphous;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Amorphous implements ModInitializer {
    public static final String MOD_ID = "amorphous";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItems.initialize();
        LOGGER.info("oi pelo menos abri");
    }
}