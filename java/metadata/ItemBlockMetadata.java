package metadata;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockMetadata extends ItemBlock {

	public ItemBlockMetadata(Block block) {
		super(block);
		setMaxDamage(0);
		setHasSubtypes(true);
	}

	public ItemBlockMetadata() {
		super(ModMetadata.block_metadata);
		setMaxDamage(0);
		setHasSubtypes(true);
	}

	public String getUnlocalizedName(ItemStack is) {
		int metadata = is.getItemDamage();
		if (metadata >= 0 && metadata < BlockMetadata.metadata.length) {
			return super.getUnlocalizedName() + "." + BlockMetadata.metadata[metadata];
		}
		return super.getUnlocalizedName();
	}

	public int getMetadata(int metadata) {
		return metadata;
	}

}
