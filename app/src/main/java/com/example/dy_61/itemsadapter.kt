package com.example.dy_61

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import androidx.recyclerview.widget.RecyclerView
import  android.view.View
import android.widget.TextView
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate

class ItemsAdapter(var items: List<Item>, var context: Context): RecyclerView.Adapter<ItemsAdapter.MyViewHolder>() {

    class MyViewHolder(view: View): RecyclerView.ViewHolder(view){
        val title: TextView = view.findViewById(R.id.item_list_title)
        val btn: Button = view.findViewById(R.id.item_list_button)
        val text1: TextView = view.findViewById(R.id.item_list_text1)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_in_list,parent,false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return items.count()
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.title.text = items[position].title
        holder.text1.text = items[position].text1


        holder.btn.setOnClickListener{
            val intent = Intent(context, ItemActivity::class.java)
            intent.putExtra("itemTitle",items[position].title)
            intent.putExtra("itemText1",items[position].text1)
            context.startActivity(intent)
        }
    }

}