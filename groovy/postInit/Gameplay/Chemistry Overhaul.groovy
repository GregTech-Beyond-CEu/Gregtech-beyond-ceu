import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;

ROTARY_KILN_RECIPES.recipeBuilder()
    .inputs(metaitem('dustSodiumSulfate')*7)
    .inputs(metaitem('dustCarbon')*2)
    .fluidOutputs(fluid('carbon_dioxide')*2000)
    .outputs(metaitem('dustSodiumSulfide')*3)
    .EUt(15)
    .duration(200)
    .buildAndRegister();

// Sodium Sulfide Dust * 3
mods.gregtech.chemical_reactor.removeByInput(30, [metaitem('dustSodium') * 2, metaitem('dustSulfur')], null)

FIXED_BED_TUBULAR_REACTOR_RECIPES.recipeBuilder()
    .fluidInputs(fluid('propene') * 2000)
    .notConsumable(metaitem('dustMolybdenumTrioxide'))
    .fluidOutputs(fluid('isoprene')*1000)
    .fluidOutputs(fluid('methane')*1000)
    .EUt(40)
    .duration(250)
    .buildAndRegister();

// Methane Gas * 1000
mods.gregtech.chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 3])], [fluid('propene') * 2000 * 2000])

// Methane Gas * 1000
mods.gregtech.chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 1]), metaitem('dustCarbon')], [fluid('hydrogen') * 4000 * 4000])

FIXED_BED_TUBULAR_REACTOR_RECIPES.recipeBuilder()
    .fluidInputs(fluid('carbon_dioxide') * 1000)
    .fluidInputs(fluid('hydrogen')*8000)
    .notConsumable(metaitem('dustNickel'))
    .fluidOutputs(fluid('water')*2000)
    .fluidOutputs(fluid('methane')*1000)
    .EUt(40)
    .duration(250)
    .buildAndRegister();

// Hydrogen Gas * 2000
mods.gregtech.chemical_reactor.removeByInput(30, null, [fluid('ethylene') * 1000 * 1000, fluid('propene') * 1000 * 1000])

STIRRED_TANK_REACTOR_RECIPES.recipeBuilder()
    .fluidInputs(fluid('sulfuric_acid') * 2000)
    .inputs(metaitem('dustSodiumSulfate')*7)
    .outputs(metaitem('dustSodiumBisulfate')*8)
    .EUt(20)
    .duration(200)
    .buildAndRegister();

FLUIDIZED_BED_REACTOR_RECIPES.recipeBuilder()
    .fluidInputs(fluid('chlorine')*6000)
    .inputs(metaitem('dustIron')*2)
    .fluidOutputs(fluid('iron_iii_chloride') * 1000)
    .EUt(16)
    .duration(150)
    .buildAndRegister();

// Liquid Iron III Chloride * 1000
mods.gregtech.chemical_reactor.removeByInput(30, [metaitem('dustIron'), metaitem('circuit.integrated').withNbt(['Configuration': 1])], [fluid('hydrochloric_acid') * 3000 * 3000])


ROASTER_RECIPES.recipeBuilder()
    .fluidInputs(fluid('hydrochloric_acid')*6000)
    .inputs(metaitem('dustIronOxide')*5)
    .fluidOutputs(fluid('iron_iii_chloride') * 2000)
    .fluidOutputs(fluid('water') * 3000)
    .EUt(5)
    .duration(120)
    .buildAndRegister();

// Hydrochloric Acid * 2000
mods.gregtech.chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 2])], [fluid('chlorine') * 4000 * 4000, fluid('benzene') * 1000 * 1000])

PLUG_FLOW_REACTOR_RECIPES.recipeBuilder()
    .fluidInputs(fluid('benzene')*1000)
    .fluidInputs(fluid('chlorine')*2000)
    .notConsumable(metaitem('dustIronIiiChloride')*4)
    .fluidOutputs(fluid('dichlorobenzene')*1000)
    .fluidOutputs(fluid('hydrochloric_acid')*2000)
    .EUt(50)
    .duration(200)
    .buildAndRegister();

CRYSTALLIZATION_RECIPES.recipeBuilder()
    .outputs(metaitem('dustIronIiiChloride')*4)
    .fluidInputs(fluid('iron_iii_chloride') * 1000)
    .circuitMeta(1)
    .EUt(12)
    .duration(140)
    .buildAndRegister();

// Sodium Bisulfate Dust * 7
mods.gregtech.chemical_reactor.removeByInput(30, [metaitem('dustSalt') * 2, metaitem('circuit.integrated').withNbt(['Configuration': 1])], [fluid('sulfuric_acid') * 1000 * 1000])
// Sodium Bisulfate Dust * 7
mods.gregtech.chemical_reactor.removeByInput(30, [metaitem('dustSodiumHydroxide') * 3], [fluid('sulfuric_acid') * 1000 * 1000])

