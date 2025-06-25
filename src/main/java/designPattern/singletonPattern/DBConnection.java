package designPattern.singletonPattern;

public class DBConnection {


    private static final DBConnection instance=new DBConnection();

    // make constructor as private to make it as singleton design pattern
    private DBConnection(){
        System.out.println("DBConnection constructor called");
    }

    public static DBConnection getInstance(){
        return instance;
    }

    public void connection(){
        System.out.println("Db is Connected to the System");
    }
}

class Main{
    public static void main(String[] args) {

        System.out.println("Main method started");
        DBConnection conn1 = DBConnection.getInstance();
        DBConnection conn2 = DBConnection.getInstance();

        System.out.println("Hashcode of conn1: " + conn1.hashCode());
        System.out.println("Hashcode of conn2: " + conn2.hashCode());

        if (conn1 == conn2) {
            System.out.println("Both are the same instance (Singleton works!)");
        } else {
            System.out.println("Different instances (Singleton FAILED!)");
        }

        conn1.connection();


    }
}
