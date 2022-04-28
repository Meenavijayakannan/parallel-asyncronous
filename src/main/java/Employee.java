import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class Employee {

public static void main(String[] args) throws ExecutionException, InterruptedException {

    int timeout = 3;
    Employee employee =new Employee();

    runTask()
            .orTimeout(timeout, TimeUnit.SECONDS)
            .exceptionally((err)->{
                System.err.println("Error Printed "+err);
                return null;
            }).join();
}
    private static CompletableFuture runTask() {
        return CompletableFuture.supplyAsync(() -> {
            for (int i = 1; i < 6; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("running task - " + i + " seconds" +Thread.currentThread().getName());
            }
            return "completed";
        });
    }

}
