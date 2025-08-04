import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;

CONTINOUS_STIRRING_TANK_REACTOR_RECIPES.recipeBuilder()
    .fluidInputs(fluid('ethylene_glycol')*2000)
    .inputs(metaitem('dustTerephthalicAcid')*20)
    .fluidOutputs(fluid('water')*2000)
    .fluidOutputs(fluid('bis_2_hydroxyethyl_terephthalate')*2000)
    .EUt(70)
    .duration(300)
    .buildAndRegister();

POLYMERIZATION_TANK_RECIPES.recipeBuilder()
    .fluidInputs(fluid('bis_2_hydroxyethyl_terephthalate')*1000)
    .fluidOutputs(fluid('low_molecular_weight_polyethylene_terephthalate')*1000)
    .EUt(50)
    .duration(200)
    .buildAndRegister();

FINAL_POLYCONDENSATION_REACTOR_RECIPES.recipeBuilder()
    .fluidInputs(fluid('low_molecular_weight_polyethylene_terephthalate')*1000)
    .fluidOutputs(fluid('high_molecular_weight_polyethylene_terephthalate')*1000)
    .fluidOutputs(fluid('ethylene_glycol')*1000)
    .EUt(50)
    .duration(200)
    .buildAndRegister();