TRICKLE_BED_REACTOR_RECIPES.recipeBuilder()
    .fluidInputs(fluid('glycerol')*1000)
    .fluidInputs(fluid('nitration_mixture')*1000)
    .fluidOutputs(fluid('glyceryl_trinitrate')*1000)
    .fluidOutputs(fluid('diluted_sulfuric_acid')*1000)
    .EUt(30)
    .duration(240)
    .buildAndRegister();


// Glyceryl Trinitrate * 1000
mods.gregtech.chemical_reactor.removeByInput(30, null, [fluid('nitration_mixture') * 3000 * 3000, fluid('glycerol') * 1000 * 1000])

DEHYDRATOR_RECIPES.recipeBuilder()
    .fluidInputs(fluid('acetic_acid')*1000)
    .fluidOutputs(fluid('water')*1000)
    .fluidOutputs(fluid('ethenone')*1000)
    .EUt(30)
    .duration(220)
    .buildAndRegister();

// Ethenone * 1000
mods.gregtech.chemical_reactor.removeByInput(120, null, [fluid('sulfuric_acid') * 1000 * 1000, fluid('acetic_acid') * 1000 * 1000])

STIRRED_TANK_REACTOR_RECIPES.recipeBuilder()
    .fluidInputs(fluid('acetic_acid')*2000)
    .inputs(metaitem('dustCalciumHydroxide')*2)
    .fluidOutputs(fluid('dissolved_calcium_acetate') * 1000)
    .fluidOutputs(fluid('water')*2000)
    .EUt(40)
    .duration(250)
    .buildAndRegister();


// Dissolved Calcium Acetate * 1000
mods.gregtech.chemical_reactor.removeByInput(120, [metaitem('dustCalcite') * 5], [fluid('acetic_acid') * 2000 * 2000])
// Dissolved Calcium Acetate * 1000
mods.gregtech.chemical_reactor.removeByInput(380, [metaitem('dustQuicklime') * 2, metaitem('circuit.integrated').withNbt(['Configuration': 1])], [fluid('acetic_acid') * 2000 * 2000])
// Dissolved Calcium Acetate * 1000
mods.gregtech.chemical_reactor.removeByInput(380, [metaitem('dustCalcium')], [fluid('acetic_acid') * 2000 * 2000, fluid('oxygen') * 1000 * 1000])

STIRRED_TANK_REACTOR_RECIPES.recipeBuilder()
    .fluidInputs(fluid('acetic_acid')*2000)
    .inputs(metaitem('dustCalciumCarbonate')*4)
    .fluidOutputs(fluid('dissolved_calcium_acetate') * 1000)
    .fluidOutputs(fluid('water')*1000)
    .fluidOutputs(fluid('carbon_dioxide')*1000)
    .EUt(40)
    .duration(250)
    .buildAndRegister();

STIRRED_TANK_REACTOR_RECIPES.recipeBuilder()
    .fluidInputs(fluid('acetic_acid')*1000)
    .fluidInputs(fluid('methanol')*1000)
    .notConsumable(fluid('sulfuric_acid')*1000)
    .fluidOutputs(fluid('water')*1000)
    .fluidOutputs(fluid('methyl_acetate')*1000)
    .EUt(50)
    .duration(350)
    .buildAndRegister();

// Methyl Acetate * 1000
mods.gregtech.chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 1])], [fluid('methanol') * 1000 * 1000, fluid('acetic_acid') * 1000 * 1000])

TUBE_FURNACE_RECIPES.recipeBuilder()
    .fluidInputs(fluid('hydrogen')*2000)
    .inputs(metaitem('dustSulfur'))
    .fluidOutputs(fluid('hydrogen_sulfide')*1000)
    .EUt(80)
    .duration(200)
    .buildAndRegister();

// Hydrogen Sulfide Gas * 1000
mods.gregtech.chemical_reactor.removeByInput(7, [metaitem('dustSulfur')], [fluid('hydrogen') * 2000 * 2000])

// Hypochlorous Acid * 10000
mods.gregtech.chemical_reactor.removeByInput(7, null, [fluid('mercury') * 1000 * 1000, fluid('water') * 10000 * 10000, fluid('chlorine') * 10000 * 10000])

BUBBLE_COLUMN_REACTOR_RECIPES.recipeBuilder()
    .fluidInputs(fluid('sodium_hypochlorite')*1000)
    .fluidInputs(fluid('hydrogen')*1000)
    .outputs(metaitem('dustSodium'))
    .fluidOutputs(fluid('hypochlorous_acid') * 1000)
    .EUt(60)
    .duration(300)
    .buildAndRegister();

