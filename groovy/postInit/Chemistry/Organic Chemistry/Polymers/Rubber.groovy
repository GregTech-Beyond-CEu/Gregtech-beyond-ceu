import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;



// Liquid Rubber * 1296
mods.gregtech.chemical_reactor.removeByInput(16, [metaitem('dustRawRubber') * 9, metaitem('dustSulfur')], null)

THERMAL_PRESS_RECIPES.recipeBuilder()
    .inputs(metaitem('dustRawRubber') * 9)
    .inputs(metaitem('dustSulfur'))
    .fluidOutputs(fluid('rubber')*1296)
    .EUt(12)
    .duration(300)
    .buildAndRegister();