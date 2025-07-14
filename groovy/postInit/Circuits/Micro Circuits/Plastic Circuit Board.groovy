import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;



        FORMING_PRESS_RECIPES.recipeBuilder()
                .inputs(metaitem('foilCopper')*4)
                .inputs(metaitem('platePlastic'))
                .outputs(metaitem('board.plastic'))
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        FORMING_PRESS_RECIPES.recipeBuilder()
                .inputs(metaitem('foilCopper')*4)
                .inputs(metaitem('platePolyvinylChloride'))
                .outputs(metaitem('board.plastic')*2)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        FORMING_PRESS_RECIPES.recipeBuilder()
                .inputs(metaitem('foilCopper')*4)
                .inputs(metaitem('platePolytetrafluoroethylene'))
                .outputs(metaitem('board.plastic')*4)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        FORMING_PRESS_RECIPES.recipeBuilder()
                .inputs(metaitem('foilCopper')*4)
                .inputs(metaitem('platePolybenzimidazole'))
                .outputs(metaitem('board.plastic')*8)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .fluidInputs(fluid('sodium_bisulfate_solution')*100)
                .inputs(metaitem('patterned_plastic_board'))
                .outputs(metaitem('drenched_plastic_board'))
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .fluidInputs(fluid('iron_iii_chloride')*100)
                .inputs(metaitem('patterned_plastic_board'))
                .outputs(metaitem('drenched_plastic_board'))
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        ENGRAVING_UNIT_RECIPES.recipeBuilder()
                .fluidInputs(fluid('novolacs_photoresist')*200)
                .inputs(metaitem('board.plastic'))
                .outputs(metaitem('patterned_plastic_board'))
                .duration(200)
                .EUt(80)
                .buildAndRegister();
        
        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('water')*1000)
                .inputs(metaitem('dustSodiumBisulfate')*3)
                .fluidOutputs(fluid('sodium_bisulfate_solution')*1000)
                .duration(190)
                .EUt(70)
                .buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(fluid('sodium_bisulfate_solution')*1000)
                .outputs(metaitem('dustSodiumBisulfate')*3)
                .fluidOutputs(fluid('water')*1000)
                .duration(120)
                .EUt(90)
                .buildAndRegister();


// Plastic Circuit Board * 1
mods.gregtech.chemical_reactor.removeByInput(10, [metaitem('platePlastic'), metaitem('foilCopper') * 4], [fluid('sulfuric_acid') * 250 * 250])
// Plastic Circuit Board * 2
mods.gregtech.chemical_reactor.removeByInput(10, [metaitem('platePolyvinylChloride'), metaitem('foilCopper') * 4], [fluid('sulfuric_acid') * 250 * 250])
// Plastic Circuit Board * 4
mods.gregtech.chemical_reactor.removeByInput(10, [metaitem('platePolytetrafluoroethylene'), metaitem('foilCopper') * 4], [fluid('sulfuric_acid') * 250 * 250])
// Plastic Circuit Board * 8
mods.gregtech.chemical_reactor.removeByInput(10, [metaitem('platePolybenzimidazole'), metaitem('foilCopper') * 4], [fluid('sulfuric_acid') * 250 * 250])
// Plastic Circuit Board * 1
mods.gregtech.large_chemical_reactor.removeByInput(30, [metaitem('board.plastic'), metaitem('foilCopper') * 6], [fluid('sodium_persulfate') * 500 * 500])
// Plastic Circuit Board * 1
mods.gregtech.large_chemical_reactor.removeByInput(30, [metaitem('board.plastic'), metaitem('foilCopper') * 6], [fluid('iron_iii_chloride') * 250 * 250])
// Plastic Circuit Board * 1
mods.gregtech.large_chemical_reactor.removeByInput(10, [metaitem('platePlastic'), metaitem('foilCopper') * 4], [fluid('sulfuric_acid') * 250 * 250])
// Plastic Circuit Board * 2
mods.gregtech.large_chemical_reactor.removeByInput(10, [metaitem('platePolyvinylChloride'), metaitem('foilCopper') * 4], [fluid('sulfuric_acid') * 250 * 250])
// Plastic Circuit Board * 4
mods.gregtech.large_chemical_reactor.removeByInput(10, [metaitem('platePolytetrafluoroethylene'), metaitem('foilCopper') * 4], [fluid('sulfuric_acid') * 250 * 250])
// Plastic Circuit Board * 8
mods.gregtech.large_chemical_reactor.removeByInput(10, [metaitem('platePolybenzimidazole'), metaitem('foilCopper') * 4], [fluid('sulfuric_acid') * 250 * 250])

        FORMING_PRESS_RECIPES.recipeBuilder()
                .inputs(metaitem('drenched_plastic_board'))
                .inputs(metaitem('foilGold')*2)
                .outputs(metaitem('circuit_board.plastic'))
                .duration(120)
                .EUt(90)
                .buildAndRegister();
