package DatabaseFiles.ServicesImplementation;

import HibernateFiles.HibernateUtil;
import org.hibernate.Session;
import DatabaseFiles.ServicesInterface.DatabaseServices;


public class DatabaseConnection implements DatabaseServices{

    @Override
    public Session DataBaseConnection() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        return session;
    }
    @Override
    public Session begainSession(Session session) {
        session.beginTransaction();
        return session;
    }
}