// Diluted Hydrochloric Acid * 1000
mods.gregtech.chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 1])], [fluid('water') * 1000 * 1000, fluid('chlorine') * 2000 * 2000])
// Glyceryl Trinitrate * 1000
mods.gregtech.large_chemical_reactor.removeByInput(30, null, [fluid('nitration_mixture') * 3000 * 3000, fluid('glycerol') * 1000 * 1000])
// Sodium Bisulfate Dust * 7
mods.gregtech.large_chemical_reactor.removeByInput(30, [metaitem('dustSalt') * 2, metaitem('circuit.integrated').withNbt(['Configuration': 1])], [fluid('sulfuric_acid') * 1000 * 1000])
// Sodium Bisulfate Dust * 7
mods.gregtech.large_chemical_reactor.removeByInput(30, [metaitem('dustSodiumHydroxide') * 3], [fluid('sulfuric_acid') * 1000 * 1000])
// Methane Gas * 1000
mods.gregtech.large_chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 1]), metaitem('dustCarbon')], [fluid('hydrogen') * 4000 * 4000])
// Hydrogen Gas * 2000
mods.gregtech.large_chemical_reactor.removeByInput(30, null, [fluid('ethylene') * 1000 * 1000, fluid('propene') * 1000 * 1000])
// Methane Gas * 1000
mods.gregtech.large_chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 3])], [fluid('propene') * 2000 * 2000])
// Sodium Sulfide Dust * 3
mods.gregtech.large_chemical_reactor.removeByInput(30, [metaitem('dustSodium') * 2, metaitem('dustSulfur')], null)
// Salt * 4
mods.gregtech.large_chemical_reactor.removeByInput(360, [metaitem('dustSodiumSulfide') * 3], [fluid('dichlorobenzene') * 1000 * 1000, fluid('air') * 16000 * 16000])
// Salt * 4
mods.gregtech.large_chemical_reactor.removeByInput(360, [metaitem('dustSodiumSulfide') * 3], [fluid('dichlorobenzene') * 1000 * 1000, fluid('oxygen') * 8000 * 8000])
// 1,1-Dimethylhydrazine * 1000
mods.gregtech.chemical_reactor.removeByInput(480, null, [fluid('dimethylamine') * 1000 * 1000, fluid('monochloramine') * 1000 * 1000])
// 1,1-Dimethylhydrazine * 1000
mods.gregtech.chemical_reactor.removeByInput(480, null, [fluid('methanol') * 2000 * 2000, fluid('ammonia') * 2000 * 2000, fluid('hypochlorous_acid') * 1000 * 1000])

TRICKLE_BED_REACTOR_RECIPES.recipeBuilder()
    .fluidInputs(fluid('methyl_iodide')*1000)
    .fluidInputs(fluid('hydrazine')*1000)
    .fluidOutputs(fluid('hydroiodic_acid')*1000)
    .fluidOutputs(fluid('dimethylhydrazine') * 1000)
    .EUt(70)
    .duration(300)
    .buildAndRegister();

FIXED_BED_REACTOR_RECIPES.recipeBuilder()
    .fluidInputs(fluid('sulfuric_acid')*1000)
    .inputs(metaitem('dustCalciumFluoride')*3)
    .fluidOutputs(fluid('hydrofluoric_acid')*2000)
    .outputs(metaitem('dustCalciumSulfate')*6)
    .EUt(18)
    .duration(350)
    .buildAndRegister();

// Hydrofluoric Acid * 1000
mods.gregtech.chemical_reactor.removeByInput(7, null, [fluid('hydrogen') * 1000 * 1000, fluid('fluorine') * 1000 * 1000])
// Hypochlorous Acid * 10000
mods.gregtech.large_chemical_reactor.removeByInput(7, null, [fluid('mercury') * 1000 * 1000, fluid('water') * 10000 * 10000, fluid('chlorine') * 10000 * 10000])
// Diluted Hydrochloric Acid * 1000
mods.gregtech.large_chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 1])], [fluid('water') * 1000 * 1000, fluid('chlorine') * 2000 * 2000])

BUBBLE_COLUMN_REACTOR_RECIPES.recipeBuilder()
    .fluidInputs(fluid('gtfo_acetaldehyde') * 1000)
    .fluidInputs(fluid('oxygen')*500)
    .fluidOutputs(fluid('acetic_acid')*1000)
    .EUt(18)
    .duration(350)
    .buildAndRegister();

