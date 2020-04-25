/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseFiles.ServicesInterface;

import Model.Volunteer;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Eng Eslam khder
 */
public interface VolunteerServices {
    public int addVolunteer(Volunteer volunteer);
    public Volunteer getVolunteerId(int id);
    public List getVolunteersName(String fname,String lname);
    public int updateVolunteer(Volunteer volunteer);
    public int deleteVolunteer(Volunteer volunteer);
    public List<Volunteer> getAllVolunteer();
}
