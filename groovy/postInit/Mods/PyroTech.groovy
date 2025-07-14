import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;





crafting.addShaped("plant_fibre_torch", item('pyrotech:torch_fiber'), [
[item('notreepunching:grass_fiber')], 
[ore('stickWood')]
])

crafting.addShaped("plant_fibre_torch_2", item('pyrotech:torch_fiber'), [
[item('primal_tech:plant_fibres')], 
[ore('stickWood')]
])

oreDict.add("dustAsh", item('pyrotech:material'));

crafting.remove("pyrotech:tech/basic/anvil_granite")

crafting.addShaped("granite_anvil_pyrotech_recipe", item('pyrotech:anvil_granite'), [
[ore('stoneSmooth'), ore('stoneSmooth'), ore('stoneSmooth')], 
[ore('plateStone'), ore('plateStone'), ore('plateStone')]
])

crafting.remove("pyrotech:ignition/flint_and_tinder")

mods.pyrotech.anvil.removeByOutput(item('pyrotech:material', 16)*2);

mods.pyrotech.anvil.recipeBuilder()
    .input(metaitem('ingotMasonryBrick'))
    .output(item('pyrotech:material', 16))
    .hits(5)
    .typeHammer()
    .tierGranite()
    .name('gt_masonry_to_pyrotech_masonry')
    .register()

furnace.removeByInput(metaitem('dustMasonryBrick'))

oreDict.remove("dustFlint", item('pyrotech:material', 31))

crafting.remove('pyrotech:tech/basic/drying_rack_crude')

crafting.addShaped("drying_rack_crude", item('pyrotech:drying_rack'), [
[ore('stickWood'), ore('stickWood')], 
[item('notreepunching:grass_fiber'), item('notreepunching:grass_fiber')]])

mods.pyrotech.crude_drying_rack.removeByInput(item('pyrotech:material', 12))

mods.pyrotech.crude_drying_rack.recipeBuilder()
    .input(item('notreepunching:grass_fiber'))
    .output(item('pyrotech:material', 13))
    .dryTime(260)
    .name('dried_plant_fibers_drying_rack')
    .register()

crafting.remove('pyrotech:furnace')

BLOOMERY_RECIPES.recipeBuilder()
    .inputs(item('gregtech:ore_copper_0'))
    .outputs(metaitem('nuggetCopper')*13)
    .outputs(metaitem('copper_ore_slag')*2)
    .duration(100)
    .buildAndRegister();

BLOOMERY_RECIPES.recipeBuilder()
    .inputs(item('gregtech:ore_tin_0'))
    .outputs(metaitem('nuggetTin')*13)
    .outputs(metaitem('tin_ore_slag')*2)
    .duration(100)
    .buildAndRegister();

BLOOMERY_RECIPES.recipeBuilder()
    .inputs(item('gregtech:ore_iron_0'))
    .outputs(item('minecraft:iron_nugget')*13)
    .outputs(item('pyrotech:generated_slag_iron')*2)
    .duration(100)
    .buildAndRegister();

BLOOMERY_RECIPES.recipeBuilder()
    .inputs(item('gregtech:ore_gold_0'))
    .outputs(item('minecraft:gold_nugget')*13)
    .outputs(item('pyrotech:generated_slag_gold')*2)
    .duration(100)
    .buildAndRegister();

crafting.remove('pyrotech:tool/bone_axe')
crafting.remove('pyrotech:tool/bone_pickaxe')
crafting.remove('pyrotech:tool/bone_hoe')
crafting.remove('pyrotech:tool/bone_sword')
crafting.remove('pyrotech:tool/bone_shovel')

crafting.remove('pyrotech:tool/bone_axe_durable')
crafting.remove('pyrotech:tool/bone_pickaxe_durable')
crafting.remove('pyrotech:tool/bone_hoe_durable')
crafting.remove('pyrotech:tool/bone_shovel_durable')

crafting.remove('pyrotech:tool/flint_axe_durable')
crafting.remove('pyrotech:tool/flint_pickaxe_durable')
crafting.remove('pyrotech:tool/flint_hoe_durable')
crafting.remove('pyrotech:tool/flint_shovel_durable')

crafting.remove('pyrotech:tool/gold_shears')

crafting.remove('pyrotech:tool/bone_shears')
crafting.remove('pyrotech:tool/flint_shears')
crafting.remove('pyrotech:tool/diamond_shears')

crafting.remove('pyrotech:diamond_hammer')
crafting.remove('pyrotech:iron_hammer')
crafting.remove('pyrotech:gold_hammer')


