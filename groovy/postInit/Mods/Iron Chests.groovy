import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;

crafting.addShaped("copper_chest", item('ironchest:iron_chest', 3), [
[ore('plateCopper'), ore('plateCopper'), ore('plateCopper')], 
[ore('plateCopper'), item('minecraft:chest'), ore('plateCopper')], 
[ore('plateCopper'), ore('plateCopper'), ore('plateCopper')]
])