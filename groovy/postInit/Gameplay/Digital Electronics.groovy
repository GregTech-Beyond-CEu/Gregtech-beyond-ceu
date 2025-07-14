import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;



mods.extendedcrafting.table_crafting.shapedBuilder()
    .matrix([[item('gregtech:meta_item_2', 573), item('gregtech:meta_item_2', 573), item('gregtech:meta_item_2', 573), item('gregtech:meta_item_2', 573), item('gregtech:meta_item_2', 573)], 
            [metaitem('component.smd.resistor'), item('gregtech:meta_item_2', 573), item('gregtech:meta_item_2', 573), item('gregtech:meta_item_2', 573), item('gregtech:meta_item_2', 573)], 
            [ore('wireGtSingleRedAlloy'), ore('wireGtSingleRedAlloy'), metaitem('component.smd.transistor'), item('gregtech:meta_item_2', 573), item('gregtech:meta_item_2', 573)], 
            [item('gregtech:meta_item_2', 573), item('gregtech:meta_item_2', 573), ore('wireGtSingleRedAlloy'), item('gregtech:meta_item_2', 573), item('gregtech:meta_item_2', 573)], 
            [item('gregtech:meta_item_2', 573), item('gregtech:meta_item_2', 573), metaitem('component.smd.resistor'), item('gregtech:meta_item_2', 573), item('gregtech:meta_item_2', 573)]])
    .output(metaitem('not_gate'))
    .tier(2)
    .register()

mods.extendedcrafting.table_crafting.shapedBuilder()
    .matrix([[item('gregtech:meta_item_2', 573), item('gregtech:meta_item_2', 573), item('gregtech:meta_item_2', 573), item('gregtech:meta_item_2', 573), item('gregtech:meta_item_2', 573), item('gregtech:meta_item_2', 573), item('gregtech:meta_item_2', 573)], 
            [item('gregtech:meta_item_2', 573), item('gregtech:meta_item_2', 576), ore('wireGtSingleRedAlloy'), ore('wireGtSingleRedAlloy'), item('gregtech:meta_item_2', 573), item('gregtech:meta_item_2', 573), item('gregtech:meta_item_2', 573)], 
            [item('gregtech:meta_item_2', 573), item('gregtech:meta_item_2', 573), item('gregtech:meta_item_2', 573), ore('wireGtSingleRedAlloy'), item('gregtech:meta_item_2', 573), item('gregtech:meta_item_2', 573), item('gregtech:meta_item_2', 573)], 
            [item('gregtech:meta_item_2', 573), item('gregtech:meta_item_2', 576), ore('wireGtSingleRedAlloy'), item('gregtech:meta_item_2', 577), ore('wireGtSingleRedAlloy'), ore('wireGtSingleRedAlloy'), item('gregtech:meta_item_2', 573)], 
            [item('gregtech:meta_item_2', 573), item('gregtech:meta_item_2', 573), ore('wireGtSingleRedAlloy'), item('gregtech:meta_item_2', 573), item('gregtech:meta_item_2', 573), ore('wireGtSingleRedAlloy'), item('gregtech:meta_item_2', 573)], 
            [item('gregtech:meta_item_2', 573), item('gregtech:meta_item_2', 573), item('gregtech:meta_item_2', 577), ore('wireGtSingleRedAlloy'), ore('wireGtSingleRedAlloy'), item('gregtech:meta_item_2', 578), item('gregtech:meta_item_2', 573)], 
            [item('gregtech:meta_item_2', 573), item('gregtech:meta_item_2', 573), item('gregtech:meta_item_2', 573), item('gregtech:meta_item_2', 573), item('gregtech:meta_item_2', 573), item('gregtech:meta_item_2', 573), item('gregtech:meta_item_2', 573)]])
    .output(metaitem('plate.xor'))
    .tier(3)
    .register()

