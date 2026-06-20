public class SingletonPatternExample {
    public static class Logger {
        /*
            Logger class
            - having a static final Logger instance variable which stores a single object on creation
            - on calling getInstance() it returns the same instance object to each call
            - Output: on object creation using function call, we get multiple instances pointing to same object reference
        */
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
