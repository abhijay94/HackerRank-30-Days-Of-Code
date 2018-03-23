public class TimingContext {
    long tStart;
    long tEnd;
    long tDelta;
    double elapsedTime;

    public TimingContext() {
        this.tStart = System.nanoTime();
    }

    public void stop() {
        this.tEnd = System.nanoTime();
        long tDelta = tEnd - tStart;
        this.elapsedTime = tDelta / 1000000.0;
    }

    public String getElapsedTime() {
        return elapsedTime + " milli seconds";
    }
}
