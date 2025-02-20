package hollow.vanillaenhanced;

import hollow.vanillaenhanced.item.ModItems;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
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

    public static void initialize() {
        ItemGroupEvents.modifyEntriesEvent(ModItems.CUSTOM_ITEM_GROUP_KEY).register((itemGroup) -> {
            itemGroup.add(ModBlocks.ECHO_BLOCK.asItem());
        });
    }
}
