public class TimingContext {
    long tStart;
    long tEnd;
    long tDelta;
    double elapsedTime;

    public TimingContext() {
        this.tStart = System.currentTimeMillis();
    }

    public void stop() {
        this.tEnd = System.currentTimeMillis();
        long tDelta = tEnd - tStart;
        this.elapsedTime = tDelta / 1000.0;
    }

    public String getElapsedTime() {
        return elapsedTime + " seconds";
    }
}
