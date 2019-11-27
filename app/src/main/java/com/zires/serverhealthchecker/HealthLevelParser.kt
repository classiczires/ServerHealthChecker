package com.zires.serverhealthchecker

import com.zires.lib.EmailNotification
import com.zires.lib.Notification
import com.zires.lib.PushNotification
import com.zires.lib.SmsNotification

/**
 * Created by ClassicZires on 11/24/2019.
 **/

object HealthLevelParser {
    fun toNotification(healthLevel: HealthLevel): Notification {
        if (healthLevel == HealthLevel.Low)
            return SmsNotification()
        else if (healthLevel == HealthLevel.Medium)
            return EmailNotification()
        else
            return PushNotification()
    }
}