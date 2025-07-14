import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;


crafting.addShaped("iron_furnace", item('ironfurnaces:iron_furnace_idle'), [[ore('plateIron'), ore('plateIron'), ore('plateIron')], [ore('plateIron'), item('minecraft:furnace'), ore('plateIron')], [ore('plateIron'), ore('plateIron'), ore('plateIron')]])
crafting.addShaped("gold_furnace", item('ironfurnaces:gold_furnace_idle'), [[ore('plateGold'), ore('plateGold'), ore('plateGold')], [ore('plateGold'), item('ironfurnaces:iron_furnace_idle'), ore('plateGold')], [ore('plateGold'), ore('plateGold'), ore('plateGold')]])
crafting.addShaped("diamond_furnace", item('ironfurnaces:diamond_furnace_idle'), [[ore('plateDiamond'), ore('plateDiamond'), ore('plateDiamond')], [ore('plateDiamond'), item('ironfurnaces:gold_furnace_idle'), ore('plateDiamond')], [ore('plateDiamond'), ore('plateDiamond'), ore('plateDiamond')]])
crafting.addShaped("glass_furnace", item('ironfurnaces:glass_furnace_idle'), [[ore('gemExquisiteGlass'), ore('plateGlass'), ore('gemExquisiteGlass')], [ore('plateGlass'), item('ironfurnaces:obsidian_furnace_idle'), ore('plateGlass')], [ore('gemExquisiteGlass'), ore('plateGlass'), ore('gemExquisiteGlass')]])
crafting.addShaped("obsidian", item('ironfurnaces:obsidian_furnace_idle'), [[ore('plateDenseObsidian'), ore('circuitHv'), ore('plateDenseObsidian')], [ore('plateDenseObsidian'), item('ironfurnaces:diamond_furnace_idle'), ore('plateDenseObsidian')], [ore('plateDenseObsidian'), ore('circuitHv'), ore('plateDenseObsidian')]])

crafting.remove('ironfurnaces:iron_furnace');
crafting.remove('ironfurnaces:gold_furnace');
crafting.remove('ironfurnaces:diamond_furnace');
crafting.remove('ironfurnaces:obsidian_furnace');
crafting.remove('ironfurnaces:glass_furnace');