// Acetic Acid * 1000
mods.gregtech.chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 2])], [fluid('oxygen') * 2000 * 2000, fluid('ethylene') * 1000 * 1000])
// Acetic Acid * 1000
mods.gregtech.chemical_reactor.removeByInput(30, null, [fluid('carbon_monoxide') * 1000 * 1000, fluid('methanol') * 1000 * 1000])
// Acetic Acid * 1000
mods.gregtech.chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 2])], [fluid('hydrogen') * 4000 * 4000, fluid('carbon_monoxide') * 2000 * 2000])
// Acetic Acid * 1000
mods.gregtech.chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 4]), metaitem('dustCarbon') * 2], [fluid('oxygen') * 2000 * 2000, fluid('hydrogen') * 4000 * 4000])
// Acetic Acid * 1000
mods.gregtech.chemical_reactor.removeByInput(60, [metaitem('dustSodiumHydroxide')], [fluid('methyl_acetate') * 1000 * 1000, fluid('water') * 1000 * 1000])

TRICKLE_BED_REACTOR_RECIPES.recipeBuilder()
    .fluidInputs(fluid('methanol')*1000)
    .fluidInputs(fluid('carbon_monoxide')*1000)
    .fluidOutputs(fluid('acetic_acid')*1000)
    .EUt(18)
    .duration(350)
    .buildAndRegister();

FIXED_BED_TUBULAR_REACTOR_RECIPES.recipeBuilder()
    .fluidInputs(fluid('oxygen')*500)
    .fluidInputs(fluid('acetic_acid')*1000)
    .fluidInputs(fluid('ethylene')*1000)
    .fluidOutputs(fluid('water')*1000)
    .fluidOutputs(fluid('vinyl_acetate')*1000)
    .EUt(40)
    .duration(400)
    .buildAndRegister();

BATCH_REACTOR_RECIPES.recipeBuilder()
    .fluidInputs(fluid('acetylene')*1000)
    .fluidInputs(fluid('acetic_acid')*1000)
    .notConsumable(fluid('mercury')*2000)
    .fluidOutputs(fluid('vinyl_acetate')*1000)
    .EUt(40)
    .duration(400)
    .buildAndRegister();

// Carbon Monoxide Gas * 1000
mods.gregtech.chemical_reactor.removeByInput(7, [metaitem('circuit.integrated').withNbt(['Configuration': 1]), metaitem('dustCarbon')], [fluid('oxygen') * 1000 * 1000])
// Carbon Monoxide Gas * 1000
mods.gregtech.chemical_reactor.removeByInput(7, [metaitem('circuit.integrated').withNbt(['Configuration': 1]), item('minecraft:coal', 1)], [fluid('oxygen') * 1000 * 1000])
// Carbon Monoxide Gas * 1000
mods.gregtech.chemical_reactor.removeByInput(7, [metaitem('circuit.integrated').withNbt(['Configuration': 1]), item('minecraft:coal')], [fluid('oxygen') * 1000 * 1000])
// Carbon Monoxide Gas * 1000
mods.gregtech.chemical_reactor.removeByInput(7, [metaitem('circuit.integrated').withNbt(['Configuration': 1]), metaitem('dustCharcoal')], [fluid('oxygen') * 1000 * 1000])
// Carbon Monoxide Gas * 1000
mods.gregtech.chemical_reactor.removeByInput(7, [metaitem('dustCoal'), metaitem('circuit.integrated').withNbt(['Configuration': 1])], [fluid('oxygen') * 1000 * 1000])
// Carbon Dioxide Gas * 1000
mods.gregtech.chemical_reactor.removeByInput(7, [metaitem('circuit.integrated').withNbt(['Configuration': 2]), metaitem('dustCarbon')], [fluid('oxygen') * 2000 * 2000])
// Carbon Dioxide Gas * 1000
mods.gregtech.chemical_reactor.removeByInput(7, [metaitem('circuit.integrated').withNbt(['Configuration': 2]), item('minecraft:coal')], [fluid('oxygen') * 2000 * 2000])
// Carbon Dioxide Gas * 1000
mods.gregtech.chemical_reactor.removeByInput(7, [metaitem('circuit.integrated').withNbt(['Configuration': 2]), item('minecraft:coal', 1)], [fluid('oxygen') * 2000 * 2000])
// Carbon Dioxide Gas * 1000
mods.gregtech.chemical_reactor.removeByInput(7, [metaitem('circuit.integrated').withNbt(['Configuration': 2]), metaitem('dustCharcoal')], [fluid('oxygen') * 2000 * 2000])
// Carbon Dioxide Gas * 1000
mods.gregtech.chemical_reactor.removeByInput(7, [metaitem('circuit.integrated').withNbt(['Configuration': 2]), metaitem('dustCoal')], [fluid('oxygen') * 2000 * 2000])

