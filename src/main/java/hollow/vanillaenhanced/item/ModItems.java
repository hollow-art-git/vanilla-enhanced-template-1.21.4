package hollow.vanillaenhanced.item;

import hollow.vanillaenhanced.block.ModBlocks;
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

import java.util.function.Function;

public class ModItems {

    public static Item register(String name, Function<Item.Settings, Item> itemFactory, Item.Settings settings) {
        // Create the item key.
        RegistryKey<Item> itemKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(VanillaEnhanced.MOD_ID, name));

        // Create the item instance.
        Item item = itemFactory.apply(settings.registryKey(itemKey));

        // Register the item.
        Registry.register(Registries.ITEM, itemKey, item);

        return item;
    }


    public static final Item SHARP_STONE = register("sharp_stone", Item::new, new Item.Settings());
    public static final Item REINFORCED_STICK = register("reinforced_stick", Item::new, new Item.Settings());
    public static final Item COPPER_NUGGET = register("copper_nugget", Item::new, new Item.Settings());


    // --- CUSTOM GROUP ---

    public static final RegistryKey<ItemGroup> CUSTOM_ITEM_GROUP_KEY = RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of(VanillaEnhanced.MOD_ID, "item_group"));

    public static final ItemGroup CUSTOM_ITEM_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModBlocks.ECHO_BLOCK.asItem()))
            .displayName(Text.translatable("itemGroup.vanilla-enhanced"))
            .build();


    public static void initialize() {

        // --- STANDARD GROUPS ---

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register((itemGroup) -> {
            itemGroup.add(ModItems.SHARP_STONE);
            itemGroup.add(ModItems.REINFORCED_STICK);
            itemGroup.add(ModItems.COPPER_NUGGET);

        });

        // --- VANILLA ENHANCED GROUP ---

        Registry.register(Registries.ITEM_GROUP, CUSTOM_ITEM_GROUP_KEY, CUSTOM_ITEM_GROUP);

        ItemGroupEvents.modifyEntriesEvent(CUSTOM_ITEM_GROUP_KEY).register(itemGroup -> {
            itemGroup.add(ModItems.SHARP_STONE);
            itemGroup.add(ModItems.REINFORCED_STICK);
            itemGroup.add(ModItems.COPPER_NUGGET);
        });
    }
}
