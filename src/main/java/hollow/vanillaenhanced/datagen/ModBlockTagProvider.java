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
                .add(ModBlocks.CHISELED_ANDESITE)
                .add(ModBlocks.GRANITE_BRICKS)
                .add(ModBlocks.DIORITE_BRICKS)
                .add(ModBlocks.SUPER_POWERED_RAIL);


    }
}
