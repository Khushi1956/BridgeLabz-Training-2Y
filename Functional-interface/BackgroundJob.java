public class BackgroundJob {
    public static void main(String[] args) {
        Runnable job = () -> System.out.println("Running backup in background...");
        Thread t = new Thread(job);
        t.start();
    }
}
