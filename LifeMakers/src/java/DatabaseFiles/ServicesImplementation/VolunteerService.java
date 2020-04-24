package DatabaseFiles.ServicesImplementation;

import Controller.DatabaseController;
import DatabaseFiles.ServicesInterface.VolunteerServices;
import Model.Volunteer;
import java.util.LinkedList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;

/**
 *
 * @author Eng Eslam khder
 */
public class VolunteerService implements VolunteerServices{
    
    private DatabaseController databasecontroller;
    public VolunteerService () {
        databasecontroller = new DatabaseController();
    }

    @Override
    public int addVolunteer(Volunteer volunteer, Session session) {
        try {
            session = databasecontroller.begainSession(session);
            session.save(volunteer);
            session.getTransaction().commit();
            return 1;
        } catch (Exception e) {
            session.getTransaction().rollback();
        }
        return 0;
    }

    @Override
    public Volunteer getVolunteer(int id, Session session) {
        session = databasecontroller.begainSession(session);
        Volunteer volunteer = (Volunteer) session.get(Volunteer.class, id);
        if (volunteer == null) {
            return null;
        } else {
            return volunteer;
        }
    }

    @Override
    public int updateVolunteer(Volunteer player, Session session) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int deleteVolunteer(Volunteer volunteer, Session session) {
        try {
            session = databasecontroller.begainSession(session);
            session.delete(volunteer);
            return 1;
        } catch (Exception e) {
            session.getTransaction().rollback();
        }
        return 0;
    }

    @Override
    public List<Volunteer> getAllVolunteer(Session session) {
        session = databasecontroller.begainSession(session);
        List<Volunteer> volunteers = new LinkedList<>();
        Criteria cri = session.createCriteria(Volunteer.class);
        volunteers = cri.list();
        return volunteers;
    }
   
}
