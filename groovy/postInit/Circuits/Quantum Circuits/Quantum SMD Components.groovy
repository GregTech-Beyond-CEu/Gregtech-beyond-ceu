import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;

//Tantalum Capacitor

    ASSEMBLER_RECIPES.recipeBuilder()
        .inputs(metaitem('dustHighPurityTantalum'))
        .inputs(metaitem('stickHighPurityTantalum'))
        .outputs(metaitem('pressed_tantalum_pellet'))
        .EUt(7000)
        .duration(400)
        .buildAndRegister();

    VACUUM_FURNACE_RECIPES.recipeBuilder()
        .inputs(metaitem('pressed_tantalum_pellet'))
        .outputs(metaitem('porous_sintered_pellet'))
        .duration(500)
        .EUt(6000)
        .buildAndRegister();

    ELECTROLYZER_RECIPES.recipeBuilder()
        .inputs(metaitem('porous_sintered_pellet'))
        .fluidInputs(fluid('sulfuric_acid')*1000)
        .outputs(metaitem('oxidized_anode'))
        .duration(450)
        .EUt(5600)
        .buildAndRegister();

    MIXER_RECIPES.recipeBuilder()
        .inputs(metaitem('oxidized_anode'))
        .inputs(metaitem('dustManganeseDioxide'))
        .inputs(metaitem('dustGraphite'))
        .outputs(metaitem('tantalum_cap_core'))
        .duration(400)
        .EUt(6200)
        .buildAndRegister();

    ASSEMBLER_RECIPES.recipeBuilder()
        .inputs(metaitem('tantalum_cap_core'))
        .inputs(metaitem('dustSilver'))
        .fluidInputs(fluid('epoxy')*500)
        .outputs(metaitem('tantalum_capacitor'))
        .duration(300)
        .EUt(5200)
        .buildAndRegister();

    //Zener Diode


    ION_IMPLANTER_RECIPES.recipeBuilder()
        .fluidInputs(fluid('diborane')*1000)
        .inputs(metaitem('p_doped_ga_as_wafer'))
        .outputs(metaitem('zener_junction_core'))
        .duration(200)
        .EUt(1000)
        .buildAndRegister();

    ASSEMBLER_RECIPES.recipeBuilder()
        .inputs(metaitem('zener_junction_core'))
        .inputs(metaitem('foilNickel'))
        .inputs(metaitem('wireGtSingleGold'))
        .outputs(metaitem('zener_diode_die'))
        .duration(150)
        .EUt(800)
        .buildAndRegister();

    ASSEMBLER_RECIPES.recipeBuilder()
        .inputs(metaitem('zener_diode_die'))
        .inputs(metaitem('component.glass.tube'))
        .fluidInputs(fluid('epoxy')*100)
        .outputs(metaitem('zener_diode'))
        .duration(200)
        .EUt(650)
        .buildAndRegister();

    //Precision Resistor Array

    ASSEMBLER_RECIPES.recipeBuilder()
        .inputs(metaitem('wafer.silicon'))
        .inputs(metaitem('dustTantalumNitride')*2)
        .fluidInputs(fluid('pmma')*250)
        .inputs(ore('craftingLensGlass'))
        .inputs(metaitem('wireGtSingleSilver')*2)
        .outputs(metaitem('precision_resistor_array'))
        .EUt(480)
        .duration(400)
        .buildAndRegister();

    //Crystal Oscillator Module

    PRECISION_LASER_RECIPES.recipeBuilder()
        .inputs(metaitem('gemExquisiteNetherQuartz'))
        .fluidInputs(fluid('argon')*1000)
        .inputs(metaitem('foilSilver'))
        .outputs(metaitem('oscillating_quartz_blank'))
        .EUt(280)
        .duration(200)
        .buildAndRegister();

    CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder()
        .inputs(metaitem('oscillating_quartz_blank'))
        .inputs(metaitem('battery.re.ulv.tantalum'))
        .inputs(metaitem('quantum_smd_transistor')*2)
        .inputs(metaitem('precision_resistor_array'))
        .inputs(metaitem('plate.integrated_logic_circuit')*2)
        .outputs(metaitem('crystal_oscillator_circuit'))
        .EUt(380)
        .duration(300)
        .buildAndRegister();

    ASSEMBLER_RECIPES.recipeBuilder()
        .inputs(metaitem('wireGtSingleYttriumBariumCuprate')*8)
        .circuitMeta(8)
        .outputs(metaitem('yttrium_barium_cuprate_coil'))
        .EUt(800)
        .duration(300)
        .buildAndRegister();

    ASSEMBLER_RECIPES.recipeBuilder()
        .inputs(metaitem('crystal_oscillator_circuit'))
        .fluidInputs(fluid('epoxy')*500)
        .inputs(metaitem('plateSteel'))
        .outputs(metaitem('crystal_oscillator'))
        .EUt(800)
        .duration(300)
        .buildAndRegister();

    //IV Voltage Regulator

    ASSEMBLER_RECIPES.recipeBuilder()
        .inputs(metaitem('zener_diode'))
        .inputs(metaitem('precision_resistor_array'))
        .inputs(metaitem('crystal_oscillator'))
        .outputs(metaitem('voltage_reference_core'))
        .EUt(1800)
        .duration(500)
        .buildAndRegister();

    ASSEMBLER_RECIPES.recipeBuilder()
        .inputs(metaitem('voltage_reference_core'))
        .inputs(metaitem('battery.re.ulv.tantalum'))
        .inputs(metaitem('wireGtSingleSilver'))
        .inputs(metaitem('plate.integrated_logic_circuit')*4)
        .outputs(metaitem('stabilized_voltage_regulator_board'))
        .EUt(1800)
        .duration(500)
        .buildAndRegister();

    ASSEMBLER_RECIPES.recipeBuilder()
        .fluidInputs(fluid('helium')*1000)
        .inputs(metaitem('stabilized_voltage_regulator_board'))
        .inputs(metaitem('yttrium_barium_cuprate_coil'))
        .outputs(metaitem('iv_voltage_regulator'))
        .EUt(1800)
        .duration(500)
        .buildAndRegister();