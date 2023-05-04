package Prologue;

/**
 * @Author LiuYunJie
 * @Date 2023/5/3 14:52
 **/
public class Main {
    public static void main(String[] args) {
        new PrintThread("Hello!").start();
        new PrintThread("World!").start();

        new Thread(new Printer("Hello!")).start();
        new Thread(new Printer("World!")).start();
    }
}
