package net.internalerror.registry;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static net.internalerror.RockRefinement.MOD_ID;

public abstract class RRBlocks {

    private static final DeferredRegister<Block> registry = DeferredRegister.create(ForgeRegistries.BLOCKS, MOD_ID);

    public static final RegistryObject<Block> TIN_ORE = block("tin_ore", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)));
    public static final RegistryObject<Block> DEEPSLATE_TIN_ORE = block("deepslate_tin_ore", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_IRON_ORE)));
    public static final RegistryObject<Block> TIN_BLOCK = block("tin_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Block> RAW_TIN_BLOCK = block("raw_tin_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.RAW_IRON_BLOCK)));

    private static RegistryObject<Block> block(String pName, Supplier<Block> pBlockSupplier) {
        return registry.register(pName, pBlockSupplier);
    }

    public static void register(IEventBus eventBus) {
        registry.register(eventBus);
    }

}
