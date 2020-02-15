package io.pronab.viewtimer

import android.app.Activity
import android.view.ViewGroup
import android.widget.TextView

/*
class TimerView() {

   fun start(radio: View, vv: ViewGroup, act: Activity)
    {
       // var tv = radio
        var currC = 0
      //  var vv = show
        val timer = Timer()
        timer.schedule(
            object : TimerTask() {
                override fun run() {
                    act.runOnUiThread {
                        // do UI updates here
                        (radio as TextView).setText("...........Greetings.......");
                        if (currC == 0) {
                            radio.setBackgroundColor(Color.BLUE);
                            vv.setBackgroundColor(Color.CYAN)
                            currC = 9
                        } else {
                            radio.setBackgroundColor(Color.RED);
                            vv.setBackgroundColor(Color.GRAY)
                            currC = 0
                        }


                    }
                }
            }, 500, 5000
        )
    }
}
*/

class TimerView(vv: ViewGroup, tv: TextView, mainActivity: Activity) {

}

