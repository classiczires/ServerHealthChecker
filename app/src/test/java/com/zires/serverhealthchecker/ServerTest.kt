package com.zires.serverhealthchecker

import com.zires.serverhealthchecker.notification.Notification
import com.zires.serverhealthchecker.server.ServerHealth
import com.zires.serverhealthchecker.server.all.DatabaseServerHealth
import com.zires.serverhealthchecker.server.all.FileServerHealth
import com.zires.serverhealthchecker.server.all.WebServerHealth
import org.junit.Before
import org.junit.Test
import java.util.*
import kotlin.test.assertNotEquals
import kotlin.test.assertNotNull
import kotlin.test.assertTrue

/**
 * Created by ClassicZires on 12/1/2019.
 */

class ServerTest {
    private val serversHealth: ArrayList<ServerHealth> = arrayListOf()

    @Before
    fun setUp() {
        serversHealth.add(DatabaseServerHealth())
        serversHealth.add(WebServerHealth())
        serversHealth.add(FileServerHealth())
    }

    @Test
    internal fun checkServerHealthAndSendNotification() {
        for (serverHealth in serversHealth) {
            val notifications: ArrayList<Notification> = serverHealth.check()
            assertNotNull(notifications)
            assertNotEquals(notifications.size, 0)
            sendNotification(notifications, serverHealth)
        }
    }

    private fun sendNotification(
        notifications: ArrayList<Notification>,
        serverHealth: ServerHealth
    ) {
        for (notification in notifications) {
            assertTrue { notification.send(serverHealth) }
        }
    }
}