crafting.remove('pyrotech:tech/bloomery/tongs_iron')
crafting.remove('pyrotech:tech/bloomery/tongs_gold')
crafting.remove('pyrotech:tech/bloomery/tongs_diamond')

CHEMICAL_BATH_RECIPES.recipeBuilder()
    .fluidInputs(fluid('wood_tar') * 25)
    .inputs(item('pyrotech:material', 20))
    .outputs(item('pyrotech:material', 23))
    .EUt(12)
    .duration(20)
    .buildAndRegister();

CUTTER_RECIPES.recipeBuilder()
    .inputs(item('pyrotech:planks_tarred'))
    .fluidInputs(fluid('water')*50)
    .outputs(item('pyrotech:material', 23) * 4)
    .EUt(12)
    .duration(200)
    .buildAndRegister();

CUTTER_RECIPES.recipeBuilder()
    .inputs(item('pyrotech:planks_tarred'))
    .fluidInputs(fluid('distilled_water')*40)
    .outputs(item('pyrotech:material', 23) * 4)
    .EUt(12)
    .duration(150)
    .buildAndRegister();

CUTTER_RECIPES.recipeBuilder()
    .inputs(item('pyrotech:planks_tarred'))
    .fluidInputs(fluid('lubricant')*20)
    .outputs(item('pyrotech:material', 23) * 4)
    .EUt(12)
    .duration(100)
    .buildAndRegister();

// Paper * 1
mods.gregtech.chemical_bath.removeByInput(7, [item('minecraft:reeds')], [fluid('distilled_water') * 100 * 100])
// Paper * 1
mods.gregtech.chemical_bath.removeByInput(4, [metaitem('dustWood')], [fluid('water') * 100 * 100])
// Paper * 1
mods.gregtech.chemical_bath.removeByInput(4, [metaitem('dustPaper')], [fluid('water') * 100 * 100])
// Paper * 1
mods.gregtech.chemical_bath.removeByInput(7, [item('minecraft:reeds')], [fluid('water') * 100 * 100])
// Paper * 1
mods.gregtech.chemical_bath.removeByInput(4, [metaitem('dustWood')], [fluid('distilled_water') * 100 * 100])
// Paper * 1
mods.gregtech.chemical_bath.removeByInput(4, [metaitem('dustPaper')], [fluid('distilled_water') * 100 * 100])


CUTTER_RECIPES.recipeBuilder()
    .inputs(ore('slabWood'))
    .fluidInputs(fluid('water')*25)
    .outputs(item('minecraft:wooden_slab', 3) * 4)
    .EUt(12)
    .duration(200)
    .buildAndRegister();

CUTTER_RECIPES.recipeBuilder()
    .inputs(ore('slabWood'))
    .fluidInputs(fluid('distilled_water')*20)
    .outputs(item('minecraft:wooden_slab', 3) * 4)
    .EUt(12)
    .duration(150)
    .buildAndRegister();

CUTTER_RECIPES.recipeBuilder()
    .inputs(ore('slabWood'))
    .fluidInputs(fluid('lubricant')*15)
    .outputs(item('minecraft:wooden_slab', 3) * 4)
    .EUt(12)
    .duration(100)
    .buildAndRegister();

CUTTER_RECIPES.recipeBuilder()
    .inputs(item('pyrotech:material', 45))
    .fluidInputs(fluid('water')*25)
    .outputs(item('pyrotech:material', 39))
    .EUt(12)
    .duration(200)
    .buildAndRegister();

CUTTER_RECIPES.recipeBuilder()
    .inputs(item('pyrotech:material', 45))
    .fluidInputs(fluid('distilled_water')*20)
    .outputs(item('pyrotech:material', 39))
    .EUt(12)
    .duration(150)
    .buildAndRegister();

CUTTER_RECIPES.recipeBuilder()
    .inputs(item('pyrotech:material', 45))
    .fluidInputs(fluid('lubricant')*15)
    .outputs(item('pyrotech:material', 39))
    .EUt(12)
    .duration(100)
    .buildAndRegister();

CUTTER_RECIPES.recipeBuilder()
    .inputs(item('pyrotech:material', 38))
    .fluidInputs(fluid('water')*25)
    .outputs(item('pyrotech:material', 39)*2)
    .EUt(12)
    .duration(200)
    .buildAndRegister();

CUTTER_RECIPES.recipeBuilder()
    .inputs(item('pyrotech:material', 38))
    .fluidInputs(fluid('distilled_water')*20)
    .outputs(item('pyrotech:material', 39)*2)
    .EUt(12)
    .duration(150)
    .buildAndRegister();

