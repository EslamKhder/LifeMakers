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
public class GetAllVolunteers extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        VolunteerController vc = new VolunteerController();
        List<Volunteer> list = vc.getAllVolunteer();
        request.getServletContext().setAttribute("Volunteers",list);
        response.sendRedirect("view/ShowVolunteers/Volunteers.jsp");
    }
}
