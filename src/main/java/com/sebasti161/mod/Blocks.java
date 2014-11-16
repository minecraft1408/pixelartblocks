package com.sebasti161.mod;

import net.minecraft.block.Block;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

public class Blocks
{   
    public static Block RedBlock;
    public static Block GreenBlock;
    public static Block BrownBlock;
    public static Block LightBlueBlock;
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	RedBlock = new BlockRedBlock();
    	GreenBlock = new BlockGreenBlock();
    	BrownBlock = new BlockBrownBlock();
    	LightBlueBlock = new BlockLightBlueBlock();
    }
    {
    	//RegisterHelper.RegisterBlock(RedBlock);
    	//RegisterHelper.RegisterBlock(GreenBlock);
    	//RegisterHelper.RegisterBlock(BrownBlock);
    	//RegisterHelper.RegisterBlock(LightBlueBlock);
    	GameRegistry.registerBlock(RedBlock, "RedBlock");
        GameRegistry.registerBlock(GreenBlock, "GreenBlock");
        GameRegistry.registerBlock(BrownBlock, "BrownBlock");
        GameRegistry.registerBlock(LightBlueBlock, "LightBlueBlock");
    }
}