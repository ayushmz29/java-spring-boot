package SingletonPattern.LazySingletons;

/**
 * Thread-Safe: Yes.
 * <p>
 * Lazy Initialization: Yes.
 * <p>
 * Pros: Thread-safe and lazy.
 * <p>
 * Cons: Synchronization adds overhead on every method call.
 */

public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {
    }

    public static synchronized ThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }
}