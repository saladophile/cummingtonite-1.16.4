package com.saladophile.cummingtonite;

import com.saladophile.cummingtonite.registry.ModItems;
import net.fabricmc.api.ModInitializer;

public class Cummingtonite implements ModInitializer {
    public static final String MOD_ID = "cummingtonite";

    @Override
    public void onInitialize() {
        ModItems.registerItems();
    }
}
