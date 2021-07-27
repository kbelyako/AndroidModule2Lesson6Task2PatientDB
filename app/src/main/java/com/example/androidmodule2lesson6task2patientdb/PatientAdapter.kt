package com.example.androidmodule2lesson6task2patientdb

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_details.view.*
import kotlinx.android.synthetic.main.item_patient.view.*

class PatientAdapter(val patients:ArrayList<Patient>, val context:Context, val callBack: PatiensListCallBack)
    :RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_patient,parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.imgAva.setImageBitmap(patients[position].avatar)
        holder.name.text=patients[position].name
        holder.lastName.text=patients[position].lastName
        holder.lastName.text=patients[position].Sex
   //     holder.details.text=patients[position].details
        holder.root.setOnClickListener{callBack.onItemSelected(position)}
    }

    override fun getItemCount(): Int {
        return patients.size
    }
}

class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
    val imgAva = itemView.ivAvatar
    val name=itemView.tvNameList
    val lastName=itemView.tvLastNameList
    val sex=itemView.tvSex
   // val details=itemView.tvDetails
    val root = itemView.clItemRoot

}

interface PatiensListCallBack {
    fun onItemSelected(index:Int)
}