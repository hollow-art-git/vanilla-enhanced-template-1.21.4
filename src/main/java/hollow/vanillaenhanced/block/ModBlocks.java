package hollow.vanillaenhanced.block;

import hollow.vanillaenhanced.VanillaEnhanced;
import hollow.vanillaenhanced.item.ModItems;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
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
            new Block(AbstractBlock.Settings.create().registryKey(ECHO_BLOCK_KEY).sounds(BlockSoundGroup.AMETHYST_BLOCK).requiresTool().strength(1.5f)),
            ECHO_BLOCK_KEY, true);

    // --- SUPER POWERED RAIL ---
    public static final RegistryKey<Block> SUPER_POWERED_RAIL_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaEnhanced.MOD_ID, "super_powered_rail"));
    public static final Block SUPER_POWERED_RAIL = register(
            new PoweredRailBlock(AbstractBlock.Settings.create().registryKey(SUPER_POWERED_RAIL_KEY).sounds(BlockSoundGroup.STONE).strength(0.7f).noCollision()),
            SUPER_POWERED_RAIL_KEY, true);

    // --- DIORITE ---
    public static final RegistryKey<Block> DIORITE_BRICKS_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaEnhanced.MOD_ID, "diorite_bricks"));
    public static final Block DIORITE_BRICKS = register(
            new Block(AbstractBlock.Settings.create().registryKey(DIORITE_BRICKS_KEY).sounds(BlockSoundGroup.STONE).requiresTool().resistance(6).hardness(1.5f)),
            DIORITE_BRICKS_KEY, true);

    public static final RegistryKey<Block> DIORITE_BRICKS_SLAB_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaEnhanced.MOD_ID, "diorite_bricks_slab"));
    public static final Block DIORITE_BRICKS_SLAB = register(
            new SlabBlock(AbstractBlock.Settings.create().registryKey(DIORITE_BRICKS_SLAB_KEY).sounds(BlockSoundGroup.STONE).requiresTool().resistance(6).hardness(1.5f)),
            DIORITE_BRICKS_SLAB_KEY, true);

    public static final RegistryKey<Block> DIORITE_BRICKS_STAIRS_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaEnhanced.MOD_ID, "diorite_bricks_stairs"));
    public static final Block DIORITE_BRICKS_STAIRS = register(
            new StairsBlock(ModBlocks.DIORITE_BRICKS.getDefaultState(), AbstractBlock.Settings.create().registryKey(DIORITE_BRICKS_STAIRS_KEY).sounds(BlockSoundGroup.STONE).requiresTool().resistance(6).hardness(1.5f)),
            DIORITE_BRICKS_STAIRS_KEY, true);

    public static final RegistryKey<Block> DIORITE_BRICKS_WALL_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaEnhanced.MOD_ID, "diorite_bricks_wall"));
    public static final Block DIORITE_BRICKS_WALL = register(
            new WallBlock(AbstractBlock.Settings.create().registryKey(DIORITE_BRICKS_WALL_KEY).sounds(BlockSoundGroup.STONE).requiresTool().resistance(6).hardness(1.5f)),
            DIORITE_BRICKS_WALL_KEY, true);

    public static final BlockFamily DIORITE_FAMILY =
            new BlockFamily.Builder(ModBlocks.DIORITE_BRICKS)
                    .stairs(ModBlocks.DIORITE_BRICKS_STAIRS)
                    .slab(ModBlocks.DIORITE_BRICKS_SLAB)
                    .wall(ModBlocks.DIORITE_BRICKS_WALL)
                    .build();

    public static final RegistryKey<Block> CHISELED_DIORITE_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaEnhanced.MOD_ID, "chiseled_diorite"));
    public static final Block CHISELED_DIORITE = register(
            new Block(AbstractBlock.Settings.create().registryKey(CHISELED_DIORITE_KEY).sounds(BlockSoundGroup.STONE).requiresTool().resistance(6).hardness(1.5f)),
            CHISELED_DIORITE_KEY, true);

    // --- GRANITE ---
    public static final RegistryKey<Block> GRANITE_BRICKS_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaEnhanced.MOD_ID, "granite_bricks"));
    public static final Block GRANITE_BRICKS = register(
            new Block(AbstractBlock.Settings.create().registryKey(GRANITE_BRICKS_KEY).sounds(BlockSoundGroup.STONE).requiresTool().resistance(6).hardness(1.5f)),
            GRANITE_BRICKS_KEY, true);

    public static final RegistryKey<Block> GRANITE_BRICKS_SLAB_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaEnhanced.MOD_ID, "granite_bricks_slab"));
    public static final Block GRANITE_BRICKS_SLAB = register(
            new SlabBlock(AbstractBlock.Settings.create().registryKey(GRANITE_BRICKS_SLAB_KEY).sounds(BlockSoundGroup.STONE).requiresTool().resistance(6).hardness(1.5f)),
            GRANITE_BRICKS_SLAB_KEY, true);

    public static final RegistryKey<Block> GRANITE_BRICKS_STAIRS_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaEnhanced.MOD_ID, "granite_bricks_stairs"));
    public static final Block GRANITE_BRICKS_STAIRS = register(
            new StairsBlock(ModBlocks.GRANITE_BRICKS.getDefaultState(), AbstractBlock.Settings.create().registryKey(GRANITE_BRICKS_STAIRS_KEY).sounds(BlockSoundGroup.STONE).requiresTool().resistance(6).hardness(1.5f)),
            GRANITE_BRICKS_STAIRS_KEY, true);

    public static final RegistryKey<Block> GRANITE_BRICKS_WALL_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaEnhanced.MOD_ID, "granite_bricks_wall"));
    public static final Block GRANITE_BRICKS_WALL = register(
            new WallBlock(AbstractBlock.Settings.create().registryKey(GRANITE_BRICKS_WALL_KEY).sounds(BlockSoundGroup.STONE).requiresTool().resistance(6).hardness(1.5f)),
            GRANITE_BRICKS_WALL_KEY, true);

    public static final BlockFamily GRANITE_FAMILY =
            new BlockFamily.Builder(ModBlocks.GRANITE_BRICKS)
                    .stairs(ModBlocks.GRANITE_BRICKS_STAIRS)
                    .slab(ModBlocks.GRANITE_BRICKS_SLAB)
                    .wall(ModBlocks.GRANITE_BRICKS_WALL)
                    .build();

    public static final RegistryKey<Block> CHISELED_GRANITE_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaEnhanced.MOD_ID, "chiseled_granite"));
    public static final Block CHISELED_GRANITE = register(
            new PillarBlock(AbstractBlock.Settings.create().registryKey(CHISELED_GRANITE_KEY).sounds(BlockSoundGroup.STONE).requiresTool().resistance(6).hardness(1.5f)),
            CHISELED_GRANITE_KEY, true);

    // --- ANDESITE ---
    public static final RegistryKey<Block> ANDESITE_BRICKS_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaEnhanced.MOD_ID, "andesite_bricks"));
    public static final Block ANDESITE_BRICKS = register(
            new Block(AbstractBlock.Settings.create().registryKey(ANDESITE_BRICKS_KEY).sounds(BlockSoundGroup.STONE).requiresTool().resistance(6).hardness(1.5f)),
            ANDESITE_BRICKS_KEY, true);

    public static final RegistryKey<Block> ANDESITE_BRICKS_SLAB_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaEnhanced.MOD_ID, "andesite_bricks_slab"));
    public static final Block ANDESITE_BRICKS_SLAB = register(
            new SlabBlock(AbstractBlock.Settings.create().registryKey(ANDESITE_BRICKS_SLAB_KEY).sounds(BlockSoundGroup.STONE).requiresTool().resistance(6).hardness(1.5f)),
            ANDESITE_BRICKS_SLAB_KEY, true);

    public static final RegistryKey<Block> ANDESITE_BRICKS_STAIRS_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaEnhanced.MOD_ID, "andesite_bricks_stairs"));
    public static final Block ANDESITE_BRICKS_STAIRS = register(
            new StairsBlock(ModBlocks.ANDESITE_BRICKS.getDefaultState(), AbstractBlock.Settings.create().registryKey(ANDESITE_BRICKS_STAIRS_KEY).sounds(BlockSoundGroup.STONE).requiresTool().resistance(6).hardness(1.5f)),
            ANDESITE_BRICKS_STAIRS_KEY, true);

    public static final RegistryKey<Block> ANDESITE_BRICKS_WALL_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaEnhanced.MOD_ID, "andesite_bricks_wall"));
    public static final Block ANDESITE_BRICKS_WALL = register(
            new WallBlock(AbstractBlock.Settings.create().registryKey(ANDESITE_BRICKS_WALL_KEY).sounds(BlockSoundGroup.STONE).requiresTool().resistance(6).hardness(1.5f)),
            ANDESITE_BRICKS_WALL_KEY, true);

    public static final BlockFamily ANDESITE_FAMILY =
            new BlockFamily.Builder(ModBlocks.ANDESITE_BRICKS)
                    .stairs(ModBlocks.ANDESITE_BRICKS_STAIRS)
                    .slab(ModBlocks.ANDESITE_BRICKS_SLAB)
                    .wall(ModBlocks.ANDESITE_BRICKS_WALL)
                    .build();

    public static final RegistryKey<Block> CHISELED_ANDESITE_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaEnhanced.MOD_ID, "chiseled_andesite"));
    public static final Block CHISELED_ANDESITE = register(
            new Block(AbstractBlock.Settings.create().registryKey(CHISELED_ANDESITE_KEY).sounds(BlockSoundGroup.STONE).requiresTool().resistance(6).hardness(1.5f)),
            CHISELED_ANDESITE_KEY, true);

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
        });
    }
}
