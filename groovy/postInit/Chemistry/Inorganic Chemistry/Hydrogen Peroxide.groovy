import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;

// Naphthalene * 400
mods.gregtech.distillation_tower.removeByInput(120, null, [fluid('coal_tar') * 1000])
// Naphthalene * 40
mods.gregtech.distillery.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 1])], [fluid('coal_tar') * 100 * 100])
// Hydrogen Sulfide Gas * 30
mods.gregtech.distillery.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 2])], [fluid('coal_tar') * 100 * 100])
// Creosote * 40
mods.gregtech.distillery.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 3])], [fluid('coal_tar') * 200 * 200])
// Phenol * 50
mods.gregtech.distillery.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 4])], [fluid('coal_tar') * 500 * 500])

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(fluid('coal_tar')*1000)
                .fluidOutputs(fluid('phenol')*100)
                .fluidOutputs(fluid('naphthalene')*400)
                .fluidOutputs(fluid('anthracene')*100)
                .fluidOutputs(fluid('hydrogen_sulfide')*200)
                .fluidOutputs(fluid('creosote')*200)
                .chancedOutput(metaitem('dustCoke')*1, 2000, 20)
                .duration(100)
                .EUt(200)
                .buildAndRegister();

        BATCH_REACTOR_RECIPES.recipeBuilder()
                .fluidInputs(fluid('ethyl_benzene')*1000)
                .inputs(metaitem('dustPhthalicAnhydride')* 15)
                .fluidOutputs(fluid('ethylanthraquinone')*1000)
                .fluidOutputs(fluid('water')*1000)
                .duration(200)
                .EUt(800)
                .buildAndRegister();

        FIXED_BED_REACTOR_RECIPES.recipeBuilder()
                .fluidInputs(fluid('ethylanthraquinone')*1000)
                .fluidInputs(fluid('hydrogen')*1000)
                .fluidOutputs(fluid('ethylanthrahydroquinone')*1000)
                .duration(200)
                .EUt(100)
                .buildAndRegister();

        BUBBLE_COLUMN_REACTOR_RECIPES.recipeBuilder()
                .fluidInputs(fluid('ethylanthrahydroquinone')*1000)
                .notConsumable(fluid('anthracene')*1000)
                .fluidInputs(fluid('oxygen')*2000)
                .fluidOutputs(fluid('hydrogen_peroxide')*2000)
                .fluidOutputs(fluid('ethylanthraquinone')*1000)
                .duration(299)
                .EUt(800)
                .buildAndRegister();