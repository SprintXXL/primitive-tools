package com.SprintXXL.primitivetools.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

import static com.SprintXXL.primitivetools.Reference.MODID;

public class ItemFlintHatchet extends ItemAxe {
    public ItemFlintHatchet(ToolMaterial material) {
        super(material, 4, -3);

        setRegistryName(MODID, "flint_hatchet");
        setTranslationKey(MODID + ".flint_hatchet");
        setCreativeTab(CreativeTabs.TOOLS);
    }
}
