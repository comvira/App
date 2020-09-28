package Flow;

public class FlowRun {
    public static void main(String[] args) {
        Thread t = new Thread(new Flow2());
        t.start();
        Flow1 t2 = new Flow1();
        t2.start();
    }
}
