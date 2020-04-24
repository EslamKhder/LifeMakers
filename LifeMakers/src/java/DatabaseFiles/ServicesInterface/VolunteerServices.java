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
    public int addVolunteer(Volunteer player,Session session);
    public Volunteer getVolunteer(int id,Session session);
    public int updateVolunteer(Volunteer player,Session session);
    public int deleteVolunteer(Volunteer player,Session session);
    public List<Volunteer> getAllVolunteer(Session session);
}
