package hollow.vanillaenhanced.datagen;

import hollow.vanillaenhanced.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.ECHO_BLOCK);
        addDrop(ModBlocks.CHISELED_ANDESITE);
        addDrop(ModBlocks.ANDESITE_BRICKS);
        addDrop(ModBlocks.GRANITE_BRICKS);
        addDrop(ModBlocks.DIORITE_BRICKS);
        addDrop(ModBlocks.SUPER_POWERED_RAIL);
    }
}
