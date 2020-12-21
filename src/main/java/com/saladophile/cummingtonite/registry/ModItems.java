package com.saladophile.cummingtonite.registry;

import com.saladophile.cummingtonite.Cummingtonite;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Block CUMMINGTONITE_ORE = new Block(FabricBlockSettings.of(Material.STONE).hardness(3.5f));
    public static final Item CUMMINGTONITE_CHUNK = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item CUMMINGTONITE_NUGGET = new Item(new Item.Settings().group(ItemGroup.FOOD));
    public static final Block CUMMINGTONITE_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).hardness(3.5f));

    public static final Item CUMMINGTONITE_SWORD = new Item(new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item CUMMINGTONITE_PICKAXE = new Item(new Item.Settings().group(ItemGroup.TOOLS));
    public static final Item CUMMINGTONITE_AXE = new Item(new Item.Settings().group(ItemGroup.TOOLS));
    public static final Item CUMMINGTONITE_SHOVEL = new Item(new Item.Settings().group(ItemGroup.TOOLS));

    public static final Item CUMMINGTONITE_HELMET = new Item(new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item CUMMINGTONITE_CHESTPLATE = new Item(new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item CUMMINGTONITE_LEGGINGS = new Item(new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item CUMMINGTONITE_BOOTS = new Item(new Item.Settings().group(ItemGroup.COMBAT));

    public static void registerItems(){
        Registry.register(Registry.BLOCK, new Identifier(Cummingtonite.MOD_ID, "cummingtonite_ore"), CUMMINGTONITE_ORE);
        Registry.register(Registry.ITEM, new Identifier(Cummingtonite.MOD_ID, "cummingtonite_ore"), new BlockItem(CUMMINGTONITE_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(Cummingtonite.MOD_ID, "cummingtonite_chunk"), CUMMINGTONITE_CHUNK);
        Registry.register(Registry.ITEM, new Identifier(Cummingtonite.MOD_ID, "cummingtonite_nugget"), CUMMINGTONITE_NUGGET);
        Registry.register(Registry.BLOCK, new Identifier(Cummingtonite.MOD_ID, "cummingtonite_block"), CUMMINGTONITE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Cummingtonite.MOD_ID, "cummingtonite_block"), new BlockItem(CUMMINGTONITE_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));

        Registry.register(Registry.ITEM, new Identifier(Cummingtonite.MOD_ID, "cummingtonite_sword"), CUMMINGTONITE_SWORD);
        Registry.register(Registry.ITEM, new Identifier(Cummingtonite.MOD_ID, "cummingtonite_pickaxe"), CUMMINGTONITE_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(Cummingtonite.MOD_ID, "cummingtonite_axe"), CUMMINGTONITE_AXE);
        Registry.register(Registry.ITEM, new Identifier(Cummingtonite.MOD_ID, "cummingtonite_shovel"), CUMMINGTONITE_SHOVEL);

        Registry.register(Registry.ITEM, new Identifier(Cummingtonite.MOD_ID, "cummingtonite_helmet"), CUMMINGTONITE_HELMET);
        Registry.register(Registry.ITEM, new Identifier(Cummingtonite.MOD_ID, "cummingtonite_chestplate"), CUMMINGTONITE_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(Cummingtonite.MOD_ID, "cummingtonite_leggings"), CUMMINGTONITE_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(Cummingtonite.MOD_ID, "cummingtonite_boots"), CUMMINGTONITE_BOOTS);
    }
}
