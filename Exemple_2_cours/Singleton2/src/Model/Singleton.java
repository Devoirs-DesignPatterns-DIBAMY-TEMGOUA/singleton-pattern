package Model;


public final class Singleton {
    private static Singleton instance = null;
    private int x;
    private int y;

    private Singleton(){
        super();
    }

    private Singleton (int x, int y){
            this.x = x;
            this.y = y;
    }

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }

        return instance;

    }

    public static Singleton getInstance(int x, int y){
        if(instance == null){
            instance = new Singleton(x, y);
        }

        return instance;

    }

    public float moyenne(int x, int y){
        return (x + y) / 2;
    }

    public int somme(int x, int y){
        return x + y;
    }

    public int produit(int x, int y){
        return x * y ;
    }

    public void afficher(){
        System.out.println("\n je suis une instance et mes valeurs sont: x= "+this.x+" et y= "+this.y);
    }
}
