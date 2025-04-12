package hollow.vanillaenhanced.world.tree;

import hollow.vanillaenhanced.VanillaEnhanced;
import hollow.vanillaenhanced.world.ModConfiguredFeatures;
import net.minecraft.block.SaplingGenerator;

import java.util.Optional;

public class ModSaplingGenerators {
    public static final SaplingGenerator PALM = new SaplingGenerator(VanillaEnhanced.MOD_ID + ":palm",
            Optional.empty(), Optional.of(ModConfiguredFeatures.PALM_KEY), Optional.empty());
}
