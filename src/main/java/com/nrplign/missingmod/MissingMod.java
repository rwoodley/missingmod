package com.nrplign.missingmod;

import com.nrplign.missingmod.blocks.GlycerinBlock;
import com.nrplign.missingmod.blocks.ModBlocks;
import com.nrplign.missingmod.setup.ClientProxy;
import com.nrplign.missingmod.setup.IProxy;
import com.nrplign.missingmod.setup.ServerProxy;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("missingmod")
public class MissingMod
{
    public static final String MODID = "missingmod";

    public static IProxy proxy = DistExecutor.runForDist(() -> () -> new ClientProxy(), () -> () -> new ServerProxy());

    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    public MissingMod() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        // when you get here all the block and things you might need have been registered.
    }

    // You can use EventBusSubscriber to automatically subscribe events on the contained class (this is subscribing to the MOD
    // Event bus for receiving Registry Events)
    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> event) {
            // register a new block here
            LOGGER.info("HELLO from onBlocksRegistry");

            event.getRegistry().register(new GlycerinBlock());
        }

        @SubscribeEvent
        public static void onItemRegistry(final RegistryEvent.Register<Item> event) {
            LOGGER.info("HELLO from onItemRegistry");
            event.getRegistry().register(new BlockItem(ModBlocks.GLYCERINBLOCK, new Item.Properties())
                .setRegistryName("glycerinblock")
            );
        }
    }
}
