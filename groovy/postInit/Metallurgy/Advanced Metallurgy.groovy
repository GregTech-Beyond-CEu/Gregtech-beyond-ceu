import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;

INDUCTION_FURNACE_RECIPES.recipeBuilder()
    .inputs(metaitem('dustHighPurityIron')*6)
    .inputs(metaitem('dustHighPurityNickel'))
    .inputs(metaitem('dustHighPurityManganese'))
    .inputs(metaitem('dustHighPurityChrome'))
    .fluidOutputs(fluid('high_purity_stainless_steel') * 1296)
    .fluidInputs(fluid('nitrogen')*9000)
    .EUt(500)
    .duration(200)
    .buildAndRegister();

//High Purity Chrome

ZONE_REFINER_RECIPES.recipeBuilder()
    .inputs(metaitem('stickChrome'))
    .outputs(metaitem('stickHighPurityChrome'))
    .EUt(200)
    .duration(300)
    .buildAndRegister();

//High Purity Manganese

CHEMICAL_RECIPES.recipeBuilder()
    .fluidInputs(fluid('butyraldehyde')*1000)
    .notConsumable(metaitem('dustSodiumHydroxide')*3)
    .fluidOutputs(fluid('water')*1000)
    .fluidOutputs(fluid('ethylhexanol')*1000)
    .EUt(150)
    .duration(200)
    .buildAndRegister();

CONTINOUS_STIRRING_TANK_REACTOR_RECIPES.recipeBuilder()
    .fluidInputs(fluid('ethylhexanol')*2000)
    .fluidInputs(fluid('phosphoric_acid')*1000)
    .fluidInputs(fluid('toluene')*1000)
    .fluidOutputs(fluid('di_ethylhexyl_phosphoric_acid_solution')*1000)
    .EUt(200)
    .duration(300)
    .buildAndRegister();

DISTILLATION_RECIPES.recipeBuilder()
    .fluidInputs(fluid('di_ethylhexyl_phosphoric_acid_solution')*1000)
    .fluidOutputs(fluid('di_ethylhexyl_phosphoric_acid')*1000)
    .fluidOutputs(fluid('water')*2000)
    .fluidOutputs(fluid('toluene')*1000)
    .EUt(200)
    .duration(300)
    .buildAndRegister();

ELECTROLYTIC_CELL_RECIPES.recipeBuilder()
    .fluidInputs(fluid('manganese_sulfate_solution')*1000)
    .fluidOutputs(fluid('di_ethylhexyl_phosphoric_acid')*1000)
    .notConsumable(metaitem('stickStainlessSteel'))
    .notConsumable(metaitem('stickLead'))
    .fluidOutputs(fluid('high_purity_manganese')*144)
    .fluidOutputs(fluid('sulfuric_acid')*1000)
    .EUt(200)
    .duration(300)
    .buildAndRegister();

TRICKLE_BED_REACTOR_RECIPES.recipeBuilder()
    .fluidInputs(fluid('di_ethylhexyl_phosphoric_acid')*1000)
    .inputs(metaitem('dustManganeseSulfate')*4)
    .fluidOutputs(fluid('manganese_sulfate_solution')*1000)
    .EUt(300)
    .duration(250)
    .buildAndRegister();

// High Purity Iron

ELECTROLYTIC_CELL_RECIPES.recipeBuilder()
    .notConsumable(metaitem('plateCopper'))
    .notConsumable(metaitem('graphite_electrode'))
    .fluidInputs(fluid('deionized_water')*500)
    .fluidInputs(fluid('iron_2_chloride')*1000)
    .fluidOutputs(fluid('chlorine')*2000)
    .fluidOutputs(fluid('high_purity_iron')*144)
    .EUt(200)
    .duration(180)
    .buildAndRegister();

// Block of gtb.material.high_purity_iron * 1
mods.gregtech.fluid_solidifier.removeByInput(7, [metaitem('shape.mold.block')], [fluid('high_purity_iron') * 1296 * 1296])
// gtb.material.high_purity_iron Nugget * 9
mods.gregtech.fluid_solidifier.removeByInput(7, [metaitem('shape.mold.nugget')], [fluid('high_purity_iron') * 144 * 144])
// gtb.material.high_purity_iron Ingot * 1
mods.gregtech.fluid_solidifier.removeByInput(7, [metaitem('shape.mold.ingot')], [fluid('high_purity_iron') * 144 * 144])

CRYSTALLIZATION_RECIPES.recipeBuilder()
    .fluidInputs(fluid('high_purity_iron')*144)
    .outputs(metaitem('dustHighPurityIron'))
    .EUt(220)
    .duration(280)
    .buildAndRegister();

//Mond Process High Purity Nickel

CHEMICAL_RECIPES.recipeBuilder()
    .inputs(metaitem('dustNickel'))
    .fluidInputs(fluid('carbon_monoxide')*4000)
    .fluidOutputs(fluid('nickel_tetracarbonyl')*1000)
    .EUt(220)
    .duration(280)
    .buildAndRegister();

THERMAL_DECOMPOSITION_RECIPES.recipeBuilder()
    .fluidInputs(fluid('nickel_tetracarbonyl')*1000)
    .fluidOutputs(fluid('carbon_monoxide')*4000)
    .outputs(metaitem('dustHighPurityNickel'))
    .EUt(350)
    .duration(400)
    .buildAndRegister();

//High Purity Beryllium

ELECTROLYTIC_CELL_RECIPES.recipeBuilder()
    .inputs(metaitem('dustBerylliumFluoride'))
    .inputs(metaitem('dustLithiumFluoride'))
    .notConsumable(metaitem('graphite_electrode'))
    .notConsumable(metaitem('stickTungsten'))
    .fluidOutputs(fluid('high_purity_beryllium')*144)
    .outputs(metaitem('dustLithium'))
    .fluidOutputs(fluid('fluorine')*3000)
    .EUt(200)
    .duration(200)
    .buildAndRegister();

TUBE_FURNACE_RECIPES.recipeBuilder()
    .inputs(metaitem('dustHighPurityBeryllium'))
    .fluidInputs(fluid('oxygen')*2000)
    .outputs(metaitem('dustHighPurityBerylliumOxide'))
    .EUt(300)
    .duration(250)
    .buildAndRegister();

CONTINOUS_STIRRING_TANK_REACTOR_RECIPES.recipeBuilder()
    .fluidInputs(fluid('hydrofluoric_acid')*2000)
    .inputs(metaitem('dustHighPurityBerylliumOxide'))
    .outputs(metaitem('dustHighPurityBerylliumFluoride'))
    .fluidOutputs(fluid('water')*1000)
    .EUt(600)
    .duration(350)
    .buildAndRegister();

CRYSTALLIZATION_RECIPES.recipeBuilder()
    .fluidInputs(fluid('high_purity_beryllium')*144)
    .outputs(metaitem('dustHighPurityBeryllium'))
    .EUt(400)
    .duration(550)
    .buildAndRegister();