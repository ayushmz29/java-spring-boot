package SingletonPattern.LazySingletons;

/**
 * Thread-Safe: No (fails in multithreaded environments).
 * <p>
 * Lazy Initialization: Yes.
 * <p>
 * Pros: Saves resources if the instance is never used.
 * <p>
 * Cons: Not thread-safe.
 */

public class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}