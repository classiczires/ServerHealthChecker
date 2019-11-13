package com.zires.serverhealthchecker.servers

import com.zires.lib.EmailNotification
import com.zires.lib.Notification
import com.zires.serverhealthchecker.Server

/**
 * Created by ClassicZires on 11/13/2019.
 **/

class DatabaseServer : Server {

    override fun checkHealthAndNotify() {
        val resultCheckHealth = "The system is healthy"

        EmailNotification().notify(resultCheckHealth)
    }
}