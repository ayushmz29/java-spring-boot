package SingletonPattern.LazySingletons;

/**
 * Thread-Safe: Yes (with volatile keyword in Java 5+).
 * <p>
 * Lazy Initialization: Yes.
 * <p>
 * Pros: Minimizes synchronization overhead after the first instance creation.
 * <p>
 * Cons: Requires volatile to prevent JVM instruction reordering.
 */

public class DoubleCheckedLockingSingleton {
    private static volatile DoubleCheckedLockingSingleton instance;

    private DoubleCheckedLockingSingleton() {
    }

    public static DoubleCheckedLockingSingleton getInstance() {
        if (instance == null) {
            synchronized(DoubleCheckedLockingSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckedLockingSingleton();
                }
            }
        }
        return instance;
    }
}