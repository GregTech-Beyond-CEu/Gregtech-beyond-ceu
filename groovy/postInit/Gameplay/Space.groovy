import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;


SPACE_COMPONENT_ASSEMBLING.recipeBuilder()
    .inputs(metaitem('frameAluminium')*2)
    .inputs(metaitem('cableGtDoubleGold')*4)
    .inputs(metaitem('wireGtOctalMagnesiumDiboride')*2)
    .inputs(metaitem('cover.solar.panel')*2)
    .inputs(metaitem('plateAluminium')*12)
    .inputs(ore('circuitHv')*4)
    .fluidInputs(fluid('soldering_alloy')*144)
    .outputs(metaitem('satellite'))
    .EUt(80)
    .duration(800)
    .buildAndRegister();

IMPLOSION_RECIPES.recipeBuilder()
    .inputs(metaitem('plateDoubleBronze')*8)
    .outputs(item('galacticraftcore:basic_item', 10))
    .explosivesAmount(16)
    .EUt(2000)
    .duration(400)
    .buildAndRegister();

IMPLOSION_RECIPES.recipeBuilder()
    .inputs(metaitem('plateDoubleCopper')*8)
    .outputs(item('galacticraftcore:basic_item', 6))
    .EUt(2000)
    .explosivesAmount(16)
    .duration(400)
    .buildAndRegister();

IMPLOSION_RECIPES.recipeBuilder()
    .inputs(metaitem('plateDoubleTin')*8)
    .outputs(item('galacticraftcore:basic_item', 7))
    .explosivesAmount(16)
    .EUt(2000)
    .duration(400)
    .buildAndRegister();

IMPLOSION_RECIPES.recipeBuilder()
    .inputs(metaitem('plateDoubleAluminium')*8)
    .outputs(item('galacticraftcore:basic_item', 8))
    .explosivesAmount(16)
    .EUt(2000)
    .duration(400)
    .buildAndRegister();

IMPLOSION_RECIPES.recipeBuilder()
    .inputs(metaitem('plateDoubleSteel')*8)
    .outputs(item('galacticraftcore:basic_item', 9))
    .explosivesAmount(16)
    .EUt(2000)
    .duration(400)
    .buildAndRegister();

IMPLOSION_RECIPES.recipeBuilder()
    .inputs(metaitem('plateDoubleMeteoricIron')*8)
    .outputs(item('galacticraftcore:basic_item', 11))
    .explosivesAmount(16)
    .EUt(2000)
    .duration(400)
    .buildAndRegister();

ASSEMBLER_RECIPES.recipeBuilder()
    .fluidInputs(fluid('soldering_alloy')*1000)
    .inputs(item('galacticraftcore:basic_item', 8)*2)
    .inputs(item('galacticraftcore:basic_item', 9)*2)
    .inputs(item('galacticraftcore:basic_item', 10)*2)
    .outputs(item('galacticraftcore:heavy_plating'))
    .EUt(1500)
    .duration(200)
    .buildAndRegister();

ROCKET_ASSEMBLY_RECIPES.recipeBuilder()
    .inputs(item('galacticraftcore:heavy_plating')*6)
    .inputs(item('minecraft:redstone_torch'))
    .inputs(metaitem('frameTitanium'))
    .inputs(metaitem('carbon_carbon_plate')*6)
    .inputs(metaitem('foilGraphene')*4)
    .inputs(metaitem('fused_quartz_panel')*4)
    .inputs(metaitem('wireGtDoubleUraniumTriplatinum'))
    .outputs(item('galacticraftcore:nose_cone'))
    .EUt(1800)
    .duration(400)
    .buildAndRegister();

crafting.remove('galacticraftcore:nose_cone');

ROCKET_ASSEMBLY_RECIPES.recipeBuilder()
    .inputs(metaitem('frameTitanium'))
    .inputs(metaitem('carbon_carbon_plate')*4)
    .inputs(metaitem('piezoelectric_actuator'))
    .inputs(metaitem('superalloy_bearing')*8)
    .outputs(item('galacticraftcore:rocket_fins'))
    .inputs(metaitem('gyroscope_chip'))
    .EUt(7000)
    .duration(400)
    .buildAndRegister();
    
