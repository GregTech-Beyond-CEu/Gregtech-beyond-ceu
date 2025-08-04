import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;


        FIXED_BED_REACTOR_RECIPES.recipeBuilder()
                .inputs(metaitem('dustSulfur')*4)
                .fluidInputs(fluid('methane')*1000)
                .fluidOutputs(fluid('carbon_disulfide')*1000)
                .fluidOutputs(fluid('hydrogen_sulfide')*1000)
                .duration(400)
                .EUt(12)
                .buildAndRegister();

        CONTINOUS_STIRRING_TANK_REACTOR_RECIPES.recipeBuilder()
                .fluidInputs(fluid('ammonia')*1000)
                .fluidInputs(fluid('nitric_acid')*1000)
                .fluidOutputs(fluid('ammonium_nitrate')*1000)
                .duration(400)
                .EUt(12)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('water')*1000)
                .inputs(metaitem('dustWheat')*3)
                .circuitMeta(3)
                .fluidOutputs(fluid('grain_solution')*1000)
                .duration(400)
                .EUt(12)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .blastFurnaceTemp(1200)
                .EUt(700)
                .duration(200)
                .inputs(metaitem('dustCalciumCarbide')*3)
                .outputs(metaitem('dustCalciumHydroxide')*5)
                .fluidInputs(fluid('steam')*2000)
                .fluidOutputs(fluid('acetylene')*1000)
                .buildAndRegister();

