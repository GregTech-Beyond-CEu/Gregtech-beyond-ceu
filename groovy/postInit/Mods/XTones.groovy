import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;

ASSEMBLER_RECIPES.recipeBuilder()
    .inputs(ore('stone'))
    .inputs(item('minecraft:stone_slab')*6)
    .circuitMeta(16)
    .outputs(item('xtones:base') * 8)
    .EUt(12)
    .duration(100)
    .buildAndRegister();

ASSEMBLER_RECIPES.recipeBuilder()
    .inputs(item('xtones:base') * 8)
    .inputs(item('minecraft:stone_slab'))
    .circuitMeta(16)
    .outputs(item('xtones:agon') * 8)
    .EUt(12)
    .duration(100)
    .buildAndRegister();

ASSEMBLER_RECIPES.recipeBuilder()
    .inputs(item('xtones:base') * 8)
    .inputs(ore('dyeBlue'))
    .circuitMeta(16)
    .outputs(item('xtones:azur') * 8)
    .EUt(12)
    .duration(100)
    .buildAndRegister();

ASSEMBLER_RECIPES.recipeBuilder()
    .inputs(item('xtones:base') * 8)
    .inputs(ore('dustCarbon'))
    .circuitMeta(16)
    .outputs(item('xtones:bitt') * 8)
    .EUt(12)
    .duration(100)
    .buildAndRegister();

ASSEMBLER_RECIPES.recipeBuilder()
    .inputs(item('xtones:base') * 8)
    .inputs(item('minecraft:coal'))
    .circuitMeta(16)
    .outputs(item('xtones:bitt') * 8)
    .EUt(12)
    .duration(100)
    .buildAndRegister();

ASSEMBLER_RECIPES.recipeBuilder()
    .inputs(item('xtones:base') * 8)
    .inputs(item('minecraft:hardened_clay'))
    .circuitMeta(16)
    .outputs(item('xtones:cray') * 8)
    .EUt(12)
    .duration(100)
    .buildAndRegister();

ASSEMBLER_RECIPES.recipeBuilder()
    .inputs(item('xtones:base') * 8)
    .inputs(item('minecraft:brick'))
    .circuitMeta(16)
    .outputs(item('xtones:fort') * 8)
    .EUt(12)
    .duration(100)
    .buildAndRegister();

ASSEMBLER_RECIPES.recipeBuilder()
    .inputs(item('xtones:base') * 8)
    .inputs(item('minecraft:glass'))
    .circuitMeta(16)
    .outputs(item('xtones:glaxx') * 8)
    .EUt(12)
    .duration(100)
    .buildAndRegister();

ASSEMBLER_RECIPES.recipeBuilder()
    .inputs(item('xtones:base') * 8)
    .inputs(item('minecraft:stone'))
    .circuitMeta(16)
    .outputs(item('xtones:iszm') * 8)
    .EUt(12)
    .duration(100)
    .buildAndRegister();

ASSEMBLER_RECIPES.recipeBuilder()
    .inputs(item('xtones:base') * 8)
    .inputs(ore('dyeOrange'))
    .circuitMeta(16)
    .outputs(item('xtones:jelt') * 8)
    .EUt(12)
    .duration(100)
    .buildAndRegister();

ASSEMBLER_RECIPES.recipeBuilder()
    .inputs(item('xtones:base') * 8)
    .inputs(item('minecraft:gravel'))
    .circuitMeta(16)
    .outputs(item('xtones:korp') * 8)
    .EUt(12)
    .duration(100)
    .buildAndRegister();

ASSEMBLER_RECIPES.recipeBuilder()
    .inputs(item('xtones:base') * 8)
    .inputs(item('minecraft:dirt'))
    .circuitMeta(16)
    .outputs(item('xtones:kryp') * 8)
    .EUt(12)
    .duration(100)
    .buildAndRegister();

ASSEMBLER_RECIPES.recipeBuilder()
    .inputs(item('xtones:base') * 8)
    .inputs(item('minecraft:stone', 1))
    .circuitMeta(16)
    .outputs(item('xtones:lair') * 8)
    .EUt(12)
    .duration(100)
    .buildAndRegister();

ASSEMBLER_RECIPES.recipeBuilder()
    .inputs(item('xtones:base') * 8)
    .inputs(ore('dyeLightBlue'))
    .circuitMeta(16)
    .outputs(item('xtones:lave') * 8)
    .EUt(12)
    .duration(100)
    .buildAndRegister();

ASSEMBLER_RECIPES.recipeBuilder()
    .inputs(item('xtones:base') * 8)
    .inputs(ore('dyeLime'))
    .circuitMeta(16)
    .outputs(item('xtones:mint') * 8)
    .EUt(12)
    .duration(100)
    .buildAndRegister();

ASSEMBLER_RECIPES.recipeBuilder()
    .inputs(item('xtones:base') * 8)
    .inputs(item('minecraft:snow'))
    .circuitMeta(16)
    .outputs(item('xtones:myst') * 8)
    .EUt(12)
    .duration(100)
    .buildAndRegister();

ASSEMBLER_RECIPES.recipeBuilder()
    .inputs(item('xtones:base') * 8)
    .inputs(ore('dyeRed'))
    .circuitMeta(16)
    .outputs(item('xtones:reds') * 8)
    .EUt(12)
    .duration(100)
    .buildAndRegister();

ASSEMBLER_RECIPES.recipeBuilder()
    .inputs(item('xtones:base') * 8)
    .inputs(item('minecraft:reeds'))
    .circuitMeta(16)
    .outputs(item('xtones:reed') * 8)
    .EUt(12)
    .duration(100)
    .buildAndRegister();

