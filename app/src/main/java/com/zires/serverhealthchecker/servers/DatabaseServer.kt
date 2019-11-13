package com.zires.serverhealthchecker.servers

import com.zires.lib.Notification
import com.zires.serverhealthchecker.Server

/**
 * Created by ClassicZires on 11/13/2019.
 **/

class DatabaseServer(val notification: Notification) : Server {

    override fun checkHealthAndNotify() {

        notification.notify("Sms Notification")
    }
}