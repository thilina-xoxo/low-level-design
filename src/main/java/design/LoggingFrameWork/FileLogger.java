package design.LoggingFrameWork;

import java.io.FileWriter;
import java.io.IOException;

public class FileLogger implements LogDestination{

    private String fileName;

    public FileLogger(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void log(String message) {
        try (FileWriter fileWriter = new FileWriter(fileName, true)) {
            fileWriter.write(message + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
