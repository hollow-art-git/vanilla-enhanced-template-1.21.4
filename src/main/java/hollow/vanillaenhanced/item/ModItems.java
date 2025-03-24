package hollow.vanillaenhanced.item;

import hollow.vanillaenhanced.VanillaEnhanced;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;
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

    public static final ToolMaterial NEW_GOLD_TOOL_MATERIAL = new ToolMaterial(
            BlockTags.INCORRECT_FOR_IRON_TOOL,
            64,
            ToolMaterial.IRON.speed(),
            1.2f,
            ToolMaterial.GOLD.enchantmentValue(),
            ItemTags.REPAIRS_GOLD_ARMOR
    );

    public static final Item NEW_GOLD_PICKAXE = register(
            "new_golden_pickaxe",
            settings -> new PickaxeItem(NEW_GOLD_TOOL_MATERIAL, 1f, 1f, settings),
            new Item.Settings()
    );

    public static final Item SHARP_STONE = register("sharp_stone", Item::new, new Item.Settings());
    public static final Item REINFORCED_STICK = register("reinforced_stick", Item::new, new Item.Settings());
    public static final Item EXPERT_HANDLE = register("expert_handle", Item::new, new Item.Settings());
    public static final Item COPPER_NUGGET = register("copper_nugget", Item::new, new Item.Settings());
    public static final Item DIAMOND_SHARD = register("diamond_shard", Item::new, new Item.Settings());


    // --- CUSTOM GROUP ---

    public static final RegistryKey<ItemGroup> CUSTOM_ITEM_GROUP_KEY = RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of(VanillaEnhanced.MOD_ID, "item_group"));

    public static final ItemGroup CUSTOM_ITEM_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModItems.DIAMOND_SHARD))
            .displayName(Text.translatable("itemGroup.vanilla-enhanced"))
            .build();


    public static void initialize() {

        // --- STANDARD GROUPS ---

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register((itemGroup) -> {
            itemGroup.add(ModItems.NEW_GOLD_PICKAXE);

        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register((itemGroup) -> {
            itemGroup.add(ModItems.SHARP_STONE);
            itemGroup.add(ModItems.REINFORCED_STICK);
            itemGroup.add(ModItems.EXPERT_HANDLE);
            itemGroup.add(ModItems.COPPER_NUGGET);
            itemGroup.add(ModItems.DIAMOND_SHARD);

        });

        // --- VANILLA ENHANCED GROUP ---

        Registry.register(Registries.ITEM_GROUP, CUSTOM_ITEM_GROUP_KEY, CUSTOM_ITEM_GROUP);

        ItemGroupEvents.modifyEntriesEvent(CUSTOM_ITEM_GROUP_KEY).register(itemGroup -> {
            itemGroup.add(ModItems.SHARP_STONE);
            itemGroup.add(ModItems.REINFORCED_STICK);
            itemGroup.add(ModItems.EXPERT_HANDLE);
            itemGroup.add(ModItems.COPPER_NUGGET);
            itemGroup.add(ModItems.DIAMOND_SHARD);
            itemGroup.add(ModItems.NEW_GOLD_PICKAXE);
        });
    }
}
