<%-- 
    Document   : EditVolunteer
    Created on : Apr 25, 2020, 2:54:49 AM
    Author     : Eng Eslam khder
--%>

<%@page import="javax.swing.JOptionPane"%>
<%@page import="Model.Volunteer"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Contact V2</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!--===============================================================================================-->
        <link rel="icon" type="image/png" href="images/icons/favicon.ico"/>
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="vendor/bootstrap/css/bootstrap.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="fonts/font-awesome-4.7.0/css/font-awesome.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="vendor/animate/animate.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="vendor/css-hamburgers/hamburgers.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="vendor/select2/select2.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="css/util.css">
        <link rel="stylesheet" type="text/css" href="css/main.css">
        <!--===============================================================================================-->
    </head>
    <jsp:scriptlet>
        Volunteer vol = (Volunteer) request.getServletContext().getAttribute("Volunteer");
    </jsp:scriptlet>
    <body>

        <div class="bg-contact2" style="background-image: url('images/bg-01.jpg');">
            <div class="container-contact2">
                <div class="wrap-contact2">
                    <form class="contact2-form validate-form">
                        <span class="contact2-form-title">
                            Edit Volunteer
                        </span>
                        <div class="wrap-input2 validate-input" data-validate="required">
                            ID : <input class="input2" type="text" id="id" placeholder="First Name" disabled value="<%=vol.getId()%>">
                        </div>
                        <div class="wrap-input2 validate-input" data-validate="required">
                            First Name : <input class="input2" type="text" id="fname" placeholder="First Name" value="<%=vol.getFname()%>">
                        </div>
                        <div id="FNAME"></div>
                        <div class="wrap-input2 validate-input" data-validate="required">
                            Last Name : <input class="input2" type="text" id="lname" placeholder="Last Name" value="<%=vol.getLname()%>">
                        </div>
                        <div id="LANME"></div>
                        <div class="wrap-input2 validate-input" data-validate="required">
                            Age : <input class="input2" type="text" id="age" placeholder="Age" value="<%=vol.getAge()%>">
                        </div>
                        <div id="AGE"></div>
                        <div class="wrap-input2 validate-input" data-validate="required">
                            Phone Number : <input class="input2" type="text" id="phone" placeholder="" value="<%=vol.getPhone()%>">
                        </div>
                        <div id="PHONE"></div>
                        <div class="wrap-input2 validate-input" data-validate="required">
                            Gender : <input class="input2" type="text" placeholder="Gender" id="gender" disabled value="<%=vol.getGender()%>">
                        </div>
                        <div class="wrap-input2 validate-input" data-validate="required">
                            City :  <input class="input2" type="text" placeholder="City" id="city" value="<%=vol.getCity()%>">
                        </div>
                        <div id="CITY"></div>
                        <div class="wrap-input2 validate-input" data-validate ="required">
                            Message : <textarea class="input2" id="message" placeholder="Any Thing About You"><%=vol.getMessage()%></textarea>
                        </div>
                        <div id="MESSAGE"></div>
                    </form>
                    <div class="container-contact2-form-btn">
                        <div class="wrap-contact2-form-btn">
                            <div class="contact2-form-bgbtn"></div>
                            <button class="contact2-form-btn" onclick="Edit()">
                                Done
                            </button>
                        </div>
                    </div>
                </div>
            </div>
        </div>




        <!--===============================================================================================-->
        <script src="vendor/jquery/jquery-3.2.1.min.js"></script>
        <!--===============================================================================================-->
        <script src="vendor/bootstrap/js/popper.js"></script>
        <script src="vendor/bootstrap/js/bootstrap.min.js"></script>
        <!--===============================================================================================-->
        <script src="vendor/select2/select2.min.js"></script>
        <!--===============================================================================================-->
        <script src="js/main.js"></script>
        <script src="js/Edit.js"></script>
        

        <!-- Global site tag (gtag.js) - Google Analytics -->
        <script async src="https://www.googletagmanager.com/gtag/js?id=UA-23581568-13"></script>
        <script>
            window.dataLayer = window.dataLayer || [];
            function gtag() {
                dataLayer.push(arguments);
            }
            gtag('js', new Date());

            gtag('config', 'UA-23581568-13');
        </script>
        

    </body>
</html>

