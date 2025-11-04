public class Thread11 {
    public static void main(String[] args) throws InterruptedException {
        int N = 2012; // número de threads

        long inicio = System.currentTimeMillis();

        Thread[] threads = new Thread[N];
        for (int i = 0; i < N; i++) {
            threads[i] = new Thread(() -> {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
            threads[i].start();
        }

        for (Thread t : threads) {
            t.join();
        }

        long fim = System.currentTimeMillis();
        System.out.println("Modelo 1:1 - Tempo: " + (fim - inicio) + " ms");
    }
}