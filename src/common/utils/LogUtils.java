package common.utils;

/**
 * Utility class to help with logging
 */
public class LogUtils {

    /**
     * Private empty constructor
     */
    private LogUtils() {
        // empty
    }

    /**
     * Logs an array
     *
     * @param array the array we want to log
     */
    public static void logArray(final Object[] array) {
        for (final Object o : array) {
            System.out.println(o);
        }
    }
}
