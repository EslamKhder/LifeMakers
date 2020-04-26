package Servlets;

import Controller.VolunteerController;
import Model.Volunteer;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Eng Eslam khder
 */
public class DeleteVolunteerId extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String id = request.getParameter("id");
        Volunteer volunteer = null;
        VolunteerController vc1 = new VolunteerController();
        VolunteerController vc2 = new VolunteerController();
        if (id.isEmpty() || isNumber(id) == -1) {
            response.getWriter().print("id");
        } else {
            SessionFactory session = (SessionFactory) request.getServletContext().getAttribute("Connect");
            volunteer = vc1.getVolunteerId(isNumber(id),session);
            if (volunteer == null) {
                response.getWriter().print("notexist");
            } else {
                vc2.deleteVolunteer(volunteer,session);
                response.getWriter().print("success");
            }
        }

    }

    public int isNumber(String num) {
        try {
            return Integer.parseInt(num);
        } catch (NumberFormatException e) {
            return -1;
        }
    }
}
