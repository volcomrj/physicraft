package com.volcomrj.physicraft;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSpade;
import cpw.mods.fml.common.registry.GameRegistry;

public class CustomShovel extends ItemSpade{
	
	public CustomShovel(ToolMaterial t,String name, int m)
	{
		super(t);
		
		setUnlocalizedName(name);
		setCreativeTab(Physicraft.tabPhysicraft);
		setTextureName("physicraft:"+name);
		setMaxStackSize(m);
		
		GameRegistry.registerItem(this, name);
	}
	
}