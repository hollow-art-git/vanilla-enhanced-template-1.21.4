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

        addDrop(ModBlocks.ANDESITE_BRICKS);
        addDrop(ModBlocks.ANDESITE_BRICKS_SLAB, slabDrops(ModBlocks.ANDESITE_BRICKS_SLAB));
        addDrop(ModBlocks.ANDESITE_BRICKS_STAIRS);
        addDrop(ModBlocks.ANDESITE_BRICKS_WALL);
        addDrop(ModBlocks.CHISELED_ANDESITE);

        addDrop(ModBlocks.GRANITE_BRICKS);
        addDrop(ModBlocks.GRANITE_BRICKS_SLAB, slabDrops(ModBlocks.GRANITE_BRICKS_SLAB));
        addDrop(ModBlocks.GRANITE_BRICKS_STAIRS);
        addDrop(ModBlocks.GRANITE_BRICKS_WALL);
        addDrop(ModBlocks.CHISELED_GRANITE);

        addDrop(ModBlocks.DIORITE_BRICKS);
        addDrop(ModBlocks.DIORITE_BRICKS_SLAB, slabDrops(ModBlocks.DIORITE_BRICKS_SLAB));
        addDrop(ModBlocks.DIORITE_BRICKS_STAIRS);
        addDrop(ModBlocks.DIORITE_BRICKS_WALL);
        addDrop(ModBlocks.CHISELED_DIORITE);

        addDrop(ModBlocks.SUPER_POWERED_RAIL);
    }
}