CUTTER_RECIPES.recipeBuilder()
    .inputs(item('pyrotech:material', 38))
    .fluidInputs(fluid('lubricant')*15)
    .outputs(item('pyrotech:material', 39)*2)
    .EUt(12)
    .duration(100)
    .buildAndRegister();

CHEMICAL_BATH_RECIPES.recipeBuilder()
    .fluidInputs(fluid('wood_tar') * 200)
    .inputs(item('pyrotech:material', 39))
    .outputs(item('pyrotech:material', 43))
    .EUt(20)
    .duration(200)
    .buildAndRegister();

CHEMICAL_BATH_RECIPES.recipeBuilder()
    .fluidInputs(fluid('wood_tar') * 200)
    .inputs(item('pyrotech:thatch'))
    .outputs(item('pyrotech:wood_tar_block'))
    .EUt(20)
    .duration(200)
    .buildAndRegister();

CHEMICAL_BATH_RECIPES.recipeBuilder()
    .fluidInputs(fluid('wood_tar') * 200)
    .inputs(item('pyrotech:material', 38))
    .outputs(item('pyrotech:material', 42))
    .EUt(20)
    .duration(200)
    .buildAndRegister();

CHEMICAL_BATH_RECIPES.recipeBuilder()
    .fluidInputs(fluid('wood_tar') * 200)
    .inputs(item('minecraft:leather'))
    .outputs(item('pyrotech:material', 41))
    .EUt(20)
    .duration(200)
    .buildAndRegister();

CHEMICAL_BATH_RECIPES.recipeBuilder()
    .fluidInputs(fluid('wood_tar') * 200)
    .inputs(ore('plankWood'))
    .outputs(item('pyrotech:planks_tarred'))
    .EUt(20)
    .duration(200)
    .buildAndRegister();

CHEMICAL_BATH_RECIPES.recipeBuilder()
    .fluidInputs(fluid('wood_tar') * 200)
    .inputs(ore('blockWool'))
    .outputs(item('pyrotech:wool_tarred'))
    .EUt(20)
    .duration(200)
    .buildAndRegister();

CHEMICAL_BATH_RECIPES.recipeBuilder()
    .fluidInputs(fluid('wood_tar') * 200)
    .inputs(item('pyrotech:material', 29))
    .outputs(item('pyrotech:material', 30))
    .EUt(20)
    .duration(200)
    .buildAndRegister();

CHEMICAL_BATH_RECIPES.recipeBuilder()
    .fluidInputs(fluid('wood_tar') * 200)
    .inputs(item('pyrotech:material', 40))
    .outputs(item('pyrotech:material', 44))
    .EUt(20)
    .duration(200)
    .buildAndRegister();

CHEMICAL_BATH_RECIPES.recipeBuilder()
    .fluidInputs(fluid('wood_tar') * 200)
    .inputs(item('pyrotech:material', 14))
    .outputs(item('pyrotech:material', 26))
    .EUt(20)
    .duration(200)
    .buildAndRegister();

DRYER_RECIPES.recipeBuilder()
    .inputs(item('pyrotech:hide_tanned'))
    .outputs(item('minecraft:leather'))
    .duration(300)
    .EUt(20)
    .buildAndRegister();

DRYER_RECIPES.recipeBuilder()
    .inputs(item('pyrotech:hide_small_tanned'))
    .outputs(item('pyrotech:material', 45))
    .duration(300)
    .EUt(20)
    .buildAndRegister();

DRYER_RECIPES.recipeBuilder()
    .inputs(item('minecraft:sponge', 1))
    .outputs(item('minecraft:sponge'))
    .duration(300)
    .EUt(20)
    .buildAndRegister();

DRYER_RECIPES.recipeBuilder()
    .inputs(ore('treeSapling'))
    .outputs(item('pyrotech:material', 13))
    .duration(300)
    .EUt(20)
    .buildAndRegister();

DRYER_RECIPES.recipeBuilder()
    .inputs(item('pyrotech:material', 12))
    .outputs(item('pyrotech:material', 13))
    .duration(300)
    .EUt(20)
    .buildAndRegister();

DRYER_RECIPES.recipeBuilder()
    .inputs(item('minecraft:wheat'))
    .outputs(item('pyrotech:material', 2))
    .duration(300)
    .EUt(20)
    .buildAndRegister();

DRYER_RECIPES.recipeBuilder()
    .inputs(item('pyrotech:material', 25))
    .outputs(item('minecraft:paper'))
    .duration(300)
    .EUt(20)
    .buildAndRegister();

