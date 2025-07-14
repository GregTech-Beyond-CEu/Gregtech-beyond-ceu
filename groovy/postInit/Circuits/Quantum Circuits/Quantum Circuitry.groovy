import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;



// Quantumprocessor * 1
mods.gregtech.circuit_assembler.removeByInput(2400, [metaitem('circuit_board.extreme'), metaitem('plate.qbit_central_processing_unit'), metaitem('plate.nano_central_processing_unit'), metaitem('component.smd.capacitor') * 12, metaitem('component.smd.transistor') * 12, metaitem('wireFinePlatinum') * 12], [fluid('soldering_alloy') * 72 * 72])
// Quantumprocessor * 1
mods.gregtech.circuit_assembler.removeByInput(2400, [metaitem('circuit_board.extreme'), metaitem('plate.qbit_central_processing_unit'), metaitem('plate.nano_central_processing_unit'), metaitem('component.smd.capacitor') * 12, metaitem('component.smd.transistor') * 12, metaitem('wireFinePlatinum') * 12], [fluid('tin') * 144 * 144])
// Quantumprocessor * 1
mods.gregtech.circuit_assembler.removeByInput(2400, [metaitem('circuit_board.extreme'), metaitem('plate.qbit_central_processing_unit'), metaitem('plate.nano_central_processing_unit'), metaitem('component.advanced_smd.capacitor') * 3, metaitem('component.advanced_smd.transistor') * 3, metaitem('wireFinePlatinum') * 12], [fluid('soldering_alloy') * 72 * 72])
// Quantumprocessor * 1
mods.gregtech.circuit_assembler.removeByInput(2400, [metaitem('circuit_board.extreme'), metaitem('plate.qbit_central_processing_unit'), metaitem('plate.nano_central_processing_unit'), metaitem('component.advanced_smd.capacitor') * 3, metaitem('component.advanced_smd.transistor') * 3, metaitem('wireFinePlatinum') * 12], [fluid('tin') * 144 * 144])
// Quantumprocessor * 2
mods.gregtech.circuit_assembler.removeByInput(38400, [metaitem('circuit_board.extreme'), metaitem('plate.advanced_system_on_chip'), metaitem('wireFinePlatinum') * 12, metaitem('boltNiobiumTitanium') * 8], [fluid('soldering_alloy') * 72 * 72])
// Quantumprocessor * 2
mods.gregtech.circuit_assembler.removeByInput(38400, [metaitem('circuit_board.extreme'), metaitem('plate.advanced_system_on_chip'), metaitem('wireFinePlatinum') * 12, metaitem('boltNiobiumTitanium') * 8], [fluid('tin') * 144 * 144])

CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder()
    .inputs(metaitem('plate.nano_central_processing_unit'))
    .inputs(metaitem('plate.qbit_central_processing_unit'))
    .inputs(metaitem('circuit_board.extreme'))
    .inputs(metaitem('iv_voltage_regulator'))
    .inputs(metaitem('wireFinePlatinum')*12)
    .inputs(metaitem('quantum_smd_transistor')*12)
    .inputs(metaitem('quantum_smd_capacitor')*12)
    .outputs(metaitem('circuit.quantum_processor'))
    .EUt(7000)
    .duration(400)
    .buildAndRegister();

// Quantumprocessor Assembly * 1
mods.gregtech.circuit_assembler.removeByInput(2400, [metaitem('circuit_board.extreme'), metaitem('circuit.quantum_processor') * 2, metaitem('component.smd.inductor') * 8, metaitem('component.smd.capacitor') * 16, metaitem('plate.random_access_memory') * 4, metaitem('wireFinePlatinum') * 16], [fluid('soldering_alloy') * 144 * 144])
// Quantumprocessor Assembly * 1
mods.gregtech.circuit_assembler.removeByInput(2400, [metaitem('circuit_board.extreme'), metaitem('circuit.quantum_processor') * 2, metaitem('component.smd.inductor') * 8, metaitem('component.smd.capacitor') * 16, metaitem('plate.random_access_memory') * 4, metaitem('wireFinePlatinum') * 16], [fluid('tin') * 288 * 288])
// Quantumprocessor Assembly * 1
mods.gregtech.circuit_assembler.removeByInput(2400, [metaitem('circuit_board.extreme'), metaitem('circuit.quantum_processor') * 2, metaitem('component.advanced_smd.inductor') * 2, metaitem('component.advanced_smd.capacitor') * 4, metaitem('plate.random_access_memory') * 4, metaitem('wireFinePlatinum') * 16], [fluid('soldering_alloy') * 144 * 144])
// Quantumprocessor Assembly * 1
mods.gregtech.circuit_assembler.removeByInput(2400, [metaitem('circuit_board.extreme'), metaitem('circuit.quantum_processor') * 2, metaitem('component.advanced_smd.inductor') * 2, metaitem('component.advanced_smd.capacitor') * 4, metaitem('plate.random_access_memory') * 4, metaitem('wireFinePlatinum') * 16], [fluid('tin') * 288 * 288])

CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder()
    .inputs(metaitem('plate.random_access_memory'))
    .inputs(metaitem('circuit_board.extreme'))
    .inputs(metaitem('battery.re.ulv.tantalum'))
    .inputs(metaitem('wireFinePlatinum')*16)
    .inputs(metaitem('quantum_smd_inductor')*8)
    .inputs(metaitem('quantum_smd_capacitor')*16)
    .inputs(metaitem('circuit.quantum_processor')*2)
    .outputs(metaitem('circuit.quantum_assembly'))
    .EUt(7000)
    .duration(400)
    .buildAndRegister();