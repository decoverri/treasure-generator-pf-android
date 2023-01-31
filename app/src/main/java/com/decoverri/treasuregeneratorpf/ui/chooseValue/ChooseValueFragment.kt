package com.decoverri.treasuregeneratorpf.ui.chooseValue

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.fragment.app.Fragment
import com.decoverri.treasuregeneratorpf.R
import com.decoverri.treasuregeneratorpf.model.TreasureType
import com.decoverri.treasuregeneratorpf.ui.chooseType.ChooseTypeFragment

class ChooseValueFragment : Fragment() {

    companion object {
        fun newInstance() = ChooseTypeFragment()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_choose_value, container, false)
        val valuesView = view.findViewById<ListView>(R.id.values)
        val type = arguments?.getSerializable("selectedType") as TreasureType
        valuesView.adapter = activity?.let { ArrayAdapter(it, R.layout.values_list_item, type.values) }
        return view
    }

}