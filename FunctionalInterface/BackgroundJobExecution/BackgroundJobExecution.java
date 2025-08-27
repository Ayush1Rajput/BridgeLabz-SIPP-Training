package FunctionalInterface.BackgroundJobExecution;

public class BackgroundJobExecution {
    public static void main(String[] args) {
        // Runnable task
        Runnable job = () -> {
            System.out.println("Background job started...");
            try {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Processing step " + i);
                    Thread.sleep(1000); // simulate delay
                }
            } catch (InterruptedException e) {
                System.out.println("Job interrupted: " + e.getMessage());
            }
            System.out.println("Background job completed.");
        };

        // Running job in separate thread
        Thread backgroundThread = new Thread(job);
        backgroundThread.start();

        System.out.println("Main program continues running...");
    }
}