// Calcium Dust * 1
mods.gregtech.electrolyzer.removeByInput(30, [metaitem('dustCalciumChloride') * 3], null)

        ELECTROLYZER_RECIPES.recipeBuilder()
                .notConsumable(metaitem('stickIron'))
                .notConsumable(metaitem('stickGold'))
                .inputs(metaitem('dustCalciumChloride')*3)
                .fluidOutputs(fluid('chlorine')*2000)
                .outputs(metaitem('dustCalcium'))
                .EUt(40)
                .duration(200)
                .buildAndRegister();

        ELECTROLYZER_RECIPES.recipeBuilder()
                .notConsumable(metaitem('stickIron'))
                .notConsumable(metaitem('stickGold'))
                .inputs(metaitem('dustZincChloride')*3)
                .fluidOutputs(fluid('chlorine')*2000)
                .outputs(metaitem('dustZinc'))
                .EUt(40)
                .duration(200)
                .buildAndRegister();

        FIXED_BED_REACTOR_RECIPES.recipeBuilder()
                .fluidInputs(fluid('nitrobenzene')*1000)
                .fluidInputs(fluid('hydrogen')*3000)
                .notConsumable(metaitem('dustNickel'))
                .fluidOutputs(fluid('water')*2000)
                .fluidOutputs(fluid('aniline')*1000)
                .EUt(300)
                .duration(100)
                .buildAndRegister();

        FIXED_BED_REACTOR_RECIPES.recipeBuilder()
                .fluidInputs(fluid('acetylene')*1000)
                .fluidInputs(fluid('formaldehyde')*1000)
                .notConsumable(metaitem('dustCopper'))
                .fluidOutputs(fluid('propargyl_alcohol')*1000)
                .EUt(300)
                .duration(100)
                .buildAndRegister();

        CONTINOUS_STIRRING_TANK_REACTOR_RECIPES.recipeBuilder()
                .fluidInputs(fluid('dichloromethane')*1000)
                .fluidInputs(fluid('propargyl_alcohol')*1000)
                .fluidInputs(fluid('thionyl_chloride')*1000)
                .fluidOutputs(fluid('propargyl_chloride_solution')*1000)
                .EUt(250)
                .duration(200)
                .buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(fluid('propargyl_chloride_solution')*1000)
                .fluidOutputs(fluid('propargylchloride')*1000)
                .fluidOutputs(fluid('sulfur_dioxide')*1000)
                .fluidOutputs(fluid('hydrochloric_acid')*1000)
                .EUt(250)
                .duration(200)
                .buildAndRegister();

        FIXED_BED_REACTOR_RECIPES.recipeBuilder()
                .fluidInputs(fluid('ethylene')*1000)
                .fluidInputs(fluid('oxygen')*1000)
                .notConsumable(metaitem('dustGold'))
                .fluidOutputs(fluid('ethylene_oxide')*1000)
                .EUt(20)
                .duration(240)
                .buildAndRegister();

        STIRRED_TANK_REACTOR_RECIPES.recipeBuilder()
                .fluidInputs(fluid('chloromethane')*1000)
                .inputs(metaitem('dustWood'))
                .inputs(metaitem('dustSodiumHydroxide'))
                .fluidOutputs(fluid('methylcellulose')*1000)
                .outputs(metaitem('dustSalt'))
                .fluidOutputs(fluid('water')*1000)
                .EUt(110)
                .duration(300)
                .buildAndRegister();
        
        FLUIDIZED_BED_REACTOR_RECIPES.recipeBuilder()
                .fluidInputs(fluid('chlorine')*1000)
                .inputs(metaitem('dustIron'))
                .fluidOutputs(fluid('iron_chloride')*1000)
                .EUt(110)
                .duration(300)
                .buildAndRegister();

        //Trimethyl Tin Chloride

        STIRRED_TANK_REACTOR_RECIPES.recipeBuilder()
                .fluidInputs(fluid('hydrobromic_acid')*1000)
                .fluidInputs(fluid('methanol')*1000)
                .fluidOutputs(fluid('methyl_bromide')*1000)
                .duration(300)
                .EUt(40)
                .buildAndRegister();

        //Grignard Reagent Synthesis

        STIRRED_TANK_REACTOR_RECIPES.recipeBuilder()
                .fluidInputs(fluid('methyl_bromide')*1000)
                .notConsumable(metaitem('dustIodine')*2)
                .notConsumable(fluid('dry_diethyl_ether')*1000)
                .inputs(metaitem('dustMagnesium'))
                .notConsumable(fluid('nitrogen')*2000)
                .notConsumable(metaitem('fume_hood'))
                .fluidOutputs(fluid('methylmagnesium_bromide')*1000)
                .duration(300)
                .EUt(40)
                .buildAndRegister();

        FRACTIONAL_DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(fluid('diethyl_ether')*1000)
                .notConsumable(fluid('difluorobenzophenone')*1000)
                .fluidOutputs(fluid('dry_diethyl_ether')*1000)
                .duration(300)
                .EUt(240)
                .buildAndRegister();

        FLUIDIZED_BED_REACTOR_RECIPES.recipeBuilder()
                .fluidInputs(fluid('chlorine')*4000)
                .inputs(metaitem('dustTin'))
                .outputs(metaitem('dustTinChloride'))
                .duration(300)
                .EUt(380)
                .buildAndRegister();

        //Grignard Reaction

        STIRRED_TANK_REACTOR_RECIPES.recipeBuilder()
                .inputs(metaitem('dustTinChloride'))
                .fluidInputs(fluid('methylmagnesium_bromide')*1000)
                .fluidOutputs(fluid('trimethyl_tin_chloride') * 1000)
                .outputs(metaitem('dustMagnesiumChloride')*3)
                .duration(150)
                .EUt(480)
                .buildAndRegister();

        //Chichibabin Synthesis

        STIRRED_TANK_REACTOR_RECIPES.recipeBuilder()
                .fluidInputs(fluid('formaldehyde')*1000)
                .fluidInputs(fluid('ammonia')*1000)
                .fluidInputs(fluid('gtfo_acetaldehyde')*1000)
                .fluidOutputs(fluid('pyridine')*1000)
                .fluidOutputs(fluid('water')*1000)
                .duration(150)
                .EUt(480)
                .buildAndRegister();

        //Dichloromethane

        UV_LIGHT_RECIPES.recipeBuilder()
                .fluidInputs(fluid('methane')*1000)
                .fluidInputs(fluid('chlorine')*2000)
                .fluidOutputs(fluid('hydrogen_chloride')*1000)
                .fluidOutputs(fluid('dichloromethane')*1000)
                .duration(100)
                .EUt(250)
                .buildAndRegister();

        //Diluted Acetone

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('distilled_water')*1000)
                .fluidInputs(fluid('acetone')*1000)
                .fluidOutputs(fluid('diluted_acetone')*1000)
                .duration(100)
                .EUt(40)
                .buildAndRegister();

        //Phosphorus Oxychloride

        BATCH_REACTOR_RECIPES.recipeBuilder()
                .fluidInputs(fluid('phosphorus_trichloride')*3000)
                .fluidInputs(fluid('phosphoric_acid')*1000)
                .notConsumable(metaitem('fume_hood'))
                .fluidOutputs(fluid('phosphorus_oxychloride')*4000)
                .fluidOutputs(fluid('hydrochloric_acid')*3000)
                .duration(200)
                .EUt(40)
                .buildAndRegister();

        //Barium Peroxide

        BLAST_RECIPES.recipeBuilder()
                .fluidInputs(fluid('oxygen')*2000)
                .inputs(metaitem('dustBariumOxide')*4)
                .outputs(metaitem('dustBariumPeroxide')*6)
                .duration(200)
                .EUt(40)
                .blastFurnaceTemp(2300)
                .buildAndRegister();

        //Boron Oxide

        ELECTROLYZER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustBoronOxide')*2)
                .notConsumable(metaitem('stickIron'))
                .notConsumable(metaitem('stickPlatinum'))
                .fluidOutputs(fluid('oxygen')*1000)
                .outputs(metaitem('dustBoron'))
                .duration(200)
                .EUt(40)
                .buildAndRegister();

        CONTINOUS_STIRRING_TANK_REACTOR_RECIPES.recipeBuilder()
                .fluidInputs(fluid('nitric_acid')*1000)
                .fluidInputs(fluid('distilled_water')*1000)
                .inputs(metaitem('dustLead')*2)
                .fluidOutputs(fluid('lead_nitrate_solution')*1000)
                .duration(300)
                .EUt(50)
                .buildAndRegister();

        VACUUM_DESICCATOR_RECIPES.recipeBuilder()
                .fluidInputs(fluid('lead_nitrate_solution')*1000)
                .fluidOutputs(fluid('water')*1000)
                .outputs(metaitem('dustLeadNitrate')*2)
                .duration(300)
                .EUt(50)
                .buildAndRegister();

        //Diborane

        TRICKLE_BED_REACTOR_RECIPES.recipeBuilder()
                .fluidInputs(fluid('boron_trifluoride')*2000)
                .inputs(metaitem('dustLithiumAluminiumHydride')*3)
                .fluidOutputs(fluid('diborane')*1000)
                .outputs(metaitem('dustLithiumFluoride')*3)
                .outputs(metaitem('dustAluminiumTrifluoride')*3)
                .duration(300)
                .EUt(50)
                .buildAndRegister();

        //Sodium Silicate


        CHEMICAL_RECIPES.recipeBuilder()
                .inputs(metaitem('dustSodaAsh'))
                .inputs(metaitem('dustSiliconDioxide'))
                .outputs(metaitem('dustSodiumSilicate'))
                .fluidOutputs(fluid('carbon_dioxide')*1000)
                .duration(300)
                .EUt(50)
                .buildAndRegister();

        //Lithium Aluminium Hydride

        TRICKLE_BED_REACTOR_RECIPES.recipeBuilder()
                .inputs(metaitem('dustLithiumHydride')*4)
                .inputs(metaitem('dustAluminiumChloride'))
                .fluidInputs(fluid('diethyl_ether')*1000)
                .fluidOutputs(fluid('lithium_aluminium_hydride_solution')*1000)
                .duration(400)
                .EUt(150)
                .buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(fluid('lithium_aluminium_hydride_solution')*1000)
                .outputs(metaitem('dustLithiumAluminiumHydride'))
                .fluidOutputs(fluid('diethyl_ether')*1000)
                .fluidOutputs(fluid('lithium_chloride_solution')*3000)
                .duration(400)
                .EUt(150)
                .buildAndRegister();
                
