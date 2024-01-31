package net.krepek.morevariants.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.krepek.morevariants.MoreVariants;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item CHERRY_STICK = registerItem("cherry_stick", new Item(new FabricItemSettings()));
    public static final Item WARPED_STICK = registerItem("warped_stick", new Item(new FabricItemSettings()));
    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries)    {
        entries.add(CHERRY_STICK);
        entries.add(WARPED_STICK);
    }
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(MoreVariants.MOD_ID, name), item);
    }


    public static void registerModItems()   {
        MoreVariants.LOGGER.info("Registering Mod Items for" + MoreVariants.MOD_ID);
    }
}
