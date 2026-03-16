package xyz.limeing.limemod

import net.fabricmc.api.ModInitializer
import net.minecraft.item.Item
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.util.Identifier
import org.slf4j.LoggerFactory

class Limemod : ModInitializer {
    companion object {
        const val MOD_ID = "limemod"
        val LOGGER = LoggerFactory.getLogger(MOD_ID)
        val LIME = Item(Item.Settings())
    }

    override fun onInitialize() {
        Registry.register(Registries.ITEM, Identifier(MOD_ID, "lime"), LIME)
        LimemodJava.initialize()
    }
}