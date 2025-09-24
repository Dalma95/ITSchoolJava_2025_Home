package session34;

class DataBaseConnection{

    private String connectionString;
    private static DataBaseConnection instance;

    private DataBaseConnection(){
        connectionString = "jdbc:postgress://localhost:3306/db";
    }

    public static synchronized DataBaseConnection getInstance(){
        if (instance == null){
            instance = new DataBaseConnection();
        }
        return instance;
    }

    public void connect(){
        System.out.println("Connects to: " + connectionString);
    }
}

public class Singleton {
    public static void main(String[] args) {

        DataBaseConnection db = DataBaseConnection.getInstance();
        db.connect();
        System.out.println(db);
        DataBaseConnection db2 = DataBaseConnection.getInstance();
        db2.connect();
        System.out.println(db2);
    }
}
