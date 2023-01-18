package com.decoverri.treasuregeneratorpf.ui.treasureTypes

import androidx.lifecycle.ViewModel
import com.decoverri.treasuregeneratorpf.model.TreasureType

class TreasureTypesViewModel : ViewModel() {
    val types = TreasureType.values()

}