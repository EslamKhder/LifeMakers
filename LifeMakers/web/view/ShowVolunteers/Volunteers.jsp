<%@page import="Model.Gender"%>
<%@page import="java.util.List"%>
<%@page import="Model.Volunteer"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="style.css" />
    </head>
    <%
        ArrayList<Volunteer> volunteer = (ArrayList<Volunteer>) application.getAttribute("Volunteers");
    %>
    <body>
        <div class="back">
            <%
                if (volunteer.size() == 0) {
            %>
            <div class="NO">NO Volunteers</div>
            <%
            } else {
                int i;
                for (i = 0; i < volunteer.size(); i++) {
                    if (volunteer.get(i).getGender() == Gender.Male) {
            %>
            <div class="card">
                <img src="boy.png" alt="Avatar" style="width:100%">
                <div class="container">
                    <h3><%=volunteer.get(i).getId()%></h3>
                    <h4><b><%=volunteer.get(i).getFname().toUpperCase()%> <%=volunteer.get(i).getLname().toUpperCase()%></b></h4> 
                    <p><%=volunteer.get(i).getAge()%> Years</p> 
                    <p><%=volunteer.get(i).getPhone()%></p> 
                    <p><%=volunteer.get(i).getCity().toUpperCase()%></p> 
                    <p><%=volunteer.get(i).getGender()%></p> 
                    <p><%=volunteer.get(i).getMessage()%></p> 
                </div>
                <button class="bu" onclick="Delete(<%=volunteer.get(i).getId()%>)">Delete</button>
                <button class="bu" onclick="GET(<%=volunteer.get(i).getId()%>)">UPDATE</button>
            </div>
            <%
            } else {

            %>
            <div class="card">
                <img src="gri.png" alt="Avatar" style="width:100%">
                <div class="container">
                    <h3><%=volunteer.get(i).getId()%></h3>
                    <h4><b><%=volunteer.get(i).getFname().toUpperCase()%> <%=volunteer.get(i).getLname().toUpperCase()%></b></h4> 
                    <p><%=volunteer.get(i).getAge()%> Years</p> 
                    <p><%=volunteer.get(i).getPhone()%></p> 
                    <p><%=volunteer.get(i).getCity().toUpperCase()%></p> 
                    <p><%=volunteer.get(i).getGender()%></p> 
                    <p><%=volunteer.get(i).getMessage()%></p>
                </div>
                <button class="bu" onclick="Delete(<%=volunteer.get(i).getId()%>)">Delete</button>
                <button class="bu" onclick="GET(<%=volunteer.get(i).getId()%>)">UPDATE</button>
            </div>
            <%
                        }
                    }
                }
            %>
        </div>
        <script src="GetID.js"></script>
        <script src="DeleteId.js"></script>
    </body>
</html> 