CHEMICAL_BATH_RECIPES.recipeBuilder()
    .fluidInputs(fluid('water')*125)
    .inputs(item('minecraft:reeds'))
    .outputs(item('pyrotech:material', 25))
    .duration(200)
    .EUt(12)
    .buildAndRegister();

CHEMICAL_BATH_RECIPES.recipeBuilder()
    .fluidInputs(fluid('water')*500)
    .inputs(item('pyrotech:rock', 7))
    .outputs(item('pyrotech:material', 25))
    .duration(200)
    .EUt(12)
    .buildAndRegister();

CHEMICAL_BATH_RECIPES.recipeBuilder()
    .fluidInputs(fluid('water')*500)
    .inputs(metaitem('dustPaper'))
    .outputs(item('pyrotech:material', 25))
    .duration(200)
    .EUt(12)
    .buildAndRegister();

CHEMICAL_BATH_RECIPES.recipeBuilder()
    .fluidInputs(fluid('water')*500)
    .inputs(metaitem('dustWood'))
    .outputs(item('pyrotech:material', 25))
    .duration(200)
    .EUt(12)
    .buildAndRegister();

CHEMICAL_BATH_RECIPES.recipeBuilder()
    .fluidInputs(fluid('distilled_water')*125)
    .inputs(item('minecraft:reeds'))
    .outputs(item('pyrotech:material', 25))
    .duration(150)
    .EUt(12)
    .buildAndRegister();

CHEMICAL_BATH_RECIPES.recipeBuilder()
    .fluidInputs(fluid('distilled_water')*500)
    .inputs(item('pyrotech:rock', 7))
    .outputs(item('pyrotech:material', 25))
    .duration(150)
    .EUt(12)
    .buildAndRegister();

CHEMICAL_BATH_RECIPES.recipeBuilder()
    .fluidInputs(fluid('distilled_water')*500)
    .inputs(metaitem('dustPaper'))
    .outputs(item('pyrotech:material', 25))
    .duration(150)
    .EUt(12)
    .buildAndRegister();

CHEMICAL_BATH_RECIPES.recipeBuilder()
    .fluidInputs(fluid('distilled_water')*500)
    .inputs(metaitem('dustWood'))
    .outputs(item('pyrotech:material', 25))
    .duration(150)
    .EUt(12)
    .buildAndRegister();

crafting.remove('pyrotech:shears');

CHEMICAL_BATH_RECIPES.recipeBuilder()
    .fluidInputs(fluid('tannin')*250)
    .inputs(item('pyrotech:hide_washed'))
    .outputs(item('pyrotech:hide_tanned'))
    .EUt(60)
    .duration(300)
    .buildAndRegister();

CHEMICAL_BATH_RECIPES.recipeBuilder()
    .fluidInputs(fluid('water')*250)
    .inputs(item('pyrotech:hide_scraped'))
    .outputs(item('pyrotech:hide_washed'))
    .EUt(60)
    .duration(300)
    .buildAndRegister();

CUTTER_RECIPES.recipeBuilder()
    .inputs(ore('hideScrapeable'))
    .outputs(item('pyrotech:hide_scraped'))
    .fluidInputs(fluid('water')*12)
    .EUt(60)
    .duration(400)
    .buildAndRegister();

CUTTER_RECIPES.recipeBuilder()
    .inputs(ore('hideScrapeable'))
    .outputs(item('pyrotech:hide_scraped'))
    .fluidInputs(fluid('distilled_water')*10)
    .EUt(60)
    .duration(300)
    .buildAndRegister();

CUTTER_RECIPES.recipeBuilder()
    .inputs(ore('hideScrapeable'))
    .outputs(item('pyrotech:hide_scraped'))
    .fluidInputs(fluid('lubricant')*8)
    .EUt(60)
    .duration(300)
    .buildAndRegister();

CUTTER_RECIPES.recipeBuilder()
    .inputs(ore('slabWood'))
    .outputs(item('pyrotech:material', 20) * 4)
    .fluidInputs(fluid('water')*12)
    .EUt(60)
    .duration(400)
    .buildAndRegister();

CUTTER_RECIPES.recipeBuilder()
    .inputs(ore('slabWood'))
    .outputs(item('pyrotech:material', 20) * 4)
    .fluidInputs(fluid('distilled_water')*10)
    .EUt(60)
    .duration(300)
    .buildAndRegister();

CUTTER_RECIPES.recipeBuilder()
    .inputs(ore('slabWood'))
    .outputs(item('pyrotech:material', 20) * 4)
    .fluidInputs(fluid('lubricant')*8)
    .EUt(60)
    .duration(300)
    .buildAndRegister();