package com.example.flinttools.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

import static com.example.flinttools.FlintTools.MODID;

public class ItemFlintKnife extends ItemSword {
    public ItemFlintKnife(ToolMaterial material) {
        super(material);

        setRegistryName(MODID, "flint_knife");
        setUnlocalizedName(MODID + ".flint_knife");
        setCreativeTab(CreativeTabs.COMBAT);
    }
}