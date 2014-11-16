package com.sebasti161.mod.items;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

import com.sebasti161.mod.RegisterHelper;

public class ModItems 
{
    //non-functional items.
	public static Item RedItem;
	
	//Tools
	//public static Item Pickaxe;
	//public static Item Axe;
		

    /**
     * We call this in our main mod file.
     * We add all items here to the game.
     */
	public static void loadItems()
	{
		RedItem = new ItemRedBlock();
		
		RegisterHelper.registerItem(RedItem);

	}
}