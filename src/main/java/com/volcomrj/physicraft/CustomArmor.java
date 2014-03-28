package com.volcomrj.physicraft;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class CustomArmor extends ItemArmor{

	public CustomArmor(ArmorMaterial p_i45325_1_, int p_i45325_2_,
			int p_i45325_3_) {
		super(p_i45325_1_, p_i45325_2_, p_i45325_3_);
	}
	
	/*public String getArmorTexture(ItemStack stack,Entity entity, int slot, String type){
		
		if(stack.getItem()==Physicraft.bronzeHelmet||stack.getItem()==Physicraft.bronzePlate||stack.getItem()==Physicraft.bronzeBoots){
			
			return "physicraft:textures/armor/BronzeArmor1.png";
		} else if(stack.getItem()==Physicraft.bronzePants){
			return "physicraft:textures/armor/BronzeArmor2.png";
		} else{
			return null;
		}
		
	}*/

}
