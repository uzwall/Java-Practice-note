package Threa;

import com.sun.jdi.event.ThreadStartEvent;

class ThreadA implements Runnable {
    public void run() {
        try {
            for (int i = 50; i <= 100; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);

                }
                Thread.sleep(200);
            }
        } catch (Exception e) {
            System.out.print(e);
        }
    }
}

class ThreadB implements Runnable {
    public void run() {
        try {
            for (int i = 50; i <= 100; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);

                }
                Thread.sleep(200);
            }
        } catch (Exception e) {
            System.out.print(e);
        }
    }

}

public class MultipleThreadOddEven {
    public static void main(String[] args) {
        Runnable runnable = new ThreadA();
        Thread t1 = new Thread(runnable);
        Runnable runnable1 = new ThreadB();
        Thread t2 = new Thread(runnable1);
        t1.start();
        t2.start();
    }
}
