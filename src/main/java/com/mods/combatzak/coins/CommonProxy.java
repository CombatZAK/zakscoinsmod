package com.mods.combatzak.coins;

import com.mods.combatzak.coins.items.CoinsItems;
import com.mods.combatzak.coins.recipes.RecipeHandler;

import cpw.mods.fml.common.Loader;

/**
 * Performs environment-specific actions for CoinsMod; also currently acts as a server-side proxy
 * 
 * @author CombatZAK
 *
 */
public class CommonProxy {
	/**
	 * Run during pre-initialization
	 */
	public void preInit() {
		CoinsItems.registerItems(); //register the items
	}
	
	/**
	 * Run during initialization
	 */
	public void init() {
		RecipeHandler.registerRecipes(); //register new recipes
	}
	
	/**
	 * Run during post-initialization
	 */
	public void postInit() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		RecipeHandler.deregisterGoldCoin(); //removes the gold coin from the ore dictionary
		if (Loader.isModLoaded("TConstruct")) RecipeHandler.addTConstructRecipes();
	}
}
