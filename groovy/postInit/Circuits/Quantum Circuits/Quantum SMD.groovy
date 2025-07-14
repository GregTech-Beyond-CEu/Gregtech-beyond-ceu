import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;

    CVD_UNIT_RECIPES.recipeBuilder()
        .inputs(metaitem('stickGraphene'))
        .inputs(metaitem('plateAluminium'))
        .outputs(metaitem('graphene_electrode_substrate'))
        .duration(300)
        .EUt(4000)
        .buildAndRegister();

    ATOMIC_LAYER_DEPOSITION_RECIPES.recipeBuilder()
        .inputs(metaitem('graphene_electrode_substrate'))
        .inputs(metaitem('dustHafniumOxide'))
        .outputs(metaitem('dielectric_electrode_substrate'))
        .EUt(2000)
        .duration(500)
        .buildAndRegister();

    CVD_UNIT_RECIPES.recipeBuilder()
        .inputs(metaitem('dielectric_electrode_substrate'))
        .inputs(metaitem('stickGraphene'))
        .outputs(metaitem('top_electrode_deposited_substrate'))
        .duration(300)
        .EUt(4000)
        .buildAndRegister();

    SPINCOATER_RECIPES.recipeBuilder()
        .fluidInputs(fluid('pmma')*100)
        .inputs(metaitem('thin_kapton_k_sheet'))
        .inputs(metaitem('top_electrode_deposited_substrate'))
        .outputs(metaitem('spincoated_substrate'))
        .duration(500)
        .EUt(4000)
        .buildAndRegister();

    UV_LIGHT_RECIPES.recipeBuilder()
        .fluidInputs(fluid('deionized_water')*1000)
        .inputs(metaitem('spincoated_substrate'))
        .outputs(metaitem('deionized_substrate'))
        .duration(400)
        .EUt(3000)
        .buildAndRegister();

    ELECTRON_BEAM_LITHOGRAPHER_RECIPES_MULTI.recipeBuilder()
        .inputs(metaitem('electron_source_100kv'))
        .fluidInputs(fluid('pmma')*100)
        .inputs(metaitem('deionized_substrate'))
        .inputs(metaitem('dustSapphire'))
        .inputs(metaitem('dustNiobium'))
        .outputs(metaitem('exposed_substrate'))
        .duration(500)
        .EUt(2500)
        .buildAndRegister();

    PLASMA_ETCHER_RECIPES.recipeBuilder()
        .fluidInputs(fluid('diluted_hydrofluoric_acid')*1000)
        .outputs(metaitem('etched_exposed_substrate'))
        .inputs(metaitem('exposed_substrate'))
        .duration(400)
        .EUt(2200)
        .buildAndRegister();

    ATOMIC_LAYER_DEPOSITION_RECIPES.recipeBuilder()
        .inputs(metaitem('dustTantalumOxide'))
        .inputs(metaitem('dustYttriumOxide'))
        .inputs(metaitem('etched_exposed_substrate'))
        .outputs(metaitem('atomic_layered_substrate'))
        .duration(400)
        .EUt(1900)
        .buildAndRegister();

    CUTTER_RECIPES.recipeBuilder()
        .fluidInputs(fluid('water')*200)
        .inputs(metaitem('atomic_layered_substrate'))
        .outputs(metaitem('quantum_smd_capacitor_chips')*8)
        .duration(800)
        .EUt(2100)
        .buildAndRegister();

    CUTTER_RECIPES.recipeBuilder()
        .fluidInputs(fluid('distilled_water')*100)
        .inputs(metaitem('atomic_layered_substrate'))
        .outputs(metaitem('quantum_smd_capacitor_chips')*8)
        .duration(600)
        .EUt(2100)
        .buildAndRegister();

    CUTTER_RECIPES.recipeBuilder()
        .fluidInputs(fluid('lubricant')*50)
        .inputs(metaitem('atomic_layered_substrate'))
        .outputs(metaitem('quantum_smd_capacitor_chips')*8)
        .duration(400)
        .EUt(2100)
        .buildAndRegister();

    ASSEMBLER_RECIPES.recipeBuilder()
        .fluidInputs(fluid('epoxy')*288)
        .inputs(metaitem('sod_323_packaging'))
        .inputs(metaitem('quantum_smd_capacitor_chips')*8)
        .outputs(metaitem('quantum_smd_capacitor')*8)
        .duration(400)
        .EUt(2100)
        .buildAndRegister();

    MOCVD_UNIT_RECIPES.recipeBuilder()
        .inputs(metaitem('dustPolonium'))
        .inputs(metaitem('dustTellurium'))
        .inputs(metaitem('dustBeryllium'))
        .fluidInputs(fluid('hydrogen')*1000)
        .inputs(metaitem('ga_as_wafer'))
        .fluidInputs(fluid('trimethylgallium')*1000)
        .fluidInputs(fluid('arsine')*1000)
        .outputs(metaitem('heavily_doped_ga_as_wafer'))
        .duration(400)
        .EUt(2100)
        .buildAndRegister();

    CHEMICAL_BATH_RECIPES.recipeBuilder()
        .fluidInputs(fluid('plasma.oxygen')*100)
        .inputs(metaitem('heavily_doped_ga_as_wafer'))
        .outputs(metaitem('cleaned_doped_ga_as_wafer'))
        .duration(500)
        .EUt(1200)
        .buildAndRegister();

    CVD_UNIT_RECIPES.recipeBuilder()
        .inputs(metaitem('cleaned_doped_ga_as_wafer'))
        .inputs(metaitem('dustGraphene'))
        .outputs(metaitem('resistivated_ga_as_wafer'))
        .duration(400)
        .EUt(1400)
        .buildAndRegister();

    SPINCOATER_RECIPES.recipeBuilder()
        .inputs(metaitem('resistivated_ga_as_wafer'))
        .fluidInputs(fluid('pmma')*250)
        .outputs(metaitem('spincoated_resistivated_ga_as_wafer'))
        .duration(500)
        .EUt(1200)
        .buildAndRegister();

    ELECTRON_BEAM_LITHOGRAPHER_RECIPES_MULTI.recipeBuilder()
        .fluidInputs(fluid('pmma')*200)
        .inputs(metaitem('spincoated_resistivated_ga_as_wafer'))
        .notConsumable(metaitem('resistor_lithography_mask'))
        .outputs(metaitem('engraved_spincoated_ga_as_wafer'))
        .duration(300)
        .EUt(1600)
        .buildAndRegister();

    ELECTRON_BEAM_LITHOGRAPHER_RECIPES.recipeBuilder()
        .fluidInputs(fluid('pmma')*200)
        .inputs(metaitem('spincoated_resistivated_ga_as_wafer'))
        .notConsumable(metaitem('resistor_lithography_mask'))
        .outputs(metaitem('engraved_spincoated_ga_as_wafer'))
        .duration(300)
        .EUt(1600)
        .buildAndRegister();

    CHEMICAL_BATH_RECIPES.recipeBuilder()
        .fluidInputs(fluid('methyl_isobutyl_ketone')*500)
        .inputs(metaitem('engraved_spincoated_ga_as_wafer'))
        .outputs(metaitem('developed_ga_as_wafer'))
        .duration(500)
        .EUt(4200)
        .buildAndRegister();

    ATOMIC_LAYER_DEPOSITION_RECIPES.recipeBuilder()
        .inputs(metaitem('dielectric_film'))
        .inputs(metaitem('developed_ga_as_wafer'))
        .inputs(metaitem('wireFineRuthenium'))
        .outputs(metaitem('atomic_layered_ga_as_wafer'))
        .duration(500)
        .EUt(4200)
        .buildAndRegister();

    BLAST_RECIPES.recipeBuilder()
        .blastFurnaceTemp(3000)
        .inputs(metaitem('atomic_layered_ga_as_wafer'))
        .fluidInputs(fluid('oxygen')*1000)
        .outputs(metaitem('annealed_ga_as_wafer'))
        .duration(400)
        .EUt(3000)
        .buildAndRegister();

    CUTTER_RECIPES.recipeBuilder()
        .fluidInputs(fluid('water')*200)
        .inputs(metaitem('annealed_ga_as_wafer'))
        .outputs(metaitem('quantum_smd_resistor_chips')*8)
        .duration(800)
        .EUt(2100)
        .buildAndRegister();

    CUTTER_RECIPES.recipeBuilder()
        .fluidInputs(fluid('distilled_water')*100)
        .inputs(metaitem('annealed_ga_as_wafer'))
        .outputs(metaitem('quantum_smd_resistor_chips')*8)
        .duration(600)
        .EUt(2100)
        .buildAndRegister();

    CUTTER_RECIPES.recipeBuilder()
        .fluidInputs(fluid('lubricant')*50)
        .inputs(metaitem('annealed_ga_as_wafer'))
        .outputs(metaitem('quantum_smd_resistor_chips')*8)
        .duration(400)
        .EUt(2100)
        .buildAndRegister();

    MOCVD_UNIT_RECIPES.recipeBuilder()
        .inputs(metaitem('plateBeryllium'))
        .inputs(metaitem('dustGalliumArsenide'))
        .inputs(metaitem('dustCadmiumMagnesiumTellurium'))
        .fluidInputs(fluid('aluminium_gallium_arsenide')*1000)
        .outputs(metaitem('quantum_well_substrate'))
        .duration(400)
        .EUt(2100)
        .buildAndRegister();

    LASER_ENGRAVER_RECIPES.recipeBuilder()
        .inputs(metaitem('transistor_lithography_mask'))
        .inputs(metaitem('quantum_well_substrate'))
        .outputs(metaitem('engraved_substrate'))
        .duration(400)
        .EUt(2100)
        .buildAndRegister();

    PLASMA_ETCHER_RECIPES.recipeBuilder()
        .inputs(metaitem('engraved_substrate'))
        .outputs(metaitem('etched_substrate'))
        .fluidInputs(fluid('gtfo_citric_acid')*250)
        .duration(500)
        .EUt(1700)
        .buildAndRegister();

    ATOMIC_LAYER_DEPOSITION_RECIPES.recipeBuilder()
        .inputs(metaitem('etched_substrate'))
        .outputs(metaitem('gated_substrate'))
        .inputs(metaitem('dustHafniumOxide'))
        .duration(600)
        .EUt(3700)
        .buildAndRegister();

    MOCVD_UNIT_RECIPES.recipeBuilder()
        .inputs(item('supercritical:meta_wire_fine', 10) *4)
        .inputs(metaitem('gated_substrate'))
        .outputs(metaitem('metal_layered_substrate'))
        .duration(500)
        .EUt(3200)
        .buildAndRegister();

    BLAST_RECIPES.recipeBuilder()
        .blastFurnaceTemp(4000)
        .EUt(6000)
        .duration(800)
        .fluidInputs(fluid('oxygen')*1000)
        .inputs(metaitem('metal_layered_substrate'))
        .outputs(metaitem('annealed_layered_substrate'))
        .buildAndRegister();

    CUTTER_RECIPES.recipeBuilder()
        .fluidInputs(fluid('water')*200)
        .inputs(metaitem('annealed_layered_substrate'))
        .outputs(metaitem('quantum_smd_transistor_chips')*8)
        .duration(800)
        .EUt(2100)
        .buildAndRegister();

    CUTTER_RECIPES.recipeBuilder()
        .fluidInputs(fluid('distilled_water')*100)
        .inputs(metaitem('annealed_layered_substrate'))
        .outputs(metaitem('quantum_smd_transistor_chips')*8)
        .duration(600)
        .EUt(2100)
        .buildAndRegister();

    CUTTER_RECIPES.recipeBuilder()
        .fluidInputs(fluid('lubricant')*50)
        .inputs(metaitem('annealed_layered_substrate'))
        .outputs(metaitem('quantum_smd_transistor_chips')*8)
        .duration(400)
        .EUt(2100)
        .buildAndRegister();

    ENGRAVING_UNIT_RECIPES.recipeBuilder()
        .inputs(metaitem('heavily_doped_ga_as_wafer'))
        .fluidInputs(fluid('pmma')*250)
        .notConsumable(metaitem('diode_lithography_mask'))
        .outputs(metaitem('engraved_doped_ga_as_wafer'))
        .duration(350)
        .EUt(1900)
        .buildAndRegister();

    PLASMA_ETCHER_RECIPES.recipeBuilder()
        .fluidInputs(fluid('sulfuric_acid')*1000)
        .inputs(metaitem('engraved_doped_ga_as_wafer'))
        .outputs(metaitem('mesa_structured_ga_as_wafer'))
        .duration(550)
        .EUt(2900)
        .buildAndRegister();

    HIGH_VACUUM_EVAPORATION_RECIPES.recipeBuilder()
        .inputs(metaitem('mesa_structured_ga_as_wafer'))
        .inputs(metaitem('stickGold'))
        .outputs(metaitem('gold_layered_ga_as_wafer'))
        .duration(650)
        .EUt(1500)
        .buildAndRegister();
    
    CVD_UNIT_RECIPES.recipeBuilder()
        .fluidInputs(fluid('methane')*1000)
        .inputs(metaitem('stickAluminium'))
        .inputs(metaitem('gold_layered_ga_as_wafer'))
        .outputs(metaitem('aluminium_layered_ga_as_wafer'))
        .duration(450)
        .EUt(2500)
        .buildAndRegister();

    CVD_UNIT_RECIPES.recipeBuilder()
        .fluidInputs(fluid('methane')*1000)
        .inputs(metaitem('dustSiliconNitride'))
        .inputs(metaitem('aluminium_layered_ga_as_wafer'))
        .outputs(metaitem('passivated_quantum_smd_wafer'))
        .duration(550)
        .EUt(2700)
        .buildAndRegister();

    CUTTER_RECIPES.recipeBuilder()
        .fluidInputs(fluid('water')*200)
        .inputs(metaitem('passivated_quantum_smd_wafer'))
        .outputs(metaitem('quantum_smd_diode_chips')*8)
        .duration(800)
        .EUt(2100)
        .buildAndRegister();

    CUTTER_RECIPES.recipeBuilder()
        .fluidInputs(fluid('distilled_water')*100)
        .inputs(metaitem('passivated_quantum_smd_wafer'))
        .outputs(metaitem('quantum_smd_diode_chips')*8)
        .duration(600)
        .EUt(2100)
        .buildAndRegister();

    CUTTER_RECIPES.recipeBuilder()
        .fluidInputs(fluid('lubricant')*50)
        .inputs(metaitem('passivated_quantum_smd_wafer'))
        .outputs(metaitem('quantum_smd_diode_chips')*8)
        .duration(400)
        .EUt(2100)
        .buildAndRegister();
    
    ASSEMBLER_RECIPES.recipeBuilder()
        .fluidInputs(fluid('soldering_alloy')*288)
        .inputs(metaitem('frameLead'))
        .inputs(metaitem('wireFineHssg')*4)
        .outputs(metaitem('sod_323_packaging'))
        .EUt(2000)
        .duration(700)
        .buildAndRegister();

    ASSEMBLER_RECIPES.recipeBuilder()
        .fluidInputs(fluid('epoxy')*288)
        .inputs(metaitem('sod_323_packaging'))
        .inputs(metaitem('quantum_smd_inductor_chips')*8)
        .outputs(metaitem('quantum_smd_inductor')*8)
        .duration(400)
        .EUt(2100)
        .buildAndRegister();

    ASSEMBLER_RECIPES.recipeBuilder()
        .fluidInputs(fluid('epoxy')*288)
        .inputs(metaitem('sod_323_packaging'))
        .inputs(metaitem('quantum_smd_transistor_chips')*8)
        .outputs(metaitem('quantum_smd_transistor')*8)
        .duration(400)
        .EUt(2100)
        .buildAndRegister();
        
    ASSEMBLER_RECIPES.recipeBuilder()
        .fluidInputs(fluid('epoxy')*288)
        .inputs(metaitem('sod_323_packaging'))
        .inputs(metaitem('quantum_smd_diode_chips')*8)
        .outputs(metaitem('quantum_smd_diode')*8)
        .duration(400)
        .EUt(2100)
        .buildAndRegister();
        
    ASSEMBLER_RECIPES.recipeBuilder()
        .fluidInputs(fluid('epoxy')*288)
        .inputs(metaitem('sod_323_packaging'))
        .inputs(metaitem('quantum_smd_resistor_chips')*8)
        .outputs(metaitem('quantum_smd_resistor')*8)
        .duration(400)
        .EUt(2100)
        .buildAndRegister();