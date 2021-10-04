package net.desertupdate.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.world.World;

public class Crab extends PathAwareEntity {

    public Crab(EntityType<? extends PathAwareEntity> entityType, World world) {
        super(entityType, world);
    }
}
