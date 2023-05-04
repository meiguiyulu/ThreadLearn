package Prologue;

/**
 * @Author LiuYunJie
 * @Date 2023/5/3 14:54
 **/
public class Printer implements Runnable{

    private String message;

    public Printer(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println(Thread.currentThread().getName() + message);
        }
    }
}
