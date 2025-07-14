import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;

ASSEMBLER_RECIPES.recipeBuilder()
    .inputs(metaitem('platePolytetrafluoroethylene')*4)
    .inputs(metaitem('plateHighPurityStainlessSteel')*4)
    .inputs(metaitem('plateHighPurityIndium')*4)
    .inputs(metaitem('plateHighPurityBrass')*4)
    .outputs(item('gtb:gtb_multiblock_casing2', 11))
    .EUt(2000)
    .duration(800)
    .buildAndRegister();

DILUTION_REFRIGERATOR_RECIPES.recipeBuilder()
    .fluidInputs(fluid('liquid_nitrogen')*1000)
    .inputs(item('gtb:gtb_multiblock_casing2', 11))
    .outputs(metaitem('gtb:kev_cooler.gregtech.material.ln'))
    .EUt(1000)
    .duration(400)
    .buildAndRegister();

DILUTION_REFRIGERATOR_RECIPES.recipeBuilder()
    .fluidInputs(fluid('f_li_be') * 1000)
    .inputs(item('gtb:gtb_multiblock_casing2', 11))
    .outputs(metaitem('gtb:kev_cooler.gregtech.material.f_li_be'))
    .EUt(1000)
    .duration(400)
    .buildAndRegister();

DILUTION_REFRIGERATOR_RECIPES.recipeBuilder()
    .fluidInputs(fluid('mnovec') * 1000)
    .inputs(item('gtb:gtb_multiblock_casing2', 11))
    .outputs(metaitem('gtb:kev_cooler.gregtech.material.mnovec'))
    .EUt(1000)
    .duration(400)
    .buildAndRegister();

DILUTION_REFRIGERATOR_RECIPES.recipeBuilder()
    .fluidInputs(fluid('biphenyl_diphenyl_ether') * 1000)
    .inputs(item('gtb:gtb_multiblock_casing2', 11))
    .outputs(metaitem('gtb:kev_cooler.gregtech.material.biphenyl_diphenyl_ether'))
    .EUt(1000)
    .duration(400)
    .buildAndRegister();

DILUTION_REFRIGERATOR_RECIPES.recipeBuilder()
    .fluidInputs(fluid('fc_40') * 1000)
    .inputs(item('gtb:gtb_multiblock_casing2', 11))
    .outputs(metaitem('gtb:kev_cooler.gregtech.material.fc_40'))
    .EUt(1000)
    .duration(400)
    .buildAndRegister();

DILUTION_REFRIGERATOR_RECIPES.recipeBuilder()
    .fluidInputs(fluid('perfluoropolyether_k') * 1000)
    .inputs(item('gtb:gtb_multiblock_casing2', 11))
    .outputs(metaitem('gtb:kev_cooler.gregtech.material.perfluoropolyether_k'))
    .EUt(1000)
    .duration(400)
    .buildAndRegister();