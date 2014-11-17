package com.sebasti161.mod;

import net.minecraft.block.Block;
import net.minecraft.block.BlockAir;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import com.sebasti161.mod.RegisterHelper;
import com.sebasti161.mod.blocks.ModBlocks;
import com.sebasti161.mod.items.ModItems;
import com.sebasti161.mod.recipes.ModRecipes;

@Mod(modid = PixelCore.MODID, version = PixelCore.VERSION)
public class PixelCore
{
    public static final String MODID = "pixelartblocks";
    public static final String VERSION = "1.0";
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		ModBlocks.loadBlocks();

		ModItems.loadItems();

		ModRecipes.addRecipes();
    }
	public static CreativeTabs tabPixel = new CreativeTabs("tabPixel") {
	    @Override
	    @SideOnly(Side.CLIENT)
	    public Item getTabIconItem() {
	        return ModItems.RedItem;
	    }
	};
}
	