package Controller;

import DatabaseFiles.ServicesImplementation.VolunteerService;
import Model.Volunteer;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Eng Eslam khder
 */
public class VolunteerController {

    private VolunteerService volunteerservice;

    public VolunteerController() {
        volunteerservice = new VolunteerService();
    }

    public int addVolunteer(Volunteer volunteer) {
        return volunteerservice.addVolunteer(volunteer);
    }

    public Volunteer getVolunteerId(int id) {
        return volunteerservice.getVolunteerId(id);
    }

    public List getVolunteersName(String fname, String lname) {
        return volunteerservice.getVolunteersName(fname, lname);
    }

    public int updateVolunteer(Volunteer player) {
        return volunteerservice.updateVolunteer(player);
    }

    public int deleteVolunteer(Volunteer volunteer) {
        return volunteerservice.deleteVolunteer(volunteer);
    }

    public List<Volunteer> getAllVolunteer() {
        return volunteerservice.getAllVolunteer();
    }
}
