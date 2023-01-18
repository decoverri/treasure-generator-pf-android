package com.decoverri.treasuregeneratorpf.ui.treasureTypes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.GridView
import com.decoverri.treasuregeneratorpf.R
import com.decoverri.treasuregeneratorpf.adapters.TreasureGridAdapter
import com.decoverri.treasuregeneratorpf.model.TreasureType

class ChooseTypeFragment : Fragment() {

    companion object {
        fun newInstance() = ChooseTypeFragment()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_choose_type, container, false)

        val treasureGridView = view.findViewById<GridView>(R.id.treasure_type_grid)
        treasureGridView.adapter = activity?.let { TreasureGridAdapter(it, TreasureType.values().asList()) }

        return view
    }

}