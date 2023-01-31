package com.decoverri.treasuregeneratorpf.ui.chooseType

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView.OnItemClickListener
import android.widget.GridView
import androidx.fragment.app.Fragment
import com.decoverri.treasuregeneratorpf.MainActivity
import com.decoverri.treasuregeneratorpf.R
import com.decoverri.treasuregeneratorpf.adapters.TreasureGridAdapter
import com.decoverri.treasuregeneratorpf.model.TreasureType
import com.decoverri.treasuregeneratorpf.ui.chooseValue.ChooseValueFragment

class ChooseTypeFragment : Fragment() {

    companion object {
        fun newInstance() = ChooseTypeFragment()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_choose_type, container, false)

        val treasureGridView = view.findViewById<GridView>(R.id.treasure_type_grid)
        treasureGridView.adapter = activity?.let { TreasureGridAdapter(it, TreasureType.values().asList()) }

        treasureGridView.onItemClickListener = OnItemClickListener { parent, _, position, _ ->
            Log.i("DECOOOOOO", "Clicked the item")
            val selectedType = parent.getItemAtPosition(position) as TreasureType
            val bundle = Bundle()
            bundle.putSerializable("selectedType", selectedType)
            val chooseValueFragment = ChooseValueFragment.newInstance()
            chooseValueFragment.arguments = bundle
            parentFragmentManager.beginTransaction()
                .replace(R.id.container, chooseValueFragment)
                .commitNow()
            Log.i("DECOOOOOO", "Commit dammit")
        }

        return view
    }

}