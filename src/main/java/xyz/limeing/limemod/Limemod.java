package xyz.limeing.limemod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.condition.MatchToolLootCondition;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.predicate.item.ItemPredicate;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Limemod implements ModInitializer {
	public static final String MOD_ID = "limemod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	// item.limemod.lime
	public static final Item LIME = new Item(new Item.Settings()
			.component(DataComponentTypes.FOOD, new FoodComponent.Builder()
					//恢复10点饱食度
					.nutrition(10)
					.saturationModifier(0.2f)
					.build()
			)
	);

	// 自定义物品组
	public static final ItemGroup LIMEMOD_GROUP = Registry.register(
			Registries.ITEM_GROUP,
			Identifier.of(MOD_ID, "test_group"),
			FabricItemGroup.builder()
					.icon(() -> new ItemStack(LIME))
					.displayName(Text.translatable("itemGroup.limemod.test_group"))
					.entries((context, entries) -> entries.add(LIME))
					.build()
	);

	@Override
	public void onInitialize() {
		// 注册 item.limemod.lime 物品
		Registry.register(Registries.ITEM, Identifier.of(MOD_ID, "lime"), LIME);

		LOGGER.info("此模组的玩法 查看我们的wiki wiki.limeing.xyz");
	}
}