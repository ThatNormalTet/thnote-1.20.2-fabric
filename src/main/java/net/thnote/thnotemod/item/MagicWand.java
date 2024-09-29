package net.thnote.thnotemod.item;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.FireballEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SnowballItem;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import net.thnote.thnotemod.Thnote;

public class MagicWand extends SnowballItem {
    public MagicWand(Settings settings) {
        super(settings);
    }



    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);
        world.playSound(
                null,
                user.getX(),
                user.getY(),
                user.getZ(),
                SoundEvents.BLOCK_BEACON_ACTIVATE,
                SoundCategory.NEUTRAL,
                0.5F,
                0.4F / (world.getRandom().nextFloat() * 0.4F + 0.8F)
        );
        if (!world.isClient) {
            Thnote.LOGGER.info("" + user.getPitch() + " " + user.getYaw());
            FireballEntity fireballEntity = new FireballEntity(world, user, -user.getYaw(), -user.getPitch(), -user.getYaw(), 5);
            fireballEntity.setPosition(user.getX(), user.getY()+1, user.getZ());
            world.spawnEntity(fireballEntity);
        }

        return TypedActionResult.success(itemStack, world.isClient());
    }
}