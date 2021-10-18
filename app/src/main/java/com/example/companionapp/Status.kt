package com.example.companionapp

import android.view.View
import com.example.companionapp.Status.Companion.night

class Status {

    companion object{

        const val night = 0
        const val day = 1

    }

    fun changeBackground(layout: View, day:Int){

        when (day){
            0->{layout.setBackgroundResource(R.drawable.night)}
            1->{layout.setBackgroundResource(R.drawable.day)}
        }

    }
}