SPACE_COMPONENT_ASSEMBLING.recipeBuilder()
    .inputs(metaitem('piezoelectric_crystal'))
    .inputs(metaitem('stickSilver'))
    .outputs(metaitem('piezoelectric_actuator'))
    .EUt(2000)
    .duration(500)
    .buildAndRegister();

VACUUM_FURNACE_RECIPES.recipeBuilder()
    .inputs(metaitem('dustCarbonNanotubes')*2)
    .inputs(metaitem('dustGraphite')*2)
    .outputs(metaitem('carbon_carbon_plate'))
    .EUt(1500)
    .duration(200)
    .buildAndRegister();

SPACE_COMPONENT_ASSEMBLING.recipeBuilder()
    .inputs(metaitem('plateTungstenSteel'))
    .inputs(metaitem('plateIncoloyMa956'))
    .inputs(metaitem('plateHastelloyX'))
    .outputs(metaitem('superalloy_bearing'))
    .EUt(1300)
    .duration(400)
    .buildAndRegister();


ROCKET_ASSEMBLY_RECIPES.recipeBuilder()
    .inputs(metaitem('combustion_generator.hv')*16)
    .inputs(metaitem('advanced_nozzle'))
    .inputs(metaitem('turbo_pump_assembly'))
    .inputs(metaitem('cryogenic_fuel_lines'))
    .inputs(metaitem('quantum_integrated_engine_controller'))
    .inputs(metaitem('thermal_control_loop'))
    .inputs(item('galacticraftcore:air_vent'))
    .inputs(metaitem('item_casingTitanium')*8)
    .outputs(item('galacticraftcore:engine'))
    .EUt(7000)
    .duration(400)
    .buildAndRegister();

ROCKET_ASSEMBLY_RECIPES.recipeBuilder()
    .inputs(metaitem('plateIridiumAlloy')*4)
    .inputs(metaitem('ringNickelZincFerrite'))
    .inputs(metaitem('plateIridium'))
    .inputs(metaitem('carbon_carbon_plate')*2)
    .inputs(metaitem('pipeHugeFluidNiobiumTitanium')*4)
    .inputs(metaitem('plateTungstenCarbide')*4)
    .outputs(metaitem('advanced_nozzle'))
    .EUt(3000)
    .duration(300)
    .buildAndRegister();

FORMING_PRESS_RECIPES.recipeBuilder()
    .inputs(metaitem('plateIridium'))
    .inputs(metaitem('platePlatinum'))
    .inputs(metaitem('plateOsmium'))
    .inputs(metaitem('plateRuthenium'))
    .outputs(metaitem('plateIridiumAlloy'))
    .EUt(1400)
    .duration(200)
    .buildAndRegister();

SPACE_COMPONENT_ASSEMBLING.recipeBuilder()
    .inputs(metaitem('cryogenic_pump'))
    .inputs(metaitem('pipeLargeFluidNiobiumTitanium')*2)
    .inputs(metaitem('plateTitaniumCarbide')*8)
    .inputs(metaitem('dustThermalPasteCompound'))
    .outputs(metaitem('thermal_control_loop'))
    .EUt(600)
    .duration(500)
    .buildAndRegister();

SPACE_COMPONENT_ASSEMBLING.recipeBuilder()
    .inputs(metaitem('plateTitanium')*4)
    .inputs(metaitem('electric.motor.hv'))
    .inputs(metaitem('plateAluminaCeramic')*2)
    .outputs(metaitem('cryogenic_pump'))
    .EUt(250)
    .duration(150)
    .buildAndRegister();

EXTRUDER_RECIPES.recipeBuilder()
    .inputs(metaitem('fused_quartz')*4)
    .outputs(metaitem('fused_quartz_panel'))
    .EUt(350)
    .duration(150)
    .buildAndRegister();

