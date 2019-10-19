package account;

public class Logger {

private static Logger instance;

    private Logger () {

    }

    public void log (String s) {
        System.out.println(s);
    }

    public static Logger getInstance() {
        if (instance == null) {
            synchronized (Logger.class) {
                if (instance == null) {
                    instance = new Logger();
                }
            }
        }
        return instance;
    }
}
