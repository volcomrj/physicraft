package com.volcomrj.physicraft;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class PhysicraftItem extends Item{

	public PhysicraftItem(String name,int m){
		super();
		
		setMaxStackSize(m);
		setCreativeTab(Physicraft.tabPhysicraft);
		setUnlocalizedName(name);
		setTextureName("physicraft:"+name);
		
		GameRegistry.registerItem(this, name);
	}
}
