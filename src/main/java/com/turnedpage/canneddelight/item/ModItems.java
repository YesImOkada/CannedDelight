package com.turnedpage.canneddelight.item;

import com.turnedpage.canneddelight.CannedDelight;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.EventBus;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CannedDelight.MOD_ID);

    public static final RegistryObject<Item> BAKEDBEANS = ITEMS.register("baked_beans",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).stacksTo(1)
                    .food(new FoodProperties.Builder().nutrition(5).saturationMod(4))));
    public static final RegistryObject<Item> TINCAN = ITEMS.register("tin_can",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_CANNEDDELIGHT).stacksTo(8)));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
