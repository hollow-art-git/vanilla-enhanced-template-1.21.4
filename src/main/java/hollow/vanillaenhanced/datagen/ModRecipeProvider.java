package hollow.vanillaenhanced.datagen;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import hollow.vanillaenhanced.block.ModBlocks;
import hollow.vanillaenhanced.item.ModItems;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup registryLookup, RecipeExporter exporter) {
        return new RecipeGenerator(registryLookup, exporter) {
            @Override
            public void generate() {
                RegistryWrapper.Impl<Item> itemLookup = registries.getOrThrow(RegistryKeys.ITEM);

                // --- CRAFTING TABLE ---

                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ECHO_BLOCK, 1)
                        .pattern("xx")
                        .pattern("xx")
                        .input('x', Items.ECHO_SHARD)
                        .group("multi-bench")
                        .criterion(hasItem(Items.ECHO_SHARD), conditionsFromItem(Items.ECHO_SHARD))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SUPER_POWERED_RAIL, 3)
                        .pattern("g g")
                        .pattern("c/c")
                        .pattern("grg")
                        .input('g', Items.GOLD_INGOT)
                        .input('c', Items.COPPER_INGOT)
                        .input('/', Items.STICK)
                        .input('r', Items.REDSTONE)
                        .group("multi-bench")
                        .criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT))
                        .offerTo(exporter);


                // --- SMELTING ---

                offerSmelting(List.of(Items.ANDESITE), RecipeCategory.BUILDING_BLOCKS, Items.POLISHED_ANDESITE, 0.1f, 200, "andesite");
                offerSmelting(List.of(Items.GRANITE), RecipeCategory.BUILDING_BLOCKS, Items.POLISHED_GRANITE, 0.1f, 200, "granite");
                offerSmelting(List.of(Items.DIORITE), RecipeCategory.BUILDING_BLOCKS, Items.POLISHED_DIORITE, 0.1f, 200, "diorite");
            }
        };
    }

    @Override
    public String getName() {
        return "FabricDocsReferenceRecipeProvider";
    }
}