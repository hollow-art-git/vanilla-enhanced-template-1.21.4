package hollow.vanillaenhanced.datagen;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import hollow.vanillaenhanced.block.ModBlocks;
import hollow.vanillaenhanced.item.ModItems;
import net.minecraft.data.recipe.CraftingRecipeJsonBuilder;
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

                offer2x2CompactingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ECHO_BLOCK, Items.ECHO_SHARD);

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

                offerChiseledBlockRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_ANDESITE, Items.ANDESITE);
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICKS_SLAB, Ingredient.ofItem(Items.ANDESITE));
                createStairsRecipe(ModBlocks.ANDESITE_BRICKS_STAIRS, Ingredient.ofItem(Items.ANDESITE));
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICKS_STAIRS,Items.ANDESITE);

                offerChiseledBlockRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_GRANITE, Items.GRANITE);
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICKS_SLAB, Ingredient.ofItem(Items.GRANITE));
                createStairsRecipe(ModBlocks.GRANITE_BRICKS_STAIRS, Ingredient.ofItem(Items.GRANITE));
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICKS_STAIRS,Items.GRANITE);

                offerChiseledBlockRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_DIORITE, Items.DIORITE);
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICKS_SLAB, Ingredient.ofItem(Items.DIORITE));
                createStairsRecipe(ModBlocks.DIORITE_BRICKS_STAIRS, Ingredient.ofItem(Items.DIORITE));
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICKS_STAIRS,Items.DIORITE);


                // --- SMELTING ---

                offerSmelting(List.of(Items.ANDESITE), RecipeCategory.BUILDING_BLOCKS, Items.POLISHED_ANDESITE, 0.1f, 200, "andesite");
                offerSmelting(List.of(Items.GRANITE), RecipeCategory.BUILDING_BLOCKS, Items.POLISHED_GRANITE, 0.1f, 200, "granite");
                offerSmelting(List.of(Items.DIORITE), RecipeCategory.BUILDING_BLOCKS, Items.POLISHED_DIORITE, 0.1f, 200, "diorite");

                // --- STONECUTTER ---

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_ANDESITE, Items.ANDESITE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICKS, Items.ANDESITE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICKS_STAIRS, Items.ANDESITE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICKS_WALL, Items.ANDESITE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICKS_SLAB, Items.ANDESITE, 2);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_GRANITE, Items.GRANITE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICKS, Items.GRANITE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICKS_STAIRS, Items.GRANITE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICKS_WALL, Items.GRANITE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICKS_SLAB, Items.GRANITE, 2);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_DIORITE, Items.DIORITE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICKS, Items.DIORITE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICKS_STAIRS, Items.DIORITE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICKS_WALL, Items.DIORITE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICKS_SLAB, Items.DIORITE, 2);
            }
        };
    }

    @Override
    public String getName() {
        return "FabricDocsReferenceRecipeProvider";
    }
}