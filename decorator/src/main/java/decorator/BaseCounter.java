package decorator;

public class BaseCounter implements Counter {


    public BaseCounter(int base) {

    }

    public int read() {
        return 0;
    }

    public Counter tick() {
        return null;
    }
}
