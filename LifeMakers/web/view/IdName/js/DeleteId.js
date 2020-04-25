var request;
var id;
function Delete()
{
    id = document.getElementById("id").value;
    var url = "../../DeleteVolunteerId";
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
        request.send("id=" + id);
    } catch (e)
    {
        alert("Unable to connect to server");
    }
}
var ID = document.getElementById("ID");
function getInfo() {
    if (this.readyState == 4 && this.status == 200) {
        
        var val = this.responseText;
        if (val == "id") {
            ID.innerHTML = "Invalid ID";
        } else if (val == "notexist") {
            ID.innerHTML = "ID Not Exist";
        }  else if (val == "success") {
            location.replace("../../view/Life Makers.html");
        }
    }
    clear(ID);
}
function clear(x) {
    setTimeout(function () {
        x.innerHTML = "";
    }, 2000);
}