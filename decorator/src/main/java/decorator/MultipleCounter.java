package decorator;

public class MultipleCounter extends CounterDecorator {

    public MultipleCounter(Counter counter, int multiple) {
        super(counter);
    }
}
