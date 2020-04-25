var request;
var fname,lname;
function Get()
{
    fname = document.getElementById("fname").value;
    lname = document.getElementById("lname").value;
    var url = "../../GetVolunteerName";
    if (window.XMLHttpRequest) {
        request = new XMLHttpRequest();
    } else if (window.ActiveXObject) {
        request = new ActiveXObject("Microsoft.XMLHTTP");
    }
    try
    {
        request.onreadystatechange = getInfo;
        request.open("POST", url, true);
        request.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
        request.send("fname=" + fname + "&lname=" + lname);
    } catch (e)
    {
        alert("Unable to connect to server");
    }
}
var FNAME = document.getElementById("FNAME"),
    LNAME = document.getElementById("LNAME"),
    NOT = document.getElementById("NOT");
function getInfo() {
    if (this.readyState == 4 && this.status == 200) {
        var val = this.responseText;
        if (val == "success") {
            location.replace("../EditVolunteer/EditVolunteer.jsp");
        } else if (val == "notexist") {
            NOT.innerHTML = "The Name Not Exist";
            clear(NOT);
        }  else if (val == "fname") {
            FNAME.innerHTML = "invalid First Name";
            clear(FNAME);
        }  else if (val == "lname") {
            LNAME.innerHTML = "invalid Last Name";
            clear(LNAME);
        }
    }
    
}
function clear(x) {
    setTimeout(function () {
        x.innerHTML = "";
    }, 2000);
}