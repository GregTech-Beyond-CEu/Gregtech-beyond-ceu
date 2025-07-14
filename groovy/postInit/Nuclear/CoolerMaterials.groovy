import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;

//FLiBe

MIXER_RECIPES.recipeBuilder()
    .fluidInputs(fluid('high_purity_lithium_fluoride')*1000)
    .fluidInputs(fluid('high_purity_beryllium_fluoride')*1000)
    .fluidOutputs(fluid('f_li_be')*1000)
    .EUt(500)
    .duration(400)
    .buildAndRegister();

CHEMICAL_BATH_RECIPES.recipeBuilder()
    .fluidInputs(fluid('acetone')*100)
    .inputs(metaitem('dustLithiumFluoride'))
    .outputs(metaitem('dustWashedLithiumFluoride'))
    .EUt(200)
    .duration(500)
    .buildAndRegister();

ADVANCED_CRUCIBLE_RECIPES.recipeBuilder()
    .inputs(metaitem('dustWashedLithiumFluoride'))
    .fluidOutputs(fluid('lithium_fluoride')*1000)
    .EUt(200)
    .duration(500)
    .buildAndRegister();

CRUCIBLE_RECIPES.recipeBuilder()
    .fluidInputs(fluid('lithium_fluoride')*1000)
    .outputs(metaitem('dustHighPurityLithiumFluoride'))
    .EUt(400)
    .duration(400)
    .buildAndRegister();

//3M Novec

ELECTROCHEMICAL_CELL_RECIPES.recipeBuilder()
    .fluidInputs(fluid('butane')*1000)
    .fluidInputs(fluid('hydrofluoric_acid')*10000)
    .fluidOutputs(fluid('perfluorinated_alkane_solution')*1000)
    .fluidOutputs(fluid('hydrogen')*10000)
    .EUt(400)
    .duration(400)
    .buildAndRegister();

DISTILLATION_RECIPES.recipeBuilder()
    .fluidInputs(fluid('perfluorinated_alkane_solution')*1000)
    .fluidOutputs(fluid('perfluorobutane')*600)
    .fluidOutputs(fluid('perfluoropropane')*300)
    .fluidOutputs(fluid('perfluoropentane')*100)
    .EUt(400)
    .duration(400)
    .buildAndRegister();

UV_LIGHT_RECIPES.recipeBuilder()
    .fluidInputs(fluid('perfluorobutane')*1000)
    .inputs(metaitem('dustIodine')*2)
    .fluidOutputs(fluid('hydrofluoric_acid')*1000)
    .fluidOutputs(fluid('perfluorobutyl_iodide')*1000)
    .EUt(500)
    .duration(300)
    .buildAndRegister();

CHEMICAL_RECIPES.recipeBuilder()
    .fluidInputs(fluid('perfluorobutyl_iodide')*1000)
    .inputs(metaitem('dustSodiumHydroxide'))
    .outputs(metaitem('dustHydrogenIodide'))
    .fluidOutputs(fluid('perfluorobutoxide')*1000)
    .EUt(300)
    .duration(350)
    .buildAndRegister();

TRICKLE_BED_REACTOR_RECIPES.recipeBuilder()
    .fluidInputs(fluid('perfluorobutoxide')*1000)
    .fluidOutputs(fluid('novec_solution') * 1000)
    .fluidInputs(fluid('methyl_iodide') * 1000)
    .EUt(400)
    .duration(200)
    .buildAndRegister();

FLASH_CHROMATOGRAPHY_RECIPES.recipeBuilder()
    .fluidInputs(fluid('novec_solution')*1000)
    .notConsumable(fluid('hexane')*4000)
    .fluidOutputs(fluid('purified_novec_solution')*1000)
    .EUt(400)
    .duration(200)
    .buildAndRegister();

DISTILLATION_RECIPES.recipeBuilder()
    .fluidInputs(fluid('purified_novec_solution')*1000)
    .fluidOutputs(fluid('mnovec')*1000)
    .outputs(metaitem('dustSodiumIodide'))
    .EUt(300)
    .duration(250)
    .buildAndRegister();

//Biphenyl Diphenyl Ether

CONTINOUS_STIRRING_TANK_REACTOR_RECIPES.recipeBuilder()
    .fluidInputs(fluid('phenol')*1000)
    .inputs(metaitem('dustCopperIodide'))
    .fluidInputs(fluid('dimethylformamide')*1000)
    .notConsumable(metaitem('dustPotassiumCarbonate'))
    .fluidInputs(fluid('phenanthroline')*1000)
    .fluidInputs(fluid('bromobiphenyl')*1000)
    .fluidOutputs(fluid('biphenyl_diphenyl_ether_solution')*1000)
    .EUt(300)
    .duration(250)
    .buildAndRegister();

DISTILLATION_RECIPES.recipeBuilder()
    .fluidOutputs(fluid('dimethylformamide')*1000)
    .fluidInputs(fluid('biphenyl_diphenyl_ether_solution')*1000)
    .outputs(metaitem('dustCopperIodide'))
    .fluidOutputs(fluid('phenanthroline')*1000)
    .fluidOutputs(fluid('biphenyl_diphenyl_ether')*1000)
    .EUt(300)
    .duration(250)
    .buildAndRegister();

CHEMICAL_RECIPES.recipeBuilder()
    .fluidInputs(fluid('ethanol')*100)
    .inputs(metaitem('wireGtSingleCopper')*4)
    .inputs(metaitem('dustIodine')*2)
    .outputs(metaitem('dustCopperIodide')*2)
    .EUt(300)
    .duration(250)
    .buildAndRegister();

TRICKLE_BED_REACTOR_RECIPES.recipeBuilder()
    .fluidInputs(fluid('glycerol')*1000)
    .fluidInputs(fluid('sulfuric_acid')*1000)
    .fluidOutputs(fluid('acrolein')*1000)
    .fluidOutputs(fluid('water')*1000)
    .EUt(70)
    .duration(600)
    .buildAndRegister();

FLUIDIZED_BED_REACTOR_RECIPES.recipeBuilder()
    .fluidInputs(fluid('acrolein')*1000)
    .inputs(metaitem('dustParaPhenylenediamine'))
    .fluidOutputs(fluid('dihydrophenanthroline')*1000)
    .EUt(70)
    .duration(600)
    .buildAndRegister();

CRYSTALLIZATION_RECIPES.recipeBuilder()
    .fluidInputs(fluid('dihydrophenanthroline')*1000)
    .outputs(metaitem('dustPhenanthroline'))
    .EUt(800)
    .duration(700)
    .buildAndRegister();

CHEMICAL_BATH_RECIPES.recipeBuilder()
    .inputs(metaitem('dustPhenanthroline'))
    .fluidInputs(fluid('nitric_acid')*100)
    .fluidOutputs(fluid('phenanthroline')*1000)
    .EUt(70)
    .duration(600)
    .buildAndRegister();

CHEMICAL_RECIPES.recipeBuilder()
    .fluidInputs(fluid('bromine')*2000)
    .inputs(metaitem('dustBiphenyl'))
    .notConsumable(metaitem('dustAluminiumChloride'))
    .fluidOutputs(fluid('bromobiphenyl')*1000)
    .fluidOutputs(fluid('hydrobromic_acid')*1000)
    .EUt(70)
    .duration(600)
    .buildAndRegister();
