import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;

CONTINOUS_STIRRING_TANK_REACTOR_RECIPES.recipeBuilder()
        .fluidInputs(fluid('nitric_acid')*1000)
        .inputs(metaitem('dustCyclohexanoneOxime')*19)
        .fluidOutputs(fluid('adipic_acid')*1000)
        .fluidOutputs(fluid('nitrogen_dioxide')*1000)
        .fluidOutputs(fluid('water')*1000)
        .EUt(80)
        .duration(200)
        .buildAndRegister();

POLYMERIZATION_TANK_RECIPES.recipeBuilder()
        .fluidInputs(fluid('adipic_acid')*1000)
        .fluidInputs(fluid('hexamethylenediamine')*1000)
        .fluidOutputs(fluid('nylon')*1000)
        .fluidOutputs(fluid('water')*1000)
        .EUt(80)
        .duration(200)
        .buildAndRegister();

TRICKLE_BED_REACTOR_RECIPES.recipeBuilder()
        .fluidInputs(fluid('adiponitrile')*1000)
        .fluidInputs(fluid('hydrogen')*4000)
        .notConsumable(metaitem('dustNickel'))
        .fluidOutputs(fluid('hexamethylenediamine')*1000)
        .EUt(280)
        .duration(500)
        .buildAndRegister();

CONTINOUS_STIRRING_TANK_REACTOR_RECIPES.recipeBuilder()
        .fluidInputs(fluid('butadiene')*1000)
        .notConsumable(metaitem('dustNickel'))
        .fluidInputs(fluid('gtfo_hydrogen_cyanide')*1000)
        .fluidOutputs(fluid('adiponitrile')*1000)
        .EUt(380)
        .duration(400)
        .buildAndRegister();