import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;

// Liquid Polytetrafluoroethylene (PTFE) * 144
mods.gregtech.chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 1])], [fluid('air') * 1000 * 1000, fluid('tetrafluoroethylene') * 144 * 144])
// Liquid Polytetrafluoroethylene (PTFE) * 216
mods.gregtech.chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 1])], [fluid('oxygen') * 1000 * 1000, fluid('tetrafluoroethylene') * 144 * 144])
// Liquid Polytetrafluoroethylene (PTFE) * 3240
mods.gregtech.large_chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 2])], [fluid('air') * 7500 * 7500, fluid('tetrafluoroethylene') * 2160 * 2160, fluid('titanium_tetrachloride') * 100 * 100])
// Liquid Polytetrafluoroethylene (PTFE) * 4320
mods.gregtech.large_chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 2])], [fluid('oxygen') * 7500 * 7500, fluid('tetrafluoroethylene') * 2160 * 2160, fluid('titanium_tetrachloride') * 100 * 100])

        POLYMERIZATION_TANK_RECIPES.recipeBuilder()
                .fluidInputs(fluid('tetrafluoroethylene')*144)
                .notConsumable(metaitem('dustKaminskyCatalyst'))
                .fluidOutputs(fluid('polytetrafluoroethylene')*576)
                .duration(120)
                .EUt(670)
                .buildAndRegister();

        POLYMERIZATION_TANK_RECIPES.recipeBuilder()
                .fluidInputs(fluid('tetrafluoroethylene')*144)
                .notConsumable(metaitem('dustPhilipsCatalyst'))
                .fluidOutputs(fluid('polytetrafluoroethylene')*288)
                .duration(120)
                .EUt(670)
                .buildAndRegister();

        POLYMERIZATION_TANK_RECIPES.recipeBuilder()
                .fluidInputs(fluid('tetrafluoroethylene')*144)
                .notConsumable(metaitem('dustZieglerNattaCatalyst'))
                .fluidOutputs(fluid('polytetrafluoroethylene')*432)
                .duration(120)
                .EUt(670)
                .buildAndRegister();

        POLYMERIZATION_TANK_RECIPES.recipeBuilder()
                .fluidInputs(fluid('tetrafluoroethylene')*144)
                .fluidInputs(fluid('oxygen')*1000)
                .fluidOutputs(fluid('polytetrafluoroethylene')*144)
                .duration(120)
                .EUt(670)
                .buildAndRegister();

        POLYMERIZATION_TANK_RECIPES.recipeBuilder()
                .fluidInputs(fluid('tetrafluoroethylene')*144)
                .fluidInputs(fluid('air')*1000)
                .fluidOutputs(fluid('polytetrafluoroethylene')*144)
                .duration(120)
                .EUt(670)
                .buildAndRegister();