package lab12.task05;

public class Main {
    private static final Object lock = new Object();
    private static int [] numbers = {10, 21, 32, 1, 56, 23, 12, 24, 46, 75};
    private static int globalMaxElement = 0;
    private static int count = 0;

    public static void main(String[] args) throws InterruptedException {
        int cores = Runtime.getRuntime().availableProcessors();
        Thread[] threads = new Thread[cores];
        for (int i = 0; i < cores; i++) {
            threads[i] = new Thread(() -> {
                int localMaxElement = 0;
                int index;
                while (true) {
                    synchronized (lock) {
                        if (count >= numbers.length) {
                            break;
                        }
                        index = count;
                        count++;
                        if (numbers[index] > localMaxElement) {
                            localMaxElement = numbers[index];
                        }
                    }
                }
                synchronized (lock) {
                    if (localMaxElement > globalMaxElement) {
                        globalMaxElement = localMaxElement;
                    }
                }
            });
            threads[i].start();
        }
        for (Thread thread : threads) {
            thread.join();
        }
        System.out.println("Максимальный элемент в массиве: " + globalMaxElement);
    }
}
