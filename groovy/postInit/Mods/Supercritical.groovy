import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;


// Heavy Water * 72
mods.gregtech.heat_exchanger.removeByInput(1, [metaitem('circuit.integrated').withNbt(['Configuration': 2])], [fluid('high_pressure_heavy_water') * 72 * 72, fluid('distilled_water') * 600 * 600])
// Heavy Water * 72
mods.gregtech.heat_exchanger.removeByInput(1, [metaitem('circuit.integrated').withNbt(['Configuration': 2])], [fluid('high_pressure_heavy_water') * 72 * 72, fluid('water') * 600 * 600])
// Heavy Water * 1
mods.gregtech.heat_exchanger.removeByInput(1, [metaitem('circuit.integrated').withNbt(['Configuration': 1])], [fluid('high_pressure_heavy_water'), fluid('water') * 6 * 6])
// Heavy Water * 1
mods.gregtech.heat_exchanger.removeByInput(1, [metaitem('circuit.integrated').withNbt(['Configuration': 1])], [fluid('high_pressure_heavy_water'), fluid('distilled_water') * 6 * 6])

// Reactor Vessel * 2
mods.gregtech.assembler.removeByInput(48, [metaitem('supercritical:plateDoubleInconel'), metaitem('plateSteel') * 5, metaitem('frameSteel')], null)


ASSEMBLER_RECIPES.recipeBuilder()
    .inputs(metaitem('plateHighPurityStainlessSteel')*5)
    .inputs(item('gregtech:meta_block_frame_917', 8))
    .inputs(metaitem('supercritical:plateDoubleInconel'))
    .outputs(item('supercritical:fission_casing')*2)
    .EUt(180)
    .duration(500)
    .buildAndRegister();