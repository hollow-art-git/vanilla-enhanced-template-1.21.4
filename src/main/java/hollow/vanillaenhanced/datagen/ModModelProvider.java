package hollow.vanillaenhanced.datagen;

import hollow.vanillaenhanced.block.ModBlocks;
import hollow.vanillaenhanced.item.ModItems;
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
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        itemModelGenerator.register(ModItems.NEW_GOLD_PICKAXE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.SHARP_STONE, Models.GENERATED);
        itemModelGenerator.register(ModItems.REINFORCED_STICK, Models.HANDHELD);
        itemModelGenerator.register(ModItems.EXPERT_HANDLE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COPPER_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.DIAMOND_SHARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.GUARDIAN_HORN, Models.GENERATED);
        itemModelGenerator.register(ModItems.ELDER_GUARDIAN_HORN, Models.GENERATED);

        //itemModelGenerator.register(ModBlocks.PALM_SAPLING.asItem(), Models.GENERATED);

    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ECHO_BLOCK);
        blockStateModelGenerator.registerStraightRail(ModBlocks.SUPER_POWERED_RAIL);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PALM_LEAVES);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PALM_PLANKS).family(ModBlocks.PALM_FAMILY);
        blockStateModelGenerator.registerLog(ModBlocks.PALM_LOG).log(ModBlocks.PALM_LOG).wood(ModBlocks.PALM_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_PALM_LOG).log(ModBlocks.STRIPPED_PALM_LOG).wood(ModBlocks.STRIPPED_PALM_WOOD);
        blockStateModelGenerator.registerTintableCross(ModBlocks.PALM_SAPLING, BlockStateModelGenerator.CrossType.NOT_TINTED);

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ANDESITE_BRICKS).family(ModBlocks.ANDESITE_FAMILY);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHISELED_ANDESITE);

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GRANITE_BRICKS).family(ModBlocks.GRANITE_FAMILY);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHISELED_GRANITE);

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DIORITE_BRICKS).family(ModBlocks.DIORITE_FAMILY);

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

        blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.RED_CONCRETE).family(ModBlocks.RED_CONCRETE_FAMILY);
        blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.ORANGE_CONCRETE).family(ModBlocks.ORANGE_CONCRETE_FAMILY);
        blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.YELLOW_CONCRETE).family(ModBlocks.YELLOW_CONCRETE_FAMILY);
        blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIME_CONCRETE).family(ModBlocks.LIME_CONCRETE_FAMILY);
        blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GREEN_CONCRETE).family(ModBlocks.GREEN_CONCRETE_FAMILY);
        blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CYAN_CONCRETE).family(ModBlocks.CYAN_CONCRETE_FAMILY);
        blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIGHT_BLUE_CONCRETE).family(ModBlocks.LIGHT_BLUE_CONCRETE_FAMILY);
        blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BLUE_CONCRETE).family(ModBlocks.BLUE_CONCRETE_FAMILY);
        blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PURPLE_CONCRETE).family(ModBlocks.PURPLE_CONCRETE_FAMILY);
        blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.MAGENTA_CONCRETE).family(ModBlocks.MAGENTA_CONCRETE_FAMILY);
        blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PINK_CONCRETE).family(ModBlocks.PINK_CONCRETE_FAMILY);
        blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BROWN_CONCRETE).family(ModBlocks.BROWN_CONCRETE_FAMILY);
        blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BLACK_CONCRETE).family(ModBlocks.BLACK_CONCRETE_FAMILY);
        blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GRAY_CONCRETE).family(ModBlocks.GRAY_CONCRETE_FAMILY);
        blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIGHT_GRAY_CONCRETE).family(ModBlocks.LIGHT_GRAY_CONCRETE_FAMILY);
        blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.WHITE_CONCRETE).family(ModBlocks.WHITE_CONCRETE_FAMILY);
    }

    @Override
    public String getName() {
        return "Vanilla Enhanced Model Provider";
    }
}
