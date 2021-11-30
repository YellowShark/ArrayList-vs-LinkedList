package timer;

public class MyTimer {
    public long calculateExecutionTime(Callback function) {
        var startTime = System.nanoTime();
        function.call();
        return System.nanoTime() - startTime;
    }
}
