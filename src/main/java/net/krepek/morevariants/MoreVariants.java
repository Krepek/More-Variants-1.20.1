package net.krepek.morevariants;

import net.fabricmc.api.ModInitializer;

import net.krepek.morevariants.item.ModItemGroups;
import net.krepek.morevariants.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoreVariants implements ModInitializer {
	public static final String MOD_ID = "morevariants";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
	}
}