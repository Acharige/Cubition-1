package net.cubition.minecraft.item;

import net.cubition.api.API;
import net.cubition.api.TranslatableResource;
import net.cubition.api.item.ToolItem;
import net.cubition.api.network.NetworkIDResource;
import net.cubition.api.tool.ToolType;
import net.cubition.minecraft.tool.ToolShovel;

public class ItemStoneShovel extends ToolItem implements NetworkIDResource,
		TranslatableResource {

	@Override
	public String getNetworkID() {
		return "273";
	}

	@Override
	public String getTranslatableName() {
		return "item.shovelStone";
	}

	@Override
	public String getTranslatableName(byte damage) {
		return "item.shovelStone";
	}

	@Override
	public int maxStackSize() {
		return 1;
	}

	@Override
	public ToolType getToolType() {
		return API.getToolTypeRegister().get(ToolShovel.class.getName());
	}

}