ROTARY_KILN_RECIPES.recipeBuilder()
    .inputs(metaitem('dustCoal'))
    .fluidInputs(fluid('oxygen')*2000)
    .fluidOutputs(fluid('carbon_dioxide')*1000)
    .fluidOutputs(fluid('water')*1000)
    .EUt(170)
    .duration(200)
    .buildAndRegister();

ROTARY_KILN_RECIPES.recipeBuilder()
    .inputs(metaitem('dustCharcoal'))
    .fluidInputs(fluid('oxygen')*2000)
    .fluidOutputs(fluid('carbon_dioxide')*1000)
    .fluidOutputs(fluid('water')*1000)
    .EUt(170)
    .duration(200)
    .buildAndRegister();

ROTARY_KILN_RECIPES.recipeBuilder()
    .inputs(item('minecraft:coal'))
    .fluidInputs(fluid('oxygen')*2000)
    .fluidOutputs(fluid('carbon_dioxide')*1000)
    .fluidOutputs(fluid('water')*1000)
    .EUt(170)
    .duration(200)
    .buildAndRegister();

ROTARY_KILN_RECIPES.recipeBuilder()
    .inputs(item('minecraft:coal', 1))
    .fluidInputs(fluid('oxygen')*2000)
    .fluidOutputs(fluid('carbon_dioxide')*1000)
    .fluidOutputs(fluid('water')*1000)
    .EUt(170)
    .duration(200)
    .buildAndRegister();

ROTARY_KILN_RECIPES.recipeBuilder()
    .inputs(metaitem('dustCarbon'))
    .fluidInputs(fluid('oxygen')*2000)
    .fluidOutputs(fluid('carbon_dioxide')*1000)
    .fluidOutputs(fluid('water')*1000)
    .EUt(170)
    .duration(200)
    .buildAndRegister();

FERMENTATION_VAT_RECIPES.recipeBuilder()
    .inputs(item('minecraft:sugar')*24)
    .fluidOutputs(fluid('ethanol')*2000)
    .circuitMeta(2)
    .fluidOutputs(fluid('carbon_dioxide')*2000)
    .EUt(150)
    .duration(200)
    .buildAndRegister();
    
// Carbon Dust * 5
mods.gregtech.chemical_reactor.removeByInput(120, null, [fluid('methyl_acetate') * 2000 * 2000, fluid('nitric_acid') * 4000 * 4000])
// Tetranitromethane * 2000
mods.gregtech.chemical_reactor.removeByInput(120, null, [fluid('nitric_acid') * 8000 * 8000, fluid('ethenone') * 1000 * 1000])

CONTINOUS_STIRRING_TANK_REACTOR_RECIPES.recipeBuilder()
    .fluidInputs(fluid('chloroform')*1000)
    .fluidInputs(fluid('nitric_acid')*4000)
    .fluidInputs(fluid('sulfuric_acid')*3000)
    .fluidOutputs(fluid('water')*5000)
    .fluidOutputs(fluid('chlorine')*3000)
    .fluidOutputs(fluid('tetranitromethane')*1000)
    .EUt(25)
    .duration(500)
    .buildAndRegister();

// Dinitrogen Tetroxide Gas * 1000
mods.gregtech.large_chemical_reactor.removeByInput(480, [metaitem('circuit.integrated').withNbt(['Configuration': 5])], [fluid('oxygen') * 7000 * 7000, fluid('nitrogen') * 2000 * 2000, fluid('hydrogen') * 6000 * 6000])
// Dinitrogen Tetroxide Gas * 1000
mods.gregtech.chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 3])], [fluid('oxygen') * 7000 * 7000, fluid('ammonia') * 2000 * 2000])
// Dinitrogen Tetroxide Gas * 1000
mods.gregtech.chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 2])], [fluid('nitrogen_dioxide') * 2000 * 2000])

VACUUM_RECIPES.recipeBuilder()
    .fluidInputs(fluid('nitrogen_dioxide')*2000)
    .fluidOutputs(fluid('dinitrogen_tetroxide')*1000)
    .EUt(12)
    .duration(400)
    .buildAndRegister();

// Saltpeter Dust * 5
mods.gregtech.chemical_reactor.removeByInput(30, [metaitem('dustPotassium')], [fluid('oxygen') * 3000 * 3000, fluid('nitrogen') * 1000 * 1000])

BATCH_REACTOR_RECIPES.recipeBuilder()
    .inputs(metaitem('dustSodium'))
    .inputs(metaitem('dustPotassium'))
    .fluidOutputs(fluid('sodium_potassium') * 1000)
    .EUt(13)
    .duration(450)
    .buildAndRegister();

