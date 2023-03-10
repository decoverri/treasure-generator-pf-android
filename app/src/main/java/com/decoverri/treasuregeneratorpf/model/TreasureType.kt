package com.decoverri.treasuregeneratorpf.model

import androidx.annotation.Keep

@Keep enum class TreasureType(val letter: String, val title: String, val description: String, val values: List<Int>) {
    COINS(
        letter = "A",
        title = "Coins",
        description = "Treasure of this type consists entirely of coins. Coins can be found in nearly any encounter.",
        values = listOf(1,5,10,25,50,100,200,500,1000,5000,10000,50000)
    ),
    GEMS(
        letter = "B",
        title = "Coins and Gems",
        description = "This type consists of coins but also includes gemstones, some of which can be quite valuable. It is typically found in a small cache or as part of a larger treasure roll.",
        values = listOf(10,15,25,50,75,100,150,200,500,750,1000,2500,5000,10000,20000,50000)
    ),
    NONE(
        letter = "N",
        title = "No Treasure",
        description = "No type selected",
        values = listOf(0)
    )
}

/*
{"letter":"A","name":"Coins","description":"Treasure of this type consists entirely of coins. Coins can be found in nearly any encounter.","values":{"value":[{"value":1},{"value":5},{"value":10},{"value":25},{"value":50},{"value":100},{"value":200},{"value":500},{"value":1000},{"value":5000},{"value":10000},{"value":50000}]}}}}
{"letter":"B","name":"Coins and Gems","description":"This type consists of coins but also includes gemstones, some of which can be quite valuable. It is typically found in a small cache or as part of a larger treasure roll.","values":{"value":[{"value":10},{"value":15},{"value":25},{"value":50},{"value":75},{"value":100},{"value":150},{"value":200},{"value":250},{"value":500},{"value":750},{"value":1000},{"value":2500},{"value":5000},{"value":10000},{"value":20000},{"value":50000}]}}}}
{"letter":"C","name":"Art Objects","description":"Often overlooked, these items are valuable for their beauty and craftsmanship and are made with precious metals, gems, and other fine materials. Art objects are typically displayed in residences or placed in small vaults for safekeeping.","values":{"value":[{"value":50},{"value":100},{"value":150},{"value":200},{"value":250},{"value":500},{"value":750},{"value":1000},{"value":1500},{"value":2000},{"value":2500},{"value":5000},{"value":7500},{"value":10000},{"value":15000},{"value":20000},{"value":50000}]}}}}
{"letter":"D","name":"Coins and Small Objects","description":"This category consists of coins and small magic items, such as potions, rings, scrolls, and wands. Such treasure is typically found in the lairs of beasts or as a small hoard in a monster den.","values":{"value":[{"value":50},{"value":100},{"value":150},{"value":200},{"value":250},{"value":300},{"value":400},{"value":500},{"value":750},{"value":1000},{"value":1500},{"value":2000},{"value":3000},{"value":4000},{"value":5000},{"value":7500},{"value":10000},{"value":15000},{"value":20000},{"value":25000},{"value":30000},{"value":50000}]}}}}
{"letter":"E","name":"Armor and Weapons","description":"Consisting solely of weapons and armor, treasure of this type can be found in armories, stored in a den, or even in use by a monster.","values":{"value":[{"value":200},{"value":300},{"value":350},{"value":1000},{"value":1500},{"value":2500},{"value":3000},{"value":4000},{"value":5500},{"value":6000},{"value":7500},{"value":8000},{"value":9000},{"value":10000},{"value":13000},{"value":15000},{"value":20000},{"value":25000},{"value":30000},{"value":35000},{"value":40000},{"value":50000},{"value":75000},{"value":100000}]}}}}
{"letter":"F","name":"Combatant Gear","description":"This treasure type is made up of items that would typically be carried by a monster that relies on melee or ranged combat. It includes armor, coins, potions, weapons, and wondrous items.","values":{"value":[{"value":50},{"value":250},{"value":350},{"value":400},{"value":500},{"value":750},{"value":1000},{"value":1500},{"value":2000},{"value":3000},{"value":4000},{"value":5000},{"value":6000},{"value":7500},{"value":10000},{"value":12500},{"value":15000},{"value":20000},{"value":25000},{"value":30000},{"value":40000},{"value":50000},{"value":60000},{"value":75000},{"value":100000}]}}}}
{"letter":"G","name":"Spellcaster Gear","description":"This treasure type is carried by creatures with spellcasting abilities, and includes coins, potions, scrolls, staves, wands, and wondrous items.","values":{"value":[{"value":50},{"value":75},{"value":100},{"value":150},{"value":200},{"value":250},{"value":500},{"value":750},{"value":1000},{"value":1500},{"value":2000},{"value":2500},{"value":3000},{"value":4000},{"value":5000},{"value":6000},{"value":7500},{"value":10000},{"value":12500},{"value":15000},{"value":20000},{"value":25000},{"value":30000},{"value":40000},{"value":50000},{"value":60000},{"value":75000},{"value":100000}]}}}}
{"letter":"H","name":"Lair Treasure","description":"This treasure type can contain items of nearly any variety, but it focuses primarily on treasure of lesser individual value. It frequently includes a large number of magic items, coins, and other valuables. ","values":{"value":[{"value":500},{"value":1000},{"value":2500},{"value":5000},{"value":7500},{"value":10000},{"value":15000},{"value":20000},{"value":25000},{"value":30000},{"value":40000},{"value":50000},{"value":75000},{"value":100000}]}}}}
{"letter":"I","name":"Treasure Hoard","description":"Truly the greatest of the treasure types, this can contain virtually any type of item. It usually serves as the reward for many challenging encounters, saved up and placed in one location.","values":{"value":[{"value":5000},{"value":10000},{"value":15000},{"value":20000},{"value":25000},{"value":30000},{"value":40000},{"value":50000},{"value":60000},{"value":75000},{"value":100000},{"value":125000},{"value":150000},{"value":200000},{"value":300000}]}}}}
*/
