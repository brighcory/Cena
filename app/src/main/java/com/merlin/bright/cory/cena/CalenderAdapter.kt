package com.merlin.bright.cory.cena

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

import java.text.SimpleDateFormat
import java.util.*

class CalenderAdapter(private val mContext: Context, private val mDays: ArrayList<Day>) : RecyclerView.Adapter<CalenderAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.calender_day_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: CalenderAdapter.ViewHolder, position: Int) {
        holder.bindCalender(mDays[position])
    }

    override fun getItemCount(): Int {
        return mDays.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val date: TextView = itemView.findViewById(R.id.date_textview)
        private val breakfast: TextView = itemView.findViewById(R.id.breakfast_textview)
        private val lunch: TextView = itemView.findViewById(R.id.lunch_testview)
        private val dinner: TextView = itemView.findViewById(R.id.dinner_textview)

        fun bindCalender(day: Day) {
            val df = SimpleDateFormat("dd MMM", Locale.US)
            val formatDate = df.format(day.date)
            date.text = formatDate
            breakfast.text = day.breakfast
            lunch.text = day.lunch
            dinner.text = day.dinner
        }
    }
}
