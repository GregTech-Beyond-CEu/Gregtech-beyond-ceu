import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;


        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .inputs(metaitem('dustPollucite')* 10)
                .fluidInputs(fluid('hydrochloric_acid')*3000)
                .outputs(metaitem('dustAlumina'))
                .outputs(metaitem('dustSiliconDioxide')* 4)
                .fluidOutputs(fluid('heavy_alkali_chloride_solution')*1000)
                .duration(400)
                .EUt(1400)
                .buildAndRegister();

       BATCH_REACTOR_RECIPES.recipeBuilder()
                .fluidInputs(fluid('heavy_alkali_chloride_solution')*1000)
                .inputs(metaitem('dustTinFourChloride')*2)
                .outputs(metaitem('dustRubidiumChlorostannate')* 4)
                .outputs(metaitem('dustCaesiumChlorostannate')* 9)
                .fluidOutputs(fluid('water')*2000)
                .duration(400)
                .EUt(1400)
                .buildAndRegister();

        STIRRED_TANK_REACTOR_RECIPES.recipeBuilder()
                .fluidInputs(fluid('distilled_water')*1000)
                .fluidInputs(fluid('hydrochloric_acid')*2000)
                .inputs(metaitem('dustRubidiumChlorostannate')* 6)
                .outputs(metaitem('dustTinFourChloride')* 3)
                .fluidOutputs(fluid('diluted_rubidium_solution')*2000)
                .duration(200)
                .EUt(700)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('distilled_water')*1000)
                .fluidInputs(fluid('hydrochloric_acid')*2000)
                .inputs(metaitem('dustCaesiumChlorostannate')* 6)
                .outputs(metaitem('dustTinFourChloride')* 3)
                .fluidOutputs(fluid('diluted_caesium_solution')*2000)
                .duration(200)
                .EUt(700)
                .buildAndRegister();

        BATCH_REACTOR_RECIPES.recipeBuilder()
                .fluidInputs(fluid('diluted_caesium_solution')*1000)
                .outputs(metaitem('dustCaesium'))
                .fluidOutputs(fluid('water')*1000)
                .duration(200)
                .EUt(700)
                .buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(fluid('diluted_rubidium_solution')*1000)
                .outputs(metaitem('dustRubidium'))
                .fluidOutputs(fluid('water')*1000)
                .duration(200)
                .EUt(700)
                .buildAndRegister();

        ELECTROLYTIC_CELL_RECIPES.recipeBuilder()
                .inputs(metaitem('dustTinFourChloride')*2)
                .notConsumable(metaitem('stickSteel'))
                .notConsumable(fluid('magnesium_chloride_solution')*432)
                .notConsumable(metaitem('stickPlatinum'))
                .outputs(metaitem('dustTin'))
                .fluidOutputs(fluid('chlorine')*1000)
                .duration(90)
                .EUt(80)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('water')*1000)
                .inputs(metaitem('dustMagnesiumChloride'))
                .fluidOutputs(fluid('magnesium_chloride_solution')*1000)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

mods.gregtech.chemical_bath.removeByInput(1400, [metaitem('dustPollucite') * 10], [fluid('hydrochloric_acid') * 3000])