package com.sebasti161.mod.blocks;

import net.minecraft.block.Block;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import com.sebasti161.mod.RegisterHelper;

public class ModBlocks
{   
    public static Block redBlock;
    public static Block greenBlock;
    public static Block brownBlock;
    public static Block lightBlueBlock;
    public static Block blackBlock;
    public static Block blueBlock;
    public static Block yellowBlock;
    public static Block whiteBlock;
    public static Block darkGreenBlock;
    public static Block orangeBlock;
    public static Block darkBlueBlock;
    public static Block oneBlock;
    public static Block cyanBlock;
    public static Block limeBlock;
    public static Block purpleBlock;
    public static Block greenBlock2;
    public static Block pinkBlock;
    
    public static void loadBlocks()
    {	
    	redBlock = new BlockRedBlock();
    	greenBlock = new BlockGreenBlock();
    	brownBlock = new BlockBrownBlock();
    	lightBlueBlock = new BlockLightBlueBlock();
    	blackBlock = new BlockBlackBlock();
    	blueBlock = new BlockBlueBlock();
    	yellowBlock = new BlockYellowBlock();
    	whiteBlock = new BlockWhiteBlock();
    	darkGreenBlock = new BlockDarkGreenBlock();
    	orangeBlock = new BlockOrangeBlock();
    	darkBlueBlock = new BlockDarkBlueBlock();
    	oneBlock = new BlockOneBlock();
    	cyanBlock = new BlockCyanBlock();
    	limeBlock = new BlockLimeBlock();
    	purpleBlock = new BlockPurpleBlock();
    	greenBlock2 = new BlockGreen2Block();
    	pinkBlock = new BlockPinkBlock();
    	
    	RegisterHelper.RegisterBlock(redBlock);
    	RegisterHelper.RegisterBlock(greenBlock);
    	RegisterHelper.RegisterBlock(brownBlock);
    	RegisterHelper.RegisterBlock(lightBlueBlock);
    	RegisterHelper.RegisterBlock(blackBlock);
    	RegisterHelper.RegisterBlock(blueBlock);
    	RegisterHelper.RegisterBlock(yellowBlock);
    	RegisterHelper.RegisterBlock(whiteBlock);
    	RegisterHelper.RegisterBlock(darkGreenBlock);
    	RegisterHelper.RegisterBlock(orangeBlock);
    	RegisterHelper.RegisterBlock(darkBlueBlock);
    	RegisterHelper.RegisterBlock(oneBlock);
    	RegisterHelper.RegisterBlock(cyanBlock);
    	RegisterHelper.RegisterBlock(limeBlock);
    	RegisterHelper.RegisterBlock(purpleBlock);
    	RegisterHelper.RegisterBlock(greenBlock2);
    	RegisterHelper.RegisterBlock(pinkBlock);
    }
}