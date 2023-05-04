package Prologue;

/**
 * @Author LiuYunJie
 * @Date 2023/5/3 14:50
 **/
public class PrintThread extends Thread{
    private String message;

    public PrintThread(String message) {
        this.message = message;
    }
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.printf(Thread.currentThread().getName() + message);
        }
    }
}
