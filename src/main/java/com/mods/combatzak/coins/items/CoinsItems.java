package com.mods.combatzak.coins.items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import thaumcraft.common.config.ConfigItems;

/**
 * Stores publicly usable references to items in the mod and registers them with the game
 *  
 * @author CombatZAK
 *
 */
public class CoinsItems {
	//holder for the coins, stacks and bags
	private static MojoMetaItem coinsItem = new MojoMetaItem(64, CreativeTabs.tabMisc, "coins", java.util.Arrays.asList(new String[] {
			"", "", "", //tooltips are used to make a count of items
			"", "", "", "",
			"",	"", "", ""
	}));
	
	//holder for the coin casts
	private static MojoMetaItem castItem = new MojoMetaItem(1, CreativeTabs.tabMisc, "casts", java.util.Arrays.asList(new String[] {
			"Casts a coin",
			"Casts a handful of coins\n(stacking at no additional charge)",
			"Casts a pile of coins\n(don't ask how they don't burn the bag)",
			"Casts a coin",
			"Casts a pile of coins\n(stacking at no additional charge)",
			"Casts a pile of coins\n(don't ask how they don't burn the bag)"
	}));
	
	//striking hammer
	private static MojoDurabilityItem hammerItem = new MojoDurabilityItem(CreativeTabs.tabTools, "strikeHammer", "zakscoins:strikeHammer", "Turns ingots into coins", 250);
	
	//Head for striking hammer
	private static MojoItem hammerHeadItem = new MojoItem(1, CreativeTabs.tabMisc, "hammerHead", "zakscoins:hammerHead", "");
	
	public static ItemStack coinCopper = new ItemStack(coinsItem, 1, 0); //copper coin
	public static ItemStack coinSilver = new ItemStack(coinsItem, 1, 1); //silver coin
	public static ItemStack coinGold = new ItemStack(ConfigItems.itemResource, 1, 18); //get the gold coin from Thaumcraft
	public static ItemStack coinPlatinum = new ItemStack(coinsItem, 1, 2); //platinum coin
	
	public static ItemStack stackCopper = new ItemStack(coinsItem, 1, 3); //copper stack
	public static ItemStack stackSilver = new ItemStack(coinsItem, 1, 4); //silver stack
	public static ItemStack stackGold = new ItemStack(coinsItem, 1, 5); //gold stack
	public static ItemStack stackPlatinum = new ItemStack(coinsItem, 1, 6); //platinum stack
	
	public static ItemStack bagCopper = new ItemStack(coinsItem, 1, 7); //copper bag
	public static ItemStack bagSilver = new ItemStack(coinsItem, 1, 8); //silver bag
	public static ItemStack bagGold = new ItemStack(coinsItem, 1, 9); //gold bag
	public static ItemStack bagPlatinum = new ItemStack(coinsItem, 1, 10); //platinum bag
	
	public static ItemStack strikeHammer = new ItemStack(hammerItem, 1, 0); //striking hammer
	public static ItemStack hammerHead = new ItemStack(hammerHeadItem, 1, 0); //hammer head
	
	public static ItemStack castCoinAlubrass = new ItemStack(castItem, 1, 0); //coin cast aluminum brass
	public static ItemStack castStackAlubrass = new ItemStack(castItem, 1, 1); //stack cast aluminum brass
	public static ItemStack castBagAlubrass = new ItemStack(castItem, 1, 2); //bag cast aluminum brass
	public static ItemStack castCoinGold = new ItemStack(castItem, 1, 3); //coin cast gold
	public static ItemStack castStackGold = new ItemStack(castItem, 1, 4); //stack cast gold
	public static ItemStack castBagGold = new ItemStack(castItem, 1, 5); //bag cast gold
	
	/**
	 * Registers the items with minecraft
	 */
	public static void registerItems() {
		hammerItem.setNoRepair();
		GameRegistry.registerItem(coinsItem, coinsItem.getItemId());
		GameRegistry.registerItem(hammerItem, hammerItem.getItemId());
		GameRegistry.registerItem(hammerHeadItem, hammerHeadItem.getItemId());
		
		GameRegistry.registerItem(castItem, castItem.getItemId());
	}
}
