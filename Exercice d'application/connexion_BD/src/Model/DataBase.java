package Model;

public final class DataBase {
    private static DataBase instance = null;
    private String host;
    private String user;
    private String password;

    private DataBase(){
        super();
    }

    private DataBase (String host, String user, String pass){
        this.host = host;
        this.user = user;
        this.password = pass;
    }

    public static DataBase getInstance(){
        if(instance == null){
            instance = new DataBase();
        }
        return instance;
    }

    public static DataBase getInstance(String host, String user, String pass){
        if(instance == null){
            instance = new DataBase(host,user,pass);
        }

        return instance;

    }

    public void afficher(){
        System.out.println("\n les informations de connexion à la base de données sont: host= "+this.host+" , user= "+this.user+" et password= "+this.password);
    }



}
