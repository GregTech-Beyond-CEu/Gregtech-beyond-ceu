import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;


        ROASTER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustPhosphate')* 5)
                .outputs(metaitem('dustPhosphorus'))
                .fluidOutputs(fluid('steam')*4000)
                .circuitMeta(1)
                .duration(200)
                .EUt(9)
                .buildAndRegister()

        ROASTER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustPhosphate')* 5)
                .outputs(metaitem('dustPhosphorus'))
                .circuitMeta(0)
                .duration(200)
                .EUt(9)
                .buildAndRegister()

        ROASTER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustManganeseSulfate')* 4)
                .fluidOutputs(fluid('sulfur_dioxide') *1000)
                .outputs(metaitem('dustManganese')* 1)
                .circuitMeta(0)
                .duration(200)
                .EUt(9)
                .buildAndRegister()

        ROASTER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustIronSulfate')* 6)
                .fluidOutputs(fluid('sulfur_trioxide')*1000)
                .fluidOutputs(fluid('sulfur_dioxide')*1000)
                .outputs(metaitem('dustIron'))
                .circuitMeta(0)
                .duration(200)
                .EUt(9)
                .buildAndRegister()