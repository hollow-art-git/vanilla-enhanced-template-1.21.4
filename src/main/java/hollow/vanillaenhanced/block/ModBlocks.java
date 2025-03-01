package hollow.vanillaenhanced.block;

import hollow.vanillaenhanced.VanillaEnhanced;
import hollow.vanillaenhanced.item.ModItems;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.data.family.BlockFamilies;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static Block register(Block block, RegistryKey<Block> blockKey, boolean shouldRegisterItem) {
        // Sometimes, you may not want to register an item for the block.
        // Eg: if it's a technical block like `minecraft:air` or `minecraft:end_gateway`
        if (shouldRegisterItem) {
            // Items need to be registered with a different type of registry key, but the ID
            // can be the same.
            RegistryKey<Item> itemKey = RegistryKey.of(RegistryKeys.ITEM, blockKey.getValue());

            BlockItem blockItem = new BlockItem(block, new Item.Settings().registryKey(itemKey));
            Registry.register(Registries.ITEM, itemKey, blockItem);
        }

        return Registry.register(Registries.BLOCK, blockKey, block);
    }


    // --- ECHO BLOCK ---
    public static final RegistryKey<Block> ECHO_BLOCK_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaEnhanced.MOD_ID, "echo_block"));
    public static final Block ECHO_BLOCK = register(
            new Block(AbstractBlock.Settings.create().registryKey(ECHO_BLOCK_KEY).sounds(BlockSoundGroup.AMETHYST_BLOCK).requiresTool().strength(1.5f)), ECHO_BLOCK_KEY, true);

    // --- SUPER POWERED RAIL ---
    public static final RegistryKey<Block> SUPER_POWERED_RAIL_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaEnhanced.MOD_ID, "super_powered_rail"));
    public static final Block SUPER_POWERED_RAIL = register(
            new PoweredRailBlock(AbstractBlock.Settings.create().registryKey(SUPER_POWERED_RAIL_KEY).sounds(BlockSoundGroup.STONE).strength(0.7f).noCollision()), SUPER_POWERED_RAIL_KEY, true);

    // --- DIORITE ---
    public static final RegistryKey<Block> DIORITE_BRICKS_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaEnhanced.MOD_ID, "diorite_bricks"));
    public static final Block DIORITE_BRICKS = register(
            new Block(AbstractBlock.Settings.create().registryKey(DIORITE_BRICKS_KEY).sounds(BlockSoundGroup.STONE).requiresTool().resistance(6).hardness(1.5f)), DIORITE_BRICKS_KEY, true);

    public static final RegistryKey<Block> DIORITE_BRICKS_SLAB_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaEnhanced.MOD_ID, "diorite_bricks_slab"));
    public static final Block DIORITE_BRICKS_SLAB = register(
            new SlabBlock(AbstractBlock.Settings.create().registryKey(DIORITE_BRICKS_SLAB_KEY).sounds(BlockSoundGroup.STONE).requiresTool().resistance(6).hardness(1.5f)), DIORITE_BRICKS_SLAB_KEY, true);

    public static final RegistryKey<Block> DIORITE_BRICKS_STAIRS_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaEnhanced.MOD_ID, "diorite_bricks_stairs"));
    public static final Block DIORITE_BRICKS_STAIRS = register(
            new StairsBlock(ModBlocks.DIORITE_BRICKS.getDefaultState(), AbstractBlock.Settings.create().registryKey(DIORITE_BRICKS_STAIRS_KEY).sounds(BlockSoundGroup.STONE).requiresTool().resistance(6).hardness(1.5f)), DIORITE_BRICKS_STAIRS_KEY, true);

    public static final RegistryKey<Block> DIORITE_BRICKS_WALL_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaEnhanced.MOD_ID, "diorite_bricks_wall"));
    public static final Block DIORITE_BRICKS_WALL = register(
            new WallBlock(AbstractBlock.Settings.create().registryKey(DIORITE_BRICKS_WALL_KEY).sounds(BlockSoundGroup.STONE).requiresTool().resistance(6).hardness(1.5f)), DIORITE_BRICKS_WALL_KEY, true);

    public static final BlockFamily DIORITE_FAMILY =
            new BlockFamily.Builder(ModBlocks.DIORITE_BRICKS)
                    .stairs(ModBlocks.DIORITE_BRICKS_STAIRS)
                    .slab(ModBlocks.DIORITE_BRICKS_SLAB)
                    .wall(ModBlocks.DIORITE_BRICKS_WALL)
                    .build();

    public static final RegistryKey<Block> CHISELED_DIORITE_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaEnhanced.MOD_ID, "chiseled_diorite"));
    public static final Block CHISELED_DIORITE = register(
            new Block(AbstractBlock.Settings.create().registryKey(CHISELED_DIORITE_KEY).sounds(BlockSoundGroup.STONE).requiresTool().resistance(6).hardness(1.5f)), CHISELED_DIORITE_KEY, true);

    // --- GRANITE ---
    public static final RegistryKey<Block> GRANITE_BRICKS_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaEnhanced.MOD_ID, "granite_bricks"));
    public static final Block GRANITE_BRICKS = register(
            new Block(AbstractBlock.Settings.create().registryKey(GRANITE_BRICKS_KEY).sounds(BlockSoundGroup.STONE).requiresTool().resistance(6).hardness(1.5f)), GRANITE_BRICKS_KEY, true);

    public static final RegistryKey<Block> GRANITE_BRICKS_SLAB_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaEnhanced.MOD_ID, "granite_bricks_slab"));
    public static final Block GRANITE_BRICKS_SLAB = register(
            new SlabBlock(AbstractBlock.Settings.create().registryKey(GRANITE_BRICKS_SLAB_KEY).sounds(BlockSoundGroup.STONE).requiresTool().resistance(6).hardness(1.5f)), GRANITE_BRICKS_SLAB_KEY, true);

    public static final RegistryKey<Block> GRANITE_BRICKS_STAIRS_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaEnhanced.MOD_ID, "granite_bricks_stairs"));
    public static final Block GRANITE_BRICKS_STAIRS = register(
            new StairsBlock(ModBlocks.GRANITE_BRICKS.getDefaultState(), AbstractBlock.Settings.create().registryKey(GRANITE_BRICKS_STAIRS_KEY).sounds(BlockSoundGroup.STONE).requiresTool().resistance(6).hardness(1.5f)), GRANITE_BRICKS_STAIRS_KEY, true);

    public static final RegistryKey<Block> GRANITE_BRICKS_WALL_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaEnhanced.MOD_ID, "granite_bricks_wall"));
    public static final Block GRANITE_BRICKS_WALL = register(
            new WallBlock(AbstractBlock.Settings.create().registryKey(GRANITE_BRICKS_WALL_KEY).sounds(BlockSoundGroup.STONE).requiresTool().resistance(6).hardness(1.5f)), GRANITE_BRICKS_WALL_KEY, true);

    public static final BlockFamily GRANITE_FAMILY =
            new BlockFamily.Builder(ModBlocks.GRANITE_BRICKS)
                    .stairs(ModBlocks.GRANITE_BRICKS_STAIRS)
                    .slab(ModBlocks.GRANITE_BRICKS_SLAB)
                    .wall(ModBlocks.GRANITE_BRICKS_WALL)
                    .build();

    public static final RegistryKey<Block> CHISELED_GRANITE_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaEnhanced.MOD_ID, "chiseled_granite"));
    public static final Block CHISELED_GRANITE = register(
            new PillarBlock(AbstractBlock.Settings.create().registryKey(CHISELED_GRANITE_KEY).sounds(BlockSoundGroup.STONE).requiresTool().resistance(6).hardness(1.5f)), CHISELED_GRANITE_KEY, true);

    // --- ANDESITE ---
    public static final RegistryKey<Block> ANDESITE_BRICKS_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaEnhanced.MOD_ID, "andesite_bricks"));
    public static final Block ANDESITE_BRICKS = register(
            new Block(AbstractBlock.Settings.create().registryKey(ANDESITE_BRICKS_KEY).sounds(BlockSoundGroup.STONE).requiresTool().resistance(6).hardness(1.5f)), ANDESITE_BRICKS_KEY, true);

    public static final RegistryKey<Block> ANDESITE_BRICKS_SLAB_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaEnhanced.MOD_ID, "andesite_bricks_slab"));
    public static final Block ANDESITE_BRICKS_SLAB = register(
            new SlabBlock(AbstractBlock.Settings.create().registryKey(ANDESITE_BRICKS_SLAB_KEY).sounds(BlockSoundGroup.STONE).requiresTool().resistance(6).hardness(1.5f)), ANDESITE_BRICKS_SLAB_KEY, true);

    public static final RegistryKey<Block> ANDESITE_BRICKS_STAIRS_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaEnhanced.MOD_ID, "andesite_bricks_stairs"));
    public static final Block ANDESITE_BRICKS_STAIRS = register(
            new StairsBlock(ModBlocks.ANDESITE_BRICKS.getDefaultState(), AbstractBlock.Settings.create().registryKey(ANDESITE_BRICKS_STAIRS_KEY).sounds(BlockSoundGroup.STONE).requiresTool().resistance(6).hardness(1.5f)), ANDESITE_BRICKS_STAIRS_KEY, true);

    public static final RegistryKey<Block> ANDESITE_BRICKS_WALL_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaEnhanced.MOD_ID, "andesite_bricks_wall"));
    public static final Block ANDESITE_BRICKS_WALL = register(
            new WallBlock(AbstractBlock.Settings.create().registryKey(ANDESITE_BRICKS_WALL_KEY).sounds(BlockSoundGroup.STONE).requiresTool().resistance(6).hardness(1.5f)), ANDESITE_BRICKS_WALL_KEY, true);

    public static final BlockFamily ANDESITE_FAMILY =
            new BlockFamily.Builder(ModBlocks.ANDESITE_BRICKS)
                    .stairs(ModBlocks.ANDESITE_BRICKS_STAIRS)
                    .slab(ModBlocks.ANDESITE_BRICKS_SLAB)
                    .wall(ModBlocks.ANDESITE_BRICKS_WALL)
                    .build();

    public static final RegistryKey<Block> CHISELED_ANDESITE_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaEnhanced.MOD_ID, "chiseled_andesite"));
    public static final Block CHISELED_ANDESITE = register(
            new Block(AbstractBlock.Settings.create().registryKey(CHISELED_ANDESITE_KEY).sounds(BlockSoundGroup.STONE).requiresTool().resistance(6).hardness(1.5f)), CHISELED_ANDESITE_KEY, true);

    // --- TERRACOTTA / CONCRETE ---


    // --- MAIN ---

    public static final RegistryKey<Block> TERRACOTTA_SLAB_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaEnhanced.MOD_ID, "terracotta_slab"));
    public static final Block TERRACOTTA_SLAB = register(
            new SlabBlock(AbstractBlock.Settings.create().registryKey(TERRACOTTA_SLAB_KEY).sounds(BlockSoundGroup.STONE).requiresTool().resistance(4.2f).hardness(1.25f)), TERRACOTTA_SLAB_KEY, true);

    public static final RegistryKey<Block> TERRACOTTA_STAIRS_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaEnhanced.MOD_ID, "terracotta_stairs"));
    public static final Block TERRACOTTA_STAIRS = register(
            new StairsBlock(Blocks.TERRACOTTA.getDefaultState(), AbstractBlock.Settings.create().registryKey(TERRACOTTA_STAIRS_KEY).sounds(BlockSoundGroup.STONE).requiresTool().resistance(4.2f).hardness(1.25f)), TERRACOTTA_STAIRS_KEY, true);

    public static final BlockFamily TERRACOTTA_FAMILY =
            new BlockFamily.Builder(Blocks.TERRACOTTA)
                    .stairs(ModBlocks.TERRACOTTA_STAIRS)
                    .slab(ModBlocks.TERRACOTTA_SLAB)
                    .build();

    // --- RED ---

    public static final RegistryKey<Block> RED_TERRACOTTA_SLAB_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaEnhanced.MOD_ID, "red_terracotta_slab"));
    public static final Block RED_TERRACOTTA_SLAB = register(
            new SlabBlock(AbstractBlock.Settings.create().registryKey(RED_TERRACOTTA_SLAB_KEY).sounds(BlockSoundGroup.STONE).requiresTool().resistance(4.2f).hardness(1.25f)), RED_TERRACOTTA_SLAB_KEY, true);

    public static final RegistryKey<Block> RED_TERRACOTTA_STAIRS_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaEnhanced.MOD_ID, "red_terracotta_stairs"));
    public static final Block RED_TERRACOTTA_STAIRS = register(
            new StairsBlock(Blocks.RED_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.create().registryKey(RED_TERRACOTTA_STAIRS_KEY).sounds(BlockSoundGroup.STONE).requiresTool().resistance(4.2f).hardness(1.25f)), RED_TERRACOTTA_STAIRS_KEY, true);

    public static final BlockFamily RED_TERRACOTTA_FAMILY =
            new BlockFamily.Builder(Blocks.RED_TERRACOTTA)
                    .stairs(ModBlocks.RED_TERRACOTTA_STAIRS)
                    .slab(ModBlocks.RED_TERRACOTTA_SLAB)
                    .build();

    public static final RegistryKey<Block> RED_CONCRETE_SLAB_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaEnhanced.MOD_ID, "red_concrete_slab"));
    public static final Block RED_CONCRETE_SLAB = register(
            new SlabBlock(AbstractBlock.Settings.create().registryKey(RED_CONCRETE_SLAB_KEY).sounds(BlockSoundGroup.STONE).requiresTool().strength(1.8f)), RED_CONCRETE_SLAB_KEY, true);

    public static final RegistryKey<Block> RED_CONCRETE_STAIRS_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaEnhanced.MOD_ID, "red_concrete_stairs"));
    public static final Block RED_CONCRETE_STAIRS = register(
            new StairsBlock(Blocks.RED_CONCRETE.getDefaultState(), AbstractBlock.Settings.create().registryKey(RED_CONCRETE_STAIRS_KEY).sounds(BlockSoundGroup.STONE).requiresTool().strength(1.8f)), RED_CONCRETE_STAIRS_KEY, true);

    public static final BlockFamily RED_CONCRETE_FAMILY =
            new BlockFamily.Builder(Blocks.RED_CONCRETE)
                    .stairs(ModBlocks.RED_CONCRETE_STAIRS)
                    .slab(ModBlocks.RED_CONCRETE_SLAB)
                    .build();

    // --- ORANGE ---

    public static final RegistryKey<Block> ORANGE_TERRACOTTA_SLAB_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaEnhanced.MOD_ID, "orange_terracotta_slab"));
    public static final Block ORANGE_TERRACOTTA_SLAB = register(
            new SlabBlock(AbstractBlock.Settings.create().registryKey(ORANGE_TERRACOTTA_SLAB_KEY).sounds(BlockSoundGroup.STONE).requiresTool().resistance(4.2f).hardness(1.25f)), ORANGE_TERRACOTTA_SLAB_KEY, true);

    public static final RegistryKey<Block> ORANGE_TERRACOTTA_STAIRS_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaEnhanced.MOD_ID, "orange_terracotta_stairs"));
    public static final Block ORANGE_TERRACOTTA_STAIRS = register(
            new StairsBlock(Blocks.ORANGE_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.create().registryKey(ORANGE_TERRACOTTA_STAIRS_KEY).sounds(BlockSoundGroup.STONE).requiresTool().resistance(4.2f).hardness(1.25f)), ORANGE_TERRACOTTA_STAIRS_KEY, true);

    public static final BlockFamily ORANGE_TERRACOTTA_FAMILY =
            new BlockFamily.Builder(Blocks.ORANGE_TERRACOTTA)
                    .stairs(ModBlocks.ORANGE_TERRACOTTA_STAIRS)
                    .slab(ModBlocks.ORANGE_TERRACOTTA_SLAB)
                    .build();

    public static final RegistryKey<Block> ORANGE_CONCRETE_SLAB_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaEnhanced.MOD_ID, "orange_concrete_slab"));
    public static final Block ORANGE_CONCRETE_SLAB = register(
            new SlabBlock(AbstractBlock.Settings.create().registryKey(ORANGE_CONCRETE_SLAB_KEY).sounds(BlockSoundGroup.STONE).requiresTool().strength(1.8f)), ORANGE_CONCRETE_SLAB_KEY, true);

    public static final RegistryKey<Block> ORANGE_CONCRETE_STAIRS_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaEnhanced.MOD_ID, "orange_concrete_stairs"));
    public static final Block ORANGE_CONCRETE_STAIRS = register(
            new StairsBlock(Blocks.ORANGE_CONCRETE.getDefaultState(), AbstractBlock.Settings.create().registryKey(ORANGE_CONCRETE_STAIRS_KEY).sounds(BlockSoundGroup.STONE).requiresTool().strength(1.8f)), ORANGE_CONCRETE_STAIRS_KEY, true);

    public static final BlockFamily ORANGE_CONCRETE_FAMILY =
            new BlockFamily.Builder(Blocks.ORANGE_CONCRETE)
                    .stairs(ModBlocks.ORANGE_CONCRETE_STAIRS)
                    .slab(ModBlocks.ORANGE_CONCRETE_SLAB)
                    .build();

    // --- YELLOW ---

    public static final RegistryKey<Block> YELLOW_TERRACOTTA_SLAB_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaEnhanced.MOD_ID, "yellow_terracotta_slab"));
    public static final Block YELLOW_TERRACOTTA_SLAB = register(
            new SlabBlock(AbstractBlock.Settings.create().registryKey(YELLOW_TERRACOTTA_SLAB_KEY).sounds(BlockSoundGroup.STONE).requiresTool().resistance(4.2f).hardness(1.25f)), YELLOW_TERRACOTTA_SLAB_KEY, true);

    public static final RegistryKey<Block> YELLOW_TERRACOTTA_STAIRS_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaEnhanced.MOD_ID, "yellow_terracotta_stairs"));
    public static final Block YELLOW_TERRACOTTA_STAIRS = register(
            new StairsBlock(Blocks.YELLOW_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.create().registryKey(YELLOW_TERRACOTTA_STAIRS_KEY).sounds(BlockSoundGroup.STONE).requiresTool().resistance(4.2f).hardness(1.25f)), YELLOW_TERRACOTTA_STAIRS_KEY, true);

    public static final BlockFamily YELLOW_TERRACOTTA_FAMILY =
            new BlockFamily.Builder(Blocks.YELLOW_TERRACOTTA)
                    .stairs(ModBlocks.YELLOW_TERRACOTTA_STAIRS)
                    .slab(ModBlocks.YELLOW_TERRACOTTA_SLAB)
                    .build();

    public static final RegistryKey<Block> YELLOW_CONCRETE_SLAB_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaEnhanced.MOD_ID, "yellow_concrete_slab"));
    public static final Block YELLOW_CONCRETE_SLAB = register(
            new SlabBlock(AbstractBlock.Settings.create().registryKey(YELLOW_CONCRETE_SLAB_KEY).sounds(BlockSoundGroup.STONE).requiresTool().strength(1.8f)), YELLOW_CONCRETE_SLAB_KEY, true);

    public static final RegistryKey<Block> YELLOW_CONCRETE_STAIRS_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaEnhanced.MOD_ID, "yellow_concrete_stairs"));
    public static final Block YELLOW_CONCRETE_STAIRS = register(
            new StairsBlock(Blocks.YELLOW_CONCRETE.getDefaultState(), AbstractBlock.Settings.create().registryKey(YELLOW_CONCRETE_STAIRS_KEY).sounds(BlockSoundGroup.STONE).requiresTool().strength(1.8f)), YELLOW_CONCRETE_STAIRS_KEY, true);

    public static final BlockFamily YELLOW_CONCRETE_FAMILY =
            new BlockFamily.Builder(Blocks.YELLOW_CONCRETE)
                    .stairs(ModBlocks.YELLOW_CONCRETE_STAIRS)
                    .slab(ModBlocks.YELLOW_CONCRETE_SLAB)
                    .build();

    // --- LIME ---

    public static final RegistryKey<Block> LIME_TERRACOTTA_SLAB_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaEnhanced.MOD_ID, "lime_terracotta_slab"));
    public static final Block LIME_TERRACOTTA_SLAB = register(
            new SlabBlock(AbstractBlock.Settings.create().registryKey(LIME_TERRACOTTA_SLAB_KEY).sounds(BlockSoundGroup.STONE).requiresTool().resistance(4.2f).hardness(1.25f)), LIME_TERRACOTTA_SLAB_KEY, true);

    public static final RegistryKey<Block> LIME_TERRACOTTA_STAIRS_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaEnhanced.MOD_ID, "lime_terracotta_stairs"));
    public static final Block LIME_TERRACOTTA_STAIRS = register(
            new StairsBlock(Blocks.LIME_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.create().registryKey(LIME_TERRACOTTA_STAIRS_KEY).sounds(BlockSoundGroup.STONE).requiresTool().resistance(4.2f).hardness(1.25f)), LIME_TERRACOTTA_STAIRS_KEY, true);

    public static final BlockFamily LIME_TERRACOTTA_FAMILY =
            new BlockFamily.Builder(Blocks.LIME_TERRACOTTA)
                    .stairs(ModBlocks.LIME_TERRACOTTA_STAIRS)
                    .slab(ModBlocks.LIME_TERRACOTTA_SLAB)
                    .build();

    public static final RegistryKey<Block> LIME_CONCRETE_SLAB_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaEnhanced.MOD_ID, "lime_concrete_slab"));
    public static final Block LIME_CONCRETE_SLAB = register(
            new SlabBlock(AbstractBlock.Settings.create().registryKey(LIME_CONCRETE_SLAB_KEY).sounds(BlockSoundGroup.STONE).requiresTool().strength(1.8f)), LIME_CONCRETE_SLAB_KEY, true);

    public static final RegistryKey<Block> LIME_CONCRETE_STAIRS_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaEnhanced.MOD_ID, "lime_concrete_stairs"));
    public static final Block LIME_CONCRETE_STAIRS = register(
            new StairsBlock(Blocks.LIME_CONCRETE.getDefaultState(), AbstractBlock.Settings.create().registryKey(LIME_CONCRETE_STAIRS_KEY).sounds(BlockSoundGroup.STONE).requiresTool().strength(1.8f)), LIME_CONCRETE_STAIRS_KEY, true);

    public static final BlockFamily LIME_CONCRETE_FAMILY =
            new BlockFamily.Builder(Blocks.LIME_CONCRETE)
                    .stairs(ModBlocks.LIME_CONCRETE_STAIRS)
                    .slab(ModBlocks.LIME_CONCRETE_SLAB)
                    .build();

    // --- GREEN ---

    public static final RegistryKey<Block> GREEN_TERRACOTTA_SLAB_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaEnhanced.MOD_ID, "green_terracotta_slab"));
    public static final Block GREEN_TERRACOTTA_SLAB = register(
            new SlabBlock(AbstractBlock.Settings.create().registryKey(GREEN_TERRACOTTA_SLAB_KEY).sounds(BlockSoundGroup.STONE).requiresTool().resistance(1.8f).hardness(1.25f)), GREEN_TERRACOTTA_SLAB_KEY, true);

    public static final RegistryKey<Block> GREEN_TERRACOTTA_STAIRS_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaEnhanced.MOD_ID, "green_terracotta_stairs"));
    public static final Block GREEN_TERRACOTTA_STAIRS = register(
            new StairsBlock(Blocks.GREEN_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.create().registryKey(GREEN_TERRACOTTA_STAIRS_KEY).sounds(BlockSoundGroup.STONE).requiresTool().resistance(4.2f).hardness(1.25f)), GREEN_TERRACOTTA_STAIRS_KEY, true);

    public static final BlockFamily GREEN_TERRACOTTA_FAMILY =
            new BlockFamily.Builder(Blocks.GREEN_TERRACOTTA)
                    .stairs(ModBlocks.GREEN_TERRACOTTA_STAIRS)
                    .slab(ModBlocks.GREEN_TERRACOTTA_SLAB)
                    .build();

    public static final RegistryKey<Block> GREEN_CONCRETE_SLAB_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaEnhanced.MOD_ID, "green_concrete_slab"));
    public static final Block GREEN_CONCRETE_SLAB = register(
            new SlabBlock(AbstractBlock.Settings.create().registryKey(GREEN_CONCRETE_SLAB_KEY).sounds(BlockSoundGroup.STONE).requiresTool().strength(1.8f)), GREEN_CONCRETE_SLAB_KEY, true);

    public static final RegistryKey<Block> GREEN_CONCRETE_STAIRS_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaEnhanced.MOD_ID, "green_concrete_stairs"));
    public static final Block GREEN_CONCRETE_STAIRS = register(
            new StairsBlock(Blocks.GREEN_CONCRETE.getDefaultState(), AbstractBlock.Settings.create().registryKey(GREEN_CONCRETE_STAIRS_KEY).sounds(BlockSoundGroup.STONE).requiresTool().strength(1.8f)), GREEN_CONCRETE_STAIRS_KEY, true);

    public static final BlockFamily GREEN_CONCRETE_FAMILY =
            new BlockFamily.Builder(Blocks.GREEN_CONCRETE)
                    .stairs(ModBlocks.GREEN_CONCRETE_STAIRS)
                    .slab(ModBlocks.GREEN_CONCRETE_SLAB)
                    .build();

    // --- LIGHT BLUE ---

    public static final RegistryKey<Block> LIGHT_BLUE_TERRACOTTA_SLAB_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaEnhanced.MOD_ID, "light_blue_terracotta_slab"));
    public static final Block LIGHT_BLUE_TERRACOTTA_SLAB = register(
            new SlabBlock(AbstractBlock.Settings.create().registryKey(LIGHT_BLUE_TERRACOTTA_SLAB_KEY).sounds(BlockSoundGroup.STONE).requiresTool().resistance(4.2f).hardness(1.25f)), LIGHT_BLUE_TERRACOTTA_SLAB_KEY, true);

    public static final RegistryKey<Block> LIGHT_BLUE_TERRACOTTA_STAIRS_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaEnhanced.MOD_ID, "light_blue_terracotta_stairs"));
    public static final Block LIGHT_BLUE_TERRACOTTA_STAIRS = register(
            new StairsBlock(Blocks.LIGHT_BLUE_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.create().registryKey(LIGHT_BLUE_TERRACOTTA_STAIRS_KEY).sounds(BlockSoundGroup.STONE).requiresTool().resistance(4.2f).hardness(1.25f)), LIGHT_BLUE_TERRACOTTA_STAIRS_KEY, true);

    public static final BlockFamily LIGHT_BLUE_TERRACOTTA_FAMILY =
            new BlockFamily.Builder(Blocks.LIGHT_BLUE_TERRACOTTA)
                    .stairs(ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS)
                    .slab(ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB)
                    .build();

    public static final RegistryKey<Block> LIGHT_BLUE_CONCRETE_SLAB_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaEnhanced.MOD_ID, "light_blue_concrete_slab"));
    public static final Block LIGHT_BLUE_CONCRETE_SLAB = register(
            new SlabBlock(AbstractBlock.Settings.create().registryKey(LIGHT_BLUE_CONCRETE_SLAB_KEY).sounds(BlockSoundGroup.STONE).requiresTool().strength(1.8f)), LIGHT_BLUE_CONCRETE_SLAB_KEY, true);

    public static final RegistryKey<Block> LIGHT_BLUE_CONCRETE_STAIRS_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaEnhanced.MOD_ID, "light_blue_concrete_stairs"));
    public static final Block LIGHT_BLUE_CONCRETE_STAIRS = register(
            new StairsBlock(Blocks.LIGHT_BLUE_CONCRETE.getDefaultState(), AbstractBlock.Settings.create().registryKey(LIGHT_BLUE_CONCRETE_STAIRS_KEY).sounds(BlockSoundGroup.STONE).requiresTool().strength(1.8f)), LIGHT_BLUE_CONCRETE_STAIRS_KEY, true);

    public static final BlockFamily LIGHT_BLUE_CONCRETE_FAMILY =
            new BlockFamily.Builder(Blocks.LIGHT_BLUE_CONCRETE)
                    .stairs(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS)
                    .slab(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB)
                    .build();

    // --- BLUE ---

    public static final RegistryKey<Block> BLUE_TERRACOTTA_SLAB_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaEnhanced.MOD_ID, "blue_terracotta_slab"));
    public static final Block BLUE_TERRACOTTA_SLAB = register(
            new SlabBlock(AbstractBlock.Settings.create().registryKey(BLUE_TERRACOTTA_SLAB_KEY).sounds(BlockSoundGroup.STONE).requiresTool().resistance(4.2f).hardness(1.25f)), BLUE_TERRACOTTA_SLAB_KEY, true);

    public static final RegistryKey<Block> BLUE_TERRACOTTA_STAIRS_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaEnhanced.MOD_ID, "blue_terracotta_stairs"));
    public static final Block BLUE_TERRACOTTA_STAIRS = register(
            new StairsBlock(Blocks.BLUE_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.create().registryKey(BLUE_TERRACOTTA_STAIRS_KEY).sounds(BlockSoundGroup.STONE).requiresTool().resistance(4.2f).hardness(1.25f)), BLUE_TERRACOTTA_STAIRS_KEY, true);

    public static final BlockFamily BLUE_TERRACOTTA_FAMILY =
            new BlockFamily.Builder(Blocks.BLUE_TERRACOTTA)
                    .stairs(ModBlocks.BLUE_TERRACOTTA_STAIRS)
                    .slab(ModBlocks.BLUE_TERRACOTTA_SLAB)
                    .build();

    public static final RegistryKey<Block> BLUE_CONCRETE_SLAB_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaEnhanced.MOD_ID, "blue_concrete_slab"));
    public static final Block BLUE_CONCRETE_SLAB = register(
            new SlabBlock(AbstractBlock.Settings.create().registryKey(BLUE_CONCRETE_SLAB_KEY).sounds(BlockSoundGroup.STONE).requiresTool().strength(1.8f)), BLUE_CONCRETE_SLAB_KEY, true);

    public static final RegistryKey<Block> BLUE_CONCRETE_STAIRS_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaEnhanced.MOD_ID, "blue_concrete_stairs"));
    public static final Block BLUE_CONCRETE_STAIRS = register(
            new StairsBlock(Blocks.BLUE_CONCRETE.getDefaultState(), AbstractBlock.Settings.create().registryKey(BLUE_CONCRETE_STAIRS_KEY).sounds(BlockSoundGroup.STONE).requiresTool().strength(1.8f)), BLUE_CONCRETE_STAIRS_KEY, true);

    public static final BlockFamily BLUE_CONCRETE_FAMILY =
            new BlockFamily.Builder(Blocks.BLUE_CONCRETE)
                    .stairs(ModBlocks.BLUE_CONCRETE_STAIRS)
                    .slab(ModBlocks.BLUE_CONCRETE_SLAB)
                    .build();

    // --- CYAN ---

    public static final RegistryKey<Block> CYAN_TERRACOTTA_SLAB_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaEnhanced.MOD_ID, "cyan_terracotta_slab"));
    public static final Block CYAN_TERRACOTTA_SLAB = register(
            new SlabBlock(AbstractBlock.Settings.create().registryKey(CYAN_TERRACOTTA_SLAB_KEY).sounds(BlockSoundGroup.STONE).requiresTool().resistance(4.2f).hardness(1.25f)), CYAN_TERRACOTTA_SLAB_KEY, true);

    public static final RegistryKey<Block> CYAN_TERRACOTTA_STAIRS_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaEnhanced.MOD_ID, "cyan_terracotta_stairs"));
    public static final Block CYAN_TERRACOTTA_STAIRS = register(
            new StairsBlock(Blocks.CYAN_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.create().registryKey(CYAN_TERRACOTTA_STAIRS_KEY).sounds(BlockSoundGroup.STONE).requiresTool().resistance(4.2f).hardness(1.25f)), CYAN_TERRACOTTA_STAIRS_KEY, true);

    public static final BlockFamily CYAN_TERRACOTTA_FAMILY =
            new BlockFamily.Builder(Blocks.CYAN_TERRACOTTA)
                    .stairs(ModBlocks.CYAN_TERRACOTTA_STAIRS)
                    .slab(ModBlocks.CYAN_TERRACOTTA_SLAB)
                    .build();

    public static final RegistryKey<Block> CYAN_CONCRETE_SLAB_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaEnhanced.MOD_ID, "cyan_concrete_slab"));
    public static final Block CYAN_CONCRETE_SLAB = register(
            new SlabBlock(AbstractBlock.Settings.create().registryKey(CYAN_CONCRETE_SLAB_KEY).sounds(BlockSoundGroup.STONE).requiresTool().strength(1.8f)), CYAN_CONCRETE_SLAB_KEY, true);

    public static final RegistryKey<Block> CYAN_CONCRETE_STAIRS_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaEnhanced.MOD_ID, "cyan_concrete_stairs"));
    public static final Block CYAN_CONCRETE_STAIRS = register(
            new StairsBlock(Blocks.CYAN_CONCRETE.getDefaultState(), AbstractBlock.Settings.create().registryKey(CYAN_CONCRETE_STAIRS_KEY).sounds(BlockSoundGroup.STONE).requiresTool().strength(1.8f)), CYAN_CONCRETE_STAIRS_KEY, true);

    public static final BlockFamily CYAN_CONCRETE_FAMILY =
            new BlockFamily.Builder(Blocks.CYAN_CONCRETE)
                    .stairs(ModBlocks.CYAN_CONCRETE_STAIRS)
                    .slab(ModBlocks.CYAN_CONCRETE_SLAB)
                    .build();

    // --- MAGENTA ---

    public static final RegistryKey<Block> MAGENTA_TERRACOTTA_SLAB_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaEnhanced.MOD_ID, "magenta_terracotta_slab"));
    public static final Block MAGENTA_TERRACOTTA_SLAB = register(
            new SlabBlock(AbstractBlock.Settings.create().registryKey(MAGENTA_TERRACOTTA_SLAB_KEY).sounds(BlockSoundGroup.STONE).requiresTool().resistance(4.2f).hardness(1.25f)), MAGENTA_TERRACOTTA_SLAB_KEY, true);

    public static final RegistryKey<Block> MAGENTA_TERRACOTTA_STAIRS_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaEnhanced.MOD_ID, "magenta_terracotta_stairs"));
    public static final Block MAGENTA_TERRACOTTA_STAIRS = register(
            new StairsBlock(Blocks.MAGENTA_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.create().registryKey(MAGENTA_TERRACOTTA_STAIRS_KEY).sounds(BlockSoundGroup.STONE).requiresTool().resistance(4.2f).hardness(1.25f)), MAGENTA_TERRACOTTA_STAIRS_KEY, true);

    public static final BlockFamily MAGENTA_TERRACOTTA_FAMILY =
            new BlockFamily.Builder(Blocks.MAGENTA_TERRACOTTA)
                    .stairs(ModBlocks.MAGENTA_TERRACOTTA_STAIRS)
                    .slab(ModBlocks.MAGENTA_TERRACOTTA_SLAB)
                    .build();

    public static final RegistryKey<Block> MAGENTA_CONCRETE_SLAB_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaEnhanced.MOD_ID, "magenta_concrete_slab"));
    public static final Block MAGENTA_CONCRETE_SLAB = register(
            new SlabBlock(AbstractBlock.Settings.create().registryKey(MAGENTA_CONCRETE_SLAB_KEY).sounds(BlockSoundGroup.STONE).requiresTool().strength(1.8f)), MAGENTA_CONCRETE_SLAB_KEY, true);

    public static final RegistryKey<Block> MAGENTA_CONCRETE_STAIRS_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaEnhanced.MOD_ID, "magenta_concrete_stairs"));
    public static final Block MAGENTA_CONCRETE_STAIRS = register(
            new StairsBlock(Blocks.MAGENTA_CONCRETE.getDefaultState(), AbstractBlock.Settings.create().registryKey(MAGENTA_CONCRETE_STAIRS_KEY).sounds(BlockSoundGroup.STONE).requiresTool().strength(1.8f)), MAGENTA_CONCRETE_STAIRS_KEY, true);

    public static final BlockFamily MAGENTA_CONCRETE_FAMILY =
            new BlockFamily.Builder(Blocks.MAGENTA_CONCRETE)
                    .stairs(ModBlocks.MAGENTA_CONCRETE_STAIRS)
                    .slab(ModBlocks.MAGENTA_CONCRETE_SLAB)
                    .build();

    // --- PINK ---

    public static final RegistryKey<Block> PINK_TERRACOTTA_SLAB_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaEnhanced.MOD_ID, "pink_terracotta_slab"));
    public static final Block PINK_TERRACOTTA_SLAB = register(
            new SlabBlock(AbstractBlock.Settings.create().registryKey(PINK_TERRACOTTA_SLAB_KEY).sounds(BlockSoundGroup.STONE).requiresTool().resistance(4.2f).hardness(1.25f)), PINK_TERRACOTTA_SLAB_KEY, true);

    public static final RegistryKey<Block> PINK_TERRACOTTA_STAIRS_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaEnhanced.MOD_ID, "pink_terracotta_stairs"));
    public static final Block PINK_TERRACOTTA_STAIRS = register(
            new StairsBlock(Blocks.PINK_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.create().registryKey(PINK_TERRACOTTA_STAIRS_KEY).sounds(BlockSoundGroup.STONE).requiresTool().resistance(4.2f).hardness(1.25f)), PINK_TERRACOTTA_STAIRS_KEY, true);

    public static final BlockFamily PINK_TERRACOTTA_FAMILY =
            new BlockFamily.Builder(Blocks.PINK_TERRACOTTA)
                    .stairs(ModBlocks.PINK_TERRACOTTA_STAIRS)
                    .slab(ModBlocks.PINK_TERRACOTTA_SLAB)
                    .build();

    public static final RegistryKey<Block> PINK_CONCRETE_SLAB_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaEnhanced.MOD_ID, "pink_concrete_slab"));
    public static final Block PINK_CONCRETE_SLAB = register(
            new SlabBlock(AbstractBlock.Settings.create().registryKey(PINK_CONCRETE_SLAB_KEY).sounds(BlockSoundGroup.STONE).requiresTool().strength(1.8f)), PINK_CONCRETE_SLAB_KEY, true);

    public static final RegistryKey<Block> PINK_CONCRETE_STAIRS_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaEnhanced.MOD_ID, "pink_concrete_stairs"));
    public static final Block PINK_CONCRETE_STAIRS = register(
            new StairsBlock(Blocks.PINK_CONCRETE.getDefaultState(), AbstractBlock.Settings.create().registryKey(PINK_CONCRETE_STAIRS_KEY).sounds(BlockSoundGroup.STONE).requiresTool().strength(1.8f)), PINK_CONCRETE_STAIRS_KEY, true);

    public static final BlockFamily PINK_CONCRETE_FAMILY =
            new BlockFamily.Builder(Blocks.PINK_CONCRETE)
                    .stairs(ModBlocks.PINK_CONCRETE_STAIRS)
                    .slab(ModBlocks.PINK_CONCRETE_SLAB)
                    .build();

    // --- PURPLE ---

    public static final RegistryKey<Block> PURPLE_TERRACOTTA_SLAB_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaEnhanced.MOD_ID, "purple_terracotta_slab"));
    public static final Block PURPLE_TERRACOTTA_SLAB = register(
            new SlabBlock(AbstractBlock.Settings.create().registryKey(PURPLE_TERRACOTTA_SLAB_KEY).sounds(BlockSoundGroup.STONE).requiresTool().resistance(4.2f).hardness(1.25f)), PURPLE_TERRACOTTA_SLAB_KEY, true);

    public static final RegistryKey<Block> PURPLE_TERRACOTTA_STAIRS_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaEnhanced.MOD_ID, "purple_terracotta_stairs"));
    public static final Block PURPLE_TERRACOTTA_STAIRS = register(
            new StairsBlock(Blocks.PURPLE_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.create().registryKey(PURPLE_TERRACOTTA_STAIRS_KEY).sounds(BlockSoundGroup.STONE).requiresTool().resistance(4.2f).hardness(1.25f)), PURPLE_TERRACOTTA_STAIRS_KEY, true);

    public static final BlockFamily PURPLE_TERRACOTTA_FAMILY =
            new BlockFamily.Builder(Blocks.PURPLE_TERRACOTTA)
                    .stairs(ModBlocks.PURPLE_TERRACOTTA_STAIRS)
                    .slab(ModBlocks.PURPLE_TERRACOTTA_SLAB)
                    .build();

    public static final RegistryKey<Block> PURPLE_CONCRETE_SLAB_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaEnhanced.MOD_ID, "purple_concrete_slab"));
    public static final Block PURPLE_CONCRETE_SLAB = register(
            new SlabBlock(AbstractBlock.Settings.create().registryKey(PURPLE_CONCRETE_SLAB_KEY).sounds(BlockSoundGroup.STONE).requiresTool().strength(1.8f)), PURPLE_CONCRETE_SLAB_KEY, true);

    public static final RegistryKey<Block> PURPLE_CONCRETE_STAIRS_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaEnhanced.MOD_ID, "purple_concrete_stairs"));
    public static final Block PURPLE_CONCRETE_STAIRS = register(
            new StairsBlock(Blocks.PURPLE_CONCRETE.getDefaultState(), AbstractBlock.Settings.create().registryKey(PURPLE_CONCRETE_STAIRS_KEY).sounds(BlockSoundGroup.STONE).requiresTool().strength(1.8f)), PURPLE_CONCRETE_STAIRS_KEY, true);

    public static final BlockFamily PURPLE_CONCRETE_FAMILY =
            new BlockFamily.Builder(Blocks.PURPLE_CONCRETE)
                    .stairs(ModBlocks.PURPLE_CONCRETE_STAIRS)
                    .slab(ModBlocks.PURPLE_CONCRETE_SLAB)
                    .build();

    // --- BROWN ---

    public static final RegistryKey<Block> BROWN_TERRACOTTA_SLAB_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaEnhanced.MOD_ID, "brown_terracotta_slab"));
    public static final Block BROWN_TERRACOTTA_SLAB = register(
            new SlabBlock(AbstractBlock.Settings.create().registryKey(BROWN_TERRACOTTA_SLAB_KEY).sounds(BlockSoundGroup.STONE).requiresTool().resistance(4.2f).hardness(1.25f)), BROWN_TERRACOTTA_SLAB_KEY, true);

    public static final RegistryKey<Block> BROWN_TERRACOTTA_STAIRS_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaEnhanced.MOD_ID, "brown_terracotta_stairs"));
    public static final Block BROWN_TERRACOTTA_STAIRS = register(
            new StairsBlock(Blocks.BROWN_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.create().registryKey(BROWN_TERRACOTTA_STAIRS_KEY).sounds(BlockSoundGroup.STONE).requiresTool().resistance(4.2f).hardness(1.25f)), BROWN_TERRACOTTA_STAIRS_KEY, true);

    public static final BlockFamily BROWN_TERRACOTTA_FAMILY =
            new BlockFamily.Builder(Blocks.BROWN_TERRACOTTA)
                    .stairs(ModBlocks.BROWN_TERRACOTTA_STAIRS)
                    .slab(ModBlocks.BROWN_TERRACOTTA_SLAB)
                    .build();

    public static final RegistryKey<Block> BROWN_CONCRETE_SLAB_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaEnhanced.MOD_ID, "brown_concrete_slab"));
    public static final Block BROWN_CONCRETE_SLAB = register(
            new SlabBlock(AbstractBlock.Settings.create().registryKey(BROWN_CONCRETE_SLAB_KEY).sounds(BlockSoundGroup.STONE).requiresTool().strength(1.8f)), BROWN_CONCRETE_SLAB_KEY, true);

    public static final RegistryKey<Block> BROWN_CONCRETE_STAIRS_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaEnhanced.MOD_ID, "brown_concrete_stairs"));
    public static final Block BROWN_CONCRETE_STAIRS = register(
            new StairsBlock(Blocks.BROWN_CONCRETE.getDefaultState(), AbstractBlock.Settings.create().registryKey(BROWN_CONCRETE_STAIRS_KEY).sounds(BlockSoundGroup.STONE).requiresTool().strength(1.8f)), BROWN_CONCRETE_STAIRS_KEY, true);

    public static final BlockFamily BROWN_CONCRETE_FAMILY =
            new BlockFamily.Builder(Blocks.BROWN_CONCRETE)
                    .stairs(ModBlocks.BROWN_CONCRETE_STAIRS)
                    .slab(ModBlocks.BROWN_CONCRETE_SLAB)
                    .build();

    // --- BLACK ---

    public static final RegistryKey<Block> BLACK_TERRACOTTA_SLAB_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaEnhanced.MOD_ID, "black_terracotta_slab"));
    public static final Block BLACK_TERRACOTTA_SLAB = register(
            new SlabBlock(AbstractBlock.Settings.create().registryKey(BLACK_TERRACOTTA_SLAB_KEY).sounds(BlockSoundGroup.STONE).requiresTool().resistance(4.2f).hardness(1.25f)), BLACK_TERRACOTTA_SLAB_KEY, true);

    public static final RegistryKey<Block> BLACK_TERRACOTTA_STAIRS_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaEnhanced.MOD_ID, "black_terracotta_stairs"));
    public static final Block BLACK_TERRACOTTA_STAIRS = register(
            new StairsBlock(Blocks.BLACK_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.create().registryKey(BLACK_TERRACOTTA_STAIRS_KEY).sounds(BlockSoundGroup.STONE).requiresTool().resistance(4.2f).hardness(1.25f)), BLACK_TERRACOTTA_STAIRS_KEY, true);

    public static final BlockFamily BLACK_TERRACOTTA_FAMILY =
            new BlockFamily.Builder(Blocks.BLACK_TERRACOTTA)
                    .stairs(ModBlocks.BLACK_TERRACOTTA_STAIRS)
                    .slab(ModBlocks.BLACK_TERRACOTTA_SLAB)
                    .build();

    public static final RegistryKey<Block> BLACK_CONCRETE_SLAB_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaEnhanced.MOD_ID, "black_concrete_slab"));
    public static final Block BLACK_CONCRETE_SLAB = register(
            new SlabBlock(AbstractBlock.Settings.create().registryKey(BLACK_CONCRETE_SLAB_KEY).sounds(BlockSoundGroup.STONE).requiresTool().strength(1.8f)), BLACK_CONCRETE_SLAB_KEY, true);

    public static final RegistryKey<Block> BLACK_CONCRETE_STAIRS_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaEnhanced.MOD_ID, "black_concrete_stairs"));
    public static final Block BLACK_CONCRETE_STAIRS = register(
            new StairsBlock(Blocks.BLACK_CONCRETE.getDefaultState(), AbstractBlock.Settings.create().registryKey(BLACK_CONCRETE_STAIRS_KEY).sounds(BlockSoundGroup.STONE).requiresTool().strength(1.8f)), BLACK_CONCRETE_STAIRS_KEY, true);

    public static final BlockFamily BLACK_CONCRETE_FAMILY =
            new BlockFamily.Builder(Blocks.BLACK_CONCRETE)
                    .stairs(ModBlocks.BLACK_CONCRETE_STAIRS)
                    .slab(ModBlocks.BLACK_CONCRETE_SLAB)
                    .build();

    // --- DARK GREY ---

    public static final RegistryKey<Block> GRAY_TERRACOTTA_SLAB_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaEnhanced.MOD_ID, "gray_terracotta_slab"));
    public static final Block GRAY_TERRACOTTA_SLAB = register(
            new SlabBlock(AbstractBlock.Settings.create().registryKey(GRAY_TERRACOTTA_SLAB_KEY).sounds(BlockSoundGroup.STONE).requiresTool().resistance(4.2f).hardness(1.25f)), GRAY_TERRACOTTA_SLAB_KEY, true);

    public static final RegistryKey<Block> GRAY_TERRACOTTA_STAIRS_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaEnhanced.MOD_ID, "gray_terracotta_stairs"));
    public static final Block GRAY_TERRACOTTA_STAIRS = register(
            new StairsBlock(Blocks.GRAY_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.create().registryKey(GRAY_TERRACOTTA_STAIRS_KEY).sounds(BlockSoundGroup.STONE).requiresTool().resistance(4.2f).hardness(1.25f)), GRAY_TERRACOTTA_STAIRS_KEY, true);

    public static final BlockFamily GRAY_TERRACOTTA_FAMILY =
            new BlockFamily.Builder(Blocks.GRAY_TERRACOTTA)
                    .stairs(ModBlocks.GRAY_TERRACOTTA_STAIRS)
                    .slab(ModBlocks.GRAY_TERRACOTTA_SLAB)
                    .build();

    public static final RegistryKey<Block> GRAY_CONCRETE_SLAB_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaEnhanced.MOD_ID, "gray_concrete_slab"));
    public static final Block GRAY_CONCRETE_SLAB = register(
            new SlabBlock(AbstractBlock.Settings.create().registryKey(GRAY_CONCRETE_SLAB_KEY).sounds(BlockSoundGroup.STONE).requiresTool().strength(1.8f)), GRAY_CONCRETE_SLAB_KEY, true);

    public static final RegistryKey<Block> GRAY_CONCRETE_STAIRS_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaEnhanced.MOD_ID, "gray_concrete_stairs"));
    public static final Block GRAY_CONCRETE_STAIRS = register(
            new StairsBlock(Blocks.GRAY_CONCRETE.getDefaultState(), AbstractBlock.Settings.create().registryKey(GRAY_CONCRETE_STAIRS_KEY).sounds(BlockSoundGroup.STONE).requiresTool().strength(1.8f)), GRAY_CONCRETE_STAIRS_KEY, true);

    public static final BlockFamily GRAY_CONCRETE_FAMILY =
            new BlockFamily.Builder(Blocks.GRAY_CONCRETE)
                    .stairs(ModBlocks.GRAY_CONCRETE_STAIRS)
                    .slab(ModBlocks.GRAY_CONCRETE_SLAB)
                    .build();

    // --- LIGHT GREY ---

    public static final RegistryKey<Block> LIGHT_GRAY_TERRACOTTA_SLAB_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaEnhanced.MOD_ID, "light_gray_terracotta_slab"));
    public static final Block LIGHT_GRAY_TERRACOTTA_SLAB = register(
            new SlabBlock(AbstractBlock.Settings.create().registryKey(LIGHT_GRAY_TERRACOTTA_SLAB_KEY).sounds(BlockSoundGroup.STONE).requiresTool().resistance(4.2f).hardness(1.25f)), LIGHT_GRAY_TERRACOTTA_SLAB_KEY, true);

    public static final RegistryKey<Block> LIGHT_GRAY_TERRACOTTA_STAIRS_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaEnhanced.MOD_ID, "light_gray_terracotta_stairs"));
    public static final Block LIGHT_GRAY_TERRACOTTA_STAIRS = register(
            new StairsBlock(Blocks.LIGHT_GRAY_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.create().registryKey(LIGHT_GRAY_TERRACOTTA_STAIRS_KEY).sounds(BlockSoundGroup.STONE).requiresTool().resistance(4.2f).hardness(1.25f)), LIGHT_GRAY_TERRACOTTA_STAIRS_KEY, true);

    public static final BlockFamily LIGHT_GRAY_TERRACOTTA_FAMILY =
            new BlockFamily.Builder(Blocks.LIGHT_GRAY_TERRACOTTA)
                    .stairs(ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS)
                    .slab(ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB)
                    .build();

    public static final RegistryKey<Block> LIGHT_GRAY_CONCRETE_SLAB_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaEnhanced.MOD_ID, "light_gray_concrete_slab"));
    public static final Block LIGHT_GRAY_CONCRETE_SLAB = register(
            new SlabBlock(AbstractBlock.Settings.create().registryKey(LIGHT_GRAY_CONCRETE_SLAB_KEY).sounds(BlockSoundGroup.STONE).requiresTool().strength(1.8f)), LIGHT_GRAY_CONCRETE_SLAB_KEY, true);

    public static final RegistryKey<Block> LIGHT_GRAY_CONCRETE_STAIRS_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaEnhanced.MOD_ID, "light_gray_concrete_stairs"));
    public static final Block LIGHT_GRAY_CONCRETE_STAIRS = register(
            new StairsBlock(Blocks.LIGHT_GRAY_CONCRETE.getDefaultState(), AbstractBlock.Settings.create().registryKey(LIGHT_GRAY_CONCRETE_STAIRS_KEY).sounds(BlockSoundGroup.STONE).requiresTool().strength(1.8f)), LIGHT_GRAY_CONCRETE_STAIRS_KEY, true);

    public static final BlockFamily LIGHT_GRAY_CONCRETE_FAMILY =
            new BlockFamily.Builder(Blocks.LIGHT_GRAY_CONCRETE)
                    .stairs(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS)
                    .slab(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB)
                    .build();

    // --- WHITE ---

    public static final RegistryKey<Block> WHITE_TERRACOTTA_SLAB_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaEnhanced.MOD_ID, "white_terracotta_slab"));
    public static final Block WHITE_TERRACOTTA_SLAB = register(
            new SlabBlock(AbstractBlock.Settings.create().registryKey(WHITE_TERRACOTTA_SLAB_KEY).sounds(BlockSoundGroup.STONE).requiresTool().resistance(4.2f).hardness(1.25f)), WHITE_TERRACOTTA_SLAB_KEY, true);

    public static final RegistryKey<Block> WHITE_TERRACOTTA_STAIRS_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaEnhanced.MOD_ID, "white_terracotta_stairs"));
    public static final Block WHITE_TERRACOTTA_STAIRS = register(
            new StairsBlock(Blocks.WHITE_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.create().registryKey(WHITE_TERRACOTTA_STAIRS_KEY).sounds(BlockSoundGroup.STONE).requiresTool().resistance(4.2f).hardness(1.25f)), WHITE_TERRACOTTA_STAIRS_KEY, true);

    public static final BlockFamily WHITE_TERRACOTTA_FAMILY =
            new BlockFamily.Builder(Blocks.WHITE_TERRACOTTA)
                    .stairs(ModBlocks.WHITE_TERRACOTTA_STAIRS)
                    .slab(ModBlocks.WHITE_TERRACOTTA_SLAB)
                    .build();

    public static final RegistryKey<Block> WHITE_CONCRETE_SLAB_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaEnhanced.MOD_ID, "white_concrete_slab"));
    public static final Block WHITE_CONCRETE_SLAB = register(
            new SlabBlock(AbstractBlock.Settings.create().registryKey(WHITE_CONCRETE_SLAB_KEY).sounds(BlockSoundGroup.STONE).requiresTool().strength(1.8f)), WHITE_CONCRETE_SLAB_KEY, true);

    public static final RegistryKey<Block> WHITE_CONCRETE_STAIRS_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaEnhanced.MOD_ID, "white_concrete_stairs"));
    public static final Block WHITE_CONCRETE_STAIRS = register(
            new StairsBlock(Blocks.WHITE_CONCRETE.getDefaultState(), AbstractBlock.Settings.create().registryKey(WHITE_CONCRETE_STAIRS_KEY).sounds(BlockSoundGroup.STONE).requiresTool().strength(1.8f)), WHITE_CONCRETE_STAIRS_KEY, true);

    public static final BlockFamily WHITE_CONCRETE_FAMILY =
            new BlockFamily.Builder(Blocks.WHITE_CONCRETE)
                    .stairs(ModBlocks.WHITE_CONCRETE_STAIRS)
                    .slab(ModBlocks.WHITE_CONCRETE_SLAB)
                    .build();


    // --- INITIALIZER ---
    public static void initialize() {

        // --- VANILLA GROUPS ---
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register((itemGroup) -> {
            itemGroup.add(ModBlocks.SUPER_POWERED_RAIL.asItem());
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.REDSTONE).register((itemGroup) -> {
            itemGroup.add(ModBlocks.SUPER_POWERED_RAIL.asItem());
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register((itemGroup) -> {

            itemGroup.add(ModBlocks.ECHO_BLOCK.asItem());

            itemGroup.add(ModBlocks.ANDESITE_BRICKS.asItem());
            itemGroup.add(ModBlocks.ANDESITE_BRICKS_SLAB.asItem());
            itemGroup.add(ModBlocks.ANDESITE_BRICKS_STAIRS.asItem());
            itemGroup.add(ModBlocks.ANDESITE_BRICKS_WALL.asItem());
            itemGroup.add(ModBlocks.CHISELED_ANDESITE.asItem());

            itemGroup.add(ModBlocks.GRANITE_BRICKS.asItem());
            itemGroup.add(ModBlocks.GRANITE_BRICKS_SLAB.asItem());
            itemGroup.add(ModBlocks.GRANITE_BRICKS_STAIRS.asItem());
            itemGroup.add(ModBlocks.GRANITE_BRICKS_WALL.asItem());
            itemGroup.add(ModBlocks.CHISELED_GRANITE.asItem());

            itemGroup.add(ModBlocks.DIORITE_BRICKS.asItem());
            itemGroup.add(ModBlocks.DIORITE_BRICKS_SLAB.asItem());
            itemGroup.add(ModBlocks.DIORITE_BRICKS_STAIRS.asItem());
            itemGroup.add(ModBlocks.DIORITE_BRICKS_WALL.asItem());
            itemGroup.add(ModBlocks.CHISELED_DIORITE.asItem());

            itemGroup.add(ModBlocks.TERRACOTTA_SLAB.asItem());
            itemGroup.add(ModBlocks.TERRACOTTA_STAIRS.asItem());
            itemGroup.add(ModBlocks.WHITE_TERRACOTTA_STAIRS.asItem());
            itemGroup.add(ModBlocks.WHITE_TERRACOTTA_SLAB.asItem());
            itemGroup.add(ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS.asItem());
            itemGroup.add(ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB.asItem());
            itemGroup.add(ModBlocks.GRAY_TERRACOTTA_STAIRS.asItem());
            itemGroup.add(ModBlocks.GRAY_TERRACOTTA_SLAB.asItem());
            itemGroup.add(ModBlocks.BLACK_TERRACOTTA_STAIRS.asItem());
            itemGroup.add(ModBlocks.BLACK_TERRACOTTA_SLAB.asItem());
            itemGroup.add(ModBlocks.BROWN_TERRACOTTA_STAIRS.asItem());
            itemGroup.add(ModBlocks.BROWN_TERRACOTTA_SLAB.asItem());
            itemGroup.add(ModBlocks.RED_TERRACOTTA_STAIRS.asItem());
            itemGroup.add(ModBlocks.RED_TERRACOTTA_SLAB.asItem());
            itemGroup.add(ModBlocks.ORANGE_TERRACOTTA_STAIRS.asItem());
            itemGroup.add(ModBlocks.ORANGE_TERRACOTTA_SLAB.asItem());
            itemGroup.add(ModBlocks.YELLOW_TERRACOTTA_STAIRS.asItem());
            itemGroup.add(ModBlocks.YELLOW_TERRACOTTA_SLAB.asItem());
            itemGroup.add(ModBlocks.LIME_TERRACOTTA_STAIRS.asItem());
            itemGroup.add(ModBlocks.LIME_TERRACOTTA_SLAB.asItem());
            itemGroup.add(ModBlocks.GREEN_TERRACOTTA_STAIRS.asItem());
            itemGroup.add(ModBlocks.GREEN_TERRACOTTA_SLAB.asItem());
            itemGroup.add(ModBlocks.CYAN_TERRACOTTA_STAIRS.asItem());
            itemGroup.add(ModBlocks.CYAN_TERRACOTTA_SLAB.asItem());
            itemGroup.add(ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS.asItem());
            itemGroup.add(ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB.asItem());
            itemGroup.add(ModBlocks.BLUE_TERRACOTTA_STAIRS.asItem());
            itemGroup.add(ModBlocks.BLUE_TERRACOTTA_SLAB.asItem());
            itemGroup.add(ModBlocks.PURPLE_TERRACOTTA_STAIRS.asItem());
            itemGroup.add(ModBlocks.PURPLE_TERRACOTTA_SLAB.asItem());
            itemGroup.add(ModBlocks.MAGENTA_TERRACOTTA_STAIRS.asItem());
            itemGroup.add(ModBlocks.MAGENTA_TERRACOTTA_SLAB.asItem());
            itemGroup.add(ModBlocks.PINK_TERRACOTTA_STAIRS.asItem());
            itemGroup.add(ModBlocks.PINK_TERRACOTTA_SLAB.asItem());

            itemGroup.add(ModBlocks.WHITE_CONCRETE_STAIRS.asItem());
            itemGroup.add(ModBlocks.WHITE_CONCRETE_SLAB.asItem());
            itemGroup.add(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS.asItem());
            itemGroup.add(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB.asItem());
            itemGroup.add(ModBlocks.GRAY_CONCRETE_STAIRS.asItem());
            itemGroup.add(ModBlocks.GRAY_CONCRETE_SLAB.asItem());
            itemGroup.add(ModBlocks.BLACK_CONCRETE_STAIRS.asItem());
            itemGroup.add(ModBlocks.BLACK_CONCRETE_SLAB.asItem());
            itemGroup.add(ModBlocks.BROWN_CONCRETE_STAIRS.asItem());
            itemGroup.add(ModBlocks.BROWN_CONCRETE_SLAB.asItem());
            itemGroup.add(ModBlocks.RED_CONCRETE_STAIRS.asItem());
            itemGroup.add(ModBlocks.RED_CONCRETE_SLAB.asItem());
            itemGroup.add(ModBlocks.ORANGE_CONCRETE_STAIRS.asItem());
            itemGroup.add(ModBlocks.ORANGE_CONCRETE_SLAB.asItem());
            itemGroup.add(ModBlocks.YELLOW_CONCRETE_STAIRS.asItem());
            itemGroup.add(ModBlocks.YELLOW_CONCRETE_SLAB.asItem());
            itemGroup.add(ModBlocks.LIME_CONCRETE_STAIRS.asItem());
            itemGroup.add(ModBlocks.LIME_CONCRETE_SLAB.asItem());
            itemGroup.add(ModBlocks.GREEN_CONCRETE_STAIRS.asItem());
            itemGroup.add(ModBlocks.GREEN_CONCRETE_SLAB.asItem());
            itemGroup.add(ModBlocks.CYAN_CONCRETE_STAIRS.asItem());
            itemGroup.add(ModBlocks.CYAN_CONCRETE_SLAB.asItem());
            itemGroup.add(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS.asItem());
            itemGroup.add(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB.asItem());
            itemGroup.add(ModBlocks.BLUE_CONCRETE_STAIRS.asItem());
            itemGroup.add(ModBlocks.BLUE_CONCRETE_SLAB.asItem());
            itemGroup.add(ModBlocks.PURPLE_CONCRETE_STAIRS.asItem());
            itemGroup.add(ModBlocks.PURPLE_CONCRETE_SLAB.asItem());
            itemGroup.add(ModBlocks.MAGENTA_CONCRETE_STAIRS.asItem());
            itemGroup.add(ModBlocks.MAGENTA_CONCRETE_SLAB.asItem());
            itemGroup.add(ModBlocks.PINK_CONCRETE_STAIRS.asItem());
            itemGroup.add(ModBlocks.PINK_CONCRETE_SLAB.asItem());

        });

        // --- MOD GROUP ---
        ItemGroupEvents.modifyEntriesEvent(ModItems.CUSTOM_ITEM_GROUP_KEY).register((itemGroup) -> {

            itemGroup.add(ModBlocks.ECHO_BLOCK.asItem());

            itemGroup.add(ModBlocks.SUPER_POWERED_RAIL.asItem());

            itemGroup.add(ModBlocks.ANDESITE_BRICKS.asItem());
            itemGroup.add(ModBlocks.ANDESITE_BRICKS_SLAB.asItem());
            itemGroup.add(ModBlocks.ANDESITE_BRICKS_STAIRS.asItem());
            itemGroup.add(ModBlocks.ANDESITE_BRICKS_WALL.asItem());
            itemGroup.add(ModBlocks.CHISELED_ANDESITE.asItem());

            itemGroup.add(ModBlocks.GRANITE_BRICKS.asItem());
            itemGroup.add(ModBlocks.GRANITE_BRICKS_SLAB.asItem());
            itemGroup.add(ModBlocks.GRANITE_BRICKS_STAIRS.asItem());
            itemGroup.add(ModBlocks.GRANITE_BRICKS_WALL.asItem());
            itemGroup.add(ModBlocks.CHISELED_GRANITE.asItem());

            itemGroup.add(ModBlocks.DIORITE_BRICKS.asItem());
            itemGroup.add(ModBlocks.DIORITE_BRICKS_SLAB.asItem());
            itemGroup.add(ModBlocks.DIORITE_BRICKS_STAIRS.asItem());
            itemGroup.add(ModBlocks.DIORITE_BRICKS_WALL.asItem());
            itemGroup.add(ModBlocks.CHISELED_DIORITE.asItem());

            itemGroup.add(ModBlocks.TERRACOTTA_SLAB.asItem());
            itemGroup.add(ModBlocks.TERRACOTTA_STAIRS.asItem());
            itemGroup.add(ModBlocks.WHITE_TERRACOTTA_STAIRS.asItem());
            itemGroup.add(ModBlocks.WHITE_TERRACOTTA_SLAB.asItem());
            itemGroup.add(ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS.asItem());
            itemGroup.add(ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB.asItem());
            itemGroup.add(ModBlocks.GRAY_TERRACOTTA_STAIRS.asItem());
            itemGroup.add(ModBlocks.GRAY_TERRACOTTA_SLAB.asItem());
            itemGroup.add(ModBlocks.BLACK_TERRACOTTA_STAIRS.asItem());
            itemGroup.add(ModBlocks.BLACK_TERRACOTTA_SLAB.asItem());
            itemGroup.add(ModBlocks.BROWN_TERRACOTTA_STAIRS.asItem());
            itemGroup.add(ModBlocks.BROWN_TERRACOTTA_SLAB.asItem());
            itemGroup.add(ModBlocks.RED_TERRACOTTA_STAIRS.asItem());
            itemGroup.add(ModBlocks.RED_TERRACOTTA_SLAB.asItem());
            itemGroup.add(ModBlocks.ORANGE_TERRACOTTA_STAIRS.asItem());
            itemGroup.add(ModBlocks.ORANGE_TERRACOTTA_SLAB.asItem());
            itemGroup.add(ModBlocks.YELLOW_TERRACOTTA_STAIRS.asItem());
            itemGroup.add(ModBlocks.YELLOW_TERRACOTTA_SLAB.asItem());
            itemGroup.add(ModBlocks.LIME_TERRACOTTA_STAIRS.asItem());
            itemGroup.add(ModBlocks.LIME_TERRACOTTA_SLAB.asItem());
            itemGroup.add(ModBlocks.GREEN_TERRACOTTA_STAIRS.asItem());
            itemGroup.add(ModBlocks.GREEN_TERRACOTTA_SLAB.asItem());
            itemGroup.add(ModBlocks.CYAN_TERRACOTTA_STAIRS.asItem());
            itemGroup.add(ModBlocks.CYAN_TERRACOTTA_SLAB.asItem());
            itemGroup.add(ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS.asItem());
            itemGroup.add(ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB.asItem());
            itemGroup.add(ModBlocks.BLUE_TERRACOTTA_STAIRS.asItem());
            itemGroup.add(ModBlocks.BLUE_TERRACOTTA_SLAB.asItem());
            itemGroup.add(ModBlocks.PURPLE_TERRACOTTA_STAIRS.asItem());
            itemGroup.add(ModBlocks.PURPLE_TERRACOTTA_SLAB.asItem());
            itemGroup.add(ModBlocks.MAGENTA_TERRACOTTA_STAIRS.asItem());
            itemGroup.add(ModBlocks.MAGENTA_TERRACOTTA_SLAB.asItem());
            itemGroup.add(ModBlocks.PINK_TERRACOTTA_STAIRS.asItem());
            itemGroup.add(ModBlocks.PINK_TERRACOTTA_SLAB.asItem());

            itemGroup.add(ModBlocks.WHITE_CONCRETE_STAIRS.asItem());
            itemGroup.add(ModBlocks.WHITE_CONCRETE_SLAB.asItem());
            itemGroup.add(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS.asItem());
            itemGroup.add(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB.asItem());
            itemGroup.add(ModBlocks.GRAY_CONCRETE_STAIRS.asItem());
            itemGroup.add(ModBlocks.GRAY_CONCRETE_SLAB.asItem());
            itemGroup.add(ModBlocks.BLACK_CONCRETE_STAIRS.asItem());
            itemGroup.add(ModBlocks.BLACK_CONCRETE_SLAB.asItem());
            itemGroup.add(ModBlocks.BROWN_CONCRETE_STAIRS.asItem());
            itemGroup.add(ModBlocks.BROWN_CONCRETE_SLAB.asItem());
            itemGroup.add(ModBlocks.RED_CONCRETE_STAIRS.asItem());
            itemGroup.add(ModBlocks.RED_CONCRETE_SLAB.asItem());
            itemGroup.add(ModBlocks.ORANGE_CONCRETE_STAIRS.asItem());
            itemGroup.add(ModBlocks.ORANGE_CONCRETE_SLAB.asItem());
            itemGroup.add(ModBlocks.YELLOW_CONCRETE_STAIRS.asItem());
            itemGroup.add(ModBlocks.YELLOW_CONCRETE_SLAB.asItem());
            itemGroup.add(ModBlocks.LIME_CONCRETE_STAIRS.asItem());
            itemGroup.add(ModBlocks.LIME_CONCRETE_SLAB.asItem());
            itemGroup.add(ModBlocks.GREEN_CONCRETE_STAIRS.asItem());
            itemGroup.add(ModBlocks.GREEN_CONCRETE_SLAB.asItem());
            itemGroup.add(ModBlocks.CYAN_CONCRETE_STAIRS.asItem());
            itemGroup.add(ModBlocks.CYAN_CONCRETE_SLAB.asItem());
            itemGroup.add(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS.asItem());
            itemGroup.add(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB.asItem());
            itemGroup.add(ModBlocks.BLUE_CONCRETE_STAIRS.asItem());
            itemGroup.add(ModBlocks.BLUE_CONCRETE_SLAB.asItem());
            itemGroup.add(ModBlocks.PURPLE_CONCRETE_STAIRS.asItem());
            itemGroup.add(ModBlocks.PURPLE_CONCRETE_SLAB.asItem());
            itemGroup.add(ModBlocks.MAGENTA_CONCRETE_STAIRS.asItem());
            itemGroup.add(ModBlocks.MAGENTA_CONCRETE_SLAB.asItem());
            itemGroup.add(ModBlocks.PINK_CONCRETE_STAIRS.asItem());
            itemGroup.add(ModBlocks.PINK_CONCRETE_SLAB.asItem());

        });
    }
}
