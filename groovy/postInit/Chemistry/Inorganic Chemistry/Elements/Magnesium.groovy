import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;

        BLAST_RECIPES.recipeBuilder()
                .inputs(metaitem('dustSerpentine')*7)
                .outputs(metaitem('dustMagnesia')*3)
                .outputs(metaitem('dustSiliconDioxide')*2)
                .fluidOutputs(fluid('steam')*2000)
                .duration(400)
                .EUt(80)
                .blastFurnaceTemp(700)
                .buildAndRegister()

// Magnesium Dust * 1
mods.gregtech.electrolyzer.removeByInput(30, [metaitem('dustMagnesia') * 2], null)

        BLAST_RECIPES.recipeBuilder()       //REDUCTION FURNACE TODO
                .inputs(metaitem('dustMagnesia')*2)
                .inputs(metaitem('dustSilicon'))
                .outputs(metaitem('dustSiliconDioxide'))
                .fluidOutputs(fluid('magnesium')*288)
                .duration(300)
                .EUt(90)
                .buildAndRegister()

        ARC_FURNACE_RECIPES.recipeBuilder()
                .inputs(metaitem('dustMagnesiumSulfate')*6)
                .inputs(metaitem('dustCarbon')*2)
                .fluidOutputs(fluid('magnesium')*144)
                .fluidOutputs(fluid('carbon_dioxide')*2000) // VAPOR
                .fluidOutputs(fluid('sulfur_dioxide')*2000) // VAPOR 
                .duration(200)
                .EUt(190)
                .buildAndRegister()

// Magnesium Dust * 1
mods.gregtech.electrolyzer.removeByInput(30, [metaitem('dustMagnesiumChloride') * 3], null)

        DEHYDRATOR_RECIPES.recipeBuilder()
                .fluidInputs(fluid('magnesium')*144)
                .outputs(metaitem('dustMagnesium'))
                .duration(100)
                .EUt(70)
                .buildAndRegister();

        VACUUM_FURNACE_RECIPES.recipeBuilder()
                .inputs(metaitem('dustMagnesium'))
                .fluidOutputs(fluid('magnesium_vapor')*1000)
                .duration(140)
                .EUt(60)
                .buildAndRegister();

        VACUUM_RECIPES.recipeBuilder()
                .fluidInputs(fluid('magnesium_vapor')*1000)
                .outputs(metaitem('dustRecrystallizedMagnesium'))
                .duration(300)
                .EUt(150)
                .buildAndRegister();

        INDUCTION_FURNACE_RECIPES.recipeBuilder()
                .inputs(metaitem('dustRecrystallizedMagnesium'))
                .fluidInputs(fluid('argon')*1000)
                .notConsumable(metaitem('graphite_cruicible'))
                .fluidOutputs(fluid('high_purity_magnesium')*144)
                .duration(400)
                .EUt(250)
                .buildAndRegister();

        CRYSTALLIZATION_RECIPES.recipeBuilder()
                .fluidInputs(fluid('high_purity_magnesium')*144)
                .outputs(metaitem('dustHighPurityMagnesium'))
                .duration(500)
                .EUt(350)
                .buildAndRegister();