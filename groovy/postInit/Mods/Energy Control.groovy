import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;

crafting.remove('energycontrol:kit_assembler');

AUTOMATIC_WIRE_BONDER.recipeBuilder()
    .inputs(metaitem('wireFineNylon'))
    .inputs(metaitem('foilKevlar'))
    .outputs(item('energycontrol:item_component', 4))
    .EUt(200)
    .duration(300)
    .buildAndRegister();

crafting.remove('energycontrol:strong_string');
crafting.remove('energycontrol:strong_string2');

ASSEMBLER_RECIPES.recipeBuilder()
    .inputs(item('minecraft:dye', 1) * 4)
    .inputs(item('energycontrol:item_component', 4) * 2)
    .inputs(metaitem('stickIron'))
    .inputs(metaitem('plateIron'))
    .outputs(item('energycontrol:panel_toolkit'))
    .EUt(150)
    .duration(250)
    .buildAndRegister();

ASSEMBLER_RECIPES.recipeBuilder()
    .inputs(metaitem('hull.hv'))
    .inputs(item('energycontrol:item_component', 4) * 4)
    .inputs(metaitem('item_casingStainlessSteel')*4)
    .outputs(item('energycontrol:item_component', 2))
    .EUt(150)
    .duration(250)
    .buildAndRegister();

CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder()
    .fluidInputs(fluid('soldering_alloy')*288)
    .inputs(metaitem('plateIron'))
    .inputs(ore('circuitHv'))
    .outputs(item('energycontrol:item_component', 1))
    .inputs(metaitem('boltRedAlloy')*16)
    .EUt(150)
    .duration(250)
    .buildAndRegister();

CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder()
    .fluidInputs(fluid('soldering_alloy')*288)
    .inputs(metaitem('plateGold'))
    .inputs(ore('circuitHv'))
    .outputs(item('energycontrol:item_component'))
    .inputs(metaitem('boltRedAlloy')*16)
    .EUt(150)
    .duration(250)
    .buildAndRegister();

KIT_ASSEMBLER.recipeBuilder()
    .fluidInputs(fluid('soldering_alloy')*144)
    .inputs(item('energycontrol:item_card', 14))
    .inputs(item('energycontrol:item_card', 14))
    .inputs(item('energycontrol:item_component', 4) * 2)
    .outputs(item('energycontrol:item_kit', 7)*2)
    .EUt(12)
    .duration(140)
    .buildAndRegister();

KIT_ASSEMBLER.recipeBuilder()
    .fluidInputs(fluid('soldering_alloy')*144)
    .inputs(item('energycontrol:item_card', 13))
    .inputs(item('energycontrol:item_card', 13))
    .inputs(item('energycontrol:item_component', 4) * 2)
    .outputs(item('energycontrol:item_kit', 6)*2)
    .EUt(12)
    .duration(140)
    .buildAndRegister();

KIT_ASSEMBLER.recipeBuilder()
    .fluidInputs(fluid('soldering_alloy')*144)
    .inputs(item('energycontrol:item_card', 16))
    .inputs(item('energycontrol:item_card', 16))
    .inputs(item('energycontrol:item_component', 4) * 2)
    .outputs(item('energycontrol:item_kit', 9)*2)
    .EUt(12)
    .duration(140)
    .buildAndRegister();

KIT_ASSEMBLER.recipeBuilder()
    .fluidInputs(fluid('soldering_alloy')*144)
    .inputs(item('energycontrol:item_card', 3))
    .inputs(item('energycontrol:item_card', 3))
    .inputs(item('energycontrol:item_component', 4) * 2)
    .outputs(item('energycontrol:item_kit', 3)*2)
    .EUt(12)
    .duration(140)
    .buildAndRegister();

KIT_ASSEMBLER.recipeBuilder()
    .fluidInputs(fluid('soldering_alloy')*144)
    .inputs(item('energycontrol:item_card', 2))
    .inputs(item('energycontrol:item_card', 2))
    .inputs(item('energycontrol:item_component', 4) * 2)
    .outputs(item('energycontrol:item_kit', 2)*2)
    .EUt(12)
    .duration(140)
    .buildAndRegister();

KIT_ASSEMBLER.recipeBuilder()
    .fluidInputs(fluid('soldering_alloy')*144)
    .inputs(item('energycontrol:item_card', 15))
    .inputs(item('energycontrol:item_card', 15))
    .inputs(item('energycontrol:item_component', 4) * 2)
    .outputs(item('energycontrol:item_kit', 8)*2)
    .EUt(12)
    .duration(140)
    .buildAndRegister();

KIT_ASSEMBLER.recipeBuilder()
    .fluidInputs(fluid('soldering_alloy')*144)
    .inputs(item('energycontrol:item_card', 23))
    .inputs(item('energycontrol:item_card', 23))
    .inputs(item('energycontrol:item_component', 4) * 2)
    .outputs(item('energycontrol:item_kit', 13)*2)
    .EUt(12)
    .duration(140)
    .buildAndRegister();

