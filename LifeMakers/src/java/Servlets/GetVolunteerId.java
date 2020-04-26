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
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

/**
 *
 * @author Eng Eslam khder
 */
public class GetVolunteerId extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {            
        
        String id = request.getParameter("id");
        Volunteer volunteer = null;
        VolunteerController vc1 = new VolunteerController();
        if (id.isEmpty() || isNumber(id) == -1) {
            response.getWriter().print("id");
        } else {
            volunteer = vc1.getVolunteerId(isNumber(id));
            if (volunteer == null) {
                response.getWriter().print("notexist");
            } else {
                request.getServletContext().setAttribute("Volunteer", volunteer);
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

