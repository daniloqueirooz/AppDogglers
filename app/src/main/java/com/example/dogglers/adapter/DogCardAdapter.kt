package com.example.dogglers.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.dogglers.R
import com.example.dogglers.const.Layout
import com.example.dogglers.data.DataSource

class DogCardAdapter(
    private val context: Context?,
    private val layout: Int
) : RecyclerView.Adapter<DogCardAdapter.DogCardViewHolder>() {

    private val dataset = DataSource.dogs

    class DogCardViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imageView: ImageView = view.findViewById(R.id.Leroy)
        val dogName: TextView = view.findViewById(R.id.Name)
        val dogAge: TextView = view.findViewById(R.id.Age)
        val dogHobbies: TextView = view.findViewById(R.id.Hobbis)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogCardViewHolder {
        val adapterLayout = when (layout) {
            Layout.VERTICAL -> {
                LayoutInflater.from(parent.context)
                    .inflate(R.layout.vertical_horizontal_list_item, parent, false)
            }
            Layout.HORIZONTAL -> {
                LayoutInflater.from(parent.context)
                    .inflate(R.layout.vertical_horizontal_list_item, parent, false)
            }
            else -> {
                LayoutInflater.from(parent.context)
                    .inflate(R.layout.grid_list_item, parent, false)
            }
        }
        return DogCardViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: DogCardViewHolder, position: Int) {
        // val resources = context?.resources
        val item = dataset[position]


        holder.dogName.text = item.name
        holder.imageView.setImageResource(item.imageResourceId)


        holder.dogAge.text = "Idade:${item.age}"
        //holder.dogAge.text = context?.resources?.getString(R.id.Age, item.age)

        holder.dogHobbies.text = "Hobbis:${item.hobbies}"


    }

    override fun getItemCount() = dataset.size
}