ROCKET_ASSEMBLY_RECIPES.recipeBuilder()
    .inputs(metaitem('mems_sensor_array'))
    .inputs(metaitem('ring_laser_diode'))
    .inputs(metaitem('gyro_mounting_device'))
    .inputs(metaitem('quantum_logic_ic'))
    .inputs(metaitem('dustThermalPasteCompound'))
    .inputs(metaitem('cableGtSingleNiobiumNitride')*16)
    .inputs(metaitem('battery.iv.vanadium'))
    .outputs(metaitem('gyroscope_chip'))
    .EUt(650)
    .duration(250)
    .buildAndRegister();

SPACE_COMPONENT_ASSEMBLING.recipeBuilder()
    .inputs(metaitem('rotorIridium'))
    .inputs(metaitem('cryogenic_pump_housing'))
    .inputs(metaitem('superalloy_impeller'))
    .inputs(metaitem('stickIronMagnetic'))
    .inputs(metaitem('stickNiobiumTitanium'))
    .inputs(metaitem('platePlatinum')*4)
    .outputs(metaitem('turbo_pump_assembly'))
    .EUt(250)
    .duration(150)
    .buildAndRegister();


ROCKET_ASSEMBLY_RECIPES.recipeBuilder()
    .inputs(metaitem('gyroscope_chip'))
    .inputs(ore('circuitLuv'))
    .inputs(metaitem('thermal_sensor_array'))
    .inputs(metaitem('iv_voltage_regulator'))
    .inputs(metaitem('high_reliability_memory_bank'))
    .inputs(metaitem('quantum_clock_module'))
    .inputs(metaitem('circuit_board.advanced'))
    .outputs(metaitem('quantum_integrated_engine_controller'))
    .EUt(650)
    .duration(250)
    .buildAndRegister();

SPACE_COMPONENT_ASSEMBLING.recipeBuilder()
    .inputs(metaitem('pipeSmallFluidNiobiumTitanium')*2)
    .inputs(metaitem('duct_tape')*4)
    .inputs(metaitem('platePlatinum'))
    .outputs(metaitem('cryogenic_fuel_lines'))
    .EUt(650)
    .duration(250)
    .buildAndRegister();

LATHE_RECIPES.recipeBuilder()
    .inputs(metaitem('superalloy_bearing'))
    .outputs(metaitem('impeller_core'))
    .EUt(650)
    .duration(250)
    .buildAndRegister();

SPACE_COMPONENT_ASSEMBLING.recipeBuilder()
    .inputs(metaitem('impeller_core'))
    .inputs(metaitem('superalloy_bearing'))
    .inputs(metaitem('plateAluminaCeramic')*2)
    .outputs(metaitem('superalloy_impeller'))
    .EUt(550)
    .duration(350)
    .buildAndRegister();

SPACE_COMPONENT_ASSEMBLING.recipeBuilder()
    .inputs(metaitem('plateHastelloyX')*4)
    .inputs(metaitem('ringStainlessSteel')*2)
    .inputs(metaitem('plateAluminaCeramic'))
    .outputs(metaitem('cryogenic_pump_housing'))
    .EUt(550)
    .duration(350)
    .buildAndRegister();
    


crafting.remove('galacticraftcore:rocket_fins');
crafting.remove('galacticraftcore:engine_0');
crafting.remove('galacticraftcore:engine_0_alt');

SPACE_COMPONENT_ASSEMBLING.recipeBuilder()
    .inputs(metaitem('sensor.ev'))
    .inputs(metaitem('ga_as_wafer'))
    .inputs(item('gregtech:optical_pipe_normal')*2)
    .outputs(metaitem('precision_laser_sensor'))
    .EUt(1000)
    .duration(400)
    .buildAndRegister();

// Optical Fiber Cable * 1
mods.gregtech.assembler.removeByInput(7680, [metaitem('wireFineBorosilicateGlass') * 8, metaitem('foilSilver') * 8], [fluid('polytetrafluoroethylene') * 144])