KIT_ASSEMBLER.recipeBuilder()
    .fluidInputs(fluid('soldering_alloy')*144)
    .inputs(item('energycontrol:item_card'))
    .inputs(item('energycontrol:item_card'))
    .inputs(item('energycontrol:item_component', 4) * 2)
    .outputs(item('energycontrol:item_kit')*2)
    .EUt(12)
    .duration(140)
    .buildAndRegister();

KIT_ASSEMBLER.recipeBuilder()
    .fluidInputs(fluid('soldering_alloy')*144)
    .inputs(item('energycontrol:item_card', 1))
    .inputs(item('energycontrol:item_card', 1))
    .inputs(item('energycontrol:item_component', 4) * 2)
    .outputs(item('energycontrol:item_kit', 1)*2)
    .EUt(12)
    .duration(140)
    .buildAndRegister();

KIT_ASSEMBLER.recipeBuilder()
    .fluidInputs(fluid('soldering_alloy')*144)
    .inputs(item('energycontrol:item_card', 27))
    .inputs(item('energycontrol:item_card', 27))
    .inputs(item('energycontrol:item_component', 4) * 2)
    .outputs(item('energycontrol:item_kit', 10)*2)
    .EUt(12)
    .duration(140)
    .buildAndRegister();

KIT_ASSEMBLER.recipeBuilder()
    .fluidInputs(fluid('soldering_alloy')*144)
    .inputs(item('energycontrol:item_card', 22))
    .inputs(item('energycontrol:item_card', 22))
    .inputs(item('energycontrol:item_component', 4) * 2)
    .outputs(item('energycontrol:item_kit', 10)*2)
    .EUt(12)
    .duration(140)
    .buildAndRegister();

mods.jei.category.hideCategory('energycontrol:kit_assembler')

ASSEMBLER_RECIPES.recipeBuilder()
    .fluidInputs(fluid('ethanol')*1000)
    .inputs(metaitem('component.glass.tube')*2)
    .inputs(metaitem('ringSteel')*2)
    .inputs(metaitem('fluid_cell.glass_vial'))
    .outputs(item('energycontrol:thermometer'))
    .EUt(70)
    .duration(180)
    .buildAndRegister();

mods.extendedcrafting.table_crafting.shapedBuilder()
    .matrix([[item('gregtech:meta_item_2', 573), item('gregtech:meta_item_2', 573), item('gregtech:meta_item_2', 573), item('gregtech:meta_item_2', 573), item('gregtech:meta_item_2', 573), item('gregtech:meta_item_2', 573), item('gregtech:meta_item_2', 573)], 
            [item('gregtech:meta_item_2', 573), ore('batteryLv'), item('gregtech:meta_item_2', 573), item('gregtech:meta_item_2', 573), item('gregtech:meta_item_2', 573), item('gregtech:meta_item_2', 573), item('gregtech:meta_item_2', 573)], 
            [item('gregtech:meta_item_2', 573), ore('wireGtSingleRedAlloy'), item('gregtech:meta_item_2', 573), item('gregtech:meta_item_2', 580), item('gregtech:meta_item_2', 573), metaitem('component.smd.capacitor'), item('gregtech:meta_item_2', 573)], 
            [item('gregtech:meta_item_2', 573), metaitem('component.smd.resistor'), item('gregtech:meta_item_2', 573), ore('wireGtSingleRedAlloy'), item('gregtech:meta_item_2', 573), ore('wireGtSingleRedAlloy'), item('gregtech:meta_item_2', 573)], 
            [item('gregtech:meta_item_2', 573), ore('wireGtSingleRedAlloy'), ore('wireGtSingleRedAlloy'), ore('wireGtSingleRedAlloy'), ore('wireGtSingleRedAlloy'), item('gregtech:meta_item_2', 579), item('gregtech:meta_item_2', 573)], 
            [item('gregtech:meta_item_2', 573), metaitem('component.smd.resistor'), item('gregtech:meta_item_2', 573), item('gregtech:meta_item_2', 573), item('gregtech:meta_item_2', 573), item('gregtech:meta_item_2', 573), item('gregtech:meta_item_2', 573)], 
            [item('gregtech:meta_item_2', 573), item('gregtech:meta_item_2', 573), item('gregtech:meta_item_2', 573), item('gregtech:meta_item_2', 573), item('gregtech:meta_item_2', 573), item('gregtech:meta_item_2', 573), item('gregtech:meta_item_2', 573)]])
    .output(metaitem('simple_alarm_circuit'))
    .tier(3)
    .register()

crafting.remove('energycontrol:lime_dye');

crafting.addShaped("howler_alarm_ec", item('energycontrol:howler_alarm'), [
[ore('plateSteel'), ore('plateSteel'), ore('plateSteel')], 
[ore('circuitBasic'), item('gregtech:meta_item_2', 581), ore('circuitBasic')], 
[ore('plateSteel'), ore('plateSteel'), ore('plateSteel')]
])

crafting.remove('energycontrol:howler_alarm');
crafting.remove('energycontrol:thermometer');