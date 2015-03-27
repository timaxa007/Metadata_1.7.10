package metadata;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockMetadata extends Block {

	public static final String[] metadata = new String[] {
		"meta_1", 
		"meta_2", 
		"meta_3", 
		"meta_4", 
		"meta_5", 
		"meta_6", 
		"meta_7", 
		"meta_8", 
		"meta_9", 
		"meta_10", 
		"meta_11", 
		"meta_12", 
		"meta_13", 
		"meta_14", 
		"meta_15", 
		"meta_16"
	};

	@SideOnly(Side.CLIENT)
	private IIcon[] icon_array;

	public BlockMetadata() {
		super(Material.iron);
		setCreativeTab(ModMetadata.tab_metadata);
		setHardness(0.3F);
		setResistance(1.0F);
		setBlockTextureName(ModMetadata.MODID + ":block_metadata");
		setBlockName("block_metadata");
	}

	public int idPicked(World world, int x, int y, int z) {
		return 0;
	}

	public ItemStack getPickBlock(MovingObjectPosition target, World world, int x, int y, int z) {
		return new ItemStack(world.getBlock(x, y, z), 1, world.getBlockMetadata(x, y, z));
	}

	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int metadata) {
		return icon_array[metadata];
	}

	@SideOnly(Side.CLIENT)
	public void getSubBlocks(Item id, CreativeTabs table, List list) {
		for (int j = 0; j < metadata.length; ++j) {
			list.add(new ItemStack(id, 1, j));
		}
	}

	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister ir) {
		icon_array = new IIcon[metadata.length];
		blockIcon = ir.registerIcon(getTextureName());
		for (int i = 0; i < metadata.length; ++i) {
			icon_array[i] = ir.registerIcon(getTextureName() + "/" + metadata[i]);
		}
	}

}
