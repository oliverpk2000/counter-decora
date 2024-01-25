package decorator;

public class LoopCounter implements Counter {

    public LoopCounter(int... values) {
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
