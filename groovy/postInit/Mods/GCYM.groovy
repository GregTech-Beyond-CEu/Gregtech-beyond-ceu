import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;


crafting.remove('gcym:alloy_blast_smelter')

// Molybdenum Disilicide Dust * 3
mods.gregtech.mixer.removeByInput(1920, [metaitem('dustMolybdenum'), metaitem('dustSilicon') * 2, metaitem('circuit.integrated').withNbt(['Configuration': 1])], null)


MIXER_RECIPES.recipeBuilder()
    .inputs(metaitem('dustMolybdenum'))
    .inputs(metaitem('dustSilicon') * 2)
    .circuitMeta(1)
    .EUt(400)
    .duration(200)
    .outputs(metaitem('dustMolybdenumDisilicide')*3)
    .buildAndRegister();

crafting.addShaped("alloy_blast_smelter", metaitem('gcym:alloy_blast_smelter'), [
[ore('plateTantalumCarbide'), ore('circuitEv'), ore('plateTantalumCarbide')], 
[ore('cableGtSingleAluminium'), item('gregtech:machine', 82), ore('cableGtSingleAluminium')], 
[ore('plateTantalumCarbide'), ore('circuitEv'), ore('plateTantalumCarbide')]
])