package com.example.flinttools.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

import static com.example.flinttools.FlintTools.MODID;

public class ItemFlintHatchet extends ItemAxe {
    public ItemFlintHatchet(ToolMaterial material) {
        super(material, 4, -3);

        setRegistryName(MODID, "flint_hatchet");
        setUnlocalizedName(MODID + ".flint_hatchet");
        setCreativeTab(CreativeTabs.TOOLS);
    }
}
