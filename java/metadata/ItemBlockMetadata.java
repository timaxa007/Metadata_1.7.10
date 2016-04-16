package metadata;

import net.minecraft.block.Block;
import net.minecraft.item.ItemMultiTexture;

public class ItemBlockMetadata extends ItemMultiTexture {

	public ItemBlockMetadata(Block block) {
		super(block, block, BlockMetadata.metadata);
	}

}
