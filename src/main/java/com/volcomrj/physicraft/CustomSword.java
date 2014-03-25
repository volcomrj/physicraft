package com.volcomrj.physicraft;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemSword;

public class CustomSword extends ItemSword{
	
	public CustomSword(ToolMaterial t,String name, int m)
	{
		super(t);
		
		setUnlocalizedName(name);
		setCreativeTab(Physicraft.tabPhysicraft);
		setTextureName("physicraft:"+name);
		setMaxStackSize(m);
		
		GameRegistry.registerItem(this, name);
	}
	
}