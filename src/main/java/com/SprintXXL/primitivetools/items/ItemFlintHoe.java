package com.SprintXXL.primitivetools.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;

import static com.SprintXXL.primitivetools.PrimitiveTools.MODID;

public class ItemFlintHoe extends ItemHoe {
    public ItemFlintHoe(ToolMaterial material) {
        super(material);

        setRegistryName(MODID, "flint_hoe");
        setUnlocalizedName(MODID + ".flint_hoe");
        setCreativeTab(CreativeTabs.TOOLS);
    }
}