ASSEMBLER_RECIPES.recipeBuilder()
    .inputs(metaitem('wireFineBorosilicateGlass') * 8)
    .inputs(metaitem('foilSilver') * 8)
    .fluidInputs(fluid('polytetrafluoroethylene') * 144)
    .EUt(1800)
    .duration(200)
    .outputs(item('gregtech:optical_pipe_normal'))
    .buildAndRegister();

SPACE_COMPONENT_ASSEMBLING.recipeBuilder()
    .inputs(metaitem('precision_laser_sensor'))
    .inputs(metaitem('electric.motor.ev')*2)
    .inputs(ore('circuitEv')*2)
    .inputs(metaitem('rotorTitanium'))
    .inputs(metaitem('frameTungsten'))
    .fluidInputs(fluid('lubricant')*1000)
    .outputs(metaitem('gyro_mounting_device'))
    .EUt(1500)
    .duration(400)
    .buildAndRegister();

ASSEMBLER_RECIPES.recipeBuilder()
    .inputs(metaitem('nano_smd_diode'))
    .inputs(metaitem('lensSapphire'))
    .outputs(metaitem('uv_laser_lens'))
    .EUt(1600)
    .duration(200)
    .buildAndRegister();

SPACE_COMPONENT_ASSEMBLING.recipeBuilder()
    .inputs(metaitem('uv_laser_lens'))
    .inputs(metaitem('frameNiobiumTitanium'))
    .inputs(metaitem('wireGtDoubleUraniumTriplatinum')*4)
    .inputs(metaitem('dustYtterbium'))
    .outputs(metaitem('ytterbium_ion_trap'))
    .EUt(1200)
    .duration(400)
    .buildAndRegister();

SPACE_COMPONENT_ASSEMBLING.recipeBuilder()
    .inputs(metaitem('emitter.ev'))
    .inputs(metaitem('lensSapphire'))
    .inputs(metaitem('wireFinePlatinum')*4)
    .outputs(metaitem('ultra_stable_laser_array'))
    .EUt(1200)
    .duration(400)
    .buildAndRegister();

SPACE_COMPONENT_ASSEMBLING.recipeBuilder()
    .inputs(metaitem('ytterbium_ion_trap'))
    .inputs(metaitem('ultra_stable_laser_array'))
    .inputs(metaitem('crystal_oscillator'))
    .inputs(ore('circuitEv'))
    .inputs(metaitem('cryogenic_cooling_unit'))
    .outputs(metaitem('quantum_clock_module'))
    .EUt(1200)
    .duration(400)
    .buildAndRegister();

MIXER_RECIPES.recipeBuilder()
    .fluidInputs(fluid('silicone_oil')*1000)
    .inputs(metaitem('dustAlumina')*4)
    .inputs(metaitem('dustGraphite'))
    .inputs(metaitem('dustSilver'))
    .inputs(metaitem('dustClay'))
    .outputs(metaitem('dustThermalPasteCompound'))
    .EUt(800)
    .duration(440)
    .buildAndRegister();

ASSEMBLER_RECIPES.recipeBuilder()
    .fluidInputs(fluid('epoxy')*250)
    .inputs(metaitem('plateAluminaCeramic'))
    .inputs(metaitem('nano_smd_resistor')*4)
    .inputs(metaitem('glass_lens.red'))
    .inputs(metaitem('sapphire_wafer'))
    .inputs(metaitem('foilCopper')*2)
    .inputs(metaitem('thermophile_chip'))
    .outputs(metaitem('thermal_sensor_array'))
    .EUt(200)
    .duration(340)
    .buildAndRegister();

ASSEMBLER_RECIPES.recipeBuilder()
    .inputs(metaitem('plate.xor'))
    .inputs(metaitem('not_gate'))
    .inputs(metaitem('silicon_wafer_slice'))
    .outputs(metaitem('parity_checker_ic'))
    .EUt(150)
    .duration(240)
    .buildAndRegister();

