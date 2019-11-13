package com.zires.serverhealthchecker.servers

import com.zires.lib.EmailNotification
import com.zires.serverhealthchecker.Server

/**
 * Created by ClassicZires on 11/13/2019.
 **/

class FileServer : Server {
    override fun checkHealthAndNotify() {
        val resultCheckHealth = "The system is healthy"

        EmailNotification().notify(resultCheckHealth)
    }
}