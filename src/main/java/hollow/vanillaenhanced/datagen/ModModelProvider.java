package hollow.vanillaenhanced.datagen;

import hollow.vanillaenhanced.block.ModBlocks;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.block.Blocks;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.Models;
import net.minecraft.client.data.TexturedModel;
import net.minecraft.data.family.BlockFamily;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ECHO_BLOCK);
        blockStateModelGenerator.registerStraightRail(ModBlocks.SUPER_POWERED_RAIL);

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ANDESITE_BRICKS).family(ModBlocks.ANDESITE_FAMILY);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHISELED_ANDESITE);

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GRANITE_BRICKS).family(ModBlocks.GRANITE_FAMILY);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHISELED_GRANITE);

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DIORITE_BRICKS).family(ModBlocks.DIORITE_FAMILY);
        blockStateModelGenerator.registerSingleton(ModBlocks.CHISELED_DIORITE, TexturedModel.END_FOR_TOP_CUBE_COLUMN);

        blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.TERRACOTTA).family(ModBlocks.TERRACOTTA_FAMILY);
        blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.RED_TERRACOTTA).family(ModBlocks.RED_TERRACOTTA_FAMILY);
        blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.ORANGE_TERRACOTTA).family(ModBlocks.ORANGE_TERRACOTTA_FAMILY);
        blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.YELLOW_TERRACOTTA).family(ModBlocks.YELLOW_TERRACOTTA_FAMILY);
        blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIME_TERRACOTTA).family(ModBlocks.LIME_TERRACOTTA_FAMILY);
        blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GREEN_TERRACOTTA).family(ModBlocks.GREEN_TERRACOTTA_FAMILY);
        blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIGHT_BLUE_TERRACOTTA).family(ModBlocks.LIGHT_BLUE_TERRACOTTA_FAMILY);
        blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BLUE_TERRACOTTA).family(ModBlocks.BLUE_TERRACOTTA_FAMILY);
        blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CYAN_TERRACOTTA).family(ModBlocks.CYAN_TERRACOTTA_FAMILY);
        blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.MAGENTA_TERRACOTTA).family(ModBlocks.MAGENTA_TERRACOTTA_FAMILY);
        blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PINK_TERRACOTTA).family(ModBlocks.PINK_TERRACOTTA_FAMILY);
        blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PURPLE_TERRACOTTA).family(ModBlocks.PURPLE_TERRACOTTA_FAMILY);
        blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BROWN_TERRACOTTA).family(ModBlocks.BROWN_TERRACOTTA_FAMILY);
        blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BLACK_TERRACOTTA).family(ModBlocks.BLACK_TERRACOTTA_FAMILY);
        blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GRAY_TERRACOTTA).family(ModBlocks.GRAY_TERRACOTTA_FAMILY);
        blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIGHT_GRAY_TERRACOTTA).family(ModBlocks.LIGHT_GRAY_TERRACOTTA_FAMILY);
        blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.WHITE_TERRACOTTA).family(ModBlocks.WHITE_TERRACOTTA_FAMILY);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        //itemModelGenerator.register(ModBlocks.ECHO_BLOCK, Models.GENERATED);
    }

    @Override
    public String getName() {
        return "Vanilla Enhanced Model Provider";
    }
}
