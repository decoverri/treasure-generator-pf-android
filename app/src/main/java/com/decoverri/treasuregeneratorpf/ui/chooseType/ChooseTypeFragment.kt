package com.decoverri.treasuregeneratorpf.ui.chooseType

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.GridView
import androidx.navigation.fragment.findNavController
import com.decoverri.treasuregeneratorpf.R
import com.decoverri.treasuregeneratorpf.adapters.TreasureGridAdapter
import com.decoverri.treasuregeneratorpf.model.TreasureType

class ChooseTypeFragment : Fragment() {

    companion object {
        fun newInstance() = ChooseTypeFragment()
    }

    private lateinit var viewModel: ChooseTypeViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_choose_type, container, false)

        val treasureGridView = view.findViewById<GridView>(R.id.treasure_type_grid)
        treasureGridView.adapter = activity?.let { TreasureGridAdapter(it, TreasureType.values().asList() - TreasureType.NONE) }

        treasureGridView.onItemClickListener =
            AdapterView.OnItemClickListener { parent, _, position, _ ->
                val selectedType = parent.getItemAtPosition(position) as TreasureType
                findNavController().navigate(ChooseTypeFragmentDirections.actionChooseTypeFragmentToChooseValueFragment(selectedType))
            }

        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ChooseTypeViewModel::class.java)
        // TODO: Use the ViewModel
    }

}