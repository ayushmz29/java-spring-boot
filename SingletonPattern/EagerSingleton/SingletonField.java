package SingletonPattern.EagerSingleton;

/**
 * Singleton with public static final field.
 * <p>
 * Not safe with deserialization.
 */
public class SingletonField {

    public static final SingletonField INSTANCE = new SingletonField();

    private SingletonField() {
    }

}