ASSEMBLER_RECIPES.recipeBuilder()
    .inputs(item('xtones:base') * 8)
    .inputs(item('minecraft:sand'))
    .circuitMeta(16)
    .outputs(item('xtones:roen') * 8)
    .EUt(12)
    .duration(100)
    .buildAndRegister();

ASSEMBLER_RECIPES.recipeBuilder()
    .inputs(item('xtones:base') * 8)
    .inputs(ore('dyeYellow'))
    .circuitMeta(16)
    .outputs(item('xtones:sols') * 8)
    .EUt(12)
    .duration(100)
    .buildAndRegister();

ASSEMBLER_RECIPES.recipeBuilder()
    .inputs(item('xtones:base') * 8)
    .inputs(ore('dyeGreen'))
    .circuitMeta(16)
    .outputs(item('xtones:sync') * 8)
    .EUt(12)
    .duration(100)
    .buildAndRegister();

ASSEMBLER_RECIPES.recipeBuilder()
    .inputs(item('xtones:base') * 8)
    .inputs(ore('dyeGray'))
    .circuitMeta(16)
    .outputs(item('xtones:tank') * 8)
    .EUt(12)
    .duration(100)
    .buildAndRegister();

ASSEMBLER_RECIPES.recipeBuilder()
    .inputs(item('xtones:base') * 8)
    .inputs(ore('dyeBlack'))
    .circuitMeta(16)
    .outputs(item('xtones:vect') * 8)
    .EUt(12)
    .duration(100)
    .buildAndRegister();

ASSEMBLER_RECIPES.recipeBuilder()
    .inputs(item('xtones:base') * 8)
    .inputs(item('minecraft:stone', 5))
    .circuitMeta(16)
    .outputs(item('xtones:vena') * 8)
    .EUt(12)
    .duration(100)
    .buildAndRegister();

ASSEMBLER_RECIPES.recipeBuilder()
    .inputs(item('xtones:base') * 8)
    .inputs(item('minecraft:clay_ball'))
    .circuitMeta(16)
    .outputs(item('xtones:zane') * 8)
    .EUt(12)
    .duration(100)
    .buildAndRegister();

ASSEMBLER_RECIPES.recipeBuilder()
    .inputs(item('xtones:base') * 8)
    .inputs(item('minecraft:coal', 1))
    .circuitMeta(16)
    .outputs(item('xtones:zech') * 8)
    .EUt(12)
    .duration(100)
    .buildAndRegister();

ASSEMBLER_RECIPES.recipeBuilder()
    .inputs(item('xtones:base') * 8)
    .inputs(item('minecraft:snowball'))
    .circuitMeta(16)
    .outputs(item('xtones:zest') * 8)
    .EUt(12)
    .duration(100)
    .buildAndRegister();

ASSEMBLER_RECIPES.recipeBuilder()
    .inputs(item('xtones:base') * 8)
    .inputs(item('minecraft:string'))
    .circuitMeta(16)
    .outputs(item('xtones:zeta') * 8)
    .EUt(12)
    .duration(100)
    .buildAndRegister();

ASSEMBLER_RECIPES.recipeBuilder()
    .inputs(item('xtones:base') * 8)
    .inputs(item('minecraft:torch'))
    .circuitMeta(16)
    .outputs(item('xtones:zion') * 8)
    .EUt(12)
    .duration(100)
    .buildAndRegister();

ASSEMBLER_RECIPES.recipeBuilder()
    .inputs(item('xtones:base') * 8)
    .inputs(item('minecraft:bone'))
    .circuitMeta(16)
    .outputs(item('xtones:zkul') * 8)
    .EUt(12)
    .duration(100)
    .buildAndRegister();

ASSEMBLER_RECIPES.recipeBuilder()
    .inputs(item('xtones:base') * 8)
    .inputs(item('minecraft:stone', 3))
    .circuitMeta(16)
    .outputs(item('xtones:zoea') * 8)
    .EUt(12)
    .duration(100)
    .buildAndRegister();

ASSEMBLER_RECIPES.recipeBuilder()
    .inputs(item('xtones:base') * 8)
    .inputs(item('minecraft:cobblestone'))
    .circuitMeta(16)
    .outputs(item('xtones:zome') * 8)
    .EUt(12)
    .duration(100)
    .buildAndRegister();

ASSEMBLER_RECIPES.recipeBuilder()
    .inputs(item('xtones:base') * 8)
    .inputs(item('minecraft:stone_slab', 3))
    .circuitMeta(16)
    .outputs(item('xtones:zone') * 8)
    .EUt(12)
    .duration(100)
    .buildAndRegister();

ASSEMBLER_RECIPES.recipeBuilder()
    .inputs(item('xtones:base') * 8)
    .inputs(item('minecraft:clay'))
    .circuitMeta(16)
    .outputs(item('xtones:zorg') * 8)
    .EUt(12)
    .duration(100)
    .buildAndRegister();

ASSEMBLER_RECIPES.recipeBuilder()
    .inputs(item('xtones:base') * 8)
    .inputs(ore('dyeLightGray'))
    .circuitMeta(16)
    .outputs(item('xtones:ztyl') * 8)
    .EUt(12)
    .duration(100)
    .buildAndRegister();

ASSEMBLER_RECIPES.recipeBuilder()
    .inputs(item('xtones:base') * 8)
    .inputs(item('minecraft:stick'))
    .circuitMeta(16)
    .outputs(item('xtones:zyth') * 8)
    .EUt(12)
    .duration(100)
    .buildAndRegister();