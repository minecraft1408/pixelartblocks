package com.sebasti161.mod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.sebasti161.mod.PixelCore;

public class ItemRedBlock extends Item 
{
	public ItemRedBlock()
	{
		super();
		setUnlocalizedName("RedItem")
		.setTextureName(PixelCore.MODID + ":" + getUnlocalizedName().substring(5));
	}
}