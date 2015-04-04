package net.cubition.minecraft.block;

import net.cubition.api.block.BlockType;
import net.cubition.api.item.ItemBase;
import net.cubition.api.item.ToolItem;
import net.cubition.api.network.NetworkIDResource;
import net.cubition.minecraft.tool.ToolPickaxe;

public class BlockCobblestone extends ItemBase implements BlockType,
		NetworkIDResource {

	@Override
	public String getNetworkID() {
		return "4"; // Assuming this is Minecraft id
	}

	@Override
	public float getDigSpeed(ToolItem item) {
		if (item.getToolType() instanceof ToolPickaxe)
			return 4;
		else
			return 2;
	}

	@Override
	public String getTranslatableName() {
		return "tile.cobblestone.default.name";
	}
}
