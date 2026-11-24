import Model.DataBase;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        DataBase db1 = DataBase.getInstance("localhost","root","root");
        db1.afficher();
    }
}
