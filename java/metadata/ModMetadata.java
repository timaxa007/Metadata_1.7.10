package metadata;

import net.minecraft.block.Block;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod (modid = ModMetadata.MODID, name = ModMetadata.MODNAME, version = ModMetadata.VERSION)

public class ModMetadata {

	public static final String MODID = "metadata";
	public static final String MODNAME = "Metadata";
	public static final String VERSION = "0.2a";

	@Instance(ModMetadata.MODID)
	public static ModMetadata instance;

	public static Block block_metadata;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {

		block_metadata = new BlockMetadata();
		GameRegistry.registerBlock(block_metadata, ItemBlockMetadata.class, "block_metadata");

	}

	@EventHandler
	public void init(FMLInitializationEvent event) {

	}

}