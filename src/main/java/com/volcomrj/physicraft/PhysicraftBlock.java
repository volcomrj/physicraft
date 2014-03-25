package com.volcomrj.physicraft;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class PhysicraftBlock extends Block{
	
	public PhysicraftBlock(Material m, int h, int r,SoundType s, String name) {
		super(m);
		
		setHardness(h);
		setResistance(r);
		setStepSound(s);
		setCreativeTab(Physicraft.tabPhysicraft);
		setBlockName(name);
		setBlockTextureName("physicraft:"+name);
		
		GameRegistry.registerBlock(this, name);
	}
	
}

