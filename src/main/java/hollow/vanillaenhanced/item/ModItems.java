package hollow.vanillaenhanced.item;

import hollow.vanillaenhanced.VanillaEnhanced;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item SUPER_POWERED_RAIL = registerItem("super_powered_rail", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(VanillaEnhanced.MOD_ID, name), item);
    }

    public static void registerModItems(){
        VanillaEnhanced.LOGGER.info("Registering Mod Items for " + VanillaEnhanced.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.REDSTONE).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(SUPER_POWERED_RAIL);
        });
    }
}
