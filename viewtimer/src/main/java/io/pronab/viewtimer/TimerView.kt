package io.pronab.viewtimer

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import java.util.*

//this class will be extended to bring native effects in startTime and endTime implemented
// within the lib

class TimerView(private val vv: ViewGroup, private val radio: View, private val act: Activity) {
    // var tv = radio
    var currC = 0
    //  var vv = show
    val timer = Timer()
    public fun  start() {
    timer.schedule(
    object : TimerTask() {
        override fun run() {
            act.runOnUiThread {


                if (currC == 0) {

                    (act as ViewTimerInterface).startTime()

                    currC = 9
                } else {

                    (act as ViewTimerInterface).endTime()
                    currC = 0
                }


            }
        }
    }, (act as ViewTimerInterface).getDelay(), (act as ViewTimerInterface).getPeriod()
    )
}
}



