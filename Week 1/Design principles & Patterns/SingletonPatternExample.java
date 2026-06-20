public class SingletonPatternExample {
    public static class Logger {
        private static final Logger instance = new Logger();

        private Logger() {
            System.out.println("Logger instance created!\n");
        }

        public static Logger getInstance() {
            return instance;
        }
    }

    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        if (logger1 == logger2) {
            if (logger1 != null && logger1 instanceof Logger)
                System.out.println("Logger1 instanceof Logger class!\n");
            if (logger2 != null && logger2 instanceof Logger)
                System.out.println("Logger2 instanceof Logger class!\n");
            System.out.println("Success: Both object points to single instance of class!");
        }
    }
}
