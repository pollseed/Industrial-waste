package hoge;

public abstract class AbstractTimer {
    abstract protected void convert();

    protected final void measure(Measure m) {
        final long startTime = System.nanoTime();
        m.action();
        final long estimatedTime = System.nanoTime() - startTime;
        System.out.println(estimatedTime + "ms");
    }

    protected interface Measure {
        void action();
    }
}
