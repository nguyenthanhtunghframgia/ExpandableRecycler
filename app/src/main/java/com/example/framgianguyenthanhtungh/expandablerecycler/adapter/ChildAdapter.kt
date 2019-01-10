package com.example.framgianguyenthanhtungh.expandablerecycler.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.framgianguyenthanhtungh.expandablerecycler.R
import com.example.framgianguyenthanhtungh.expandablerecycler.model.Child

class ChildAdapter(private val children: List<Child>) : RecyclerView.Adapter<ChildAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_child, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return children.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val child = children[position]
        holder.name.text = child.name
        holder.cost.text = child.cost.toString()
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val name: TextView = itemView.findViewById(R.id.child_name)
        val cost: TextView = itemView.findViewById(R.id.child_cost)
    }
}
