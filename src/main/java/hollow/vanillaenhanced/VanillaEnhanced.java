package hollow.vanillaenhanced;

import hollow.vanillaenhanced.classes.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
	}
}