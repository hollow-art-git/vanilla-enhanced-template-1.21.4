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
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ANDESITE_BRICKS).family(ModBlocks.ANDESITE_FAMILY);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHISELED_ANDESITE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GRANITE_BRICKS).family(ModBlocks.GRANITE_FAMILY);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DIORITE_BRICKS).family(ModBlocks.DIORITE_FAMILY);
        blockStateModelGenerator.registerStraightRail(ModBlocks.SUPER_POWERED_RAIL);
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
