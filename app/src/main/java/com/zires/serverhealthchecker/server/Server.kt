package com.zires.serverhealthchecker.server

import com.zires.serverhealthchecker.HealthLevel

/**
 * Created by ClassicZires on 11/13/2019.
 **/

abstract class Server() {
    var healthLevel: HealthLevel
        set(value) {
            healthLevel = value
        }
        get() {
            return healthLevel
        }

    init {
        healthLevel = HealthLevel.Healthy
    }

}