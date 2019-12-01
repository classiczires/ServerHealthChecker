package com.zires.serverhealthchecker

import com.zires.serverhealthchecker.notification.Notification
import com.zires.serverhealthchecker.server.ServerHealth
import com.zires.serverhealthchecker.server.all.DatabaseServerHealth
import com.zires.serverhealthchecker.server.all.FileServerHealth
import com.zires.serverhealthchecker.server.all.WebServerHealth
import java.util.*

/**
 * Created by ClassicZires on 11/20/2019.
 */

internal class Application {
    init {
        val serversHealth: ArrayList<ServerHealth> = arrayListOf()
        serversHealth.add(DatabaseServerHealth())
        serversHealth.add(WebServerHealth())
        serversHealth.add(FileServerHealth())

        for (serverHealth in serversHealth) {
            var notifications: ArrayList<Notification> = serverHealth.check()
            for (notification in notifications) {
                notification.send(serverHealth)
            }
        }
    }
}
