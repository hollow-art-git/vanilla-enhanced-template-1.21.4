package hollow.vanillaenhanced.item;

import hollow.vanillaenhanced.VanillaEnhanced;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

import static net.minecraft.item.Items.register; //Needed for "register" in static final items

public class ModItems {

    public static Item register(Item item, RegistryKey<Item> registryKey) {
        // Register the item.
        Item registeredItem = Registry.register(Registries.ITEM, registryKey.getValue(), item);

        // Return the registered item!
        return registeredItem;
    }

    public static final RegistryKey<Item> SUPER_POWERED_RAIL_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(VanillaEnhanced.MOD_ID, "super_powered_rail"));
    public static final Item SUPER_POWERED_RAIL = register(new Item(new Item.Settings().registryKey(SUPER_POWERED_RAIL_KEY)), SUPER_POWERED_RAIL_KEY);



    public static void initialize() {
        // Get the event for modifying entries in the ingredients group.
        // And register an event handler that adds our suspicious item to the ingredients group.
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.REDSTONE).register((itemGroup) -> itemGroup.add(ModItems.SUPER_POWERED_RAIL));
    }
}
