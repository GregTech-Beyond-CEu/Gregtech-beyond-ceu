import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;

PACKER_RECIPES.recipeBuilder()
    .inputs(metaitem('wireGtSingleAluminium'))
    .inputs(metaitem('plateNomex'))
    .outputs(item('galacticraftcore:aluminum_wire'))
    .EUt(128)
    .duration(150)
    .buildAndRegister();

ASSEMBLER_RECIPES.recipeBuilder()
    .inputs(metaitem('item_casingAluminium')*2)
    .inputs(item('galacticraftcore:aluminum_wire')*2)
    .outputs(item('galacticraftcore:aluminum_wire', 1))
    .EUt(90)
    .duration(150)
    .buildAndRegister();

crafting.remove('galacticraftcore:aluminium_wire_0')
crafting.remove('galacticraftcore:aluminium_wire_1_alt')
crafting.remove('galacticraftcore:aluminium_wire_1')
crafting.remove('galacticraftcore:machine2_4')

FLUID_COMPRESSOR_RECIPES.recipeBuilder()
    .fluidInputs(fluid('oxygen')*900)
    .inputs(item('galacticraftcore:oxygen_tank_light_full', 900))
    .outputs(item('galacticraftcore:oxygen_tank_light_full'))
    .EUt(120)
    .duration(230)
    .buildAndRegister();

FLUID_COMPRESSOR_RECIPES.recipeBuilder()
    .fluidInputs(fluid('oxygen')*1800)
    .inputs(item('galacticraftcore:oxygen_tank_med_full', 1800))
    .outputs(item('galacticraftcore:oxygen_tank_med_full'))
    .EUt(120)
    .duration(230)
    .buildAndRegister();

FLUID_COMPRESSOR_RECIPES.recipeBuilder()
    .fluidInputs(fluid('oxygen')*2700)
    .inputs(item('galacticraftcore:oxygen_tank_heavy_full', 2700))
    .outputs(item('galacticraftcore:oxygen_tank_heavy_full'))
    .EUt(120)
    .duration(230)
    .buildAndRegister();

crafting.remove('galacticraftcore:basic_item_3');
crafting.remove('galacticraftcore:furnace');

crafting.remove('galacticraftplanets:asteroid_block_7');
crafting.remove('galacticraftplanets:item_basic_asteroids_0');

crafting.addShaped("air_fan_steel_gc", item('galacticraftcore:air_fan'), [
[ore('stickSteel'), null, ore('stickSteel')], 
[null, ore('rotorSteel'), null], 
[ore('compressedSteel'), item('gregtech:meta_item_1', 129), ore('compressedSteel')]
])
crafting.remove('galacticraftcore:air_fan');
crafting.remove('galacticraftcore:fuel_loader');
crafting.remove('galacticraftplanets:mars_machine_t2_8');

crafting.addShaped("galacticraft_oxygen_light", item('galacticraftcore:oxygen_tank_light_full', 900), [[ore('screwTin'), ore('blockWoolLime'), ore('screwTin')], [ore('compressedIron'), item('galacticraftcore:canister'), ore('compressedIron')], [ore('screwTin'), ore('compressedCopper'), ore('screwTin')]])

EXTRUDER_RECIPES.recipeBuilder()
    .inputs(item('galacticraftcore:basic_item', 7))
    .outputs(item('galacticraftcore:canister'))
    .notConsumable(metaitem('shape.extruder.bottle'))
    .EUt(110)
    .duration(220)
    .buildAndRegister();

crafting.remove('galacticraftcore:canister_0');
crafting.remove('galacticraftcore:oxygen_tank_light_full');

crafting.addShaped("canvas_galacticraft", item('galacticraftcore:canvas'), [[null, ore('paper'), ore('stickWood')], [ore('paper'), ore('ringSteel'), item('silkarmor:silk_cloth')], [ore('stickWood'), item('silkarmor:silk_cloth'), null]])