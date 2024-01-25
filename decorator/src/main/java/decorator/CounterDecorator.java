package decorator;

public abstract class CounterDecorator implements Counter {

    protected CounterDecorator(Counter counter) {

    }

    @Override
    public int read() {
        return 0;
    }

    @Override
    public Counter tick() {
        return null;
    }
}
