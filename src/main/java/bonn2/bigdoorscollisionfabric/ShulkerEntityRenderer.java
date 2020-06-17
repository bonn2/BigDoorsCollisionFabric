package bonn2.bigdoorscollisionfabric;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.Frustum;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.entity.mob.ShulkerEntity;

@Environment(EnvType.CLIENT)
public class ShulkerEntityRenderer extends net.minecraft.client.render.entity.ShulkerEntityRenderer {
    public ShulkerEntityRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher);
    }

    @Override
    public boolean shouldRender(ShulkerEntity shulkerEntity, Frustum frustum, double d, double e, double f) {
        if (shulkerEntity.getName().getString().equals("BigDoorsCollision")) {
            return false;
        } else {
            return super.shouldRender(shulkerEntity, frustum, d, e, f);
        }
    }
}
