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
    }
}