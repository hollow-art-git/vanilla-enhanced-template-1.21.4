package hollow.vanillaenhanced;

import hollow.vanillaenhanced.block.ModBlocks;
import hollow.vanillaenhanced.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradedItem;
import net.minecraft.village.VillagerProfession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;

//Commit test
//https://docs.fabricmc.net/develop/getting-started/project-structure#entrypoints
//https://minecraft.wiki/w/Recipe#JSON_Format

public class VanillaEnhanced implements ModInitializer {
	public static final String MOD_ID = "vanilla-enhanced";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.initialize();
		ModBlocks.initialize();

		// VILLAGER TRADES

		
	}
}