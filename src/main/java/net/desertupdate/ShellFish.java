package net.desertupdate;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class ShellFish extends Item {

    public ShellFish(Settings item$settings_1) {
        super(item$settings_1);
    }

    // @Override
    // public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand) {
    //     playerEntity.playSound(SoundEvents.BLOCK_WOOL_BREAK, 1.0F, 1.0F);
    //     return new TypedActionResult<ItemStack>(ActionResult.SUCCESS, playerEntity.getStackInHand(hand));
    // }
}