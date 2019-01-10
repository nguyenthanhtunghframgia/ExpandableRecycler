package com.example.framgianguyenthanhtungh.expandablerecycler.adapter

import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import com.example.framgianguyenthanhtungh.expandablerecycler.R
import com.example.framgianguyenthanhtungh.expandablerecycler.model.Parent

class ParentAdapter(private val parents: List<Parent>) : RecyclerView.Adapter<ParentAdapter.ViewHolder>() {

    private var viewPool = RecyclerView.RecycledViewPool()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.parent_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return parents.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val parent = parents[position]
        holder.textView.text = parent.name
        holder.recyclerView.apply {
            layoutManager = LinearLayoutManager(holder.recyclerView.context, LinearLayout.HORIZONTAL, false)
            adapter = ChildAdapter(parent.children)
            setRecycledViewPool(viewPool)
        }
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val recyclerView: RecyclerView = itemView.findViewById(R.id.list_child)
        val textView: TextView = itemView.findViewById(R.id.parent_name)
    }
}
