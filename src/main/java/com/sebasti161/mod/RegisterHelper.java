package com.sebasti161.mod;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class RegisterHelper 
{
	public static void RegisterBlock(Block block)
	{
		GameRegistry.registerBlock(block, PixelCore.MODID + "_" + block.getUnlocalizedName().substring(5));
	}
	public static void registerItem(Item item)
	{
		GameRegistry.registerItem(item, PixelCore.MODID + "_" + item.getUnlocalizedName().substring(5));
	}
	
}
