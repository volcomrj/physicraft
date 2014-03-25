package com.volcomrj.physicraft;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemAxe;

public class CustomAxe extends ItemAxe{
	
	public CustomAxe(ToolMaterial t,String name, int m)
	{
		super(t);
		
		setUnlocalizedName(name);
		setCreativeTab(Physicraft.tabPhysicraft);
		setTextureName("physicraft:"+name);
		setMaxStackSize(m);
		
		GameRegistry.registerItem(this, name);
	}
	
}