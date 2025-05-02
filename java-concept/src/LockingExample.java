public class LockingExample {
    public static void main(String args[]) {
        PrintService p1 = new PrintService();
        PrintService p2 = new PrintService();

        new Thread(() -> p1.printClassLocking()).start(); // Thread-0, No other thread can execute synchrized code inside printClassLocking until current thread release lock
        new Thread(() -> p2.printClassLocking()).start(); // Thread-1, Will execute synchrized code inside printClassLocking only when Thread-0 release lock

        new Thread(() -> p1.printObjectLocking()).start(); // Thread-2, No other thread of same object can execute synchrized code inside printObjectLocking
        new Thread(() -> p2.printObjectLocking()).start(); // Thread-3, It will execute synchrized code inside printObjectLocking immediately as Thread-2 acquire lock on another object
    }
}

class PrintService {
    public void printClassLocking() {
        synchronized (PrintService.class) {
            try {
                System.out.println("Start: " + Thread.currentThread().getName());
                Thread.sleep(2000);
                System.out.println("End: " + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void printObjectLocking() {
        synchronized (this) {
            try {
                System.out.println("Start: " + Thread.currentThread().getName());
                Thread.sleep(2000);
                System.out.println("End: " + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
