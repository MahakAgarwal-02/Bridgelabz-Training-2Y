package interfacee;

class BackgroundJob implements Runnable {
 private String jobName;

 public BackgroundJob(String jobName) {
     this.jobName = jobName;
 }

 @Override
 public void run() {
     System.out.println(jobName + " started...");

     try {
         for (int i = 1; i <= 3; i++) {
             System.out.println(jobName + " running step " + i);
             Thread.sleep(1000); 
         }
     } catch (InterruptedException e) {
         System.out.println(jobName + " interrupted.");
     }

     System.out.println(jobName + " completed!");
 }
}

public class BackgroundJobExecution {
 public static void main(String[] args) {
     System.out.println("Main thread started...");


     Runnable dataBackupJob = new BackgroundJob("Data Backup Job");

     Thread thread = new Thread(dataBackupJob);
     thread.start();

     System.out.println("Main thread continues with other tasks...");
 }
}