// Hydrochloric Acid * 1000
mods.gregtech.large_chemical_reactor.removeByInput(7, null, [fluid('chlorine') * 1000 * 1000, fluid('hydrogen') * 1000 * 1000])
// Liquid Iron III Chloride * 1000
mods.gregtech.large_chemical_reactor.removeByInput(30, [metaitem('dustIron'), metaitem('circuit.integrated').withNbt(['Configuration': 1])], [fluid('hydrochloric_acid') * 3000 * 3000])
// Hydrochloric Acid * 2000
mods.gregtech.large_chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 2])], [fluid('chlorine') * 4000 * 4000, fluid('benzene') * 1000 * 1000])
// Nitric Acid * 2000
mods.gregtech.large_chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 3])], [fluid('water') * 1000 * 1000, fluid('oxygen') * 1000 * 1000, fluid('nitrogen_dioxide') * 2000 * 2000])
// Phosphoric Acid * 2000
mods.gregtech.large_chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 24]), metaitem('dustPhosphorus') * 2], [fluid('water') * 3000 * 3000, fluid('oxygen') * 5000 * 5000])
// Nitric Oxide Gas * 2000
mods.gregtech.large_chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 1])], [fluid('oxygen') * 5000 * 5000, fluid('ammonia') * 2000 * 2000])
// Nitrogen Dioxide Gas * 1000
mods.gregtech.large_chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 1])], [fluid('oxygen') * 1000 * 1000, fluid('nitric_oxide') * 1000 * 1000])
// Sulfuric Acid * 1000
mods.gregtech.large_chemical_reactor.removeByInput(7, null, [fluid('sulfur_trioxide') * 1000 * 1000, fluid('water') * 1000 * 1000])
// Sulfuric Acid * 1000
mods.gregtech.large_chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 2])], [fluid('hydrogen_sulfide') * 1000 * 1000, fluid('oxygen') * 4000 * 4000])
// Water * 1000
mods.gregtech.large_chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 1])], [fluid('oxygen') * 3000 * 3000, fluid('hydrogen_sulfide') * 1000 * 1000])
// Sulfur Trioxide Gas * 1000
mods.gregtech.large_chemical_reactor.removeByInput(7, null, [fluid('sulfur_dioxide') * 1000 * 1000, fluid('oxygen') * 1000 * 1000])
// Sulfur Dioxide Gas * 1000
mods.gregtech.large_chemical_reactor.removeByInput(7, [metaitem('circuit.integrated').withNbt(['Configuration': 2]), metaitem('dustSulfur')], [fluid('oxygen') * 2000 * 2000])
// Iridium Dust * 1
mods.gregtech.large_chemical_reactor.removeByInput(30, [metaitem('dustIridiumChloride') * 4], [fluid('hydrogen') * 3000 * 3000])
// Iridium Metal Residue * 5
mods.gregtech.large_chemical_reactor.removeByInput(7680, [metaitem('dustRarestMetalMixture') * 7], [fluid('hydrochloric_acid') * 4000 * 4000])
// Acetone * 2000
mods.gregtech.large_chemical_reactor.removeByInput(480, [metaitem('dustQuicklime'), metaitem('circuit.integrated').withNbt(['Configuration': 24])], [fluid('acetic_acid') * 3000 * 3000])
// Salt * 4
mods.gregtech.large_chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 24]), metaitem('dustSodiumHydroxide') * 6], [fluid('benzene') * 2000 * 2000, fluid('chlorine') * 4000 * 4000])
// Phenol * 1000
mods.gregtech.large_chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 24])], [fluid('propene') * 1000 * 1000, fluid('benzene') * 1000 * 1000, fluid('oxygen') * 1000 * 1000, fluid('phosphoric_acid') * 100 * 100])
// Phenol * 1000
mods.gregtech.large_chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 24])], [fluid('benzene') * 1000 * 1000, fluid('chlorine') * 2000 * 2000, fluid('water') * 1000 * 1000])
