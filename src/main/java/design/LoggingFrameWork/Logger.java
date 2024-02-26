package design.LoggingFrameWork;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    private LogLevel logger;
    private LogDestination logDestination;

    public Logger(LogLevel logger, LogDestination logDestination) {
        this.logger = logger;
        this.logDestination = logDestination;
    }

    public void log(String message, LogLevel level) {
        if(level.ordinal() > this.logger.ordinal()) {
            String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
            String formattedMessage = timestamp + " [" + level.name() + "] " + message;
            logDestination.log(formattedMessage);
        }
    }
}
