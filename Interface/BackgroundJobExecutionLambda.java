package interfacee;
public class BackgroundJobExecutionLambda {
    public static void main(String[] args) {
        System.out.println("Main thread started...");

        Runnable emailJob = () -> {
            System.out.println("Email Sending Job started...");
            try {
                for (int i = 1; i <= 3; i++) {
                    System.out.println("Email Sending Job running step " + i);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                System.out.println("Email Sending Job interrupted.");
            }
            System.out.println("Email Sending Job completed!");
        };

        Thread thread = new Thread(emailJob);
        thread.start();

        System.out.println("Main thread continues with other tasks...");
    }
}
