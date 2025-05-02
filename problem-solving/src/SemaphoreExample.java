import java.util.concurrent.Semaphore;

class PrinterService {
    // Semaphore with 2 permits
    private final Semaphore semaphore = new Semaphore(2);

    public void print(String jobName) {
        try {
            // Acquire permit before printing
            semaphore.acquire();
            System.out.println(Thread.currentThread().getName() + " started printing: " + jobName);
            Thread.sleep(2000); // Simulate time taken to print
            System.out.println(Thread.currentThread().getName() + " finished printing: " + jobName);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Release permit after printing
            semaphore.release();
        }
    }
}

public class SemaphoreExample {
    public static void main(String[] args) {
        PrinterService printerService = new PrinterService();

        // Create 5 threads simulating 5 print jobs
        for (int i = 1; i <= 5; i++) {
            final String jobName = "Job-" + i;
            new Thread(() -> printerService.print(jobName), "Thread-" + i).start();
        }
    }
}
