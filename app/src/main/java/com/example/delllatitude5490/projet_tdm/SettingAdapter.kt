package com.example.delllatitude5490.projet_tdm

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.TextView

class CustomAdapter(val categoryList: ArrayList<Category>): RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    var mListener : OnItemClickListener = OnItemClickListener()

    class OnItemClickListener{
        fun onItemCheck(position : Int) {

        }
        fun onItemUnCheck(position : Int) {

        }
    }

    fun setOnItemClickListener(listener : OnItemClickListener) {
        this.mListener = listener;
    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {

        p0.categoryName?.text = categoryList[p1].name
        p0.myCheckBox.isChecked = categoryList[p1].isSelected
        p0.img.setImageResource(categoryList[p1].image)


    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        val v = LayoutInflater.from(p0.context).inflate(R.layout.settings_item, p0, false)
        return ViewHolder(v,mListener);


    }

    override fun getItemCount(): Int {
        return categoryList.size
    }



    class ViewHolder(itemView: View, listener: OnItemClickListener?): RecyclerView.ViewHolder(itemView){


        val categoryName = itemView.findViewById<TextView>(R.id.nameCategory)
        val myCheckBox: CheckBox = itemView.findViewById(R.id.myCheckBox)
        val img: ImageView = itemView.findViewById(R.id.teacherImageView)

        init {

            myCheckBox.setOnClickListener(View.OnClickListener {
                if (listener != null) {
                    val position = adapterPosition
                    if (position != RecyclerView.NO_POSITION) {
                        if(myCheckBox.isChecked)
                        {
                            DemoData.setSelected(position,true)
                        }
                        else
                        {

                            DemoData.setSelected(position,false)
                        }
                    }
                }
            })
        }
    }

}

