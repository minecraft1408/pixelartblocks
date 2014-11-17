package com.sebasti161.mod.blocks;

import com.sebasti161.mod.PixelCore;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockCyanBlock extends Block
{
	public BlockCyanBlock()
	{
		super(Material.rock);
		setBlockName("CyanBlock");
		setBlockTextureName(PixelCore.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(PixelCore.tabPixel);
		setStepSound(soundTypePiston);
		setHardness(1.5F);
		setResistance(5.0F);
		setLightLevel(0.1F);
	}
}
