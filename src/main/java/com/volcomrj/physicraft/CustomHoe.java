package com.volcomrj.physicraft;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemHoe;

public class CustomHoe extends ItemHoe{
	
	public CustomHoe(ToolMaterial t,String name, int m)
	{
		super(t);
		
		setUnlocalizedName(name);
		setCreativeTab(Physicraft.tabPhysicraft);
		setTextureName("physicraft:"+name);
		setMaxStackSize(m);
		
		GameRegistry.registerItem(this, name);
	}
	
}