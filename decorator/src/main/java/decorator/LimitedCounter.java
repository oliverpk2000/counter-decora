package decorator;

public class LimitedCounter implements Counter {


    public LimitedCounter(Counter counter, int limit) {

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
