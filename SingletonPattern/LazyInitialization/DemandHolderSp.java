package SingletonPattern.LazyInitialization;

/**
 * The Initialization on Demand Holder (design pattern) idiom is a lazy-loaded singleton.
 * In all versions of Java, the idiom enables a safe, highly concurrent lazy initialization with good performance
 * <p>
 * The static class definition 'LazyHolder' within it is not initialized until the JVM determines that LazyHolder must be executed.
 * <p>
 * The static class LazyHolder is only executed when the static method getInstance is invoked on the class DemandHolderSp,
 * and the first time this happens the JVM will load and initialize the LazyHolder class.
 * <p>
 * This solution is thread-safe without requiring special language constructs (i.e. volatile or synchronized).
 */

// OR AKA BILL PUGH SINGLETON ->

/*
 public class BillPughSingleton {
 private BillPughSingleton() {}

 private static class SingletonHelper {
 private static final BillPughSingleton INSTANCE = new BillPughSingleton();
 }

 public static BillPughSingleton getInstance() {
 return SingletonHelper.INSTANCE;
 }
 }
 */

public final class DemandHolderSp {

    private DemandHolderSp() {
    }

    public static DemandHolderSp getInstance() {
        return LazyHolder.INSTANCE;
    }

    private static class LazyHolder {
        private static final DemandHolderSp INSTANCE = new DemandHolderSp();
    }
}