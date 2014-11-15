package com.sebasti161.mod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockLightBlueBlock extends Block
{
	public BlockLightBlueBlock()
	{
		super(Material.rock);
		setBlockName("LightBlueBlock");
		setBlockTextureName(References.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabs.tabBlock);
		setStepSound(soundTypePiston);
		setHardness(1.5F);
		setResistance(5.0F);
		setLightLevel(0.1F);
	}
}
