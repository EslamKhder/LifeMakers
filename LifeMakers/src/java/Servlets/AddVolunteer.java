package Servlets;

import Controller.VolunteerController;
import Model.Gender;
import Model.Volunteer;
import java.io.IOException;
import java.util.regex.Pattern;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Eng Eslam khder
 */
public class AddVolunteer extends HttpServlet {

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
        if (id.isEmpty() || isNumber(id) == -1) {
            response.getWriter().print("id");
        } else if (fname.isEmpty()) {
            response.getWriter().print("fname");
        } else if (lname.isEmpty()) {
            response.getWriter().print("lname");
        } else if (age.isEmpty() || isNumber(age) == -1) {
            response.getWriter().print("age");
        } else if (phone.isEmpty() || isNumber(phone) == -1) {
            response.getWriter().print("phone");
        } else if (city.isEmpty() || !(Pattern.matches("[a-zA-Z ]+", city))) {
            response.getWriter().print("city");
        } else if (gender.isEmpty()) {
            response.getWriter().print("gender");
        } else {
            Gender gen = null;
            if(gender.equalsIgnoreCase("male")){
                gen = Gender.Male;
            } else {
                gen = Gender.Female;
            }
            Volunteer volunteer = new Volunteer(isNumber(id), fname, lname, isNumber(age), phone, city, gen, message);
            VolunteerController vc = new VolunteerController();
            if (vc.addVolunteer(volunteer) == 1) {
                response.getWriter().print("success");
            } else {
                response.getWriter().print("idExist");
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
