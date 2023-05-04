package Chapter1;

/**
 * @Author LiuYunJie
 * @Date 2023/5/4 14:43
 **/
public class Gate {
    private int counter = 0;
    private String name = "Nobody";
    private String address = "Nowhere";
    public void pass(String name, String address) throws InterruptedException {
        this.counter++;
        this.name = name;
        this.address = address;
        Thread.sleep(1000);
        check();
    }

    public String toString() {
        return "No." + counter + ": " + name + ", " + address;
    }

    private void check() {
        if (name.charAt(0) != address.charAt(0)) {
            System.out.println("***** BROKEN *****" + toString());
        }
    }
}
