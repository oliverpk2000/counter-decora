package decorator;

public class SkipCounter extends CounterDecorator {

    public SkipCounter(Counter counter, int skip) {
        super(counter);
    }
}
