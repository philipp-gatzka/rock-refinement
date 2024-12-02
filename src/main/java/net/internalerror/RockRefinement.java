package net.internalerror;

import com.mojang.logging.LogUtils;
import net.internalerror.registry.RRBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(RockRefinement.MOD_ID)
public class RockRefinement {

    public static final String MOD_ID = "rock_refinement";

    private static final Logger LOGGER = LogUtils.getLogger();

    public RockRefinement() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        RRBlocks.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }

}
