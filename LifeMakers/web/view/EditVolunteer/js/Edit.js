var request;
var id, fname, lname, age, phone, city, gender, message;
function Edit()
{
    id = document.getElementById("id").value;
    fname = document.getElementById("fname").value;
    lname = document.getElementById("lname").value;
    age = document.getElementById("age").value;
    phone = document.getElementById("phone").value;
    city = document.getElementById("city").value;
    gender = document.getElementById("gender").value;
    message = document.getElementById("message").value;
    var url = "../../UpDateVolunteer";
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
        request.send("id=" + id + "&fname=" + fname + "&lname=" + lname + "&age=" + age + "&phone=" + phone + "&city=" + city + "&gender=" + gender + "&message=" + message);
    } catch (e)
    {
        alert("Unable to connect to server");
    }
}
var ID = document.getElementById("ID"),
        FNAME = document.getElementById("FNAME"),
        LANME = document.getElementById("LANME"),
        AGE = document.getElementById("AGE"),
        PHONE = document.getElementById("PHONE"),
        CITY = document.getElementById("CITY"),
        GENDER = document.getElementById("GENDER"),
        MESSAGE = document.getElementById("MESSAGE");
function getInfo() {
    if (this.readyState == 4 && this.status == 200) {
        var val = this.responseText;
        if (val == "id") {
            ID.innerHTML = "Invalid ID";
            clear(ID);
        } else if (val == "fname") {
            FNAME.innerHTML = "Invalid First Name";
            clear(FNAME);
        } else if (val == "lname") {
            LANME.innerHTML = "Invalid Last Name";
            clear(LANME);
        } else if (val == "age") {
            AGE.innerHTML = "Invalid Age";
            clear(AGE);
        } else if (val == "phone") {
            PHONE.innerHTML = "Invalid Phone";
            clear(PHONE);
        } else if (val == "city") {
            CITY.innerHTML = "Invalid City";
            clear(CITY);
        } else if (val == "gender") {
            GENDER.innerHTML = "Invalid Gender";
            clear(GENDER);
        } else if (val == "success") {
            location.replace("../../view/Life Makers.html");
        } else if (val == "idExist") {
            ID.innerHTML = "ID Exist";
            clear(ID);
        }
    }
}
function clear(x) {
    setTimeout(function () {
        x.innerHTML = "";
    }, 2000);
}