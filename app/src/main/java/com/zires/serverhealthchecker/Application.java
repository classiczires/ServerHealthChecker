package com.zires.serverhealthchecker;

import com.zires.lib.Notification;
import com.zires.serverhealthchecker.server.DatabaseServer;
import com.zires.serverhealthchecker.server.Server;
import com.zires.serverhealthchecker.server.checker.ServerChecker;

/**
 * Created by ClassicZires on 11/20/2019.
 **/

class Application {
    public Application() {
        Server databaseServer = new DatabaseServer();
        Server server = ServerChecker.Companion.overallHealth(databaseServer);
        Notification notification = HealthLevelParser.INSTANCE.toNotification(server.getHealthLevel());
        notification.send(server.getHealthLevel().name());
    }
}
