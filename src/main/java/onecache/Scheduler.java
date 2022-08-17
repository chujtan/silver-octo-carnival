package onecache;

public interface Scheduler {

    /**
     * Schedule work to be run asynchronously after a certain amount of time.
     *
     * @param func Function to call
     * @param delayMS How long to wait before running the function
     * @return  A cancellation function for this item
     */
    Runnable Schedule(Runnable func, long delayMS);
}
