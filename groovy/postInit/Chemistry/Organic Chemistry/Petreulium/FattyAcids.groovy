import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(fluid('olefin_mixture')*1000)
                .fluidOutputs(fluid('1_butene')*200)
                .fluidOutputs(fluid('1_octene')*200)
                .fluidOutputs(fluid('1_decene')*200)
                .fluidOutputs(fluid('1_dodecene')*200)
                .fluidOutputs(fluid('1_hexene')*200)
                .duration(300)
                .EUt(180)
                .buildAndRegister();

        CRACKING_RECIPES.recipeBuilder()
                .fluidInputs(fluid('ethylene')*1000)
                .fluidOutputs(fluid('olefin_mixture')*1000)
                .notConsumable(metaitem('dustZieglerNattaCatalyst'))
                .notConsumable(metaitem('dustZirconylChloride'))
                .duration(300)
                .EUt(180)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .inputs(item('supercritical:meta_dust', 508) *5)
                .fluidInputs(fluid('water')*2000)
                .outputs(metaitem('dustZirconylChloride')*4)
                .fluidOutputs(fluid('hydrochloric_acid')*2000)
                .duration(200)
                .EUt(120)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('chlorine')*4000)
                .inputs(metaitem('dustCarbon'))
                .inputs(metaitem('dustCubicZirconia')*3)
                .fluidOutputs(fluid('carbon_dioxide')*1000)
                .outputs(item('supercritical:meta_dust', 508) *5)
                .duration(200)
                .EUt(120)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .inputs(item('supercritical:meta_dust', 508) *5)
                .inputs(metaitem('dustMagnesium')*2)
                .outputs(metaitem('dustZirconium'))
                .outputs(metaitem('dustMagnesiumChloride')*4)
                .blastFurnaceTemp(2000)
                .EUt(180)
                .duration(400)
                .buildAndRegister();

        FLASH_CHROMATOGRAPHY_RECIPES.recipeBuilder()
                .fluidInputs(fluid('1_decene')*1000)
                .fluidOutputs(fluid('purified_1_decene')*1000)
                .notConsumable(metaitem('dustSilicaGel'))
                .notConsumable(fluid('hexane')*1000)
                .EUt(90)
                .duration(400)
                .buildAndRegister();


        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(fluid('ziegler_alfol_mixture')*1000)
                .fluidOutputs(fluid('nbutanol')*200)
                .fluidOutputs(fluid('ethanol')*300)
                .fluidOutputs(fluid('hexanol')*150)
                .fluidOutputs(fluid('decanol')*100)
                .fluidOutputs(fluid('octanol')*100)
                .fluidOutputs(fluid('tetradecanol')*50)
                .fluidOutputs(fluid('dodecanol')*60)
                .fluidOutputs(fluid('hexadecanol')*40)
                .duration(200)
                .EUt(300)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('triethylaluminium')*1000)
                .fluidInputs(fluid('ethylene')*6000)
                .fluidInputs(fluid('ether')*1000)
                .fluidOutputs(fluid('ziegler_alfol_mixture')*1000)
                .outputs(metaitem('dustAluminiumHydroxide')* 7)
                .duration(200)
                .EUt(300)
                .buildAndRegister();