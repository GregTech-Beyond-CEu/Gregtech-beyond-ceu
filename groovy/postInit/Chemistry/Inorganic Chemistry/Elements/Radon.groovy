import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;
import static supercritical.api.recipes.SCRecipeMaps.*;
     // Plutonium 239 Dust * 8
mods.gregtech.large_chemical_reactor.removeByInput(480, [metaitem('ingotPlutonium') * 8, metaitem('dustUranium')], [fluid('air') * 10000 * 10000])
// Nitrogen Dioxide Gas * 122000
mods.gregtech.distillation_tower.removeByInput(7680, null, [fluid('liquid_ender_air') * 200000 * 200000])


        GRAVITY_SETTLER_RECIPES.recipeBuilder()
            .fluidInputs(fluid('air')*20000)
            .fluidOutputs(fluid('cold_air')*19000)
            .inputs(item('gregtech:ore_pitchblende_0'))
            .outputs(item('minecraft:stone'))
            .fluidOutputs(fluid('radon_rich_air')*1000)
            .EUt(80)
            .duration(1000)
            .buildAndRegister();

        HEAT_EXCHANGER_RECIPES.recipeBuilder()
            .fluidInputs(fluid('radon_rich_air')*1000)
            .fluidOutputs(fluid('chilled_radon_rich_air')*1000)
            .EUt(250)
            .duration(320)
            .buildAndRegister();

        CRYOGENIC_DISTILLATION_PLANT_RECIPES.recipeBuilder()
            .fluidInputs(fluid('chilled_radon_rich_air')*1000)
            .fluidOutputs(fluid('liquid_oxygen')*1000)
            .fluidOutputs(fluid('liquid_nitrogen')*1000)
            .fluidOutputs(fluid('radon_containing_noble_gasses')*1000)
            .EUt(480)
            .duration(300)
            .buildAndRegister();

        FLASH_CHROMATOGRAPHY_RECIPES.recipeBuilder()
            .fluidInputs(fluid('radon_containing_noble_gasses')*1000)
            .fluidOutputs(fluid('radon')*600)
            .fluidOutputs(fluid('rare_gas_mixture')*400)
            .EUt(480)
            .duration(300)
            .buildAndRegister();
