import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;

//----------------MACERATOR CHANGES-----------------

// Purified Pile of Redstone Dust * 1
mods.gregtech.macerator.removeByInput(2, [metaitem('crushedPurifiedRedstone')], null)
// Purified Pile of Bastnasite Dust * 1
mods.gregtech.macerator.removeByInput(2, [metaitem('crushedPurifiedBastnasite')], null)
// Purified Pile of Neodymium Dust * 1
mods.gregtech.macerator.removeByInput(2, [metaitem('crushedPurifiedNeodymium')], null)
// Crushed Neodymium Ore * 4
mods.gregtech.macerator.removeByInput(2, [item('gregtech:ore_neodymium_0', 1)], null)
// Impure Pile of Neodymium Dust * 1
mods.gregtech.macerator.removeByInput(2, [metaitem('crushedNeodymium')], null)
// Crushed Neodymium Ore * 4
mods.gregtech.macerator.removeByInput(2, [item('gregtech:ore_neodymium_0', 2)], null)
// Bastnasite Dust * 1
mods.gregtech.macerator.removeByInput(2, [metaitem('crushedCentrifugedBastnasite')], null)
// Monazite Dust * 1
mods.gregtech.macerator.removeByInput(2, [metaitem('crushedCentrifugedMonazite')], null)
// Neodymium Dust * 1
mods.gregtech.macerator.removeByInput(2, [metaitem('crushedCentrifugedNeodymium')], null)
// Crushed Neodymium Ore * 2
mods.gregtech.macerator.removeByInput(2, [item('gregtech:ore_neodymium_0')], null)

MACERATOR_RECIPES.recipeBuilder()
    .inputs(item('gregtech:ore_neodymium_0'))
    .outputs(metaitem('crushedNeodymium')*2)
    .chancedOutput(metaitem('dustStone')*1, 6700, 800)
    .EUt(12)
    .duration(180)
    .buildAndRegister();

MACERATOR_RECIPES.recipeBuilder()
    .inputs(metaitem('crushedPurifiedRedstone'))
    .outputs(metaitem('dustPureRedstone'))
    .EUt(12)
    .duration(180)
    .buildAndRegister();

MACERATOR_RECIPES.recipeBuilder()
    .inputs(metaitem('crushedPurifiedBastnasite'))
    .outputs(metaitem('dustPureBastnasite'))
    .EUt(12)
    .duration(180)
    .buildAndRegister();

MACERATOR_RECIPES.recipeBuilder()
    .inputs(metaitem('crushedPurifiedNeodymium'))
    .outputs(metaitem('dustPureNeodymium'))
    .EUt(12)
    .duration(180)
    .buildAndRegister();

MACERATOR_RECIPES.recipeBuilder()
    .inputs(item('gregtech:ore_neodymium_0', 1))
    .outputs(metaitem('crushedNeodymium')*4)
    .chancedOutput(metaitem('dustNetherrack')*1, 6700, 800)
    .EUt(12)
    .duration(180)
    .buildAndRegister();

MACERATOR_RECIPES.recipeBuilder()
    .inputs(metaitem('crushedNeodymium'))
    .outputs(metaitem('dustImpureNeodymium'))
    .EUt(12)
    .duration(180)
    .buildAndRegister();

MACERATOR_RECIPES.recipeBuilder()
    .inputs(item('gregtech:ore_neodymium_0', 2))
    .outputs(metaitem('crushedNeodymium')*4)
    .chancedOutput(metaitem('dustEndstone')*1, 6700, 800)
    .EUt(12)
    .duration(180)
    .buildAndRegister();

MACERATOR_RECIPES.recipeBuilder()
    .inputs(metaitem('crushedCentrifugedBastnasite'))
    .outputs(metaitem('dustBastnasite'))
    .EUt(12)
    .duration(180)
    .buildAndRegister();

MACERATOR_RECIPES.recipeBuilder()
    .inputs(metaitem('crushedCentrifugedNeodymium'))
    .outputs(metaitem('dustNeodymium'))
    .EUt(12)
    .duration(180)
    .buildAndRegister();

MACERATOR_RECIPES.recipeBuilder()
    .inputs(metaitem('crushedCentrifugedMonazite'))
    .outputs(metaitem('dustMonazite'))
    .EUt(12)
    .duration(180)
    .buildAndRegister();

//----------------ORE WASHER RECIPES-----------------

// Purified Neodymium Ore * 1
mods.gregtech.ore_washer.removeByInput(16, [metaitem('crushedNeodymium'), metaitem('circuit.integrated').withNbt(['Configuration': 1])], [fluid('water') * 1000 * 1000])
// Purified Neodymium Ore * 1
mods.gregtech.ore_washer.removeByInput(16, [metaitem('crushedNeodymium')], [fluid('distilled_water') * 100 * 100])


ORE_WASHER_RECIPES.recipeBuilder()
    .inputs(metaitem('crushedNeodymium'))
    .circuitMeta(1)
    .fluidInputs(fluid('water')*1000)
    .outputs(metaitem('crushedPurifiedNeodymium'))
    .outputs(metaitem('dustStone'))
    .EUt(16)
    .duration(200)
    .buildAndRegister();

