package com.example.flinttools.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;

import static com.example.flinttools.FlintTools.MODID;

public class ItemFlintHoe extends ItemHoe {
    public ItemFlintHoe(ToolMaterial material) {
        super(material);

        setRegistryName(MODID, "flint_hoe");
        setUnlocalizedName(MODID + ".flint_hoe");
        setCreativeTab(CreativeTabs.TOOLS);
    }
}
