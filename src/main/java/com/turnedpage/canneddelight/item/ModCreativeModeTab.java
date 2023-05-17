package com.turnedpage.canneddelight.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab TAB_CANNEDDELIGHT = new CreativeModeTab("canneddelight_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.TINCAN.get());
        }
    };
}
