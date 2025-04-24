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

import static net.minecraft.item.Items.HEART_OF_THE_SEA;

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
                offer2x2CompactingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SNOW_BRICKS, Blocks.SNOW_BLOCK);

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

                createShaped(RecipeCategory.MISC, Items.ANGLER_POTTERY_SHERD, 5)
                        .pattern(" X ")
                        .pattern("XbX")
                        .pattern(" X ")
                        .input('b', Items.BRICK)
                        .input('X', Items.ANGLER_POTTERY_SHERD)
                        .group("pottery_sherd")
                        .criterion(hasItem(Items.ANGLER_POTTERY_SHERD), conditionsFromItem(Items.ANGLER_POTTERY_SHERD))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, Items.ARCHER_POTTERY_SHERD, 5)
                        .pattern(" X ")
                        .pattern("XbX")
                        .pattern(" X ")
                        .input('b', Items.BRICK)
                        .input('X', Items.ARCHER_POTTERY_SHERD)
                        .group("pottery_sherd")
                        .criterion(hasItem(Items.ARCHER_POTTERY_SHERD), conditionsFromItem(Items.ARCHER_POTTERY_SHERD))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, Items.ARMS_UP_POTTERY_SHERD, 5)
                        .pattern(" X ")
                        .pattern("XbX")
                        .pattern(" X ")
                        .input('b', Items.BRICK)
                        .input('X', Items.ARMS_UP_POTTERY_SHERD)
                        .group("pottery_sherd")
                        .criterion(hasItem(Items.ARMS_UP_POTTERY_SHERD), conditionsFromItem(Items.ARMS_UP_POTTERY_SHERD))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, Items.BLADE_POTTERY_SHERD, 5)
                        .pattern(" X ")
                        .pattern("XbX")
                        .pattern(" X ")
                        .input('b', Items.BRICK)
                        .input('X', Items.BLADE_POTTERY_SHERD)
                        .group("pottery_sherd")
                        .criterion(hasItem(Items.BLADE_POTTERY_SHERD), conditionsFromItem(Items.BLADE_POTTERY_SHERD))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, Items.BREWER_POTTERY_SHERD, 5)
                        .pattern(" X ")
                        .pattern("XbX")
                        .pattern(" X ")
                        .input('b', Items.BRICK)
                        .input('X', Items.BREWER_POTTERY_SHERD)
                        .group("pottery_sherd")
                        .criterion(hasItem(Items.BREWER_POTTERY_SHERD), conditionsFromItem(Items.BREWER_POTTERY_SHERD))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, Items.BURN_POTTERY_SHERD, 5)
                        .pattern(" X ")
                        .pattern("XbX")
                        .pattern(" X ")
                        .input('b', Items.BRICK)
                        .input('X', Items.BURN_POTTERY_SHERD)
                        .group("pottery_sherd")
                        .criterion(hasItem(Items.BURN_POTTERY_SHERD), conditionsFromItem(Items.BURN_POTTERY_SHERD))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, Items.DANGER_POTTERY_SHERD, 5)
                        .pattern(" X ")
                        .pattern("XbX")
                        .pattern(" X ")
                        .input('b', Items.BRICK)
                        .input('X', Items.DANGER_POTTERY_SHERD)
                        .group("pottery_sherd")
                        .criterion(hasItem(Items.DANGER_POTTERY_SHERD), conditionsFromItem(Items.DANGER_POTTERY_SHERD))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, Items.EXPLORER_POTTERY_SHERD, 5)
                        .pattern(" X ")
                        .pattern("XbX")
                        .pattern(" X ")
                        .input('b', Items.BRICK)
                        .input('X', Items.EXPLORER_POTTERY_SHERD)
                        .group("pottery_sherd")
                        .criterion(hasItem(Items.EXPLORER_POTTERY_SHERD), conditionsFromItem(Items.EXPLORER_POTTERY_SHERD))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, Items.FLOW_POTTERY_SHERD, 5)
                        .pattern(" X ")
                        .pattern("XbX")
                        .pattern(" X ")
                        .input('b', Items.BRICK)
                        .input('X', Items.FLOW_POTTERY_SHERD)
                        .group("pottery_sherd")
                        .criterion(hasItem(Items.FLOW_POTTERY_SHERD), conditionsFromItem(Items.FLOW_POTTERY_SHERD))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, Items.FRIEND_POTTERY_SHERD, 5)
                        .pattern(" X ")
                        .pattern("XbX")
                        .pattern(" X ")
                        .input('b', Items.BRICK)
                        .input('X', Items.FRIEND_POTTERY_SHERD)
                        .group("pottery_sherd")
                        .criterion(hasItem(Items.FRIEND_POTTERY_SHERD), conditionsFromItem(Items.FRIEND_POTTERY_SHERD))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, Items.GUSTER_POTTERY_SHERD, 5)
                        .pattern(" X ")
                        .pattern("XbX")
                        .pattern(" X ")
                        .input('b', Items.BRICK)
                        .input('X', Items.GUSTER_POTTERY_SHERD)
                        .group("pottery_sherd")
                        .criterion(hasItem(Items.GUSTER_POTTERY_SHERD), conditionsFromItem(Items.GUSTER_POTTERY_SHERD))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, Items.HEART_POTTERY_SHERD, 5)
                        .pattern(" X ")
                        .pattern("XbX")
                        .pattern(" X ")
                        .input('b', Items.BRICK)
                        .input('X', Items.HEART_POTTERY_SHERD)
                        .group("pottery_sherd")
                        .criterion(hasItem(Items.HEART_POTTERY_SHERD), conditionsFromItem(Items.HEART_POTTERY_SHERD))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, Items.HEARTBREAK_POTTERY_SHERD, 5)
                        .pattern(" X ")
                        .pattern("XbX")
                        .pattern(" X ")
                        .input('b', Items.BRICK)
                        .input('X', Items.HEARTBREAK_POTTERY_SHERD)
                        .group("pottery_sherd")
                        .criterion(hasItem(Items.HEARTBREAK_POTTERY_SHERD), conditionsFromItem(Items.HEARTBREAK_POTTERY_SHERD))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, Items.HOWL_POTTERY_SHERD, 5)
                        .pattern(" X ")
                        .pattern("XbX")
                        .pattern(" X ")
                        .input('b', Items.BRICK)
                        .input('X', Items.HOWL_POTTERY_SHERD)
                        .group("pottery_sherd")
                        .criterion(hasItem(Items.HOWL_POTTERY_SHERD), conditionsFromItem(Items.HOWL_POTTERY_SHERD))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, Items.MINER_POTTERY_SHERD, 5)
                        .pattern(" X ")
                        .pattern("XbX")
                        .pattern(" X ")
                        .input('b', Items.BRICK)
                        .input('X', Items.MINER_POTTERY_SHERD)
                        .group("pottery_sherd")
                        .criterion(hasItem(Items.MINER_POTTERY_SHERD), conditionsFromItem(Items.MINER_POTTERY_SHERD))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, Items.MOURNER_POTTERY_SHERD, 5)
                        .pattern(" X ")
                        .pattern("XbX")
                        .pattern(" X ")
                        .input('b', Items.BRICK)
                        .input('X', Items.MOURNER_POTTERY_SHERD)
                        .group("pottery_sherd")
                        .criterion(hasItem(Items.MOURNER_POTTERY_SHERD), conditionsFromItem(Items.MOURNER_POTTERY_SHERD))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, Items.PRIZE_POTTERY_SHERD, 5)
                        .pattern(" X ")
                        .pattern("XbX")
                        .pattern(" X ")
                        .input('b', Items.BRICK)
                        .input('X', Items.PRIZE_POTTERY_SHERD)
                        .group("pottery_sherd")
                        .criterion(hasItem(Items.PRIZE_POTTERY_SHERD), conditionsFromItem(Items.PRIZE_POTTERY_SHERD))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, Items.SCRAPE_POTTERY_SHERD, 5)
                        .pattern(" X ")
                        .pattern("XbX")
                        .pattern(" X ")
                        .input('b', Items.BRICK)
                        .input('X', Items.SCRAPE_POTTERY_SHERD)
                        .group("pottery_sherd")
                        .criterion(hasItem(Items.SCRAPE_POTTERY_SHERD), conditionsFromItem(Items.SCRAPE_POTTERY_SHERD))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, Items.PLENTY_POTTERY_SHERD, 5)
                        .pattern(" X ")
                        .pattern("XbX")
                        .pattern(" X ")
                        .input('b', Items.BRICK)
                        .input('X', Items.PLENTY_POTTERY_SHERD)
                        .group("pottery_sherd")
                        .criterion(hasItem(Items.PLENTY_POTTERY_SHERD), conditionsFromItem(Items.PLENTY_POTTERY_SHERD))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, Items.SHEAF_POTTERY_SHERD, 5)
                        .pattern(" X ")
                        .pattern("XbX")
                        .pattern(" X ")
                        .input('b', Items.BRICK)
                        .input('X', Items.SHEAF_POTTERY_SHERD)
                        .group("pottery_sherd")
                        .criterion(hasItem(Items.SHEAF_POTTERY_SHERD), conditionsFromItem(Items.SHEAF_POTTERY_SHERD))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, Items.SHELTER_POTTERY_SHERD, 5)
                        .pattern(" X ")
                        .pattern("XbX")
                        .pattern(" X ")
                        .input('b', Items.BRICK)
                        .input('X', Items.SHELTER_POTTERY_SHERD)
                        .group("pottery_sherd")
                        .criterion(hasItem(Items.SHELTER_POTTERY_SHERD), conditionsFromItem(Items.SHELTER_POTTERY_SHERD))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, Items.SNORT_POTTERY_SHERD, 5)
                        .pattern(" X ")
                        .pattern("XbX")
                        .pattern(" X ")
                        .input('b', Items.BRICK)
                        .input('X', Items.SNORT_POTTERY_SHERD)
                        .group("pottery_sherd")
                        .criterion(hasItem(Items.SNORT_POTTERY_SHERD), conditionsFromItem(Items.SNORT_POTTERY_SHERD))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, Items.SKULL_POTTERY_SHERD, 5)
                        .pattern(" X ")
                        .pattern("XbX")
                        .pattern(" X ")
                        .input('b', Items.BRICK)
                        .input('X', Items.SKULL_POTTERY_SHERD)
                        .group("pottery_sherd")
                        .criterion(hasItem(Items.SKULL_POTTERY_SHERD), conditionsFromItem(Items.SKULL_POTTERY_SHERD))
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

                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SNOW_BRICKS_SLAB, Ingredient.ofItem(ModBlocks.SNOW_BRICKS));
                createStairsRecipe(ModBlocks.SNOW_BRICKS_STAIRS, Ingredient.ofItem(ModBlocks.SNOW_BRICKS));
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SNOW_BRICKS_STAIRS,ModBlocks.SNOW_BRICKS);

                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PALM_SLAB, Ingredient.ofItem(ModBlocks.PALM_PLANKS));
                createStairsRecipe(ModBlocks.PALM_STAIRS, Ingredient.ofItem(ModBlocks.PALM_PLANKS));

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
                        .pattern("cc")
                        .pattern("cc")
                        .input('c', ModItems.COPPER_NUGGET)
                        .group("copper_ingot")
                        .criterion(hasItem(ModItems.COPPER_NUGGET), conditionsFromItem(ModItems.COPPER_NUGGET))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, ModItems.COPPER_NUGGET, 4)
                        .pattern("c")
                        .input('c', Items.COPPER_INGOT)
                        .group("copper_nugget")
                        .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, ModItems.DIAMOND_SHARD, 2)
                        .input(Items.DIAMOND, 1)
                        .group("diamond_shard")
                        .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, ModItems.ELDER_GUARDIAN_HORN, 1)
                        .pattern("gpg")
                        .pattern("pgp")
                        .pattern("gpg")
                        .input('g', ModItems.GUARDIAN_HORN)
                        .input('p', Items.PRISMARINE_SHARD)
                        .group("elder_guardian_horn")
                        .criterion(hasItem(ModItems.GUARDIAN_HORN), conditionsFromItem(ModItems.GUARDIAN_HORN))
                        .offerTo(exporter);



                // --- SMELTING ---

                offerSmelting(List.of(Items.ANDESITE), RecipeCategory.BUILDING_BLOCKS, Items.POLISHED_ANDESITE, 0.1f, 200, "andesite");
                offerSmelting(List.of(Items.GRANITE), RecipeCategory.BUILDING_BLOCKS, Items.POLISHED_GRANITE, 0.1f, 200, "granite");
                offerSmelting(List.of(Items.DIORITE), RecipeCategory.BUILDING_BLOCKS, Items.POLISHED_DIORITE, 0.1f, 200, "diorite");

                offerSmelting(List.of(Items.RAW_IRON_BLOCK), RecipeCategory.BUILDING_BLOCKS, Items.IRON_BLOCK, 0.1f, 200, "raw_iron_block");
                offerSmelting(List.of(Items.RAW_COPPER_BLOCK), RecipeCategory.BUILDING_BLOCKS, Items.COPPER_BLOCK, 0.1f, 200, "raw_copper_block");
                offerSmelting(List.of(Items.RAW_GOLD_BLOCK), RecipeCategory.BUILDING_BLOCKS, Items.GOLD_BLOCK, 0.1f, 200, "raw_gold_block");
                offerBlasting(List.of(Items.RAW_IRON_BLOCK), RecipeCategory.BUILDING_BLOCKS, Items.IRON_BLOCK, 0.1f, 200, "raw_iron_block");
                offerBlasting(List.of(Items.RAW_COPPER_BLOCK), RecipeCategory.BUILDING_BLOCKS, Items.COPPER_BLOCK, 0.1f, 200, "raw_copper_block");
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