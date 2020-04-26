/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseFiles.ServicesInterface;

import Model.Volunteer;
import java.util.List;
import org.hibernate.SessionFactory;

/**
 *
 * @author Eng Eslam khder
 */
public interface VolunteerServices {
    public int addVolunteer(Volunteer volunteer,SessionFactory session);
    public Volunteer getVolunteerId(int id,SessionFactory session);
    public List getVolunteersName(String fname,String lname,SessionFactory session);
    public int updateVolunteer(Volunteer volunteer,SessionFactory session);
    public int deleteVolunteer(Volunteer volunteer,SessionFactory session);
    public List<Volunteer> getAllVolunteer(SessionFactory session);
}
