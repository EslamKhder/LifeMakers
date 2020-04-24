package Controller;

import DatabaseFiles.ServicesImplementation.DatabaseConnection;
import org.hibernate.Session;

public class DatabaseController {
    DatabaseConnection databaseconnection;
    
    public DatabaseController(){
        databaseconnection = new DatabaseConnection();
    }
    public Session Connection(){
        return databaseconnection.DataBaseConnection();
    }
    public Session begainSession(Session session) {
        return databaseconnection.begainSession(session);
    }
}
