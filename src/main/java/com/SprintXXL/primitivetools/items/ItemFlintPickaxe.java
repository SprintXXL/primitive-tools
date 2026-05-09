package com.SprintXXL.primitivetools.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

import static com.SprintXXL.primitivetools.PrimitiveTools.MODID;

public class ItemFlintPickaxe extends ItemPickaxe {
    public ItemFlintPickaxe(ToolMaterial material) {
        super(material);

        setRegistryName(MODID, "flint_pickaxe");
        setUnlocalizedName(MODID + ".flint_pickaxe");
        setCreativeTab(CreativeTabs.TOOLS);
    }
}
