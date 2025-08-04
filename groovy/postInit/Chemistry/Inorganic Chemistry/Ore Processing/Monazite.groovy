import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;

        BALL_MILL_RECIPES.recipeBuilder()
                .inputs(item('gregtech:ore_monazite_0'))
                .outputs(metaitem('dustGroundMonazite')*16) //BALL MILLS
                .EUt(280)
                .duration(500)
                .buildAndRegister();

        DIGESTER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('concentrated_sodium_hydroxide')*1000)
                .inputs(metaitem('dustGroundMonazite')*8)
                .fluidOutputs(fluid('monazite_mixed_rare_earth_hydroxides') * 1000)
                .fluidOutputs(fluid('sodium_phosphate_solution')*1000)
                .EUt(300)
                .duration(400)
                .buildAndRegister();

        BATCH_REACTOR_RECIPES.recipeBuilder()
                .fluidInputs(fluid('monazite_mixed_rare_earth_hydroxides')*1000)
                .fluidInputs(fluid('hydrochloric_acid')*1000)
                .outputs(metaitem('dustThoriumFiltrate')*3)
                .fluidOutputs(fluid('monazite_rare_earth_chloride_solution') * 1000)
                .EUt(500)
                .duration(300)
                .buildAndRegister();

        OXIDATION_FURNACE_RECIPES.recipeBuilder()
                .fluidInputs(fluid('monazite_rare_earth_chloride_solution')*1000)
                .fluidInputs(fluid('hydrogen_peroxide')*1000)
                .fluidOutputs(fluid('water')*1000)
                .chancedOutput(metaitem('dustCeriumIvHydroxide')*1, 6666, 0)
                .fluidOutputs(fluid('monazite_cerium_depleted_rare_earth_chloride_solution') * 200)
                .EUt(500)
                .duration(300)
                .buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .fluidInputs(fluid('monazite_cerium_depleted_rare_earth_chloride_solution')*1000)
                .fluidInputs(fluid('d_2_ehpa') * 1000)
                .fluidOutputs(fluid('monazite_lree_depleted_rare_earth_solution') * 500)
                .fluidOutputs(fluid('monazite_lree_solution') * 1500)
                .EUt(400)
                .duration(600)
                .buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .fluidInputs(fluid('monazite_lree_depleted_rare_earth_solution') * 1000)
                .fluidInputs(fluid('cyanex_272')*1000)
                .fluidOutputs(fluid('monazite_hree_solution') * 1000)
                .EUt(500)
                .duration(500)
                .buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(fluid('monazite_hree_solution')*1000)
                .fluidOutputs(fluid('monazite_lree_raffinate')*100)
                .fluidOutputs(fluid('cyanex_272')*1000)
                .fluidOutputs(fluid('monazite_hree_raffinate') * 1000)
                .EUt(500)
                .duration(500)
                .buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .fluidInputs(fluid('hehehp')*1000)
                .fluidInputs(fluid('monazite_hree_raffinate') * 1000)
                .fluidOutputs(fluid('monazite_dy_depleted_raffinate') * 400)
                .fluidOutputs(fluid('monazite_dysprosium_yttrium_extract') * 1600)
                .EUt(400)
                .duration(800)
                .buildAndRegister();

        CONTINOUS_STIRRING_TANK_REACTOR_RECIPES.recipeBuilder()
                .fluidInputs(fluid('oxalic_acid_solution')*1000)
                .fluidInputs(fluid('monazite_dy_depleted_raffinate') * 1000)
                .fluidOutputs(fluid('monazite_terbium_depleted_raffinate') * 500)
                .fluidOutputs(fluid('terbium_oxalate_solution') * 1000)
                .EUt(450)
                .duration(750)
                .buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(fluid('terbium_oxalate_solution')*1000)
                .outputs(metaitem('dustTerbiumOxalate')*2)
                .fluidOutputs(fluid('hehehp')*1000)
                .EUt(500)
                .duration(850)
                .buildAndRegister();

        FLUIDIZED_BED_REACTOR_RECIPES.recipeBuilder()
                .fluidInputs(fluid('monazite_terbium_depleted_raffinate')*1000)
                .inputs(metaitem('dustSodiumHydroxide')*3)
                .fluidOutputs(fluid('monazite_adjusted_terbium_depleted_raffinate') * 1000)
                .EUt(480)
                .duration(600)
                .buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .fluidInputs(fluid('hehehp')*1000)
                .fluidInputs(fluid('monazite_adjusted_terbium_depleted_raffinate') * 1000)
                .fluidOutputs(fluid('monazite_holmium_depleted_hree_raffinate') * 1000)
                .fluidOutputs(fluid('monazite_holmium_extract') * 1000)
                .EUt(450)
                .duration(500)
                .buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(fluid('monazite_holmium_extract')*1000)
                .fluidOutputs(fluid('monazite_holmium_raffinate')*1000)
                .fluidOutputs(fluid('hehehp')*1000)
                .EUt(450)
                .duration(500)
                .buildAndRegister();

        VACUUM_RECIPES.recipeBuilder()
                .fluidInputs(fluid('monazite_holmium_depleted_hree_raffinate')*1000)
                .outputs(metaitem('ingotMonaziteHolmiumDepletedRaffinate'))
                .notConsumable(metaitem('shape.mold.ingot'))
                .EUt(350)
                .duration(400)
                .buildAndRegister();

        ZONE_REFINER_RECIPES.recipeBuilder()
                .inputs(metaitem('ingotMonaziteHolmiumDepletedRaffinate'))
                .outputs(metaitem('ingotPurifiedmonaziteHolmiumDepletedRaffinate'))
                .EUt(600)
                .duration(800)
                .buildAndRegister();

        ZONE_REFINER_RECIPES.recipeBuilder()
                .outputs(metaitem('ingotMonaziteErbiumConcentrateRaffinateIngot'))
                .inputs(metaitem('ingotPurifiedmonaziteHolmiumDepletedRaffinate'))
                .EUt(600)
                .duration(800)
                .buildAndRegister();

        CUTTER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('lubricant')*40)
                .inputs(metaitem('ingotMonaziteErbiumConcentrateRaffinateIngot'))
                .outputs(metaitem('ingotErbiumDepletedRaffinateIngot'))
                .outputs(metaitem('ingotErbiumEnrichedRaffinateIngot'))
                .EUt(600)
                .duration(800)
                .buildAndRegister();

        BATCH_REACTOR_RECIPES.recipeBuilder()
                .inputs(metaitem('ingotErbiumEnrichedRaffinateIngot')*2)
                .fluidInputs(fluid('hydrochloric_acid')*6000)
                .fluidOutputs(fluid('water')*3000)
                .fluidOutputs(fluid('erbium_trichloride')*2000)
                .EUt(500)
                .duration(500)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .fluidInputs(fluid('oxygen')*2000)
                .inputs(metaitem('ingotErbiumDepletedRaffinateIngot'))
                .outputs(metaitem('dustMonaziteMixedReeOxides'))
                .EUt(400)
                .duration(300)
                .blastFurnaceTemp(3000)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('ultrapure_water_grade_1') * 1000)
                .inputs(metaitem('dustMonaziteMixedReeOxides')*2)
                .fluidOutputs(fluid('monazite_mixed_ree_oxides_solution') * 1000)
                .EUt(900)
                .duration(500)
                .buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .fluidInputs(fluid('cyanex_272')*1000)
                .fluidInputs(fluid('monazite_mixed_ree_oxides_solution') * 1000)
                .fluidOutputs(fluid('thulium_solution')*1000)
                .fluidOutputs(fluid('monazite_thulium_depleted_raffinate') * 1000)
                .EUt(600)
                .duration(600)
                .buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(fluid('thulium_solution')*1000)
                .fluidOutputs(fluid('thulium_trichloride')*2000)
                .fluidOutputs(fluid('cyanex_272')*1000)
                .EUt(450)
                .duration(500)
                .buildAndRegister();

        CONTINOUS_STIRRING_TANK_REACTOR_RECIPES.recipeBuilder()
                .fluidInputs(fluid('monazite_thulium_depleted_raffinate')*1000)
                .fluidInputs(fluid('oxalic_acid_solution')*1000)
                .outputs(metaitem('dustYtterbiumOxalate'))
                .fluidOutputs(fluid('ytterbium_depleted_raffinate') * 1000)
                .EUt(400)
                .duration(530)
                .buildAndRegister();

        ION_EXCHANGE_RECIPES.recipeBuilder()
                .inputs(metaitem('purolite_s_950_ion_exchange_resin'))
                .outputs(metaitem('loaded_purolite_s_950_ion_exchange_resin'))
                .fluidInputs(fluid('ytterbium_depleted_raffinate') * 1000)
                .EUt(500)
                .duration(450)
                .buildAndRegister();

        ELUTION_COLUMN_RECIPES.recipeBuilder()
                .inputs(metaitem('loaded_purolite_s_950_ion_exchange_resin'))
                .fluidInputs(fluid('hydrochloric_acid')*3000)
                .outputs(metaitem('used_purolite_s_950_ion_exchange_resin'))
                .fluidOutputs(fluid('lutetium_trichloride')*2000)
                .EUt(450)
                .duration(350)
                .buildAndRegister();

        REGENERATION_UNIT_RECIPES.recipeBuilder()
                .inputs(metaitem('used_purolite_s_950_ion_exchange_resin'))
                .outputs(metaitem('purolite_s_950_ion_exchange_resin'))
                .EUt(420)
                .duration(600)
                .buildAndRegister();

        TRICKLE_BED_REACTOR_RECIPES.recipeBuilder()
                .fluidInputs(fluid('oxalic_acid')*4000)
                .fluidInputs(fluid('monazite_dysprosium_yttrium_extract')*2000)
                .outputs(metaitem('dustYttriumOxalate')*4)
                .outputs(metaitem('dustDysprosiumOxalate'))
                .EUt(420)
                .duration(600)
                .buildAndRegister();

        TRICKLE_BED_REACTOR_RECIPES.recipeBuilder()
                .inputs(metaitem('pvdf_mesh'))
                .fluidInputs(fluid('d_2_ehpa')*1000)
                .fluidInputs(fluid('kerosene')*1000)
                .outputs(metaitem('membrane_cartridge'))
                .EUt(250)
                .duration(500)
                .buildAndRegister();

        HOLLOW_FIBER_CONTACTOR_RECIPES.recipeBuilder()
                .inputs(metaitem('membrane_cartridge'))
                .fluidInputs(fluid('hydrochloric_acid')*2000)
                .fluidInputs(fluid('monazite_lree_raffinate')*1000)
                .outputs(metaitem('loaded_membrane_cartridge'))
                .EUt(400)
                .duration(350)
                .buildAndRegister();

        HOLLOW_FIBER_CONTACTOR_RECIPES.recipeBuilder()
                .inputs(metaitem('loaded_membrane_cartridge'))
                .outputs(metaitem('membrane_cartridge'))
                .fluidOutputs(fluid('monazite_sm_rich_raffinate') * 500)
                .EUt(300)
                .duration(450)
                .buildAndRegister();

        ION_EXCHANGE_RECIPES.recipeBuilder()
                .inputs(metaitem('chelating_ion_exchange_resin'))
                .fluidInputs(fluid('monazite_sm_rich_raffinate') * 1000)
                .fluidOutputs(fluid('monazite_sm_depleted_raffinate') * 1000)
                .outputs(metaitem('loaded_chelating_ion_exchange_resin'))
                .EUt(250)
                .duration(550)
                .buildAndRegister();

        ELUTION_COLUMN_RECIPES.recipeBuilder()
                .inputs(metaitem('loaded_chelating_ion_exchange_resin'))
                .outputs(metaitem('used_chelating_ion_exchange_resin'))
                .fluidOutputs(fluid('samarium_trichloride')*2000)
                .EUt(320)
                .duration(500)
                .buildAndRegister();
                
        REGENERATION_UNIT_RECIPES.recipeBuilder()
                .inputs(metaitem('used_chelating_ion_exchange_resin'))
                .outputs(metaitem('chelating_ion_exchange_resin'))
                .EUt(330)
                .duration(440)
                .buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .fluidInputs(fluid('monazite_sm_depleted_raffinate') * 1000)
                .fluidInputs(fluid('d_2_ehpa')*800)
                .fluidOutputs(fluid('monazite_hree_raffinate')*200)
                .fluidOutputs(fluid('neodymium_raffinate') * 800)
                .EUt(360)
                .duration(570)
                .buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(fluid('neodymium_raffinate') * 1000)
                .fluidOutputs(fluid('d_2_ehpa')*1000)
                .fluidOutputs(fluid('neodymium_trichloride')*2000)
                .EUt(400)
                .duration(800)
                .buildAndRegister();

        CONTINOUS_STIRRING_TANK_REACTOR_RECIPES.recipeBuilder()
                .fluidInputs(fluid('neodymium_trichloride')*2000)
                .fluidOutputs(fluid('hydrochloric_acid')*6000)
                .outputs(metaitem('dustNeodymiumOxalate')*2)
                .fluidInputs(fluid('oxalic_acid')*2000)
                .EUt(180)
                .duration(400)
                .buildAndRegister();

        CONTINOUS_STIRRING_TANK_REACTOR_RECIPES.recipeBuilder()
                .fluidInputs(fluid('erbium_trichloride')*2000)
                .fluidOutputs(fluid('hydrochloric_acid')*6000)
                .outputs(metaitem('dustErbiumOxalate')*2)
                .fluidInputs(fluid('oxalic_acid')*2000)
                .EUt(180)
                .duration(400)
                .buildAndRegister();

        CONTINOUS_STIRRING_TANK_REACTOR_RECIPES.recipeBuilder()
                .fluidInputs(fluid('ytterbium_trichloride')*2000)
                .fluidOutputs(fluid('hydrochloric_acid')*6000)
                .outputs(metaitem('dustYtterbiumOxalate')*2)
                .fluidInputs(fluid('oxalic_acid')*2000)
                .EUt(180)
                .duration(400)
                .buildAndRegister();

        CONTINOUS_STIRRING_TANK_REACTOR_RECIPES.recipeBuilder()
                .fluidInputs(fluid('terbium_trichloride')*2000)
                .fluidOutputs(fluid('hydrochloric_acid')*6000)
                .outputs(metaitem('dustTerbiumOxalate')*2)
                .fluidInputs(fluid('oxalic_acid')*2000)
                .EUt(180)
                .duration(400)
                .buildAndRegister();

        CONTINOUS_STIRRING_TANK_REACTOR_RECIPES.recipeBuilder()
                .fluidInputs(fluid('lutetium_trichloride')*2000)
                .fluidOutputs(fluid('hydrochloric_acid')*6000)
                .outputs(metaitem('dustLutetiumOxalate')*2)
                .fluidInputs(fluid('oxalic_acid')*2000)
                .EUt(180)
                .duration(400)
                .buildAndRegister();

        CONTINOUS_STIRRING_TANK_REACTOR_RECIPES.recipeBuilder()
                .fluidInputs(fluid('thulium_trichloride')*2000)
                .fluidOutputs(fluid('hydrochloric_acid')*6000)
                .outputs(metaitem('dustThuliumOxalate')*2)
                .fluidInputs(fluid('oxalic_acid')*2000)
                .EUt(180)
                .duration(400)
                .buildAndRegister();

        CONTINOUS_STIRRING_TANK_REACTOR_RECIPES.recipeBuilder()
                .fluidInputs(fluid('praseodymium_trichloride')*2000)
                .fluidOutputs(fluid('hydrochloric_acid')*6000)
                .outputs(metaitem('dustPraseodymiumOxalate')*2)
                .fluidInputs(fluid('oxalic_acid')*2000)
                .EUt(180)
                .duration(400)
                .buildAndRegister();

        CONTINOUS_STIRRING_TANK_REACTOR_RECIPES.recipeBuilder()
                .fluidInputs(fluid('samarium_trichloride')*2000)
                .fluidOutputs(fluid('hydrochloric_acid')*6000)
                .outputs(metaitem('dustSamariumOxalate')*2)
                .fluidInputs(fluid('oxalic_acid')*2000)
                .EUt(180)
                .duration(400)
                .buildAndRegister();

        CONTINOUS_STIRRING_TANK_REACTOR_RECIPES.recipeBuilder()
                .fluidInputs(fluid('holmium_trichloride')*2000)
                .fluidOutputs(fluid('hydrochloric_acid')*6000)
                .outputs(metaitem('dustHolmiumOxalate')*2)
                .fluidInputs(fluid('oxalic_acid')*2000)
                .EUt(180)
                .duration(400)
                .buildAndRegister();

        ROTARY_KILN_RECIPES.recipeBuilder()
                .inputs(metaitem('dustHolmiumOxalate')*2)
                .fluidOutputs(fluid('carbon_dioxide')*3000)
                .fluidOutputs(fluid('carbon_monoxide')*3000)
                .outputs(metaitem('dustHolmiumOxide'))
                .EUt(300)
                .duration(500)
                .buildAndRegister();

        ROTARY_KILN_RECIPES.recipeBuilder()
                .inputs(metaitem('dustLanthanumOxalate')*2)
                .fluidOutputs(fluid('carbon_dioxide')*3000)
                .fluidOutputs(fluid('carbon_monoxide')*3000)
                .outputs(metaitem('dustLanthanumOxide'))
                .EUt(300)
                .duration(500)
                .buildAndRegister();

        ROTARY_KILN_RECIPES.recipeBuilder()
                .inputs(metaitem('dustNeodymiumOxalate')*2)
                .fluidOutputs(fluid('carbon_dioxide')*3000)
                .fluidOutputs(fluid('carbon_monoxide')*3000)
                .outputs(metaitem('dustNeodymiumOxide'))
                .EUt(300)
                .duration(500)
                .buildAndRegister();

        ROTARY_KILN_RECIPES.recipeBuilder()
                .inputs(metaitem('dustSamariumOxalate')*2)
                .fluidOutputs(fluid('carbon_dioxide')*3000)
                .fluidOutputs(fluid('carbon_monoxide')*3000)
                .outputs(metaitem('dustSamariumOxide'))
                .EUt(300)
                .duration(500)
                .buildAndRegister();

        ROTARY_KILN_RECIPES.recipeBuilder()
                .inputs(metaitem('dustErbiumOxalate')*2)
                .fluidOutputs(fluid('carbon_dioxide')*3000)
                .fluidOutputs(fluid('carbon_monoxide')*3000)
                .outputs(metaitem('dustErbiumOxide'))
                .EUt(300)
                .duration(500)
                .buildAndRegister();

        ROTARY_KILN_RECIPES.recipeBuilder()
                .inputs(metaitem('dustLutetiumOxalate')*2)
                .fluidOutputs(fluid('carbon_dioxide')*3000)
                .fluidOutputs(fluid('carbon_monoxide')*3000)
                .outputs(metaitem('dustLutetiumOxide'))
                .EUt(300)
                .duration(500)
                .buildAndRegister();

        ROTARY_KILN_RECIPES.recipeBuilder()
                .inputs(metaitem('dustYtterbiumOxalate')*2)
                .fluidOutputs(fluid('carbon_dioxide')*3000)
                .fluidOutputs(fluid('carbon_monoxide')*3000)
                .outputs(metaitem('dustYtterbiumOxide'))
                .EUt(300)
                .duration(500)
                .buildAndRegister();

        ROTARY_KILN_RECIPES.recipeBuilder()
                .inputs(metaitem('dustThuliumOxalate')*2)
                .fluidOutputs(fluid('carbon_dioxide')*3000)
                .fluidOutputs(fluid('carbon_monoxide')*3000)
                .outputs(metaitem('dustThuliumOxide'))
                .EUt(300)
                .duration(500)
                .buildAndRegister();

        ROTARY_KILN_RECIPES.recipeBuilder()
                .inputs(metaitem('dustPraseodymiumOxalate')*2)
                .fluidOutputs(fluid('carbon_dioxide')*3000)
                .fluidOutputs(fluid('carbon_monoxide')*3000)
                .outputs(metaitem('dustPraseodymiumOxide'))
                .EUt(300)
                .duration(500)
                .buildAndRegister();

        ROTARY_KILN_RECIPES.recipeBuilder()
                .inputs(metaitem('dustYttriumOxalate')*2)
                .fluidOutputs(fluid('carbon_dioxide')*3000)
                .fluidOutputs(fluid('carbon_monoxide')*3000)
                .outputs(metaitem('dustYttriumOxide'))
                .EUt(300)
                .duration(500)
                .buildAndRegister();

        ROTARY_KILN_RECIPES.recipeBuilder()
                .inputs(metaitem('dustDysprosiumOxalate')*2)
                .fluidOutputs(fluid('carbon_dioxide')*3000)
                .fluidOutputs(fluid('carbon_monoxide')*3000)
                .outputs(metaitem('dustDysprosiumOxide'))
                .EUt(300)
                .duration(500)
                .buildAndRegister();

        ROTARY_KILN_RECIPES.recipeBuilder()
                .inputs(metaitem('dustTerbiumOxalate')*2)
                .fluidOutputs(fluid('carbon_dioxide')*3000)
                .fluidOutputs(fluid('carbon_monoxide')*3000)
                .outputs(metaitem('dustTerbiumOxide'))
                .EUt(300)
                .duration(500)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .blastFurnaceTemp(3000)
                .EUt(480)
                .duration(800)
                .inputs(metaitem('dustCalcium')*3)
                .outputs(metaitem('dustCalciumOxide')*3)
                .notConsumable(metaitem('molybdenum_crucible'))
                .inputs(metaitem('dustDysprosiumOxide')*5)
                .outputs(metaitem('dustDysprosium')*2)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .blastFurnaceTemp(3000)
                .EUt(480)
                .duration(800)
                .inputs(metaitem('dustCalcium')*3)
                .outputs(metaitem('dustCalciumOxide')*3)
                .notConsumable(metaitem('molybdenum_crucible'))
                .inputs(metaitem('dustLanthanumOxide')*5)
                .outputs(metaitem('dustLanthanum')*2)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .blastFurnaceTemp(3000)
                .EUt(480)
                .duration(800)
                .inputs(metaitem('dustCalcium')*3)
                .outputs(metaitem('dustCalciumOxide')*3)
                .notConsumable(metaitem('molybdenum_crucible'))
                .inputs(metaitem('dustNeodymiumOxide')*5)
                .outputs(metaitem('dustNeodymium')*2)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .blastFurnaceTemp(3000)
                .EUt(480)
                .duration(800)
                .inputs(metaitem('dustCalcium')*3)
                .outputs(metaitem('dustCalciumOxide')*3)
                .notConsumable(metaitem('molybdenum_crucible'))
                .inputs(metaitem('dustSamariumOxide')*5)
                .outputs(metaitem('dustSamarium')*2)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .blastFurnaceTemp(3000)
                .EUt(480)
                .duration(800)
                .inputs(metaitem('dustCalcium')*3)
                .outputs(metaitem('dustCalciumOxide')*3)
                .notConsumable(metaitem('molybdenum_crucible'))
                .inputs(metaitem('dustErbiumOxide')*5)
                .outputs(metaitem('dustErbium')*2)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .blastFurnaceTemp(3000)
                .EUt(480)
                .duration(800)
                .inputs(metaitem('dustCalcium')*3)
                .outputs(metaitem('dustCalciumOxide')*3)
                .notConsumable(metaitem('molybdenum_crucible'))
                .inputs(metaitem('dustHolmiumOxide')*5)
                .outputs(metaitem('dustHolmium')*2)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .blastFurnaceTemp(3000)
                .EUt(480)
                .duration(800)
                .inputs(metaitem('dustCalcium')*3)
                .outputs(metaitem('dustCalciumOxide')*3)
                .notConsumable(metaitem('molybdenum_crucible'))
                .inputs(metaitem('dustPraseodymiumOxide')*5)
                .outputs(metaitem('dustPraseodymium')*2)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .blastFurnaceTemp(3000)
                .EUt(480)
                .duration(800)
                .inputs(metaitem('dustCalcium')*3)
                .outputs(metaitem('dustCalciumOxide')*3)
                .notConsumable(metaitem('molybdenum_crucible'))
                .inputs(metaitem('dustLutetiumOxide')*5)
                .outputs(metaitem('dustLutetium')*2)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .blastFurnaceTemp(3000)
                .EUt(480)
                .duration(800)
                .inputs(metaitem('dustCalcium')*3)
                .outputs(metaitem('dustCalciumOxide')*3)
                .notConsumable(metaitem('molybdenum_crucible'))
                .inputs(metaitem('dustThuliumOxide')*5)
                .outputs(metaitem('dustThulium')*2)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .blastFurnaceTemp(3000)
                .EUt(480)
                .duration(800)
                .inputs(metaitem('dustCalcium')*3)
                .outputs(metaitem('dustCalciumOxide')*3)
                .notConsumable(metaitem('molybdenum_crucible'))
                .inputs(metaitem('dustTerbiumOxide')*5)
                .outputs(metaitem('dustTerbium')*2)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .blastFurnaceTemp(3000)
                .EUt(480)
                .duration(800)
                .inputs(metaitem('dustCalcium')*3)
                .outputs(metaitem('dustCalciumOxide')*3)
                .notConsumable(metaitem('molybdenum_crucible'))
                .inputs(metaitem('dustYttriumOxide')*5)
                .outputs(metaitem('dustYttrium')*2)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .blastFurnaceTemp(3000)
                .EUt(480)
                .duration(800)
                .inputs(metaitem('dustCalcium')*3)
                .outputs(metaitem('dustCalciumOxide')*3)
                .notConsumable(metaitem('molybdenum_crucible'))
                .inputs(metaitem('dustYtterbiumOxide')*5)
                .outputs(metaitem('dustYtterbium')*2)
                .buildAndRegister();

        //Monazite LREE

        PHASE_SEPARATOR_RECIPES.recipeBuilder()
                .fluidInputs(fluid('monazite_lree_raffinate')*1000)
                .fluidOutputs(fluid('d_2_ehpa') * 1000)
                .fluidOutputs(fluid('monazite_lanthanum_raffinate')*600)
                .fluidOutputs(fluid('stripped_lanthanum_monazite_leach') * 400)
                .EUt(500)
                .duration(500)
                .buildAndRegister();

        MIXER_SETTLER_REACTOR_RECIPES.recipeBuilder()
                .fluidInputs(fluid('monazite_lanthanum_raffinate')*1000)
                .fluidInputs(fluid('hydrochloric_acid')*3000)
                .fluidOutputs(fluid('lanthanum_trichloride')*1000)
                .EUt(400)
                .duration(450)
                .buildAndRegister();

        CONTINOUS_STIRRING_TANK_REACTOR_RECIPES.recipeBuilder()
                .fluidInputs(fluid('lanthanum_trichloride')*1000)
                .fluidOutputs(fluid('hydrochloric_acid')*6000)
                .outputs(metaitem('dustLanthanumOxalate')*2)
                .fluidInputs(fluid('oxalic_acid')*2000)
                .EUt(180)
                .duration(400)
                .buildAndRegister();

        // Lanthanum Dust * 1
