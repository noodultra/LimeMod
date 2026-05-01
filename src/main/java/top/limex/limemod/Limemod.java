package top.limex.limemod;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Limemod implements ModInitializer {
	public static final String MOD_ID = "limemod";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static final Item LIME = new Item(new Item.Settings()

			.food(new FoodComponent.Builder()
					.hunger(4)
					.saturationModifier(2.4f)
					.build()
			)
			.maxCount(64)
	);


	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("查看我们的wiki wiki.m-c.icu");

		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "lime"), LIME);
	}
}