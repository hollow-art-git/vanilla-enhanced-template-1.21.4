package hollow.vanillaenhanced.item;

import hollow.vanillaenhanced.ModBlocks;
import hollow.vanillaenhanced.VanillaEnhanced;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItems {

    public static Item register(Item item, RegistryKey<Item> registryKey) {
        // Register the item.
        Item registeredItem = Registry.register(Registries.ITEM, registryKey.getValue(), item);

        // Return the registered item!
        return registeredItem;
    }

    // --- CUSTOM GROUP ---

    public static final RegistryKey<ItemGroup> CUSTOM_ITEM_GROUP_KEY = RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of(VanillaEnhanced.MOD_ID, "item_group"));

    public static final ItemGroup CUSTOM_ITEM_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModItems.SUPER_POWERED_RAIL))
            .displayName(Text.translatable("itemGroup.vanilla-enhanced"))
            .build();

    // ---

    public static final RegistryKey<Item> SUPER_POWERED_RAIL_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(VanillaEnhanced.MOD_ID, "super_powered_rail"));
    public static final Item SUPER_POWERED_RAIL = register(new Item(new Item.Settings().registryKey(SUPER_POWERED_RAIL_KEY)), SUPER_POWERED_RAIL_KEY);



    public static void initialize() {

        // --- STANDARD GROUPS ---

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.REDSTONE).register((itemGroup) -> {
            itemGroup.add(ModItems.SUPER_POWERED_RAIL);
        });

        // --- VANILLA ENHANCED GROUP ---

        Registry.register(Registries.ITEM_GROUP, CUSTOM_ITEM_GROUP_KEY, CUSTOM_ITEM_GROUP);

        ItemGroupEvents.modifyEntriesEvent(CUSTOM_ITEM_GROUP_KEY).register(itemGroup -> {
            itemGroup.add(ModItems.SUPER_POWERED_RAIL);
            itemGroup.add(ModBlocks.ECHO_BLOCK.asItem());
        });
    }
}
