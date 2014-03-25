package com.volcomrj.physicraft;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemPickaxe;

public class CustomPickaxe extends ItemPickaxe{
	
	public CustomPickaxe(ToolMaterial t,String name, int m)
	{
		super(t);
		
		setUnlocalizedName(name);
		setCreativeTab(Physicraft.tabPhysicraft);
		setTextureName("physicraft:"+name);
		setMaxStackSize(m);
		
		GameRegistry.registerItem(this, name);
	}
	
}