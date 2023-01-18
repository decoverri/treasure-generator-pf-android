package com.decoverri.treasuregeneratorpf.adapters

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import androidx.core.content.ContextCompat
import com.decoverri.treasuregeneratorpf.R
import com.decoverri.treasuregeneratorpf.model.TreasureType

class TreasureGridAdapter(private val context: Context, private val treasureTypes: List<TreasureType>) : BaseAdapter() {
    override fun getCount(): Int {
        return treasureTypes.size
    }

    override fun getItem(position: Int): Any {
        return treasureTypes[position];
    }

    override fun getItemId(position: Int): Long {
        return position.toLong();
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view = LayoutInflater.from(context).inflate(R.layout.treasure_type_card, parent, false);
        val treasureType = treasureTypes[position];

        val image = view.findViewById<ImageView>(R.id.treasure_image)
        image.setImageDrawable(ContextCompat.getDrawable(context, context.resources.getIdentifier("type_" + treasureType.letter.lowercase(), "drawable", context.packageName)))
        return view;
    }

}
