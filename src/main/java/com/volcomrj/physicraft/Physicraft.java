package com.volcomrj.physicraft;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Physicraft.MODID, name = "Physicraft",version = Physicraft.VERSION)
public class Physicraft {

	public static final String MODID = "physicraft";
    public static final String VERSION = "0.1";
    
	
    @SidedProxy(clientSide="com.volcomrj.physicraft.client.ClientProxy",serverSide="com.volcomrj.physicraft.CommonProxy")
    public static CommonProxy proxy;
    
	@Instance(value=MODID)
	public static Physicraft instance;
	
	public static Item copperIngot;
	public static Item tinIngot;
	public static Item bronzeIngot;
	
	public static Item bronzeAxe;
	public static Item bronzePickaxe;
	public static Item bronzeShovel;
	public static Item bronzeSword;
	public static Item bronzeHoe;
	
	public static Block copperBlock;
	public static Block copperOre;
	public static Block tinOre;
	
	public static CreativeTabs tabPhysicraft = new CreativeTabs("tabPhysicraft"){
		public Item getTabIconItem()
		{
			return copperIngot;
		}
	};
	
	public static final Item.ToolMaterial BRONZE = EnumHelper.addToolMaterial("BRONZE", 2, 192, 5.0F, 1.5F, 10);
	
	
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		
		copperIngot = new PhysicraftItem("copperIngot",64);
		tinIngot = new PhysicraftItem("tinIngot",64);
		bronzeIngot = new PhysicraftItem("bronzeIngot",64);
		
		copperBlock = new PhysicraftBlock(Material.iron,5,30,Block.soundTypeMetal,"copperBlock");
		copperOre = new PhysicraftBlock(Material.iron,3,15,Block.soundTypeMetal,"copperOre");
		tinOre = new PhysicraftBlock(Material.iron,3,15,Block.soundTypeMetal,"tinOre");
		
		bronzeAxe = new CustomAxe(BRONZE,"bronzeAxe",1);
		bronzePickaxe = new CustomPickaxe(BRONZE,"bronzePickaxe",1);
		bronzeShovel = new CustomShovel(BRONZE,"bronzeShovel",1);
		bronzeSword = new CustomSword(BRONZE,"bronzeSword",1);
		bronzeHoe = new CustomHoe(BRONZE,"bronzeSword",1);
		
		
		copperBlock.setHarvestLevel("pickaxe", 1);
		copperOre.setHarvestLevel("pickaxe",1);
		tinOre.setHarvestLevel("pickaxe",1);
		
		
		GameRegistry.addShapelessRecipe(new ItemStack(copperIngot,9),new ItemStack(copperBlock));
		GameRegistry.addShapelessRecipe(new ItemStack(bronzeIngot),new ItemStack(copperIngot),new ItemStack(tinIngot),new ItemStack(tinIngot),new ItemStack(tinIngot));
		
		GameRegistry.addRecipe(new ItemStack(copperBlock), "xxx","xxx","xxx",
				'x',new ItemStack(copperIngot));
		
		GameRegistry.addRecipe(new ItemStack(bronzeAxe), "xx " , "xy " , " y " ,
				'x' , new ItemStack(bronzeIngot) , 'y' , new ItemStack(Items.stick));
		GameRegistry.addRecipe(new ItemStack(bronzeAxe), " xx" , " yx" , " y " ,
				'x' , new ItemStack(bronzeIngot) , 'y' , new ItemStack(Items.stick));
		
		GameRegistry.addRecipe(new ItemStack(bronzePickaxe), "xxx" , " y " , " y " ,
				'x' , new ItemStack(bronzeIngot) , 'y' , new ItemStack(Items.stick));
		
		GameRegistry.addRecipe(new ItemStack(bronzeShovel)," x "," y "," y ",
				'x',new ItemStack(bronzeIngot),'y',new ItemStack(Items.stick));
		
		
		GameRegistry.addSmelting(copperOre, new ItemStack(copperIngot), 0.7F);
		GameRegistry.addSmelting(tinOre, new ItemStack(tinIngot), 0.7F);
		
		proxy.registerRenderers();
	}
	
    @EventHandler
	public void init(FMLInitializationEvent event){
		System.out.println("Initializing Physicraft v"+VERSION);
		
	}
    
    
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event){}
	
}
