import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;

//Andrussow Process

    FIXED_BED_REACTOR_RECIPES.recipeBuilder()
        .fluidInputs(fluid('methane')*1000)
        .fluidInputs(fluid('ammonia')*1000)
        .fluidInputs(fluid('oxygen')*3000)
        .fluidOutputs(fluid('water')*3000)
        .notConsumable(metaitem('dustPlatinum'))
        .fluidOutputs(fluid('gtfo_hydrogen_cyanide') * 1000)
        .EUt(40)
        .duration(180)
        .buildAndRegister();