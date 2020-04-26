package Controller;

import DatabaseFiles.ServicesImplementation.VolunteerService;
import Model.Volunteer;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Eng Eslam khder
 */
public class VolunteerController {

    private VolunteerService volunteerservice;

    public VolunteerController() {
        volunteerservice = new VolunteerService();
    }

    public int addVolunteer(Volunteer volunteer,SessionFactory session) {
        return volunteerservice.addVolunteer(volunteer, session);
    }

    public Volunteer getVolunteerId(int id,SessionFactory session) {
        return volunteerservice.getVolunteerId(id, session);
    }

    public List getVolunteersName(String fname, String lname,SessionFactory session) {
        return volunteerservice.getVolunteersName(fname, lname, session);
    }

    public int updateVolunteer(Volunteer player,SessionFactory session) {
        return volunteerservice.updateVolunteer(player, session);
    }

    public int deleteVolunteer(Volunteer volunteer,SessionFactory session) {
        return volunteerservice.deleteVolunteer(volunteer, session);
    }

    public List<Volunteer> getAllVolunteer(SessionFactory session) {
        return volunteerservice.getAllVolunteer(session);
    }
}
