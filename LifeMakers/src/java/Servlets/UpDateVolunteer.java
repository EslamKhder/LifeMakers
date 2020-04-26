/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Controller.VolunteerController;
import Model.Gender;
import Model.Volunteer;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Pattern;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

/**
 *
 * @author Eng Eslam khder
 */
public class UpDateVolunteer extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String id = request.getParameter("id").trim(),
                age = request.getParameter("age").trim(),
                fname = request.getParameter("fname").trim().toLowerCase(),
                lname = request.getParameter("lname").trim().toLowerCase(),
                phone = request.getParameter("phone").trim().toLowerCase(),
                city = request.getParameter("city").trim().toLowerCase(),
                gender = request.getParameter("gender").trim().toLowerCase(),
                message = request.getParameter("message").trim().toLowerCase();
        Gender gen = null;
        if (gender.equalsIgnoreCase("male")) {
            gen = Gender.Male;
        } else {
            gen = Gender.Female;
        }
        if (fname.isEmpty()) {
            response.getWriter().print("fname");
        } else if (lname.isEmpty()) {
            response.getWriter().print("lname");
        } else if (age.isEmpty() || isNumber(age) == -1) {
            response.getWriter().print("age");
        } else if (phone.isEmpty() || isNumber(phone) == -1) {
            response.getWriter().print("phone");
        } else if (city.isEmpty() || !(Pattern.matches("[a-zA-Z ]+", city))) {
            response.getWriter().print("city");
        } else {
            Volunteer volunteer = new Volunteer(isNumber(id), fname, lname, isNumber(age), phone, city, gen, message);
            VolunteerController vc = new VolunteerController();
            vc.updateVolunteer(volunteer);
            request.getServletContext().removeAttribute("Volunteer");
            response.getWriter().print("success");
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
