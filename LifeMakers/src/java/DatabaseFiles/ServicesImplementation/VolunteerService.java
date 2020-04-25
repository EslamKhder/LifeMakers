package DatabaseFiles.ServicesImplementation;

import DatabaseFiles.ServicesInterface.VolunteerServices;
import HibernateFiles.HibernateUtil;
import Model.Volunteer;
import java.util.LinkedList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Restrictions;


/**
 *
 * @author Eng Eslam khder
 */
public class VolunteerService implements VolunteerServices {

    private Session session = null;
    
    public VolunteerService() {
        session = HibernateUtil.getSessionFactory().openSession();
    }

    @Override
    public int addVolunteer(Volunteer volunteer) {
        try {
            session.beginTransaction();
            session.save(volunteer);
            session.getTransaction().commit();
            return 1;
        } catch (Exception e) {
            return 0;
        }
    }

    @Override
    public Volunteer getVolunteerId(int id) {
        session.beginTransaction();
        Volunteer volunteer = (Volunteer) session.get(Volunteer.class, id);
        if (volunteer == null) {
            return null;
        } else {
            return volunteer;
        }
    }

    @Override
    public List getVolunteersName(String fname,String lname) {
        session.beginTransaction();
        Criteria cri = session.createCriteria(Volunteer.class);
        Criterion fn = Restrictions.eq("fname",fname),
                 ln = Restrictions.eq("lname", lname);
        LogicalExpression and = Restrictions.and(fn, ln);
        cri.add(and);
        List<Volunteer> l = new LinkedList();
        l = cri.list();
        if (l.isEmpty()) {
            return null;
        } else {
            return l;
        }
    }

    @Override
    public int updateVolunteer(Volunteer volunteer) {
        session.beginTransaction();
        session.update(volunteer);
        session.getTransaction().commit();
        return 1;
    }

    @Override
    public int deleteVolunteer(Volunteer volunteer) {
        session.beginTransaction();
        try {
            session.delete(volunteer);
            session.getTransaction().commit();
            return 1;
        } catch (Exception e) {
            return 0;
        }

    }

    @Override
    public List<Volunteer> getAllVolunteer() {
        session.beginTransaction();
        Criteria cri = session.createCriteria(Volunteer.class);
        List<Volunteer> volunteers = new LinkedList<>();
        volunteers = cri.list();
        return volunteers;
    }

}
