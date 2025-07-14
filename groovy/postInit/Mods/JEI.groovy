import mezz.jei.api.ingredients.VanillaTypes

log.info 'mod \'jei\' detected, running script'

mods.jei.ingredient.add(VanillaTypes.ITEM, item('galacticraftcore:fuel_loader').withNbt([display:[Name:'Use The Rocket Launch Pad Multiblock!']]));