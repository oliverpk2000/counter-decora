package decorator;

import java.nio.file.Path;

public class LogCounter extends CounterDecorator {


    public LogCounter(Counter counter, Path path) {
        super(counter);
    }
}