package io.pronab.viewtimer

interface ViewTimerInterface {
    fun startTime()
    fun endTime()
    fun getPeriod() : Long
    fun getDelay() : Long

}

