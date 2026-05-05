package com.example.flinttools.init;

import com.example.flinttools.items.*;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class ModItems {

    public static final Item.ToolMaterial FLINT =
            EnumHelper.addToolMaterial(
                    "FLINT",
                    0,
                    63,
                    1.6F,
                    1,
                    0
            );

    public static final Item FLINT_KNIFE = new ItemFlintKnife(FLINT);

    public static final Item FLINT_PICKAXE = new ItemFlintPickaxe(FLINT);

    public static final Item FLINT_SPADE = new ItemFlintSpade(FLINT);

    public static final Item FLINT_HOE = new ItemFlintHoe(FLINT);

    public static final Item FLINT_HATCHET = new ItemFlintHatchet(FLINT);

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(
                FLINT_KNIFE,
                FLINT_PICKAXE,
                FLINT_SPADE,
                FLINT_HOE,
                FLINT_HATCHET
        );
    }
}