STIRRED_TANK_REACTOR_RECIPES.recipeBuilder()
    .fluidInputs(fluid('ammonia')*1000)
    .fluidInputs(fluid('hypochlorous_acid') * 1000)
    .fluidOutputs(fluid('monochloramine')*1000)
    .fluidOutputs(fluid('water')*1000)
    .EUt(15)
    .duration(390)
    .buildAndRegister();

// Water * 1000
mods.gregtech.chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 1])], [fluid('hypochlorous_acid') * 1000 * 1000, fluid('ammonia') * 1000 * 1000])

BATCH_REACTOR_RECIPES.recipeBuilder()
    .fluidInputs(fluid('calcium_hydroxide_solution')*1000)
    .fluidInputs(fluid('carbon_dioxide')*1000)
    .fluidOutputs(fluid('water')*1000)
    .outputs(metaitem('dustCalcite')*5)
    .EUt(13)
    .duration(450)
    .buildAndRegister();

ROASTER_RECIPES.recipeBuilder()
    .fluidInputs(fluid('sulfur_dioxide')*2000)
    .fluidInputs(fluid('oxygen')*2000)
    .fluidOutputs(fluid('sulfur_trioxide')*2000)
    .EUt(15)
    .duration(450)
    .buildAndRegister();

// Sulfur Trioxide Gas * 1000
mods.gregtech.chemical_reactor.removeByInput(7, null, [fluid('sulfur_dioxide') * 1000 * 1000, fluid('oxygen') * 1000 * 1000])



ROASTER_RECIPES.recipeBuilder()
    .inputs(metaitem('dustSulfur'))
    .circuitMeta(2)
    .fluidInputs(fluid('oxygen')*2000)
    .fluidOutputs(fluid('sulfur_dioxide')*2000)
    .EUt(15)
    .duration(450)
    .buildAndRegister();

// Sulfur Dioxide Gas * 1000
mods.gregtech.chemical_reactor.removeByInput(7, [metaitem('circuit.integrated').withNbt(['Configuration': 2]), metaitem('dustSulfur')], [fluid('oxygen') * 2000 * 2000])
// Water * 1000
mods.gregtech.chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 1])], [fluid('oxygen') * 3000 * 3000, fluid('hydrogen_sulfide') * 1000 * 1000])

FLUIDIZED_BED_REACTOR_RECIPES.recipeBuilder()
    .fluidInputs(fluid('chloromethane')*2000)
    .inputs(metaitem('dustSilicon'))
    .fluidOutputs(fluid('dimethyldichlorosilane')*1000)
    .EUt(24)
    .duration(450)
    .buildAndRegister();

// Water * 1000
mods.gregtech.chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 3])], [fluid('oxygen') * 1000 * 1000, fluid('acetic_acid') * 1000 * 1000, fluid('ethylene') * 1000 * 1000])
// Dimethyldichlorosilane Gas * 1000
mods.gregtech.chemical_reactor.removeByInput(96, [metaitem('dustSilicon')], [fluid('chloromethane') * 2000 * 2000])
// Cumene Gas * 8000
mods.gregtech.chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 1])], [fluid('phosphoric_acid') * 1000 * 1000, fluid('benzene') * 8000 * 8000, fluid('propene') * 8000 * 8000])

BUBBLE_COLUMN_REACTOR_RECIPES.recipeBuilder()
    .fluidInputs(fluid('methanol')*1000)
    .fluidInputs(fluid('hydrogen_chloride')*1000)
    .notConsumable(metaitem('dustAlumina'))
    .fluidOutputs(fluid('water')*1000)
    .fluidOutputs(fluid('chloromethane')*1000)
    .EUt(24)
    .duration(300)
    .buildAndRegister();

