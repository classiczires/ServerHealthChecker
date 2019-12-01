package com.zires.serverhealthchecker.notification

import com.zires.serverhealthchecker.server.ServerHealth

/**
 * Created by ClassicZires on 11/13/2019.
 **/

interface Notification {
    fun send(serverHealth: ServerHealth): Boolean
}