ORE_WASHER_RECIPES.recipeBuilder()
    .inputs(metaitem('crushedNeodymium'))
    .fluidInputs(fluid('distilled_water')*100)
    .outputs(metaitem('crushedPurifiedNeodymium'))
    .outputs(metaitem('dustStone'))
    .EUt(16)
    .duration(200)
    .buildAndRegister();

//----------------CENTRIFUGE-----------------

// Redstone * 1
mods.gregtech.centrifuge.removeByInput(5, [metaitem('dustPureRedstone')], null)
// Bastnasite Dust * 1
mods.gregtech.centrifuge.removeByInput(5, [metaitem('dustPureBastnasite')], null)
// Neodymium Dust * 1
mods.gregtech.centrifuge.removeByInput(5, [metaitem('dustPureNeodymium')], null)
// Neodymium Dust * 1
mods.gregtech.centrifuge.removeByInput(24, [metaitem('dustImpureNeodymium')], null)

CENTRIFUGE_RECIPES.recipeBuilder()
    .inputs(metaitem('dustPureRedstone'))
    .EUt(5)
    .outputs(item('minecraft:redstone'))
    .duration(200)
    .buildAndRegister();

CENTRIFUGE_RECIPES.recipeBuilder()
    .inputs(metaitem('dustPureBastnasite'))
    .EUt(5)
    .outputs(metaitem('dustBastnasite'))
    .duration(200)
    .buildAndRegister();

CENTRIFUGE_RECIPES.recipeBuilder()
    .inputs(metaitem('dustPureNeodymium'))
    .EUt(5)
    .outputs(metaitem('dustNeodymium'))
    .duration(200)
    .buildAndRegister();

CENTRIFUGE_RECIPES.recipeBuilder()
    .inputs(metaitem('dustImpureNeodymium'))
    .EUt(24)
    .outputs(metaitem('dustNeodymium'))
    .duration(200)
    .buildAndRegister();


//----------------THERMAL CENTRIFUGE-----------------

// Centrifuged Redstone Ore * 1
mods.gregtech.thermal_centrifuge.removeByInput(30, [metaitem('crushedPurifiedRedstone')], null)
// Centrifuged Bastnasite Ore * 1
mods.gregtech.thermal_centrifuge.removeByInput(30, [metaitem('crushedPurifiedBastnasite')], null)
// Centrifuged Neodymium Ore * 1
mods.gregtech.thermal_centrifuge.removeByInput(30, [metaitem('crushedPurifiedNeodymium')], null)
// Centrifuged Redstone Ore * 1
mods.gregtech.thermal_centrifuge.removeByInput(30, [metaitem('crushedRedstone')], null)
// Centrifuged Bastnasite Ore * 1
mods.gregtech.thermal_centrifuge.removeByInput(30, [metaitem('crushedBastnasite')], null)
// Centrifuged Neodymium Ore * 1
mods.gregtech.thermal_centrifuge.removeByInput(30, [metaitem('crushedNeodymium')], null)

THERMAL_CENTRIFUGE_RECIPES.recipeBuilder()
    .EUt(30)
    .inputs(metaitem('crushedPurifiedRedstone'))
    .outputs(metaitem('crushedCentrifugedRedstone'))
    .duration(200)
    .buildAndRegister();

THERMAL_CENTRIFUGE_RECIPES.recipeBuilder()
    .EUt(30)
    .inputs(metaitem('crushedPurifiedBastnasite'))
    .outputs(metaitem('crushedCentrifugedBastnasite'))
    .duration(200)
    .buildAndRegister();
    
THERMAL_CENTRIFUGE_RECIPES.recipeBuilder()
    .EUt(30)
    .inputs(metaitem('crushedPurifiedNeodymium'))
    .outputs(metaitem('crushedCentrifugedNeodymium'))
    .duration(200)
    .buildAndRegister();
    
THERMAL_CENTRIFUGE_RECIPES.recipeBuilder()
    .EUt(30)
    .inputs(metaitem('crushedRedstone'))
    .outputs(metaitem('dustStone'))
    .outputs(metaitem('crushedCentrifugedRedstone'))
    .duration(200)
    .buildAndRegister();
    
THERMAL_CENTRIFUGE_RECIPES.recipeBuilder()
    .EUt(30)
    .inputs(metaitem('crushedNeodymium'))
    .outputs(metaitem('dustStone'))
    .outputs(metaitem('crushedCentrifugedNeodymium'))
    .duration(200)
    .buildAndRegister();
    
THERMAL_CENTRIFUGE_RECIPES.recipeBuilder()
    .EUt(30)
    .inputs(metaitem('crushedBastnasite'))
    .outputs(metaitem('dustStone'))
    .outputs(metaitem('crushedCentrifugedNeodymium'))
    .duration(200)
    .buildAndRegister();

//Wtf is this 

// Small Pile of Rare Earth * 1
mods.gregtech.extractor.removeByInput(64, [metaitem('dustMonazite')], null)
