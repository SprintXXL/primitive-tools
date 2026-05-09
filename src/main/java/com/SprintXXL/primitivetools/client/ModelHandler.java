package com.SprintXXL.primitivetools.client;

import com.SprintXXL.primitivetools.init.ModItems;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod.EventBusSubscriber(Side.CLIENT)
@SideOnly(Side.CLIENT)
public class ModelHandler {

    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {

        ModelLoader.setCustomModelResourceLocation(
                ModItems.FLINT_KNIFE,
                0,
                new ModelResourceLocation(ModItems.FLINT_KNIFE.getRegistryName(), "inventory")
        );

        ModelLoader.setCustomModelResourceLocation(
                ModItems.FLINT_PICKAXE,
                0,
                new ModelResourceLocation(ModItems.FLINT_PICKAXE.getRegistryName(), "inventory")
        );

        ModelLoader.setCustomModelResourceLocation(
                ModItems.FLINT_SPADE,
                0,
                new ModelResourceLocation(ModItems.FLINT_SPADE.getRegistryName(), "inventory")
        );

        ModelLoader.setCustomModelResourceLocation(
                ModItems.FLINT_HOE,
                0,
                new ModelResourceLocation(ModItems.FLINT_HOE.getRegistryName(), "inventory")
        );

        ModelLoader.setCustomModelResourceLocation(
                ModItems.FLINT_HATCHET,
                0,
                new ModelResourceLocation(ModItems.FLINT_HATCHET.getRegistryName(), "inventory")
        );
    }
}