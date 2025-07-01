package singleton;

public class TestLogger {
    public static void main(String[] args) {
        Logger log1 = Logger.getInstance();
        log1.log("First message");

        Logger log2 = Logger.getInstance();
        log2.log("Second message");

        System.out.println("Same instance? " + (log1 == log2));  // should be true
    }
}
