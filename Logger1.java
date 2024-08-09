package Week_1;

class Logger1 {
    
    private static Logger1 instance;
    
    private String log;

    private Logger1() {
        log = "";
    }

    public static Logger1 getInstance() {
        if (instance == null) {
            instance = new Logger1();
        }
        return instance;
    }

    public void log(String message) {
        log += message + "\n";
    }

    public void showLog() {
        System.out.println(log);
    }
}

