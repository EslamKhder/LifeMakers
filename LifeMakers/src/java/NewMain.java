
import Controller.VolunteerController;
import HibernateFiles.HibernateUtil;
import Model.Gender;
import Model.Volunteer;
import javax.swing.JOptionPane;
import org.hibernate.Session;

/**
 *
 * @author Eng Eslam khder
 */
public class NewMain {

    public static void main(String[] args) {
        // TODO code application logic here
        Volunteer volunteer = new Volunteer();volunteer.setFname("eslam");
        VolunteerController vv = new VolunteerController();
        
        JOptionPane.showMessageDialog(null, vv.getVolunteersName("sddsa", "asdsa") + "");
//        Session session = HibernateUtil.getSessionFactory().openSession();
//        session.beginTransaction();
//        session.delete(volunteer);
//        session.getTransaction().commit();
    }
    
}
