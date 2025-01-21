package com.decduck3.nestedshulkers.mixin;

import net.minecraft.item.ItemStack;
import net.minecraft.screen.slot.ShulkerBoxSlot;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(ShulkerBoxSlot.class)
public class ShulkerMixin {
    /**
     * @author DecDuck
     * @reason Allows anything to be inserted into a shulker
     */
    @Overwrite
    public boolean canInsert(ItemStack stack) {
        return true;
    }
}
