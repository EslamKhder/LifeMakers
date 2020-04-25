/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Controller.VolunteerController;
import Model.Volunteer;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Eng Eslam khder
 */
public class DeleteVolunteerName extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String fname = request.getParameter("fname").trim().toLowerCase(),
                lname = request.getParameter("lname").trim().toLowerCase();
        if (fname.isEmpty()) {
            response.getWriter().print("fname");
        } else if (lname.isEmpty()) {
            response.getWriter().print("lname");
        } else {
            VolunteerController vc1 = new VolunteerController();
            VolunteerController vc2 = new VolunteerController();
            List<Volunteer> vol = vc1.getVolunteersName(fname, lname);
            if (vol == null) {
                response.getWriter().print("notexist");
            } else {
                if (vol.size() == 1) {
                    Volunteer volunteer = vol.get(0);
                    vc2.deleteVolunteer(volunteer);
                    response.getWriter().print("success");
                } else {

                }
            }
        }

    }

}
