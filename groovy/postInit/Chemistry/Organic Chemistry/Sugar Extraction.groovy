import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;

    MIXER_RECIPES.recipeBuilder()
            .fluidInputs(fluid('distilled_water')*1000)
            .inputs(item('minecraft:sugar'))
            .fluidOutputs(fluid('sucrose_solution')*1000)
            .EUt(180)
            .duration(200)
            .buildAndRegister();

    CHEMICAL_RECIPES.recipeBuilder()
            .fluidInputs(fluid('sucrose_solution')*1000)
            .fluidInputs(fluid('diluted_hydrochloric_acid') * 50)
            .fluidOutputs(fluid('acidic_sucrose_solution')*1000)
            .EUt(120)
            .duration(240)
            .buildAndRegister();

    FLUID_HEATER_RECIPES.recipeBuilder()
            .fluidInputs(fluid('acidic_sucrose_solution')*1000)
            .circuitMeta(1)
            .fluidOutputs(fluid('heated_sucrose_solution')*1000)
            .EUt(130)
            .duration(140)
            .buildAndRegister();

    ION_EXCHANGE_RECIPES.recipeBuilder()
            .fluidInputs(fluid('heated_sucrose_solution')*1000)
            .notConsumable(metaitem('dowex_50_exchange_beads'))
            .fluidOutputs(fluid('glucose_solution')*500)
            .fluidOutputs(fluid('fructose_solution')*500)
            .EUt(120)
            .duration(200)
            .buildAndRegister();

    ELECTROLYTIC_CELL_RECIPES.recipeBuilder()
            .fluidInputs(fluid('glucose_solution')*1000)
            .fluidOutputs(fluid('water')*1000)
            .outputs(metaitem('dustGlucose'))
            .EUt(120)
            .duration(200)
            .buildAndRegister();

    ELECTROLYTIC_CELL_RECIPES.recipeBuilder()
            .fluidInputs(fluid('fructose_solution')*1000)
            .fluidOutputs(fluid('water')*1000)
            .outputs(metaitem('dustFructose'))
            .EUt(120)
            .duration(200)
            .buildAndRegister();