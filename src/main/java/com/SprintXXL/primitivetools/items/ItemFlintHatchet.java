package com.SprintXXL.primitivetools.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

import static com.SprintXXL.primitivetools.PrimitiveTools.MODID;

public class ItemFlintHatchet extends ItemAxe {
    public ItemFlintHatchet(ToolMaterial material) {
        super(material, 4, -3);

        setRegistryName(MODID, "flint_hatchet");
        setUnlocalizedName(MODID + ".flint_hatchet");
        setCreativeTab(CreativeTabs.TOOLS);
    }
}
