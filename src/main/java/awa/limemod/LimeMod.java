package awa.limemod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;

import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LimeMod implements ModInitializer {
	public static final String MOD_ID = "limemod";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	// Lime
	public static final Item LIME = new Item(new Item.Settings()
		.food(new FoodComponent.Builder()
			.hunger(4)
			.saturationModifier(2.4f)
			.build()
		)
		.maxCount(64)
	);

	// Lime Item Group
	public static final ItemGroup LIMEMOD_GROUP = FabricItemGroup.builder()
		.icon(() -> new ItemStack(LIME))
		.displayName(Text.translatable("itemGroup.limemod"))
		.entries((displayContext, entries) -> {
			entries.add(LIME);
		})
		.build();

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		// Log initialization messages
		LOGGER.info("LimeMod is initializing");
		LOGGER.info("LimeMod Version: 1.0.0-beta.1");

		// Register the Lime item
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "lime"), LIME);

		// Register the Lime item group
		Registry.register(Registries.ITEM_GROUP, new Identifier(MOD_ID, "limemod_group"), LIMEMOD_GROUP);
	}
}