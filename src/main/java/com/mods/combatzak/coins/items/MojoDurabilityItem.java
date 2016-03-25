package com.mods.combatzak.coins.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

/**
 * Represents an item with durability
 * 
 * @author CombatZAK
 *
 */
public class MojoDurabilityItem extends MojoItem {
	/**
	 * Default constructor
	 */
	public MojoDurabilityItem() {
		super();
		this.setMaxDamage(0);
		this.setMaxStackSize(1);
	}
	
	/**
	 * Creates a new MojoDurabilityItem instance
	 * 
	 * @param creativeTab tab on which item appears
	 * @param itemId unique id of item
	 * @param textureName item texture
	 * @param tooltip item information section
	 * @param maxDamage maximum damage item can take before breaking
	 */
	public MojoDurabilityItem(CreativeTabs creativeTab, String itemId, String textureName, String tooltip, int maxDamage) {
		super(1, creativeTab, itemId, textureName, tooltip);
		this.setMaxDamage(maxDamage);
	}
	
	/**
	 * When used in crafting recipe, item does not leave grid
	 */
	@Override
	public boolean doesContainerItemLeaveCraftingGrid(ItemStack par1ItemStack) {
		return false;
	}
	
	/**
	 * When used in crafting recipe item loses 1 durability
	 */
	@Override
	public ItemStack getContainerItem(ItemStack itemStack) {
		itemStack.setItemDamage(itemStack.getItemDamage() + 1);
		return itemStack;
	}
	
	/**
	 * Used to show that the item is a container for durability crafting
	 */
	@Override
	public boolean hasContainerItem(ItemStack stack) {
		return true;
	}
}
