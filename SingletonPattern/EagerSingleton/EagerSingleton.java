package SingletonPattern.EagerSingleton;


/**
 * Thread-Safe: Yes (classloader ensures thread safety).
 * <p>
 * Lazy Initialization: No (instance created at class load time).
 * <p>
 * Pros: Simple to implement.
 * <p>
 * Cons: Instance is created even if not used, wasting resources.
 */

public class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton();

    // Private constructor to prevent instantiation
    private EagerSingleton() {
        // Prevent reflection from creating new instances
        if (instance != null) {
            throw new IllegalStateException("Instance already created");
        }
    }

    public static EagerSingleton getInstance() {
        return instance;
    }
}