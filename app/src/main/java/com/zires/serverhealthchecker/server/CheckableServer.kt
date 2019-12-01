package com.zires.serverhealthchecker.server

import com.zires.serverhealthchecker.notification.Notification

/**
 * Created by ClassicZires on 11/24/2019.
 **/

interface CheckableServer {
    fun check(): ArrayList<Notification>
}