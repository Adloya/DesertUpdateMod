package net.desertupdate;

import net.desertupdate.entity.Crab;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class DesertupdateMod implements ModInitializer {

    public static final Item SHELLFISH = new ShellFish(new Item.Settings().group(ItemGroup.MISC));
    public static final EntityType<Crab> CRAB = Registry.register(
            Registry.ENTITY_TYPE,
            new Identifier("desertupdate", "crab"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, Crab::new).dimensions(EntityDimensions.fixed(0.75f, 0.75f)).build()
    );

    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier("desertupdate", "shellfish"), SHELLFISH);
        FabricDefaultAttributeRegistry.register(CRAB, Crab.createMobAttributes());
    }
}