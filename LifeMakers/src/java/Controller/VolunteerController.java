/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
    public VolunteerController (){
        volunteerservice = new VolunteerService();
    }
    public int addVolunteer(Volunteer volunteer, Session session) {
        return volunteerservice.addVolunteer(volunteer, session);
    }
    public Volunteer getVolunteer(int id, Session session) {
        return volunteerservice.getVolunteer(id, session);
    }
    public int updateVolunteer(Volunteer player, Session session){
        return volunteerservice.updateVolunteer(player, session);
    }
    public int deleteVolunteer(Volunteer volunteer, Session session) {
        return volunteerservice.deleteVolunteer(volunteer, session);
    }
    public List<Volunteer> getAllVolunteer(Session session) {
        return volunteerservice.getAllVolunteer(session);
    }
}
