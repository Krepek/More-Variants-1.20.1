package net.krepek.morevariants.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.krepek.morevariants.MoreVariants;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item CHERRY_STICK = registerItem("cherry_stick", new Item(new FabricItemSettings()));
    public static final Item WARPED_STICK = registerItem("warped_stick", new Item(new FabricItemSettings()));
    public static final Item CRIMSON_STICK = registerItem("crimson_stick", new Item(new FabricItemSettings()));
    public static final Item BIRCH_STICK = registerItem("birch_stick", new Item(new FabricItemSettings()));
    public static final Item ACCACIA_STICK = registerItem("accacia_stick", new Item(new FabricItemSettings()));
    public static final Item BAMBOO_STICK = registerItem("bamboo_stick", new Item(new FabricItemSettings()));
    public static final Item DARK_OAK_STICK = registerItem("dark_oak_stick", new Item(new FabricItemSettings()));
    public static final Item JUNGLE_STICK = registerItem("jungle_stick", new Item(new FabricItemSettings()));
    public static final Item SPRUCE_STICK = registerItem("spruce_stick", new Item(new FabricItemSettings()));
    public static final Item MANGROVE_STICK = registerItem("mangrove_stick", new Item(new FabricItemSettings()));
    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries)    {
        entries.add(CHERRY_STICK);
        entries.add(WARPED_STICK);
        entries.add(CRIMSON_STICK);
        entries.add(BIRCH_STICK);
        entries.add(ACCACIA_STICK);
        entries.add(BAMBOO_STICK);
        entries.add(DARK_OAK_STICK);
        entries.add(JUNGLE_STICK);
        entries.add(MANGROVE_STICK);
        entries.add(SPRUCE_STICK);
    }
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(MoreVariants.MOD_ID, name), item);
    }


    public static void registerModItems()   {
        MoreVariants.LOGGER.info("Registering Mod Items for" + MoreVariants.MOD_ID);
    }
}
