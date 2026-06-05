package com.SprintXXL.primitivetools.items;

import com.google.common.collect.Multimap;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemSword;

import static com.SprintXXL.primitivetools.Reference.MODID;

public class ItemFlintKnife extends ItemSword {
    public ItemFlintKnife(ToolMaterial material) {
        super(material);

        setRegistryName(MODID, "flint_knife");
        setTranslationKey(MODID + ".flint_knife");
        setCreativeTab(CreativeTabs.COMBAT);
    }

    @Override
    public Multimap<String, AttributeModifier> getItemAttributeModifiers(EntityEquipmentSlot slot) {

        Multimap<String, AttributeModifier> modifiers = super.getItemAttributeModifiers(slot);

        if (slot == EntityEquipmentSlot.MAINHAND) {

            modifiers.removeAll(SharedMonsterAttributes.ATTACK_SPEED.getName());

            modifiers.put(
                    SharedMonsterAttributes.ATTACK_SPEED.getName(),
                    new AttributeModifier(
                            ATTACK_SPEED_MODIFIER,
                            "Weapon modifier",
                            -1.5F,
                            0
                    )
            );

            modifiers.removeAll(SharedMonsterAttributes.ATTACK_DAMAGE.getName());

            modifiers.put(
                    SharedMonsterAttributes.ATTACK_DAMAGE.getName(),
                    new AttributeModifier(
                            ATTACK_DAMAGE_MODIFIER,
                            "Weapon modifier",
                            2,
                            0
                    )
            );

        }

        return modifiers;

    }
}