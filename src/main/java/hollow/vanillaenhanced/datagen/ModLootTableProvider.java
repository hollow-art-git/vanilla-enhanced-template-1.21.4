package hollow.vanillaenhanced.datagen;

import hollow.vanillaenhanced.block.ModBlocks;
import hollow.vanillaenhanced.item.ModItems;
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

        addDrop(ModBlocks.SNOW_BRICKS);
        addDrop(ModBlocks.SNOW_BRICKS_SLAB, slabDrops(ModBlocks.SNOW_BRICKS_SLAB));
        addDrop(ModBlocks.SNOW_BRICKS_STAIRS);
        addDrop(ModBlocks.SNOW_BRICKS_WALL);

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

        addDrop(ModBlocks.PALM_LEAVES, leavesDrops(ModBlocks.PALM_LEAVES, ModBlocks.PALM_SAPLING, 0.00625F));
        addDrop(ModBlocks.PALM_LOG);
        addDrop(ModBlocks.PALM_WOOD);
        addDrop(ModBlocks.STRIPPED_PALM_LOG);
        addDrop(ModBlocks.STRIPPED_PALM_WOOD);
        addDrop(ModBlocks.PALM_SAPLING);
        addDrop(ModBlocks.PALM_PLANKS);
        addDrop(ModBlocks.PALM_FENCE);
        //addDrop(ModBlocks.PALM_FENCE_GATE);

        addDrop(ModBlocks.TERRACOTTA_SLAB);
        addDrop(ModBlocks.TERRACOTTA_STAIRS);
        addDrop(ModBlocks.RED_TERRACOTTA_SLAB);
        addDrop(ModBlocks.RED_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.ORANGE_TERRACOTTA_SLAB);
        addDrop(ModBlocks.ORANGE_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.YELLOW_TERRACOTTA_SLAB);
        addDrop(ModBlocks.YELLOW_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.LIME_TERRACOTTA_SLAB);
        addDrop(ModBlocks.LIME_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.GREEN_TERRACOTTA_SLAB);
        addDrop(ModBlocks.GREEN_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB);
        addDrop(ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.BLUE_TERRACOTTA_SLAB);
        addDrop(ModBlocks.BLUE_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.CYAN_TERRACOTTA_SLAB);
        addDrop(ModBlocks.CYAN_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.PURPLE_TERRACOTTA_SLAB);
        addDrop(ModBlocks.PURPLE_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.MAGENTA_TERRACOTTA_SLAB);
        addDrop(ModBlocks.MAGENTA_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.PINK_TERRACOTTA_SLAB);
        addDrop(ModBlocks.PINK_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.BROWN_TERRACOTTA_SLAB);
        addDrop(ModBlocks.BROWN_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.BLACK_TERRACOTTA_SLAB);
        addDrop(ModBlocks.BLACK_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.GRAY_TERRACOTTA_SLAB);
        addDrop(ModBlocks.GRAY_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB);
        addDrop(ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.WHITE_TERRACOTTA_SLAB);
        addDrop(ModBlocks.WHITE_TERRACOTTA_STAIRS);

        addDrop(ModBlocks.WHITE_CONCRETE_STAIRS);
        addDrop(ModBlocks.WHITE_CONCRETE_SLAB);
        addDrop(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS);
        addDrop(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB);
        addDrop(ModBlocks.GRAY_CONCRETE_STAIRS);
        addDrop(ModBlocks.GRAY_CONCRETE_SLAB);
        addDrop(ModBlocks.BLACK_CONCRETE_STAIRS);
        addDrop(ModBlocks.BLACK_CONCRETE_SLAB);
        addDrop(ModBlocks.BROWN_CONCRETE_STAIRS);
        addDrop(ModBlocks.BROWN_CONCRETE_SLAB);
        addDrop(ModBlocks.RED_CONCRETE_STAIRS);
        addDrop(ModBlocks.RED_CONCRETE_SLAB);
        addDrop(ModBlocks.ORANGE_CONCRETE_STAIRS);
        addDrop(ModBlocks.ORANGE_CONCRETE_SLAB);
        addDrop(ModBlocks.YELLOW_CONCRETE_STAIRS);
        addDrop(ModBlocks.YELLOW_CONCRETE_SLAB);
        addDrop(ModBlocks.LIME_CONCRETE_STAIRS);
        addDrop(ModBlocks.LIME_CONCRETE_SLAB);
        addDrop(ModBlocks.GREEN_CONCRETE_STAIRS);
        addDrop(ModBlocks.GREEN_CONCRETE_SLAB);
        addDrop(ModBlocks.CYAN_CONCRETE_STAIRS);
        addDrop(ModBlocks.CYAN_CONCRETE_SLAB);
        addDrop(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS);
        addDrop(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB);
        addDrop(ModBlocks.BLUE_CONCRETE_STAIRS);
        addDrop(ModBlocks.BLUE_CONCRETE_SLAB);
        addDrop(ModBlocks.PURPLE_CONCRETE_STAIRS);
        addDrop(ModBlocks.PURPLE_CONCRETE_SLAB);
        addDrop(ModBlocks.MAGENTA_CONCRETE_STAIRS);
        addDrop(ModBlocks.MAGENTA_CONCRETE_SLAB);
        addDrop(ModBlocks.PINK_CONCRETE_STAIRS);
        addDrop(ModBlocks.PINK_CONCRETE_SLAB);

        addDrop(ModBlocks.SUPER_POWERED_RAIL);
    }
}
