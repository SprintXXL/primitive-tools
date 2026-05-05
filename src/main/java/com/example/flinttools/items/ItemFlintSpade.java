package com.example.flinttools.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;

import static com.example.flinttools.FlintTools.MODID;

public class ItemFlintSpade extends ItemSpade {
    public ItemFlintSpade(ToolMaterial material) {
        super(material);

        setRegistryName(MODID, "flint_spade");
        setUnlocalizedName(MODID + ".flint_spade");
        setCreativeTab(CreativeTabs.TOOLS);
    }
}