SPACE_COMPONENT_ASSEMBLING.recipeBuilder()
    .inputs(metaitem('parity_checker_ic'))
    .inputs(metaitem('plate.nand_memory_chip')*2)
    .inputs(metaitem('gold_plated_pin_grid'))
    .inputs(metaitem('plateManganeseZincFerrite')*4)
    .inputs(metaitem('alumina_heat_spreader'))
    .outputs(metaitem('high_reliability_memory_bank'))
    .fluidInputs(fluid('epoxy')*250)
    .EUt(400)
    .duration(300)
    .buildAndRegister();

AUTOMATIC_WIRE_BONDER.recipeBuilder()
    .inputs(metaitem('plateEpoxy'))
    .inputs(metaitem('wireFineGold')*16)
    .outputs(metaitem('gold_plated_pin_grid'))
    .EUt(250)
    .duration(340)
    .buildAndRegister();

SPACE_COMPONENT_ASSEMBLING.recipeBuilder()
    .fluidInputs(fluid('soldering_alloy')*36)
    .inputs(metaitem('foilAluminium')*4)
    .inputs(metaitem('dustNanothermalPaste')*4)
    .inputs(metaitem('plateTungstenRhenium')*2)
    .inputs(metaitem('circuit.nano_mainframe'))
    .outputs(metaitem('alumina_heat_spreader'))
    .duration(800)
    .EUt(1245)
    .buildAndRegister();

MIXER_RECIPES.recipeBuilder()
    .fluidInputs(fluid('silicone_rubber')*250)
    .inputs(metaitem('dustBoronNitride'))
    .outputs(metaitem('dustNanothermalPaste')*2)
    .inputs(metaitem('dustCarbonNanotubes'))
    .duration(800)
    .EUt(1245)
    .buildAndRegister();

SPACE_COMPONENT_ASSEMBLING.recipeBuilder()
    .inputs(metaitem('polysilicon_wafer'))
    .inputs(metaitem('nano_smd_capacitor')*2)
    .inputs(metaitem('nano_smd_resistor')*2)
    .inputs(metaitem('plateVanadiumGallium'))
    .fluidInputs(fluid('polybenzimidazole')*64)
    .outputs(metaitem('thermophile_chip'))
    .duration(300)
    .EUt(245)
    .buildAndRegister();

SPACE_COMPONENT_ASSEMBLING.recipeBuilder()
    .fluidInputs(fluid('liquid_helium')*72)
    .inputs(metaitem('polysilicon_wafer'))
    .inputs(metaitem('nano_smd_transistor'))
    .inputs(metaitem('nano_smd_capacitor'))
    .inputs(metaitem('wireGtSingleNiobiumTitanium')*16)
    .outputs(metaitem('quantum_logic_ic'))
    .duration(350)
    .EUt(340)
    .buildAndRegister();

ASSEMBLER_RECIPES.recipeBuilder()
    .inputs(item('minecraft:iron_bars')*16)
    .inputs(item('galacticraftcore:basic_item', 9) * 4)
    .inputs(item('galacticraftcore:basic_item', 7) * 4)
    .outputs(item('galacticraftcore:air_vent'))
    .duration(350)
    .EUt(340)
    .buildAndRegister();

crafting.remove('galacticraftcore:air_vent')


ROCKET_ASSEMBLY_RECIPES.recipeBuilder()
    .inputs(metaitem('fluid.regulator.ev'))
    .inputs(item('galacticraftcore:nose_cone'))
    .inputs(metaitem('circuit.nano_mainframe')*2)
    .inputs(item('galacticraftcore:oxygen_tank_light_full', 900))
    .inputs(item('galacticraftcore:steel_pole') * 8)
    .inputs(metaitem('plateKaptonK')*4)
    .inputs(item('galacticraftcore:heavy_plating')*8)
    .inputs(item('galacticraftcore:engine'))
    .inputs(item('galacticraftcore:rocket_fins')*4)
    .fluidInputs(fluid('soldering_alloy')*5000)
    .outputs(item('galacticraftcore:rocket_t1'))
    .duration(2000)
    .EUt(1440)
    .buildAndRegister();