mods.gregtech.electrolyzer.removeByInput(90, [metaitem('dustLanthanumOxide') * 3], null)

        CONTINOUS_STIRRING_TANK_REACTOR_RECIPES.recipeBuilder()
                .fluidInputs(fluid('dodecanol')*1000)
                .fluidInputs(fluid('isodecanol')*1000)
                .fluidInputs(fluid('stripped_lanthanum_monazite_leach') * 1000)
                .fluidOutputs(fluid('monazite_praseodymium_rich_monazite_feed')*1000)
                .EUt(180)
                .duration(400)
                .buildAndRegister();

        STIRRED_TANK_REACTOR_RECIPES.recipeBuilder()
                .fluidInputs(fluid('d_2_ehpa')*1000)
                .fluidInputs(fluid('monazite_praseodymium_rich_monazite_feed')*1000)
                .fluidOutputs(fluid('hydrogen')*2000)
                .outputs(metaitem('dustPraseodymiumD2EhpaComplex')*11)
                .EUt(380)
                .duration(500)
                .buildAndRegister();

        PHASE_SEPARATOR_RECIPES.recipeBuilder()
                .inputs(metaitem('dustPraseodymiumD2EhpaComplex')*11)
                .fluidOutputs(fluid('monazite_lree_raffinate')*700)
                .outputs(metaitem('dustLoadedPraesodymiumComplex')*4)
                .EUt(450)
                .duration(600)
                .buildAndRegister();

        MIXER_SETTLER_REACTOR_RECIPES.recipeBuilder()
                .inputs(metaitem('dustLoadedPraesodymiumComplex')*4)
                .fluidInputs(fluid('hydrochloric_acid')*3000)
                .fluidOutputs(fluid('praseodymium_trichloride')*1000)
                .fluidOutputs(fluid('d_2_ehpa_solvent_solution') * 1000)
                .EUt(400)
                .duration(450)
                .buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(fluid('d_2_ehpa_solvent_solution') * 1000)
                .fluidOutputs(fluid('dodecanol')*1000)
                .fluidOutputs(fluid('isodecanol')*1000)
                .fluidOutputs(fluid('d_2_ehpa')*1000)
                .EUt(300)
                .duration(250)
                .buildAndRegister();