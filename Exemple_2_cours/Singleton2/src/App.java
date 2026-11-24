import Model.Singleton;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        Singleton singleton = Singleton.getInstance();
        int som = singleton.somme(2, 5);
        System.out.println("la somme est: " + som);

        Singleton singleton2 = Singleton.getInstance(8, 3);
        singleton2.afficher();
        
        Singleton singleton3 = Singleton.getInstance(16, 19);
        singleton3.afficher();
    }
}
