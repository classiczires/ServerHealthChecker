package com.zires.serverhealthchecker.server.checker

import com.zires.serverhealthchecker.HealthLevel
import com.zires.serverhealthchecker.server.Server

/**
 * Created by ClassicZires on 11/24/2019.
 **/

class ServerChecker {
    companion object {
        fun overallHealth(server: Server): Server {
            server.healthLevel = HealthLevel.Low
            return server
        }
    }

}