ROCKET_ASSEMBLY_RECIPES.recipeBuilder()
    .inputs(metaitem('fluid.regulator.ev'))
    .inputs(item('minecraft:chest'))
    .circuitMeta(1)
    .inputs(item('galacticraftcore:nose_cone'))
    .inputs(metaitem('circuit.nano_mainframe')*2)
    .inputs(item('galacticraftcore:oxygen_tank_light_full', 900))
    .inputs(item('galacticraftcore:steel_pole') * 8)
    .inputs(metaitem('plateKaptonK')*4)
    .inputs(item('galacticraftcore:heavy_plating')*8)
    .inputs(item('galacticraftcore:engine'))
    .inputs(item('galacticraftcore:rocket_fins')*4)
    .fluidInputs(fluid('soldering_alloy')*5000)
    .outputs(item('galacticraftcore:rocket_t1', 1)*1)
    .duration(2000)
    .EUt(1440)
    .buildAndRegister();

ROCKET_ASSEMBLY_RECIPES.recipeBuilder()
    .inputs(metaitem('fluid.regulator.ev'))
    .inputs(item('minecraft:chest'))
    .inputs(item('minecraft:chest'))
    .circuitMeta(2)
    .inputs(item('galacticraftcore:nose_cone'))
    .inputs(metaitem('circuit.nano_mainframe')*2)
    .inputs(item('galacticraftcore:oxygen_tank_light_full', 900))
    .inputs(item('galacticraftcore:steel_pole') * 8)
    .inputs(metaitem('plateKaptonK')*4)
    .inputs(item('galacticraftcore:heavy_plating')*8)
    .inputs(item('galacticraftcore:engine'))
    .inputs(item('galacticraftcore:rocket_fins')*4)
    .fluidInputs(fluid('soldering_alloy')*5000)
    .outputs(item('galacticraftcore:rocket_t1', 2)*1)
    .duration(2000)
    .EUt(1440)
    .buildAndRegister();

ROCKET_ASSEMBLY_RECIPES.recipeBuilder()
    .inputs(metaitem('fluid.regulator.ev'))
    .inputs(item('minecraft:chest'))
    .inputs(item('minecraft:chest'))
    .inputs(item('minecraft:chest'))
    .circuitMeta(3)
    .inputs(item('galacticraftcore:nose_cone'))
    .inputs(metaitem('circuit.nano_mainframe')*2)
    .inputs(item('galacticraftcore:oxygen_tank_light_full', 900))
    .inputs(item('galacticraftcore:steel_pole') * 8)
    .inputs(metaitem('plateKaptonK')*4)
    .inputs(item('galacticraftcore:heavy_plating')*8)
    .inputs(item('galacticraftcore:engine'))
    .inputs(item('galacticraftcore:rocket_fins')*4)
    .fluidInputs(fluid('soldering_alloy')*5000)
    .outputs(item('galacticraftcore:rocket_t1', 3)*1)
    .duration(2000)
    .EUt(1440)
    .buildAndRegister();



ROCKET_ASSEMBLY_RECIPES.recipeBuilder()
    .inputs(metaitem('fluid.regulator.ev'))
    .inputs(item('minecraft:trapped_chest'))
    .circuitMeta(1)
    .inputs(item('galacticraftcore:nose_cone'))
    .inputs(metaitem('circuit.nano_mainframe')*2)
    .inputs(item('galacticraftcore:oxygen_tank_light_full', 900))
    .inputs(item('galacticraftcore:steel_pole') * 8)
    .inputs(metaitem('plateKaptonK')*4)
    .inputs(item('galacticraftcore:heavy_plating')*8)
    .inputs(item('galacticraftcore:engine'))
    .inputs(item('galacticraftcore:rocket_fins')*4)
    .fluidInputs(fluid('soldering_alloy')*5000)
    .outputs(item('galacticraftcore:rocket_t1', 1)*1)
    .duration(2000)
    .EUt(1440)
    .buildAndRegister();