mods.extendedcrafting.table_crafting.shapedBuilder()
    .matrix([[item('gregtech:meta_item_2', 573), item('gregtech:meta_item_2', 573), item('gregtech:meta_item_2', 573), item('gregtech:meta_item_2', 573), item('gregtech:meta_item_2', 573)], 
            [item('minecraft:lever'), ore('wireGtSingleRedAlloy'), metaitem('component.smd.diode'), item('gregtech:meta_item_2', 573), item('gregtech:meta_item_2', 573)], 
            [item('gregtech:meta_item_2', 573), item('gregtech:meta_item_2', 573), ore('wireGtSingleRedAlloy'), ore('wireGtSingleRedAlloy'), metaitem('component.smd.resistor')], 
            [item('minecraft:lever'), ore('wireGtSingleRedAlloy'), metaitem('component.smd.diode'), item('gregtech:meta_item_2', 573), item('gregtech:meta_item_2', 573)], 
            [item('gregtech:meta_item_2', 573), item('gregtech:meta_item_2', 573), item('gregtech:meta_item_2', 573), item('gregtech:meta_item_2', 573), item('gregtech:meta_item_2', 573)]])
    .output(metaitem('or_gate'))
    .tier(2)
    .register()

mods.extendedcrafting.table_crafting.shapedBuilder()
    .matrix([[item('gregtech:meta_item_2', 573), item('gregtech:meta_item_2', 573), metaitem('component.smd.resistor'), item('gregtech:meta_item_2', 573), item('gregtech:meta_item_2', 573)], 
            [item('gregtech:meta_item_2', 573), item('gregtech:meta_item_2', 573), ore('wireGtSingleRedAlloy'), item('gregtech:meta_item_2', 573), item('gregtech:meta_item_2', 573)], 
            [ore('wireGtSingleRedAlloy'), metaitem('component.smd.diode'), ore('wireGtSingleRedAlloy'), item('gregtech:meta_item_2', 573), item('gregtech:meta_item_2', 573)], 
            [ore('wireGtSingleRedAlloy'), item('gregtech:meta_item_2', 573), ore('wireGtSingleRedAlloy'), item('gregtech:meta_item_2', 573), item('gregtech:meta_item_2', 573)], 
            [ore('wireGtSingleRedAlloy'), metaitem('component.smd.diode'), ore('wireGtSingleRedAlloy'), item('gregtech:meta_item_2', 573), item('gregtech:meta_item_2', 573)]])
    .output(metaitem('and_gate'))
    .tier(2)
    .register()

GATE_ASSEMBLER_RECIPES.recipeBuilder()
    .inputs(metaitem('silicon_wafer_slice'))
    .outputs(metaitem('and_gate'))
    .inputs(item('gregtech:wire_single', 2517)*7)
    .inputs(metaitem('component.smd.resistor'))
    .inputs(metaitem('component.smd.diode')*2)
    .duration(2000)
    .EUt(5000)
    .buildAndRegister();

GATE_ASSEMBLER_RECIPES.recipeBuilder()
    .inputs(metaitem('silicon_wafer_slice'))
    .outputs(metaitem('or_gate'))
    .inputs(item('gregtech:wire_single', 2517)*4)
    .inputs(metaitem('component.smd.resistor'))
    .inputs(metaitem('component.smd.diode')*2)
    .inputs(item('minecraft:lever')*2)
    .duration(2000)
    .EUt(5000)
    .buildAndRegister();

GATE_ASSEMBLER_RECIPES.recipeBuilder()
    .inputs(metaitem('silicon_wafer_slice'))
    .outputs(metaitem('not_gate'))
    .inputs(item('gregtech:wire_single', 2517)*3)
    .inputs(metaitem('component.smd.resistor')*2)
    .inputs(metaitem('component.smd.transistor'))
    .duration(2000)
    .EUt(5000)
    .buildAndRegister();

GATE_ASSEMBLER_RECIPES.recipeBuilder()
    .inputs(metaitem('silicon_wafer_slice'))
    .outputs(metaitem('plate.xor'))
    .inputs(item('gregtech:wire_single', 2517)*10)
    .inputs(metaitem('not_gate')*2)
    .inputs(metaitem('and_gate')*2)
    .inputs(metaitem('or_gate'))
    .duration(2000)
    .EUt(5000)
    .buildAndRegister();