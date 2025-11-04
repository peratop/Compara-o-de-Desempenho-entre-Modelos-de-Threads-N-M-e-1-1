import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadNM {
    public static void main(String[] args) {
        int N = 2012; // número de tarefas
        int M = 4;   // número de threads do sistema

        long inicio = System.currentTimeMillis();

        ExecutorService executor = Executors.newFixedThreadPool(M);

        for (int i = 0; i < N; i++) {
            executor.submit(() -> {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
        }

        executor.shutdown();
        while (!executor.isTerminated()) {

        }

        long fim = System.currentTimeMillis();
        System.out.println("Modelo N:M - Tempo: " + (fim - inicio) + " ms");
    }
}