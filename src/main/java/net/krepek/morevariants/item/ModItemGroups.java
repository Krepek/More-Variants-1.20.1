package net.krepek.morevariants.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.krepek.morevariants.MoreVariants;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup MORE_VARIANTS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(MoreVariants.MOD_ID,"cherry"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.more_variants"))
                    .icon( () -> new ItemStack(ModItems.CHERRY_STICK)).entries((displayContext, entries) -> {
                            entries.add(ModItems.SPRUCE_STICK);
                            entries.add(ModItems.BIRCH_STICK);
                            entries.add(ModItems.JUNGLE_STICK);
                            entries.add(ModItems.ACACIA_STICK);
                            entries.add(ModItems.DARK_OAK_STICK);
                            entries.add(ModItems.MANGROVE_STICK);
                            entries.add(ModItems.BAMBOO_STICK);
                            entries.add(ModItems.CRIMSON_STICK);
                            entries.add(ModItems.WARPED_STICK);
                            entries.add(ModItems.CHERRY_STICK);

                    }).build());
    public static void registerItemGroups() {
        MoreVariants.LOGGER.info(MoreVariants.MOD_ID);
    }
}
