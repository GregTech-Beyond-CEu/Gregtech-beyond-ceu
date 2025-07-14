import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;

PRIMITIVE_BLAST_FURNACE_RECIPES.recipeBuilder()
    .inputs(metaitem('ingotPigIron'))
    .inputs(item('minecraft:coal') * 2)
    .outputs(metaitem('ingotSteel'))
    .duration(200)
    .buildAndRegister();

PRIMITIVE_BLAST_FURNACE_RECIPES.recipeBuilder()
    .inputs(metaitem('ingotPigIron'))
    .inputs(metaitem('gemCoke'))
    .outputs(metaitem('ingotSteel'))
    .duration(200)
    .buildAndRegister();

PRIMITIVE_BLAST_FURNACE_RECIPES.recipeBuilder()
    .inputs(metaitem('ingotPigIron'))
    .inputs(metaitem('dustCoke'))
    .outputs(metaitem('ingotSteel'))
    .duration(200)
    .buildAndRegister();

PRIMITIVE_BLAST_FURNACE_RECIPES.recipeBuilder()
    .inputs(metaitem('ingotPigIron'))
    .inputs(metaitem('dustCoal')*2)
    .outputs(metaitem('ingotSteel'))
    .duration(200)
    .buildAndRegister();

PRIMITIVE_BLAST_FURNACE_RECIPES.recipeBuilder()
    .inputs(metaitem('ingotPigIron'))
    .inputs(item('minecraft:coal', 1)*2)
    .outputs(metaitem('ingotSteel'))
    .duration(200)
    .buildAndRegister();

PRIMITIVE_BLAST_FURNACE_RECIPES.recipeBuilder()
    .inputs(metaitem('ingotPigIron'))
    .inputs(metaitem('dustCharcoal')*2)
    .outputs(metaitem('ingotSteel'))
    .duration(200)
    .buildAndRegister();