// Hydrogen Gas * 8000
mods.gregtech.chemical_reactor.removeByInput(480, [metaitem('circuit.integrated').withNbt(['Configuration': 1])], [fluid('water') * 2000 * 2000, fluid('methane') * 1000 * 1000])
// Calcite Dust * 5
mods.gregtech.chemical_reactor.removeByInput(30, [metaitem('dustCalcium'), metaitem('dustCarbon')], [fluid('oxygen') * 3000 * 3000])
// Sulfuric Acid * 1000
mods.gregtech.chemical_reactor.removeByInput(7, null, [fluid('sulfur_trioxide') * 1000 * 1000, fluid('water') * 1000 * 1000])
// Sulfuric Acid * 1000
mods.gregtech.chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 2])], [fluid('hydrogen_sulfide') * 1000 * 1000, fluid('oxygen') * 4000 * 4000])
// Sulfuric Acid * 1000
mods.gregtech.large_chemical_reactor.removeByInput(480, [metaitem('circuit.integrated').withNbt(['Configuration': 24]), metaitem('dustSulfur')], [fluid('water') * 4000 * 4000])
// Ammonia Gas * 1000
mods.gregtech.chemical_reactor.removeByInput(384, [metaitem('circuit.integrated').withNbt(['Configuration': 1])], [fluid('hydrogen') * 3000 * 3000, fluid('nitrogen') * 1000 * 1000])
// Ammonia Gas * 4000
mods.gregtech.large_chemical_reactor.removeByInput(480, [metaitem('circuit.integrated').withNbt(['Configuration': 24])], [fluid('methane') * 3000 * 3000, fluid('nitrogen') * 4000 * 4000, fluid('oxygen') * 3000 * 3000])

FIXED_BED_REACTOR_RECIPES.recipeBuilder()
    .fluidInputs(fluid('nitrogen')*2000)
    .fluidInputs(fluid('hydrogen')*6000)
    .fluidOutputs(fluid('ammonia')*2000)
    .EUt(24)
    .duration(200)
    .buildAndRegister();

COMBUSTION_FURNACE_RECIPES.recipeBuilder()
    .fluidInputs(fluid('dichloroethane')*1000)
    .fluidOutputs(fluid('hydrochloric_acid')*1000)
    .fluidOutputs(fluid('vinyl_chloride')*1000)
    .EUt(24)
    .duration(200)
    .buildAndRegister();

CONTINOUS_STIRRING_TANK_REACTOR_RECIPES.recipeBuilder()
    .fluidInputs(fluid('chlorine')*2000)
    .fluidInputs(fluid('ethylene')*1000)
    .fluidOutputs(fluid('dichloroethane')*1000)
    .EUt(64)
    .duration(200)
    .buildAndRegister();

CRYSTALLIZATION_RECIPES.recipeBuilder()
    .fluidInputs(fluid('ammonium_persulfate_solution')*1000)
    .outputs(metaitem('dustAmmoniumPersulfate')*10)
    .EUt(12)
    .duration(200)
    .buildAndRegister();

BUBBLE_COLUMN_REACTOR_RECIPES.recipeBuilder()
    .fluidInputs(fluid('water')*1000)
    .fluidInputs(fluid('ammonia')*1000)
    .fluidOutputs(fluid('ammonia_solution')*1000)
    .EUt(12)
    .duration(200)
    .buildAndRegister();

BUBBLE_COLUMN_REACTOR_RECIPES.recipeBuilder()
    .fluidInputs(fluid('distilled_water')*1000)
    .fluidInputs(fluid('ammonia')*1000)
    .fluidOutputs(fluid('clean_ammonia_solution')*1000)
    .EUt(12)
    .duration(200)
    .buildAndRegister();

CONTINOUS_STIRRING_TANK_REACTOR_RECIPES.recipeBuilder()
    .fluidInputs(fluid('ammonia_solution')*1000)
    .fluidInputs(fluid('sulfuric_acid')*1000)
    .fluidOutputs(fluid('ammonium_bisulfate_solution')*1000)
    .EUt(40)
    .duration(200)
    .buildAndRegister();

ELECTROLYZER_RECIPES.recipeBuilder()
    .fluidInputs(fluid('ammonium_bisulfate_solution')*1000)
    .fluidOutputs(fluid('hydrogen')*1000)
    .fluidOutputs(fluid('ammonium_persulfate_solution')*1000)
    .notConsumable(metaitem('stickIron'))
    .notConsumable(metaitem('graphite_electrode'))
    .EUt(60)
    .duration(200)
    .buildAndRegister();

// Water * 1000
mods.gregtech.chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 1])], [fluid('hydrochloric_acid') * 1000 * 1000, fluid('methanol') * 1000 * 1000])

//Nitric Acid

// Nitric Acid * 1000
mods.gregtech.large_chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 24])], [fluid('oxygen') * 4000 * 4000, fluid('ammonia') * 1000 * 1000])
// Nitric Acid * 1000
mods.gregtech.large_chemical_reactor.removeByInput(480, [metaitem('circuit.integrated').withNbt(['Configuration': 24])], [fluid('nitrogen') * 1000 * 1000, fluid('hydrogen') * 3000 * 3000, fluid('oxygen') * 4000 * 4000])
// Nitric Acid * 2000
mods.gregtech.chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 1])], [fluid('nitrogen_dioxide') * 3000 * 3000, fluid('water') * 1000 * 1000])
// Nitric Acid * 2000
mods.gregtech.chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 3])], [fluid('water') * 1000 * 1000, fluid('oxygen') * 1000 * 1000, fluid('nitrogen_dioxide') * 2000 * 2000])

