package hollow.vanillaenhanced;

import hollow.vanillaenhanced.classes.ModItems;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
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
            new Block(AbstractBlock.Settings.create().registryKey(SUPER_POWERED_RAIL_KEY).strength(0.7f).nonOpaque()),
            SUPER_POWERED_RAIL_KEY, true);

    // --- DIORITE ---
    public static final RegistryKey<Block> DIORITE_BRICKS_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaEnhanced.MOD_ID, "diorite_bricks"));
    public static final Block DIORITE_BRICKS = register(
            new Block(AbstractBlock.Settings.create().registryKey(DIORITE_BRICKS_KEY).sounds(BlockSoundGroup.STONE).requiresTool().resistance(6).hardness(1.5f)),
            DIORITE_BRICKS_KEY, true);

    // --- GRANITE ---
    public static final RegistryKey<Block> GRANITE_BRICKS_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaEnhanced.MOD_ID, "granite_bricks"));
    public static final Block GRANITE_BRICKS = register(
            new Block(AbstractBlock.Settings.create().registryKey(GRANITE_BRICKS_KEY).sounds(BlockSoundGroup.STONE).requiresTool().resistance(6).hardness(1.5f)),
            GRANITE_BRICKS_KEY, true);

    // --- ANDESITE ---
    public static final RegistryKey<Block> ANDESITE_BRICKS_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaEnhanced.MOD_ID, "andesite_bricks"));
    public static final Block ANDESITE_BRICKS = register(
            new Block(AbstractBlock.Settings.create().registryKey(ANDESITE_BRICKS_KEY).sounds(BlockSoundGroup.STONE).requiresTool().resistance(6).hardness(1.5f)),
            ANDESITE_BRICKS_KEY, true);

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
            itemGroup.add(ModBlocks.DIORITE_BRICKS.asItem());
            itemGroup.add(ModBlocks.ANDESITE_BRICKS.asItem());
            itemGroup.add(ModBlocks.CHISELED_ANDESITE.asItem());
            itemGroup.add(ModBlocks.GRANITE_BRICKS.asItem());

        });

        // --- MOD GROUP ---
        ItemGroupEvents.modifyEntriesEvent(ModItems.CUSTOM_ITEM_GROUP_KEY).register((itemGroup) -> {
            itemGroup.add(ModBlocks.ECHO_BLOCK.asItem());
            itemGroup.add(ModBlocks.SUPER_POWERED_RAIL.asItem());
            itemGroup.add(ModBlocks.DIORITE_BRICKS.asItem());
            itemGroup.add(ModBlocks.ANDESITE_BRICKS.asItem());
            itemGroup.add(ModBlocks.CHISELED_ANDESITE.asItem());
            itemGroup.add(ModBlocks.GRANITE_BRICKS.asItem());
        });
    }
}