ROCKET_ASSEMBLY_RECIPES.recipeBuilder()
    .inputs(metaitem('fluid.regulator.ev'))
    .inputs(item('minecraft:trapped_chest'))
    .inputs(item('minecraft:trapped_chest'))
    .circuitMeta(2)
    .inputs(item('galacticraftcore:nose_cone'))
    .inputs(metaitem('circuit.nano_mainframe')*2)
    .inputs(item('galacticraftcore:oxygen_tank_light_full', 900))
    .inputs(item('galacticraftcore:steel_pole') * 8)
    .inputs(metaitem('plateKaptonK')*4)
    .inputs(item('galacticraftcore:heavy_plating')*8)
    .inputs(item('galacticraftcore:engine'))
    .inputs(item('galacticraftcore:rocket_fins')*4)
    .fluidInputs(fluid('soldering_alloy')*5000)
    .outputs(item('galacticraftcore:rocket_t1', 2)*1)
    .duration(2000)
    .EUt(1440)
    .buildAndRegister();

ROCKET_ASSEMBLY_RECIPES.recipeBuilder()
    .inputs(metaitem('fluid.regulator.ev'))
    .inputs(item('minecraft:trapped_chest'))
    .inputs(item('minecraft:trapped_chest'))
    .inputs(item('minecraft:trapped_chest'))
    .circuitMeta(3)
    .inputs(item('galacticraftcore:nose_cone'))
    .inputs(metaitem('circuit.nano_mainframe')*2)
    .inputs(item('galacticraftcore:oxygen_tank_light_full', 900))
    .inputs(item('galacticraftcore:steel_pole') * 8)
    .inputs(metaitem('plateKaptonK')*4)
    .inputs(item('galacticraftcore:heavy_plating')*8)
    .inputs(item('galacticraftcore:engine'))
    .inputs(item('galacticraftcore:rocket_fins')*4)
    .fluidInputs(fluid('soldering_alloy')*5000)
    .outputs(item('galacticraftcore:rocket_t1', 3)*1)
    .duration(2000)
    .EUt(1440)
    .buildAndRegister();

crafting.addShaped("rocket_assembly_machine", item('gregtech:machine', 3082), [[ore('circuitIv'), item('gregtech:machine', 112), ore('circuitIv')], [item('gregtech:meta_item_1', 189), item('gregtech:machine', 988), item('gregtech:meta_item_1', 189)], [item('gregtech:machine', 4302), ore('circuitIv'), item('gregtech:machine', 637)]])
crafting.addShaped("rocket_launch_pad", item('gregtech:machine', 3083), [[item('galacticraftcore:landing_pad'), item('galacticraftcore:landing_pad'), item('galacticraftcore:landing_pad')], [ore('circuitIv'), item('gregtech:machine', 988), ore('circuitIv')], [item('gregtech:meta_item_1', 174), ore('circuitIv'), item('gregtech:meta_item_1', 174)]])


//Oxygen Mask

FORMING_PRESS_RECIPES.recipeBuilder()
    .inputs(metaitem('plateSiliconeRubber'))
    .inputs(metaitem('plateLexan'))
    .inputs(metaitem('plateKevlar'))
    .outputs(metaitem('oxygen_mask_protective_layer'))
    .duration(1200)
    .EUt(800)
    .buildAndRegister();

ASSEMBLER_RECIPES.recipeBuilder()
    .inputs(metaitem('plateSteel')*2)
    .inputs(metaitem('dustLithiumHydroxide'))
    .outputs(metaitem('co2_scrubber'))
    .inputs(item('gregtech:transparent_casing', 2))
    .duration(1500)
    .EUt(1200)
    .buildAndRegister();

ASSEMBLER_RECIPES.recipeBuilder()
    .inputs(metaitem('oxygen_mask_protective_layer')*5)
    .inputs(metaitem('co2_scrubber'))
    .circuitMeta(5)
    .inputs(metaitem('ringSteel'))
    .inputs(item('gregtech:transparent_casing', 2)*2)
    .outputs(item('galacticraftcore:oxygen_mask'))
    .duration(600)
    .EUt(2200)
    .buildAndRegister();

crafting.remove('galacticraftcore:oxygen_mask');

