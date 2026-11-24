import Model.Singleton;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        Singleton.getInstance().op1(1, 2, 3);
        Singleton.getInstance().op2(3 ,4,5);


        Singleton singl = Singleton.getInstance();
        singl.op1(1, 2, 3);
        singl.op1(3, 4, 5);
    }
}
