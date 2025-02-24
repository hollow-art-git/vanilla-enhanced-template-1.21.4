package hollow.vanillaenhanced.datagen;

import hollow.vanillaenhanced.block.ModBlocks;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.Models;
import net.minecraft.data.family.BlockFamily;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ECHO_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ANDESITE_BRICKS)
                .slab(ModBlocks.ANDESITE_BRICKS_SLAB)
                .stairs(ModBlocks.ANDESITE_BRICKS_STAIRS)
                .wall(ModBlocks.ANDESITE_BRICKS_WALL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHISELED_ANDESITE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DIORITE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GRANITE_BRICKS);
        //blockStateModelGenerator.registerStraightRail(ModBlocks.SUPER_POWERED_RAIL);
    }

    public static final BlockFamily RUBY_FAMILY =
            new BlockFamily.Builder(ModBlocks.ANDESITE_BRICKS)
                    .stairs(ModBlocks.ANDESITE_BRICKS_STAIRS)
                    .slab(ModBlocks.ANDESITE_BRICKS_SLAB)
                    .wall(ModBlocks.ANDESITE_BRICKS_WALL)
                    .build();

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        //itemModelGenerator.register(ModBlocks.ECHO_BLOCK, Models.GENERATED);
    }
}
