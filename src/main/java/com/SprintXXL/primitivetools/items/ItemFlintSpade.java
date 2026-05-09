package com.SprintXXL.primitivetools.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;

import static com.SprintXXL.primitivetools.PrimitiveTools.MODID;

public class ItemFlintSpade extends ItemSpade {
    public ItemFlintSpade(ToolMaterial material) {
        super(material);

        setRegistryName(MODID, "flint_spade");
        setUnlocalizedName(MODID + ".flint_spade");
        setCreativeTab(CreativeTabs.TOOLS);
    }
}
