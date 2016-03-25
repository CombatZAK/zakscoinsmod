package com.mods.combatzak.coins;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * CoinsMod registers mod information with FML
 * 
 * @author CombatZAK
 *
 */
@Mod(modid=CoinsMod.MODID, name=CoinsMod.MOD_NAME, version=CoinsMod.MOD_VERSION, dependencies=CoinsMod.DEPENDENCIES)
public class CoinsMod {
	public static final String MODID = "zakscoinsmod"; //unique mod id
	public static final String MOD_NAME = "Zak's Coins"; //friendly name
	public static final String MOD_VERSION = "0.0.1"; //mod version (major/minor/build)
	public static final String DEPENDENCIES = "required-after:ThermalFoundation;required-after:Thaumcraft;after:TConstruct"; //mod dependencies and load order
	
	@Instance
	public static CoinsMod instance; //singleton mod instance
	
	@SidedProxy(clientSide="com.mods.combatzak.coins.client.ClientProxy", serverSide="com.mods.combatzak.coins.CommonProxy")
	public static CommonProxy proxy; //proxy handle
	
	/**
	 * Handles the pre-init event
	 * 
	 * @param event args
	 */
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		proxy.preInit();
	}
	
	/**
	 * Handles the init event
	 * 
	 * @param event args
	 */
	@EventHandler
	public void load(FMLInitializationEvent event) {
		proxy.init();
	}
	
	/**
	 * Handles the post-init event
	 * 
	 * @param event args
	 * @throws IllegalAccessException 
	 * @throws IllegalArgumentException 
	 * @throws SecurityException 
	 * @throws NoSuchFieldException 
	 */
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		proxy.postInit();
	}
}
