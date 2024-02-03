package chapter5.singleton;

/**
 * The type Singleton.
 */
public class Singleton {

    /**
     * Unique instance of our Singleton class
     */
    private volatile static Singleton instance;

    /**
     * Private empty constructor
     */
    private Singleton() {
        // empty
    }

    /**
     * Gets instance.
     *
     * @return the instance
     */
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
