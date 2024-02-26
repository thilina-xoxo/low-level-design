package design.LoggingFrameWork;

public class ConsoleLogger implements LogDestination{
    @Override
    public void log(String message) {
        System.out.println(message);
    }
}
