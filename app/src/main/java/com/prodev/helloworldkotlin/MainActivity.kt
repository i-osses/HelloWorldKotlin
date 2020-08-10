package com.prodev.helloworldkotlin

import android.os.Bundle
import android.util.Log
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))



        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }

        //pregunta 3
        Log.d ("number3", getName("Ignacio"))

        //Pregunta 4
        val firstNumb = 10
        val secondNumb = 20
        val thirdNumb = 30

        //pregunta 5
       Log.d ("number5", sumTotal(firstNumb, secondNumb, thirdNumb).toString())

        // pregunta 6
        var stringA = ""
        var charB = ""

        // pregunta 7
        stringA = "Arataka Reigen"
        charB = "A"

        // pregunta 8
        Log.d("number8", " ${stringA.count()}")
         charB = "A"

        Log.d("charB", "${charB}")

        // pregunta 9
        val floatVariable : Float

        //pregunta 10
        floatVariable= 3.2F

        // pregunta 11
        Log.d( " number11", "Max Byte value = ${Byte.MAX_VALUE} and Max Short value = ${Short.MAX_VALUE } ")

        // PREGUNTA 12
        Log.d("number12", "Min Int value = ${Int.MIN_VALUE} and Min Long value = ${Long.MIN_VALUE}")

        // pregunta 13
        val boolean1=true
        Log.d("number13", "boolean1 = ${boolean1.toString()}")


        // pregunta 14
        val firstParam = "I"
        val secondParam = "O"
        Log.d ("number14", imprimiendoParametros(firstParam, secondParam))



    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

    fun getName(name:String):String {
        return "my name's $name"
    }

    fun sumTotal(firstNumb: Int, secondNumb: Int, thirdNumb:Int):Int{
       return firstNumb + secondNumb + thirdNumb
    }

    fun imprimiendoParametros (firstParam:String,secondParam:String):String{
        return firstParam + secondParam.count()
    }

}