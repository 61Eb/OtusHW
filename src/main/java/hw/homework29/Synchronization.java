package hw.homework29;

public class Synchronization {
    private static final Object lock = new Object();
    private static int currentNumber = 1;

    public static void main(String[] args) {
        Thread threadA = new Thread(new Task("A", 1));
        Thread threadB = new Thread(new Task("B", 2));
        Thread threadC = new Thread(new Task("C", 3));

        threadA.start();
        threadB.start();
        threadC.start();
    }

    static class Task implements Runnable {
        private final String letter;
        private final int threadNumber;

        public Task(String letter, int threadNumber) {
            this.letter = letter;
            this.threadNumber = threadNumber;
        }

        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                synchronized (lock) {
                    while (currentNumber != threadNumber) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                    System.out.print(letter);

                    currentNumber = (currentNumber % 3) + 1;

                    lock.notifyAll();
                }
            }
        }
    }
}
