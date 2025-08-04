import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;


STIRRED_TANK_REACTOR_RECIPES.recipeBuilder()
    .fluidInputs(fluid('bisphenol_a') * 1000)
    .fluidInputs(fluid('sodium_hydroxide_solution')*1000)
    .fluidOutputs(fluid('water')*3000)
    .fluidOutputs(fluid('bisphenolate_dianion') * 1000)
    .EUt(180)
    .duration(300)
    .buildAndRegister();

MIXER_SETTLER_REACTOR_RECIPES.recipeBuilder()
    .fluidInputs(fluid('bisphenolate_dianion') * 1000)
    .fluidOutputs(fluid('bisphenol_a_dianion')*1000)
    .fluidInputs(fluid('phosgene')*1000)
    .fluidOutputs(fluid('chlorine')*2000)
    .EUt(180)
    .duration(300)
    .buildAndRegister();

TRICKLE_BED_REACTOR_RECIPES.recipeBuilder()
    .fluidInputs(fluid('bisphenol_a_dianion')*1000)
    .fluidInputs(fluid('dichloromethane')*1000)
    .fluidOutputs(fluid('lexan_polymer_backbone')*1000)
    .EUt(180)
    .duration(300)
    .buildAndRegister();

POLYMERIZATION_TANK_RECIPES.recipeBuilder()
    .fluidInputs(fluid('lexan_polymer_backbone')*1000)
    .fluidOutputs(fluid('lexan_post_polymerization_mixture')*1000)
    .EUt(180)
    .duration(300)
    .buildAndRegister();

PHASE_SEPARATOR_RECIPES.recipeBuilder()
    .fluidInputs(fluid('lexan_post_polymerization_mixture')*1000)
    .fluidOutputs(fluid('lexan')*1000)
    .fluidOutputs(fluid('dichloromethane')*1000)
    .EUt(180)
    .duration(300)
    .buildAndRegister();