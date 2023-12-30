package commons;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class log {
    private static final Logger Log =  LogManager.getLogger(log.class);

    public static void debug(String message) {
        Log.debug(message);
    }
    public static void debug(Object object) {
        Log.debug(object);
    }

    public static void info(String message) {
        Log.debug(message);
    }
    public static void info(Object object) {
        Log.debug(object);
    }

    public static void warn(String message) {
        Log.debug(message);
    }
    public static void warn(Object object) {
        Log.debug(object);
    }

    public static void error(String message) {
        Log.debug(message);
    }
    public static void error(Object object) {
        Log.debug(object);
    }
    
    public static void fatal(String message) {
        Log.debug(message);
    }
    
}
