package com.decoverri.treasuregeneratorpf.ui.chooseValue

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.navigation.fragment.navArgs
import com.decoverri.treasuregeneratorpf.R
import com.decoverri.treasuregeneratorpf.model.TreasureType

class ChooseValueFragment : Fragment() {

    companion object {
        fun newInstance() = ChooseValueFragment()
    }

    private lateinit var viewModel: ChooseValueViewModel
    val args: ChooseValueFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_choose_value, container, false)
        val valuesView = view.findViewById(R.id.values) as ListView
        valuesView.adapter = activity?.let { ArrayAdapter(it, R.layout.values_list_item, args.selectedType.values.map { x -> "$x gp" }) }
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ChooseValueViewModel::class.java)
        // TODO: Use the ViewModel
    }

}