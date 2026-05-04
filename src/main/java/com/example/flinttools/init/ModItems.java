package com.example.flinttools.init;

import com.example.flinttools.items.ItemFlintKnife;
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
                    64,
                    3,
                    5,
                    3
            );

    public static final Item FLINT_KNIFE = new ItemFlintKnife(FLINT);

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(
                FLINT_KNIFE
        );
    }
}