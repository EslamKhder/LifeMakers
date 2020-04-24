package DatabaseFiles.ServicesInterface;

import org.hibernate.Session;

/**
 *
 * @author Eng Eslam khder
 */
public interface DatabaseServices {
    public Session DataBaseConnection();
    public Session begainSession(Session session);
    
}
