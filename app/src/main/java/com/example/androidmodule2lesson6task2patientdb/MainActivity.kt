package com.example.androidmodule2lesson6task2patientdb
/*
ДЗ. Задание 2. Среднее
Написать базу данных пациентов, как на уроке, расширив количество полей. Можно добавить
аватар (передавать как Serializable), возраст, пол, историю болезни (большой текст). Сделать
более красивый UI и положить в портфолио.
 */

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_list.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
      supportFragmentManager
            .beginTransaction()
            .addToBackStack(null)
            .replace(R.id.flList,ListFragment.newInstance("aa","aa"))
            .commit()
        /*
               supportFragmentManager
                   .beginTransaction()
                   .replace(R.id.flList,ListFragment.newInstance("aa","aa"))
                   .commit() */


    }


}