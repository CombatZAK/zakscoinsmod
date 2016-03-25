package com.mods.combatzak.coins.recipes;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import com.mods.combatzak.coins.items.CoinsItems;

import cofh.thermalfoundation.block.TFBlocks;
import cofh.thermalfoundation.item.TFItems;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import tconstruct.library.TConstructRegistry;
import tconstruct.library.crafting.CastingRecipe;
import tconstruct.library.crafting.LiquidCasting;
import tconstruct.library.crafting.Smeltery;
import tconstruct.smeltery.TinkerSmeltery;
import tconstruct.world.TinkerWorld;

/**
 * Registers new recipes with the game
 * 
 * @author CombatZAK
 *
 */
public class RecipeHandler {
	public static void registerRecipes() {
		GameRegistry.addShapelessRecipe(TFItems.nuggetCopper, CoinsItems.coinCopper, CoinsItems.coinCopper);
		GameRegistry.addShapelessRecipe(TFItems.nuggetSilver, CoinsItems.coinSilver, CoinsItems.coinSilver);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.gold_nugget), CoinsItems.coinGold, CoinsItems.coinGold);
		GameRegistry.addShapelessRecipe(TFItems.nuggetPlatinum, CoinsItems.coinPlatinum, CoinsItems.coinPlatinum);
		
		GameRegistry.addShapelessRecipe(CoinsItems.stackCopper, 
				CoinsItems.coinCopper,
				CoinsItems.coinCopper,
				CoinsItems.coinCopper,
				CoinsItems.coinCopper,
				CoinsItems.coinCopper,
				CoinsItems.coinCopper,
				CoinsItems.coinCopper,
				CoinsItems.coinCopper,
				CoinsItems.coinCopper);
		
		GameRegistry.addShapelessRecipe(CoinsItems.stackSilver, 
				CoinsItems.coinSilver,
				CoinsItems.coinSilver,
				CoinsItems.coinSilver,
				CoinsItems.coinSilver,
				CoinsItems.coinSilver,
				CoinsItems.coinSilver,
				CoinsItems.coinSilver,
				CoinsItems.coinSilver,
				CoinsItems.coinSilver);
		
		GameRegistry.addShapelessRecipe(CoinsItems.stackGold, 
				CoinsItems.coinGold,
				CoinsItems.coinGold,
				CoinsItems.coinGold,
				CoinsItems.coinGold,
				CoinsItems.coinGold,
				CoinsItems.coinGold,
				CoinsItems.coinGold,
				CoinsItems.coinGold,
				CoinsItems.coinGold);
		
		GameRegistry.addShapelessRecipe(CoinsItems.stackPlatinum,
				CoinsItems.coinPlatinum,
				CoinsItems.coinPlatinum,
				CoinsItems.coinPlatinum,
				CoinsItems.coinPlatinum,
				CoinsItems.coinPlatinum,
				CoinsItems.coinPlatinum,
				CoinsItems.coinPlatinum,
				CoinsItems.coinPlatinum,
				CoinsItems.coinPlatinum);
		
		GameRegistry.addShapelessRecipe(CoinsItems.bagCopper,
				CoinsItems.stackCopper,
				CoinsItems.stackCopper,
				CoinsItems.stackCopper,
				CoinsItems.stackCopper,
				CoinsItems.stackCopper,
				CoinsItems.stackCopper,
				CoinsItems.stackCopper,
				CoinsItems.stackCopper,
				CoinsItems.stackCopper);
		
		GameRegistry.addShapelessRecipe(CoinsItems.bagSilver,
				CoinsItems.stackSilver,
				CoinsItems.stackSilver,
				CoinsItems.stackSilver,
				CoinsItems.stackSilver,
				CoinsItems.stackSilver,
				CoinsItems.stackSilver,
				CoinsItems.stackSilver,
				CoinsItems.stackSilver,
				CoinsItems.stackSilver);
		
		GameRegistry.addShapelessRecipe(CoinsItems.bagGold,
				CoinsItems.stackGold,
				CoinsItems.stackGold,
				CoinsItems.stackGold,
				CoinsItems.stackGold,
				CoinsItems.stackGold,
				CoinsItems.stackGold,
				CoinsItems.stackGold,
				CoinsItems.stackGold,
				CoinsItems.stackGold);
		
		GameRegistry.addShapelessRecipe(CoinsItems.bagPlatinum,
				CoinsItems.stackPlatinum,
				CoinsItems.stackPlatinum,
				CoinsItems.stackPlatinum,
				CoinsItems.stackPlatinum,
				CoinsItems.stackPlatinum,
				CoinsItems.stackPlatinum,
				CoinsItems.stackPlatinum,
				CoinsItems.stackPlatinum,
				CoinsItems.stackPlatinum);
		
		ItemStack stack = CoinsItems.coinCopper.copy();
		stack.stackSize = 9;
		GameRegistry.addShapelessRecipe(stack, CoinsItems.stackCopper);
		
		stack = CoinsItems.coinSilver.copy();
		stack.stackSize = 9;
		GameRegistry.addShapelessRecipe(stack, CoinsItems.stackSilver);
		
		stack = CoinsItems.coinGold.copy();
		stack.stackSize = 9;
		GameRegistry.addShapelessRecipe(stack, CoinsItems.stackGold);;
		
		stack = CoinsItems.coinPlatinum.copy();
		stack.stackSize = 9;
		GameRegistry.addShapelessRecipe(stack, CoinsItems.stackPlatinum);
		
		stack = CoinsItems.stackCopper.copy();
		stack.stackSize = 9;
		GameRegistry.addShapelessRecipe(stack, CoinsItems.bagCopper);
		
		stack = CoinsItems.stackSilver.copy();
		stack.stackSize = 9;
		GameRegistry.addShapelessRecipe(stack, CoinsItems.bagSilver);
		
		stack = CoinsItems.stackGold.copy();
		stack.stackSize = 9;
		GameRegistry.addShapelessRecipe(stack, CoinsItems.bagGold);
		
		stack = CoinsItems.stackPlatinum.copy();
		stack.stackSize = 9;
		GameRegistry.addShapelessRecipe(stack, CoinsItems.bagPlatinum);
		
		ShapedOreRecipe recipe = new ShapedOreRecipe(CoinsItems.hammerHead, "ili", "ili", 'i', Items.iron_ingot, 'l', "ingotLead");
		GameRegistry.addRecipe(recipe);
		
		GameRegistry.addShapedRecipe(CoinsItems.strikeHammer, "  h", " s ", "s  ", 'h', CoinsItems.hammerHead, 's', Items.stick);
		
		stack = CoinsItems.coinCopper.copy();
		stack.stackSize = 8;
		ItemStack hammerStack = CoinsItems.strikeHammer.copy();
		hammerStack.setItemDamage(OreDictionary.WILDCARD_VALUE);
		GameRegistry.addRecipe(new ShapelessOreRecipe(stack, "ingotCopper", hammerStack));
		
		stack = CoinsItems.coinSilver.copy();
		stack.stackSize = 8;
		GameRegistry.addRecipe(new ShapelessOreRecipe(stack, "ingotSilver", hammerStack));
		
		stack = CoinsItems.coinGold.copy();
		stack.stackSize = 8;
		GameRegistry.addShapelessRecipe(stack, Items.gold_ingot, hammerStack);
		
		stack = CoinsItems.coinPlatinum.copy();
		stack.stackSize = 8;
		GameRegistry.addRecipe(new ShapelessOreRecipe(stack, "ingotPlatinum", hammerStack));
	}
	
	/**
	 * Removes the gold coin from the ore dictionary
	 * 
	 * @throws SecurityException 
	 * @throws NoSuchFieldException 
	 * @throws IllegalAccessException 
	 * @throws IllegalArgumentException 
	 */
	public static void deregisterGoldCoin() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		Field idToStack = OreDictionary.class.getDeclaredField("idToStack"); //get the field
		idToStack.setAccessible(true); //unlock it
		List<ArrayList<ItemStack>> entries = (List<ArrayList<ItemStack>>)idToStack.get(null);
		ArrayList<ItemStack> nuggetEntry = entries.get(OreDictionary.getOreID("nuggetGold"));
		ItemStack result = null;
		for (ItemStack check : nuggetEntry) {
			if (check.isItemEqual(CoinsItems.coinGold)) {
				result = check;
				break;
			}
		}
		
		if (result != null) nuggetEntry.remove(result);
	}
	
	public static void addTConstructRecipes() {
		//melt down coins/stacks/bags
		Smeltery.addMelting(CoinsItems.coinCopper, TFBlocks.blockStorage, 0, 450, new FluidStack(TinkerSmeltery.moltenCopperFluid, 8));
		Smeltery.addMelting(CoinsItems.coinSilver, TFBlocks.blockStorage, 2, 300, new FluidStack(TinkerSmeltery.moltenSilverFluid, 8));
		Smeltery.addMelting(CoinsItems.coinGold, Blocks.gold_block, 0, 300, new FluidStack(TinkerSmeltery.moltenGoldFluid, 8));
		Smeltery.addMelting(CoinsItems.coinPlatinum, TFBlocks.blockStorage, 5, 300, new FluidStack(TinkerSmeltery.moltenShinyFluid, 8));
		
		Smeltery.addMelting(CoinsItems.stackCopper, TFBlocks.blockStorage, 0, 500, new FluidStack(TinkerSmeltery.moltenCopperFluid, 72));
		Smeltery.addMelting(CoinsItems.stackSilver, TFBlocks.blockStorage, 2, 350, new FluidStack(TinkerSmeltery.moltenSilverFluid, 72));
		Smeltery.addMelting(CoinsItems.stackGold, Blocks.gold_block, 0, 350, new FluidStack(TinkerSmeltery.moltenGoldFluid, 72));
		Smeltery.addMelting(CoinsItems.stackPlatinum, TFBlocks.blockStorage, 5, 350, new FluidStack(TinkerSmeltery.moltenShinyFluid, 72));
		
		Smeltery.addMelting(CoinsItems.bagCopper, TFBlocks.blockStorage, 0, 650, new FluidStack(TinkerSmeltery.moltenCopperFluid, 648));
		Smeltery.addMelting(CoinsItems.bagSilver, TFBlocks.blockStorage, 2, 500, new FluidStack(TinkerSmeltery.moltenSilverFluid, 648));
		Smeltery.addMelting(CoinsItems.bagGold, Blocks.gold_block, 0, 500, new FluidStack(TinkerSmeltery.moltenGoldFluid, 648));
		Smeltery.addMelting(CoinsItems.bagPlatinum, TFBlocks.blockStorage, 5, 500, new FluidStack(TinkerSmeltery.moltenShinyFluid, 648));
		
		Smeltery.addMelting(CoinsItems.castCoinAlubrass, TinkerWorld.metalBlock, 7, 300, new FluidStack(TinkerSmeltery.moltenAlubrassFluid, 144));
		Smeltery.addMelting(CoinsItems.castCoinGold, Blocks.gold_block, 0, 350, new FluidStack(TinkerSmeltery.moltenGoldFluid, 288));
		Smeltery.addMelting(CoinsItems.castStackAlubrass, TinkerWorld.metalBlock, 7, 300, new FluidStack(TinkerSmeltery.moltenAlubrassFluid, 144));
		Smeltery.addMelting(CoinsItems.castStackGold, Blocks.gold_block, 0, 350, new FluidStack(TinkerSmeltery.moltenGoldFluid, 288));
		Smeltery.addMelting(CoinsItems.castBagAlubrass, TinkerWorld.metalBlock, 7, 300, new FluidStack(TinkerSmeltery.moltenAlubrassFluid, 144));
		Smeltery.addMelting(CoinsItems.castBagGold, Blocks.gold_block, 0, 350, new FluidStack(TinkerSmeltery.moltenGoldFluid, 288));
		
		LiquidCasting tableRecipes = TConstructRegistry.getTableCasting();
		ArrayList<CastingRecipe> matches = new ArrayList<CastingRecipe>(), list = tableRecipes.getCastingRecipes();
		for (CastingRecipe recipe : list) { //gets all gold coin casts
			if (recipe.cast == null) continue;
			if (recipe.cast.isItemEqual(CoinsItems.coinGold)) matches.add(recipe);
		}
		
		for (CastingRecipe recipe : matches) { //removes them
			list.remove(recipe);
		}
		
		tableRecipes.addCastingRecipe(CoinsItems.coinCopper, new FluidStack(TinkerSmeltery.moltenCopperFluid, 18), CoinsItems.castCoinAlubrass, 50);
		tableRecipes.addCastingRecipe(CoinsItems.coinSilver, new FluidStack(TinkerSmeltery.moltenSilverFluid, 18), CoinsItems.castCoinAlubrass, 50);
		tableRecipes.addCastingRecipe(CoinsItems.coinGold, new FluidStack(TinkerSmeltery.moltenGoldFluid, 18), CoinsItems.castCoinAlubrass, 50);
		tableRecipes.addCastingRecipe(CoinsItems.coinPlatinum, new FluidStack(TinkerSmeltery.moltenShinyFluid, 18), CoinsItems.castCoinAlubrass, 50);
		tableRecipes.addCastingRecipe(CoinsItems.coinCopper, new FluidStack(TinkerSmeltery.moltenCopperFluid, 18), CoinsItems.castCoinGold, 50);
		tableRecipes.addCastingRecipe(CoinsItems.coinSilver, new FluidStack(TinkerSmeltery.moltenSilverFluid, 18), CoinsItems.castCoinGold, 50);
		tableRecipes.addCastingRecipe(CoinsItems.coinGold, new FluidStack(TinkerSmeltery.moltenGoldFluid, 18), CoinsItems.castCoinGold, 50);
		tableRecipes.addCastingRecipe(CoinsItems.coinPlatinum, new FluidStack(TinkerSmeltery.moltenShinyFluid, 18), CoinsItems.castCoinGold, 50);
		
		tableRecipes.addCastingRecipe(CoinsItems.stackCopper, new FluidStack(TinkerSmeltery.moltenCopperFluid, 162), CoinsItems.castStackAlubrass, 50);
		tableRecipes.addCastingRecipe(CoinsItems.stackSilver, new FluidStack(TinkerSmeltery.moltenSilverFluid, 162), CoinsItems.castStackAlubrass, 50);
		tableRecipes.addCastingRecipe(CoinsItems.stackGold, new FluidStack(TinkerSmeltery.moltenGoldFluid, 162), CoinsItems.castStackAlubrass, 50);
		tableRecipes.addCastingRecipe(CoinsItems.stackPlatinum, new FluidStack(TinkerSmeltery.moltenShinyFluid, 18), CoinsItems.castStackAlubrass, 50);
		tableRecipes.addCastingRecipe(CoinsItems.stackCopper, new FluidStack(TinkerSmeltery.moltenCopperFluid, 162), CoinsItems.castStackGold, 50);
		tableRecipes.addCastingRecipe(CoinsItems.stackSilver, new FluidStack(TinkerSmeltery.moltenSilverFluid, 162), CoinsItems.castStackGold, 50);
		tableRecipes.addCastingRecipe(CoinsItems.stackGold, new FluidStack(TinkerSmeltery.moltenGoldFluid, 162), CoinsItems.castStackGold, 50);
		tableRecipes.addCastingRecipe(CoinsItems.stackPlatinum, new FluidStack(TinkerSmeltery.moltenShinyFluid, 18), CoinsItems.castStackGold, 50);
		
		tableRecipes.addCastingRecipe(CoinsItems.bagCopper, new FluidStack(TinkerSmeltery.moltenCopperFluid, 1458), CoinsItems.castBagAlubrass, 50);
		tableRecipes.addCastingRecipe(CoinsItems.bagSilver, new FluidStack(TinkerSmeltery.moltenSilverFluid, 1458), CoinsItems.castBagAlubrass, 50);
		tableRecipes.addCastingRecipe(CoinsItems.bagGold, new FluidStack(TinkerSmeltery.moltenGoldFluid, 1458), CoinsItems.castBagAlubrass, 50);
		tableRecipes.addCastingRecipe(CoinsItems.bagPlatinum, new FluidStack(TinkerSmeltery.moltenShinyFluid, 1458), CoinsItems.castBagAlubrass, 50);
		tableRecipes.addCastingRecipe(CoinsItems.bagCopper, new FluidStack(TinkerSmeltery.moltenCopperFluid, 1458), CoinsItems.castBagGold, 50);
		tableRecipes.addCastingRecipe(CoinsItems.bagSilver, new FluidStack(TinkerSmeltery.moltenSilverFluid, 1458), CoinsItems.castBagGold, 50);
		tableRecipes.addCastingRecipe(CoinsItems.bagGold, new FluidStack(TinkerSmeltery.moltenGoldFluid, 1458), CoinsItems.castBagGold, 50);
		tableRecipes.addCastingRecipe(CoinsItems.bagPlatinum, new FluidStack(TinkerSmeltery.moltenShinyFluid, 1458), CoinsItems.castBagGold, 50);
		
		tableRecipes.addCastingRecipe(CoinsItems.castCoinGold, new FluidStack(TinkerSmeltery.moltenGoldFluid, 288), CoinsItems.coinCopper, 50);
		tableRecipes.addCastingRecipe(CoinsItems.castCoinGold, new FluidStack(TinkerSmeltery.moltenGoldFluid, 288), CoinsItems.coinSilver, 50);
		tableRecipes.addCastingRecipe(CoinsItems.castCoinGold, new FluidStack(TinkerSmeltery.moltenGoldFluid, 288), CoinsItems.coinGold, 50);
		tableRecipes.addCastingRecipe(CoinsItems.castCoinGold,  new FluidStack(TinkerSmeltery.moltenGoldFluid, 288), CoinsItems.coinPlatinum, 50);		
		tableRecipes.addCastingRecipe(CoinsItems.castCoinAlubrass, new FluidStack(TinkerSmeltery.moltenAlubrassFluid, 144), CoinsItems.coinCopper, 50);
		tableRecipes.addCastingRecipe(CoinsItems.castCoinAlubrass, new FluidStack(TinkerSmeltery.moltenAlubrassFluid, 144), CoinsItems.coinSilver, 50);
		tableRecipes.addCastingRecipe(CoinsItems.castCoinAlubrass, new FluidStack(TinkerSmeltery.moltenAlubrassFluid, 144), CoinsItems.coinGold, 50);
		tableRecipes.addCastingRecipe(CoinsItems.castCoinAlubrass,  new FluidStack(TinkerSmeltery.moltenAlubrassFluid, 144), CoinsItems.coinPlatinum, 50);
		
		tableRecipes.addCastingRecipe(CoinsItems.castStackGold, new FluidStack(TinkerSmeltery.moltenGoldFluid, 288), CoinsItems.stackCopper, 50);
		tableRecipes.addCastingRecipe(CoinsItems.castStackGold, new FluidStack(TinkerSmeltery.moltenGoldFluid, 288), CoinsItems.stackSilver, 50);
		tableRecipes.addCastingRecipe(CoinsItems.castStackGold, new FluidStack(TinkerSmeltery.moltenGoldFluid, 288), CoinsItems.stackGold, 50);
		tableRecipes.addCastingRecipe(CoinsItems.castStackGold,  new FluidStack(TinkerSmeltery.moltenGoldFluid, 288), CoinsItems.stackPlatinum, 50);		
		tableRecipes.addCastingRecipe(CoinsItems.castStackAlubrass, new FluidStack(TinkerSmeltery.moltenAlubrassFluid, 144), CoinsItems.stackCopper, 50);
		tableRecipes.addCastingRecipe(CoinsItems.castStackAlubrass, new FluidStack(TinkerSmeltery.moltenAlubrassFluid, 144), CoinsItems.stackSilver, 50);
		tableRecipes.addCastingRecipe(CoinsItems.castStackAlubrass, new FluidStack(TinkerSmeltery.moltenAlubrassFluid, 144), CoinsItems.stackGold, 50);
		tableRecipes.addCastingRecipe(CoinsItems.castStackAlubrass,  new FluidStack(TinkerSmeltery.moltenAlubrassFluid, 144), CoinsItems.stackPlatinum, 50);
		
		tableRecipes.addCastingRecipe(CoinsItems.castBagGold, new FluidStack(TinkerSmeltery.moltenGoldFluid, 288), CoinsItems.bagCopper, 50);
		tableRecipes.addCastingRecipe(CoinsItems.castBagGold, new FluidStack(TinkerSmeltery.moltenGoldFluid, 288), CoinsItems.bagSilver, 50);
		tableRecipes.addCastingRecipe(CoinsItems.castBagGold, new FluidStack(TinkerSmeltery.moltenGoldFluid, 288), CoinsItems.bagGold, 50);
		tableRecipes.addCastingRecipe(CoinsItems.castBagGold,  new FluidStack(TinkerSmeltery.moltenGoldFluid, 288), CoinsItems.bagPlatinum, 50);		
		tableRecipes.addCastingRecipe(CoinsItems.castBagAlubrass, new FluidStack(TinkerSmeltery.moltenAlubrassFluid, 144), CoinsItems.bagCopper, 50);
		tableRecipes.addCastingRecipe(CoinsItems.castBagAlubrass, new FluidStack(TinkerSmeltery.moltenAlubrassFluid, 144), CoinsItems.bagSilver, 50);
		tableRecipes.addCastingRecipe(CoinsItems.castBagAlubrass, new FluidStack(TinkerSmeltery.moltenAlubrassFluid, 144), CoinsItems.bagGold, 50);
		tableRecipes.addCastingRecipe(CoinsItems.castBagAlubrass,  new FluidStack(TinkerSmeltery.moltenAlubrassFluid, 144), CoinsItems.bagPlatinum, 50);
	}
}
