package hollow.vanillaenhanced.datagen;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import hollow.vanillaenhanced.block.ModBlocks;
import hollow.vanillaenhanced.item.ModItems;
import net.minecraft.block.Blocks;
import net.minecraft.data.recipe.CraftingRecipeJsonBuilder;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
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
                        .input('g', Items.GOLD_NUGGET)
                        .input('c', ModItems.COPPER_NUGGET)
                        .input('/', Items.STICK)
                        .input('r', Items.REDSTONE)
                        .group("super_powered_rail")
                        .criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT))
                        .offerTo(exporter);

                offerChiseledBlockRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_ANDESITE, Items.ANDESITE_SLAB);
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICKS_SLAB, Ingredient.ofItem(Items.ANDESITE));
                createStairsRecipe(ModBlocks.ANDESITE_BRICKS_STAIRS, Ingredient.ofItem(Items.ANDESITE));
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICKS_STAIRS,Items.ANDESITE);

                offerChiseledBlockRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_GRANITE, Items.GRANITE_SLAB);
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICKS_SLAB, Ingredient.ofItem(Items.GRANITE));
                createStairsRecipe(ModBlocks.GRANITE_BRICKS_STAIRS, Ingredient.ofItem(Items.GRANITE));
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICKS_STAIRS,Items.GRANITE);

                offerChiseledBlockRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_DIORITE, Items.DIORITE_SLAB);
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICKS_SLAB, Ingredient.ofItem(Items.DIORITE));
                createStairsRecipe(ModBlocks.DIORITE_BRICKS_STAIRS, Ingredient.ofItem(Items.DIORITE));
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICKS_STAIRS,Items.DIORITE);

                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TERRACOTTA_SLAB, Ingredient.ofItem(Items.TERRACOTTA));
                createStairsRecipe(ModBlocks.TERRACOTTA_STAIRS, Ingredient.ofItem(Items.TERRACOTTA));
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_TERRACOTTA_SLAB, Ingredient.ofItem(Items.WHITE_TERRACOTTA));
                createStairsRecipe(ModBlocks.WHITE_TERRACOTTA_STAIRS, Ingredient.ofItem(Items.WHITE_TERRACOTTA));
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB, Ingredient.ofItem(Items.LIGHT_GRAY_TERRACOTTA));
                createStairsRecipe(ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS, Ingredient.ofItem(Items.LIGHT_GRAY_TERRACOTTA));
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_TERRACOTTA_SLAB, Ingredient.ofItem(Items.GRAY_TERRACOTTA));
                createStairsRecipe(ModBlocks.GRAY_TERRACOTTA_STAIRS, Ingredient.ofItem(Items.GRAY_TERRACOTTA));
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_TERRACOTTA_SLAB, Ingredient.ofItem(Items.BLACK_TERRACOTTA));
                createStairsRecipe(ModBlocks.BLACK_TERRACOTTA_STAIRS, Ingredient.ofItem(Items.BLACK_TERRACOTTA));
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_TERRACOTTA_SLAB, Ingredient.ofItem(Items.BROWN_TERRACOTTA));
                createStairsRecipe(ModBlocks.BROWN_TERRACOTTA_STAIRS, Ingredient.ofItem(Items.BROWN_TERRACOTTA));
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_TERRACOTTA_SLAB, Ingredient.ofItem(Items.RED_TERRACOTTA));
                createStairsRecipe(ModBlocks.RED_TERRACOTTA_STAIRS, Ingredient.ofItem(Items.RED_TERRACOTTA));
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_TERRACOTTA_SLAB, Ingredient.ofItem(Items.ORANGE_TERRACOTTA));
                createStairsRecipe(ModBlocks.ORANGE_TERRACOTTA_STAIRS, Ingredient.ofItem(Items.ORANGE_TERRACOTTA));
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_TERRACOTTA_SLAB, Ingredient.ofItem(Items.YELLOW_TERRACOTTA));
                createStairsRecipe(ModBlocks.YELLOW_TERRACOTTA_STAIRS, Ingredient.ofItem(Items.YELLOW_TERRACOTTA));
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_TERRACOTTA_SLAB, Ingredient.ofItem(Items.LIME_TERRACOTTA));
                createStairsRecipe(ModBlocks.LIME_TERRACOTTA_STAIRS, Ingredient.ofItem(Items.LIME_TERRACOTTA));
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_TERRACOTTA_SLAB, Ingredient.ofItem(Items.GREEN_TERRACOTTA));
                createStairsRecipe(ModBlocks.GREEN_TERRACOTTA_STAIRS, Ingredient.ofItem(Items.GREEN_TERRACOTTA));
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_TERRACOTTA_SLAB, Ingredient.ofItem(Items.CYAN_TERRACOTTA));
                createStairsRecipe(ModBlocks.CYAN_TERRACOTTA_STAIRS, Ingredient.ofItem(Items.CYAN_TERRACOTTA));
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB, Ingredient.ofItem(Items.LIGHT_BLUE_TERRACOTTA));
                createStairsRecipe(ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS, Ingredient.ofItem(Items.LIGHT_BLUE_TERRACOTTA));
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_TERRACOTTA_SLAB, Ingredient.ofItem(Items.BLUE_TERRACOTTA));
                createStairsRecipe(ModBlocks.BLUE_TERRACOTTA_STAIRS, Ingredient.ofItem(Items.BLUE_TERRACOTTA));
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_TERRACOTTA_SLAB, Ingredient.ofItem(Items.PURPLE_TERRACOTTA));
                createStairsRecipe(ModBlocks.PURPLE_TERRACOTTA_STAIRS, Ingredient.ofItem(Items.PURPLE_TERRACOTTA));
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_TERRACOTTA_SLAB, Ingredient.ofItem(Items.MAGENTA_TERRACOTTA));
                createStairsRecipe(ModBlocks.MAGENTA_TERRACOTTA_STAIRS, Ingredient.ofItem(Items.MAGENTA_TERRACOTTA));
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_TERRACOTTA_SLAB, Ingredient.ofItem(Items.PINK_TERRACOTTA));
                createStairsRecipe(ModBlocks.PINK_TERRACOTTA_STAIRS, Ingredient.ofItem(Items.PINK_TERRACOTTA));

                createShapeless(RecipeCategory.MISC, Items.FLINT, 1)
                        .input(Items.GRAVEL, 2)
                        .group("flint")
                        .criterion(hasItem(Blocks.GRAVEL), conditionsFromItem(Blocks.GRAVEL))
                        .offerTo(exporter);


                createShapeless(RecipeCategory.MISC, ModItems.SHARP_STONE, 1)
                        .input(Items.FLINT, 1)
                        .input(Items.COBBLESTONE, 1)
                        .group("sharp_stone")
                        .criterion(hasItem(Blocks.COBBLESTONE), conditionsFromItem(Blocks.COBBLESTONE))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, ModItems.REINFORCED_STICK, 1)
                        .pattern("/c/")
                        .input('c', Items.WHEAT)
                        .input('/', Items.STICK)
                        .group("reinforced_stick")
                        .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, ModItems.EXPERT_HANDLE, 1)
                        .pattern(" g ")
                        .pattern("g/g")
                        .pattern(" g ")
                        .input('g', Items.GOLD_NUGGET)
                        .input('/', ModItems.REINFORCED_STICK)
                        .group("expert_handle")
                        .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, Items.COPPER_INGOT, 1)
                        .pattern("ccc")
                        .input('c', ModItems.COPPER_NUGGET)
                        .group("copper_ingot")
                        .criterion(hasItem(ModItems.COPPER_NUGGET), conditionsFromItem(ModItems.COPPER_NUGGET))
                        .offerTo(exporter);



                // --- SMELTING ---

                offerSmelting(List.of(Items.ANDESITE), RecipeCategory.BUILDING_BLOCKS, Items.POLISHED_ANDESITE, 0.1f, 200, "andesite");
                offerSmelting(List.of(Items.GRANITE), RecipeCategory.BUILDING_BLOCKS, Items.POLISHED_GRANITE, 0.1f, 200, "granite");
                offerSmelting(List.of(Items.DIORITE), RecipeCategory.BUILDING_BLOCKS, Items.POLISHED_DIORITE, 0.1f, 200, "diorite");

                offerSmelting(List.of(Items.RAW_IRON_BLOCK), RecipeCategory.BUILDING_BLOCKS, Items.IRON_BLOCK, 0.1f, 200, "raw_iron_block");
                offerSmelting(List.of(Items.RAW_COPPER_BLOCK), RecipeCategory.BUILDING_BLOCKS, Items.COPPER_BLOCK, 0.1f, 200, "raw_copper_block");
                offerSmelting(List.of(Items.RAW_GOLD_BLOCK), RecipeCategory.BUILDING_BLOCKS, Items.GOLD_BLOCK, 0.1f, 200, "raw_gold_block");
                offerBlasting(List.of(Items.RAW_IRON_BLOCK), RecipeCategory.BUILDING_BLOCKS, Items.IRON_BLOCK, 0.1f, 200, "raw_iron_block");
                offerBlasting(List.of(Items.RAW_COPPER_BLOCK), RecipeCategory.BUILDING_BLOCKS, Items.COPPER_BLOCK, 0.1f, 200, "raw_");
                offerBlasting(List.of(Items.RAW_GOLD_BLOCK), RecipeCategory.BUILDING_BLOCKS, Items.GOLD_BLOCK, 0.1f, 200, "raw_gold_block");


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

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, Items.FLINT, Items.GRAVEL);
            }
        };
    }

    @Override
    public String getName() {
        return "FabricDocsReferenceRecipeProvider";
    }
}