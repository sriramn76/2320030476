package WEEK_3;

public class ClientDemo {
    public static void main(String[] args) {
        LogHandler infoHandler = new InfoHandler();
        LogHandler debugHandler = new DebugHandler();
        LogHandler errorHandler = new ErrorHandler();

        infoHandler.setNextHandler(debugHandler);
        debugHandler.setNextHandler(errorHandler);

        Logger logger = new Logger();
        logger.addCommand(new LogCommand(infoHandler) {
            @Override
            public void execute(String message, LogLevel level) {
                level = LogLevel.INFO;
                super.execute(message, level);
            }
        });

        logger.addCommand(new LogCommand(infoHandler) {
            @Override
            public void execute(String message, LogLevel level) {
                level = LogLevel.DEBUG; 
                super.execute(message, level);
            }
        });
        
        logger.addCommand(new LogCommand(infoHandler) {
            @Override
            public void execute(String message, LogLevel level) {
                level = LogLevel.ERROR;
                super.execute(message, level);
            }
        });

        logger.processCommands();
    }
}
