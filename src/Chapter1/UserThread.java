package Chapter1;

/**
 * @Author LiuYunJie
 * @Date 2023/5/4 14:46
 **/
public class UserThread extends Thread{
    private final Gate gate;
    private final String myName;
    private final String myAddress;
    public UserThread(Gate gate, String myName, String myAddress) {
        this.gate = gate;
        this.myName = myName;
        this.myAddress = myAddress;
    }
    public void run() {
        System.out.println(myName + " BEGIN");
        while (true) {
            try {
                gate.pass(myName, myAddress);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
