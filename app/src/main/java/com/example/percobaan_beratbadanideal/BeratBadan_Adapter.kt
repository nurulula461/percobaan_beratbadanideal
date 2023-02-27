package com.example.percobaan_beratbadanideal


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BeratBadan_Adapter (private val dataSet: MutableList<DataBeratBadan>):
    RecyclerView.Adapter<BeratBadan_Adapter.beratbaHolder>(){
    class beratbaHolder(view : View) : RecyclerView.ViewHolder(view) {
        val nama = view.findViewById<TextView>(R.id.Nama)
        val tingba = view.findViewById<TextView>(R.id.TinggiBadan)
        val berban = view.findViewById<TextView>(R.id.BeratBadan)
        val hapus = view.findViewById<ImageView>(R.id.icdelete)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): beratbaHolder {
        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.activity_berat_badan_adapter,parent,false
        )
        return beratbaHolder(view)
    }

    override fun onBindViewHolder(holder: beratbaHolder, position: Int) {
        val data = dataSet[position]
        holder.nama.text = dataSet[position].nama
        holder.tingba.text = dataSet[position].tinggiBadan
        holder.berban.text = dataSet[position].hasill
        holder.hapus.setOnClickListener{
            dataSet.removeAt(position)
            notifyItemRangeRemoved(position, dataSet.size)
            notifyDataSetChanged()
        }
    }

    override fun getItemCount(): Int {
       return dataSet.size
    }

}