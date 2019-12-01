package com.zires.serverhealthchecker.server.all

import com.zires.serverhealthchecker.notification.EmailNotification
import com.zires.serverhealthchecker.notification.Notification
import com.zires.serverhealthchecker.notification.PushNotification
import com.zires.serverhealthchecker.server.ServerHealth
import java.net.URL

/**
 * Created by ClassicZires on 11/13/2019.
 **/

class WebServerHealth : ServerHealth() {
    override fun check(): ArrayList<Notification> {
        val notifications: ArrayList<Notification> = ArrayList()

        notifications?.add(PushNotification())

        if (!isConnectedToServer())
            notifications?.add(EmailNotification())
        return notifications!!
    }

    private fun isConnectedToServer(): Boolean {
        return try {
            val myUrl = URL("https://www.google.com")
            val connection = myUrl.openConnection()
            connection.connectTimeout = 1000
            connection.connect()
            true
        } catch (e: Exception) {
            false
        }
    }
}