package net.desertupdate;

import net.desertupdate.client.renderer.CrabRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

@Environment(EnvType.CLIENT)
public class DesertupdateClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.INSTANCE.register(DesertupdateMod.CRAB, (dispatcher, context) -> {
            return new CrabRenderer(dispatcher);
        });
    }
}
