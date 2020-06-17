package bonn2.bigdoorscollisionfabric;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;
import net.minecraft.entity.EntityType;

@Environment(EnvType.CLIENT)
public class Main implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.INSTANCE.register(
                EntityType.SHULKER,
                (entityRenderDispatcher, context) -> new ShulkerEntityRenderer(entityRenderDispatcher));
    }
}
