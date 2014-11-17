package com.sebasti161.mod.recipes;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import com.sebasti161.mod.blocks.ModBlocks;
import com.sebasti161.mod.items.ModItems;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModRecipes
{

    /**
     * Adds the recipes.
     * Called in the preInit
     */
	public static void addRecipes() 
	{
        /**
         * A basic recipe. This requires 2 values: Output, an itemstack output, and an Object Array, of what the
         * recipe is.
         * Pretend the array as an crafting grid, where spaces are empty places.
         * All other chars can be any item assigned.
         */
		GameRegistry.addRecipe(new ItemStack(ModBlocks.whiteBlock,4), new Object[]
		{
			"YX",
			"YY",
			'X', Items.string, 'Y', Blocks.wool
		});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.redBlock,8), new Object[]
		{
			"XY",
			"XX",
			'X', ModBlocks.whiteBlock, 'Y', Items.apple
		});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.cyanBlock,8), new Object[]
		{
			"XY",
			"XX",
			'X', ModBlocks.whiteBlock, 'Y', Items.diamond
		});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.brownBlock,8), new Object[]
		{
			"XY",
			"XX",
			'X', ModBlocks.whiteBlock, 'Y', Blocks.dirt
		});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.yellowBlock,8), new Object[]
		{
			"XY",
			"XX",
			'X', ModBlocks.whiteBlock, 'Y', Items.gold_nugget
		});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.greenBlock,8), new Object[]
		{
			"XY",
			"XX",
			'X', ModBlocks.whiteBlock, 'Y', Items.slime_ball
		});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.orangeBlock,8), new Object[]
		{
			"XY",
			"XX",
			'X', ModBlocks.whiteBlock, 'Y', Items.lava_bucket
		});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.purpleBlock,8), new Object[]
		{
			"XY",
			"XX",
			'X', ModBlocks.whiteBlock, 'Y', Items.ender_pearl
		});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.blueBlock,8), new Object[]
		{
			"XY",
			"XX",
			'X', ModBlocks.whiteBlock, 'Y', Items.water_bucket
		});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.blackBlock,8), new Object[]
		{
			"XY",
			"XX",
			'X', ModBlocks.whiteBlock, 'Y', Blocks.obsidian
		});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.oneBlock,8), new Object[]
		{
			"XY",
			"XX",
			'X', ModBlocks.whiteBlock, 'Y', Items.arrow
		});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.lightBlueBlock,8), new Object[]
		{
			"XY",
			"XX",
			'X', ModBlocks.whiteBlock, 'Y', new ItemStack(Items.dye, 1, 12)
		});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.darkGreenBlock,8), new Object[]
		{
			"XY",
			"XX",
			'X', ModBlocks.whiteBlock, 'Y', new ItemStack(Items.dye, 1, 2)
		});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.greenBlock2,8), new Object[]
		{
			"XY",
			"XX",
			'X', ModBlocks.whiteBlock, 'Y', Items.wheat_seeds
		});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.darkBlueBlock,8), new Object[]
		{
			"XY",
			"XX",
			'X', ModBlocks.whiteBlock, 'Y', new ItemStack(Items.dye, 1, 4)
		});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.limeBlock,8), new Object[]
		{
			"XY",
			"XX",
			'X', ModBlocks.whiteBlock, 'Y', new ItemStack(Items.dye, 1, 10)
		});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.pinkBlock,8), new Object[]
		{
			"XY",
			"XX",
			'X', ModBlocks.whiteBlock, 'Y', new ItemStack(Items.dye, 1, 9)
		});
		/*GameRegistry.addShapelessRecipe(new ItemStack(ModItems.RedItem), new Object[]
		{
			Items.iron_ingot, new ItemStack(Items.dye, 1, 11)
		});*/
	}
}