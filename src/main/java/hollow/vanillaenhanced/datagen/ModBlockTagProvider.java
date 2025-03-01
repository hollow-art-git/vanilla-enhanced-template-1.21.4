package hollow.vanillaenhanced.datagen;

import com.jcraft.jorbis.Block;
import hollow.vanillaenhanced.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.ECHO_BLOCK)

                .add(ModBlocks.ANDESITE_BRICKS)
                .add(ModBlocks.ANDESITE_BRICKS_SLAB)
                .add(ModBlocks.ANDESITE_BRICKS_STAIRS)
                .add(ModBlocks.ANDESITE_BRICKS_WALL)
                .add(ModBlocks.CHISELED_ANDESITE)

                .add(ModBlocks.GRANITE_BRICKS)
                .add(ModBlocks.GRANITE_BRICKS_SLAB)
                .add(ModBlocks.GRANITE_BRICKS_STAIRS)
                .add(ModBlocks.GRANITE_BRICKS_WALL)
                .add(ModBlocks.CHISELED_GRANITE)

                .add(ModBlocks.DIORITE_BRICKS)
                .add(ModBlocks.DIORITE_BRICKS_SLAB)
                .add(ModBlocks.DIORITE_BRICKS_STAIRS)
                .add(ModBlocks.DIORITE_BRICKS_WALL)
                .add(ModBlocks.CHISELED_DIORITE)

                .add(ModBlocks.TERRACOTTA_SLAB)
                .add(ModBlocks.TERRACOTTA_STAIRS)
                .add(ModBlocks.RED_TERRACOTTA_SLAB)
                .add(ModBlocks.RED_TERRACOTTA_STAIRS)
                .add(ModBlocks.ORANGE_TERRACOTTA_SLAB)
                .add(ModBlocks.ORANGE_TERRACOTTA_STAIRS)
                .add(ModBlocks.YELLOW_TERRACOTTA_SLAB)
                .add(ModBlocks.YELLOW_TERRACOTTA_STAIRS)
                .add(ModBlocks.LIME_TERRACOTTA_SLAB)
                .add(ModBlocks.LIME_TERRACOTTA_STAIRS)
                .add(ModBlocks.GREEN_TERRACOTTA_SLAB)
                .add(ModBlocks.GREEN_TERRACOTTA_STAIRS)
                .add(ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB)
                .add(ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS)
                .add(ModBlocks.BLUE_TERRACOTTA_SLAB)
                .add(ModBlocks.BLUE_TERRACOTTA_STAIRS)
                .add(ModBlocks.CYAN_TERRACOTTA_SLAB)
                .add(ModBlocks.CYAN_TERRACOTTA_STAIRS)
                .add(ModBlocks.PURPLE_TERRACOTTA_SLAB)
                .add(ModBlocks.PURPLE_TERRACOTTA_STAIRS)
                .add(ModBlocks.MAGENTA_TERRACOTTA_SLAB)
                .add(ModBlocks.MAGENTA_TERRACOTTA_STAIRS)
                .add(ModBlocks.PINK_TERRACOTTA_SLAB)
                .add(ModBlocks.PINK_TERRACOTTA_STAIRS)
                .add(ModBlocks.BROWN_TERRACOTTA_SLAB)
                .add(ModBlocks.BROWN_TERRACOTTA_STAIRS)
                .add(ModBlocks.BLACK_TERRACOTTA_SLAB)
                .add(ModBlocks.BLACK_TERRACOTTA_STAIRS)
                .add(ModBlocks.GRAY_TERRACOTTA_SLAB)
                .add(ModBlocks.GRAY_TERRACOTTA_STAIRS)
                .add(ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB)
                .add(ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS)
                .add(ModBlocks.WHITE_TERRACOTTA_SLAB)
                .add(ModBlocks.WHITE_TERRACOTTA_STAIRS)

                .add(ModBlocks.WHITE_CONCRETE_STAIRS)
                .add(ModBlocks.WHITE_CONCRETE_SLAB)
                .add(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS)
                .add(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB)
                .add(ModBlocks.GRAY_CONCRETE_STAIRS)
                .add(ModBlocks.GRAY_CONCRETE_SLAB)
                .add(ModBlocks.BLACK_CONCRETE_STAIRS)
                .add(ModBlocks.BLACK_CONCRETE_SLAB)
                .add(ModBlocks.BROWN_CONCRETE_STAIRS)
                .add(ModBlocks.BROWN_CONCRETE_SLAB)
                .add(ModBlocks.RED_CONCRETE_STAIRS)
                .add(ModBlocks.RED_CONCRETE_SLAB)
                .add(ModBlocks.ORANGE_CONCRETE_STAIRS)
                .add(ModBlocks.ORANGE_CONCRETE_SLAB)
                .add(ModBlocks.YELLOW_CONCRETE_STAIRS)
                .add(ModBlocks.YELLOW_CONCRETE_SLAB)
                .add(ModBlocks.LIME_CONCRETE_STAIRS)
                .add(ModBlocks.LIME_CONCRETE_SLAB)
                .add(ModBlocks.GREEN_CONCRETE_STAIRS)
                .add(ModBlocks.GREEN_CONCRETE_SLAB)
                .add(ModBlocks.CYAN_CONCRETE_STAIRS)
                .add(ModBlocks.CYAN_CONCRETE_SLAB)
                .add(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS)
                .add(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB)
                .add(ModBlocks.BLUE_CONCRETE_STAIRS)
                .add(ModBlocks.BLUE_CONCRETE_SLAB)
                .add(ModBlocks.PURPLE_CONCRETE_STAIRS)
                .add(ModBlocks.PURPLE_CONCRETE_SLAB)
                .add(ModBlocks.MAGENTA_CONCRETE_STAIRS)
                .add(ModBlocks.MAGENTA_CONCRETE_SLAB)
                .add(ModBlocks.PINK_CONCRETE_STAIRS)
                .add(ModBlocks.PINK_CONCRETE_SLAB)

                .add(ModBlocks.SUPER_POWERED_RAIL);

        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.ANDESITE_BRICKS_WALL)
                .add(ModBlocks.GRANITE_BRICKS_WALL)
                .add(ModBlocks.DIORITE_BRICKS_WALL);

        getOrCreateTagBuilder(BlockTags.RAILS)
                .add(ModBlocks.SUPER_POWERED_RAIL);
    }
}
