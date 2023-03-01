package com.example.meshtechinterview

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.widget.AppCompatButton
import com.example.meshtechinterview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    lateinit var list : ArrayList<AppCompatButton>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        list = ArrayList()

        list.add(binding.btn1)
        list.add(binding.btn2)
        list.add(binding.btn3)
        list.add(binding.btn4)
        list.add(binding.btn5)
        list.add(binding.btn6)
        list.add(binding.btn7)
        list.add(binding.btn8)
        list.add(binding.btn9)
        list.add(binding.btn10)
        list.add(binding.btn11)
        list.add(binding.btn12)
        list.add(binding.btn13)
        list.add(binding.btn14)
        list.add(binding.btn15)
        list.add(binding.btn16)


        Thread{

            while (true){
                startAnim()
            }
        }.start()
    }

    fun startAnim(){

        for(i in 0 until list.size){

            var j = i-1
            var k = i-2

            Thread.sleep(400)

            list[i].setBackgroundResource(R.drawable.green_color)
            if(i>0){
                list[j].setBackgroundResource(R.drawable.red_color)
            }
            if(i>1){
                list[k].setBackgroundResource(R.drawable.blue_color)
            }

            for(l in 0 until list.size){
                if(k>l){
                    list[l].setBackgroundResource(R.drawable.round_button)
                }
            }

            if(i==list.size-1 && j == list.size-2 && k == list.size-3){
                Thread.sleep(400)
                list[i].setBackgroundResource(R.drawable.red_color)
                list[j].setBackgroundResource(R.drawable.blue_color)
                list[k].setBackgroundResource(R.drawable.round_button)
                list[k-1].setBackgroundResource(R.drawable.round_button)
                Thread.sleep(400)

                list[list.size-1].setBackgroundResource(R.drawable.blue_color)
                list[list.size-2].setBackgroundResource(R.drawable.round_button)

                Thread.sleep(400)
                list[list.size-1].setBackgroundResource(R.drawable.round_button)
            }
        }
    }

}