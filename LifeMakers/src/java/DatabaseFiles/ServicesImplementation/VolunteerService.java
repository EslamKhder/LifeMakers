package DatabaseFiles.ServicesImplementation;
import DatabaseFiles.ServicesInterface.VolunteerServices;
import Model.Volunteer;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Restrictions;


/**
 *
 * @author Eng Eslam khder
 */
public class VolunteerService implements VolunteerServices {

    private Session s;
    @Override
    public int addVolunteer(Volunteer volunteer,SessionFactory session) {
        try {
            s = session.openSession();
            s.beginTransaction();
            s.save(volunteer);
            s.getTransaction().commit();
            return 1;
        } catch (Exception e) {
            return 0;
        }
    }

    @Override
    public Volunteer getVolunteerId(int id,SessionFactory session) {
        s = session.openSession();
        s.beginTransaction();
        Volunteer volunteer = (Volunteer) s.get(Volunteer.class, id);
        if (volunteer == null) {
            return null;
        } else {
            return volunteer;
        }
    }

    @Override
    public List getVolunteersName(String fname,String lname,SessionFactory session) {
        s = session.openSession();
        s.beginTransaction();
        Criteria cri = s.createCriteria(Volunteer.class);
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
    public int updateVolunteer(Volunteer volunteer,SessionFactory session) {
        s = (Session) session.openSession();
        s.beginTransaction();
        s.update(volunteer);
        s.getTransaction().commit();
        return 1;
    }

    @Override
    public int deleteVolunteer(Volunteer volunteer,SessionFactory session) {
        s = session.openSession();
        s.beginTransaction();
        try {
            s.delete(volunteer);
            s.getTransaction().commit();
            return 1;
        } catch (Exception e) {
            return 0;
        }

    }

    @Override
    public List<Volunteer> getAllVolunteer(SessionFactory session) {
        List<Volunteer> volunteers = new LinkedList<>();
        s = (Session) session.openSession();
        s.beginTransaction();
        Criteria cri = s.createCriteria(Volunteer.class);
        volunteers = cri.list();
        return volunteers;
    }
}
