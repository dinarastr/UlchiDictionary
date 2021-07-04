package com.example.ulchidictionary.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.View.inflate
import android.view.ViewGroup
import androidx.asynclayoutinflater.view.AsyncLayoutInflater
import androidx.recyclerview.widget.RecyclerView
import com.example.ulchidictionary.R
import com.example.ulchidictionary.data.RussianWord
import kotlinx.android.synthetic.main.text_row.view.*


class RussianAdapter(private val onLastItemBound: (Int) -> Unit): RecyclerView.Adapter<RussianAdapter.MyViewHolder>() {
    var russianList = emptyList<RussianWord>()
    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)

    override fun getItemCount(): Int {
        return russianList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
            holder.itemView.russian_theme.text = russianList[position].russian
            russianList[position].ab.apply {
                    holder.itemView.ab.text = this
            }
            russianList[position].bc.apply {
                    holder.itemView.bc.text = this
            }

            russianList[position].cd.apply {
                    holder.itemView.cd.text = this
            }

            russianList[position].de.apply {
                    holder.itemView.de.text = this
            }



        if (position == russianList.size-1) onLastItemBound(russianList.size)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.text_row, parent, false)
        return MyViewHolder(view)
    }

    fun setData(russian: List<RussianWord>) {
        russianList = russian
        notifyDataSetChanged()
    }
}