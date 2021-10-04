package net.desertupdate.client.renderer;

import net.desertupdate.client.model.CrabModel;
import net.desertupdate.entity.Crab;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class CrabRenderer extends MobEntityRenderer<Crab, CrabModel> {
    public CrabRenderer(EntityRendererDispatcher entityRendererDispatcher) {
        super(entityRendererDispatcher, new CrabModel(), 0.5f);
    }

    @Override
    public Identifier getTexture(Crab entity) {
        return new Identifier("desertupdate", "textures/entity/crab/crab.png");
    }
}