//Ostwald Proccess

CATALYTIC_CONVERTER_RECIPES.recipeBuilder()
    .fluidInputs(fluid('oxygen')*5000)
    .fluidInputs(fluid('ammonia')*4000)
    .fluidOutputs(fluid('nitric_oxide')*4000)
    .fluidOutputs(fluid('water')*6000)
    .EUt(12)
    .duration(400)
    .buildAndRegister();

PLUG_FLOW_REACTOR_RECIPES.recipeBuilder()
    .fluidInputs(fluid('nitric_oxide')*2000)
    .fluidInputs(fluid('oxygen')*2000)
    .fluidOutputs(fluid('nitrogen_dioxide')*2000)
    .EUt(20)
    .duration(300)
    .buildAndRegister();

ADSORPTION_TOWER.recipeBuilder()
    .fluidInputs(fluid('nitrogen_dioxide')*3000)
    .fluidInputs(fluid('water')*1000)
    .fluidOutputs(fluid('nitric_acid')*2000)
    .fluidOutputs(fluid('nitric_oxide')*1000)
    .EUt(20)
    .duration(300)
    .buildAndRegister();


// Nitric Acid * 2000
mods.gregtech.large_chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 1])], [fluid('nitrogen_dioxide') * 3000 * 3000, fluid('water') * 1000 * 1000])
// Nitric Oxide Gas * 2000
mods.gregtech.chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 1])], [fluid('oxygen') * 5000 * 5000, fluid('ammonia') * 2000 * 2000])
// Ammonia Gas * 1000
mods.gregtech.large_chemical_reactor.removeByInput(384, [metaitem('circuit.integrated').withNbt(['Configuration': 1])], [fluid('hydrogen') * 3000 * 3000, fluid('nitrogen') * 1000 * 1000])

STIRRED_TANK_REACTOR_RECIPES.recipeBuilder()
    .fluidInputs(fluid('chlorine')*2000)
    .inputs(metaitem('dustSodiumHydroxide')*2)
    .outputs(metaitem('dustSalt'))
    .fluidOutputs(fluid('sodium_hypochlorite')*1000)
    .fluidOutputs(fluid('water')*1000)
    .EUt(20)
    .duration(300)
    .buildAndRegister();

// Nitrogen Dioxide Gas * 1000
mods.gregtech.large_chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 3])], [fluid('nitrogen') * 1000 * 1000, fluid('oxygen') * 2000 * 2000])
// Nitrogen Dioxide Gas * 1000
mods.gregtech.chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 1])], [fluid('oxygen') * 1000 * 1000, fluid('nitric_oxide') * 1000 * 1000])

TUBE_FURNACE_RECIPES.recipeBuilder()
    .inputs(metaitem('dustAmmoniumChloride')*2)
    .fluidOutputs(fluid('hydrochloric_acid')*1000)
    .fluidOutputs(fluid('ammonia')*1000)
    .EUt(30)
    .duration(350)
    .buildAndRegister();

// Ammonia Gas * 1000
mods.gregtech.electrolyzer.removeByInput(30, [metaitem('dustAmmoniumChloride') * 2], null)

TUBE_FURNACE_RECIPES.recipeBuilder()
    .inputs(metaitem('dustIridiumChloride') * 4)
    .fluidInputs(fluid('hydrogen')*3000)
    .outputs(metaitem('dustIridium'))
    .fluidOutputs(fluid('hydrochloric_acid')*2000)
    .EUt(50)
    .duration(240)
    .buildAndRegister();


// Iridium Dust * 1
mods.gregtech.chemical_reactor.removeByInput(30, [metaitem('dustIridiumChloride') * 4], [fluid('hydrogen') * 3000 * 3000])
// Acetic Acid * 1000
mods.gregtech.large_chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 2])], [fluid('oxygen') * 2000 * 2000, fluid('ethylene') * 1000 * 1000])
// Acetic Acid * 1000
mods.gregtech.large_chemical_reactor.removeByInput(30, null, [fluid('carbon_monoxide') * 1000 * 1000, fluid('methanol') * 1000 * 1000])
// Acetic Acid * 1000
mods.gregtech.large_chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 2])], [fluid('hydrogen') * 4000 * 4000, fluid('carbon_monoxide') * 2000 * 2000])
// Acetic Acid * 1000
mods.gregtech.large_chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 4]), metaitem('dustCarbon') * 2], [fluid('oxygen') * 2000 * 2000, fluid('hydrogen') * 4000 * 4000])
