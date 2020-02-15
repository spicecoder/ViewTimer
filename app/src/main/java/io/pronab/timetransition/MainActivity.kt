package io.pronab.timetransition

import android.app.Activity
import android.graphics.Color
import android.os.Bundle
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity() : AppCompatActivity() ,
    io.pronab.viewtimer.ViewTimerInterface {

    lateinit var vv: ViewGroup
    lateinit var tv: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        (radio as TextView).setText("...........Greetings.. .....");
         vv = show
        var currC = 0 ;

       var xx = io.pronab.viewtimer.TimerView(show, radio, this as Activity)
        xx.start();
  /*      val timer = Timer()
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
        },500,5000)*/


    }

    override fun startTime() {
        radio.setBackgroundColor(Color.BLUE);
        vv.setBackgroundColor(Color.CYAN)
    }

    override fun endTime() { radio.setBackgroundColor(Color.RED);
        vv.setBackgroundColor(Color.GRAY)
           }

    override fun getPeriod(): Long {
        return 5000
       // TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getDelay(): Long {
        return 500
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


}
