import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;

    TEXTILE_FACTORY_RECIPES.recipeBuilder()
        .inputs(item('minecraft:string')*4)
        .outputs(item('silkarmor:silk_cloth'))
        .duration(400)
        .EUt(180)
        .buildAndRegister();

    TEXTILE_FACTORY_RECIPES.recipeBuilder()
        .inputs(item('silkarmor:silk_cloth')*4)
        .circuitMeta(4)
        .outputs(item('silkarmor:silk_boots'))
        .duration(400)
        .EUt(180)
        .buildAndRegister();

    TEXTILE_FACTORY_RECIPES.recipeBuilder()
        .inputs(item('silkarmor:silk_cloth')*7)
        .circuitMeta(7)
        .outputs(item('silkarmor:silk_legs'))
        .duration(400)
        .EUt(180)
        .buildAndRegister();

    TEXTILE_FACTORY_RECIPES.recipeBuilder()
        .inputs(item('silkarmor:silk_cloth')*8)
        .circuitMeta(8)
        .outputs(item('silkarmor:silk_body'))
        .duration(400)
        .EUt(180)
        .buildAndRegister();

    TEXTILE_FACTORY_RECIPES.recipeBuilder()
        .inputs(item('silkarmor:silk_cloth')*5)
        .circuitMeta(5)
        .outputs(item('silkarmor:silk_helmet'))
        .duration(400)
        .EUt(180)
        .buildAndRegister();