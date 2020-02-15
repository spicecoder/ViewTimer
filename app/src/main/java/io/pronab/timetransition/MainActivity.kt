package io.pronab.timetransition

import android.graphics.Color
import android.os.Bundle
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var tv: TextView = radio
        var currC = 0 ;
        var vv: ViewGroup = show
      //  var xx = io.pronab.viewtimer.TimerView(vv, tv, this as Activity)
        val timer = Timer()
        timer.schedule(object : TimerTask() {
            override fun run() {
                runOnUiThread {
                    // do UI updates here
                    radio.setText("...........Greetings.......");
                    if (currC==0)
                    {  radio.setBackgroundColor(Color.BLUE);
                        vv.setBackgroundColor(Color.CYAN)
                        currC = 9 }
                    else {
                        radio.setBackgroundColor(Color.RED);
                        vv.setBackgroundColor(Color.GRAY)
                        currC = 0
                    }



                }
            }
        },500,5000)


    }
}
