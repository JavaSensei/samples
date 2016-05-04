package ru.kpfu.itis.group11506.multithreading;

public class Main {

    private String threadName;

    public static final int ARR_LENGTH = 11;

    private int[] arrs = new int[ARR_LENGTH];

    private static int currentIndex;

    public Main(String threadName) {
        this.threadName = threadName;
    }

    public static void main(String[] args) {
        for (int index = 0 ; index < 10; index++) {
            final String threadName = "Thread " + index;
            new Thread(() -> new Main(threadName).run()).start();
        }
    }

    public void run() {
        while (true) {
            if (currentIndex < ARR_LENGTH - 1) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                currentIndex++;
                System.out.println(String.format("Thread name: %s: current index: %d", threadName, currentIndex));
                arrs[currentIndex] = (int)(Math.random() * 5);
            } else {
                currentIndex = 0;
            }
        }
    }
}
