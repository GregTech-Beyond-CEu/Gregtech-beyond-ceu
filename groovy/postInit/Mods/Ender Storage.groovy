crafting.remove('enderstorage:ender_storage');

crafting.addShaped("ender_storage", item('enderstorage:ender_storage').withNbt(['Frequency': ['left': 0, 'right': 0, 'middle': 0]]), [
[ore('batteryHv'), item('gregtech:meta_item_1', 204), ore('batteryHv')], 
[ore('circuitEv'), item('ironchest:iron_chest', 6), ore('circuitEv')], 
[ore('stickBlaze'), ore('circuitEv'), ore('stickBlaze')]
])