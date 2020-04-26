var request;
var id;
function GET(x)
{
    id = x;
    var url = "../../GetVolunteerId";
    if (window.XMLHttpRequest) {
        request = new XMLHttpRequest();
    } else if (window.ActiveXObject) {
        request = new ActiveXObject("Microsoft.XMLHTTP");
    }
    try
    {
        request.onreadystatechange = getInfog;
        request.open("POST", url, true);
        request.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
        request.send("id=" + id);
    } catch (e)
    {
        alert("Unable to connect to server");
    }
}
function getInfog() {
    if (this.readyState == 4 && this.status == 200) {
        
        var val = this.responseText;
        if (val == "success") {
            location.replace("../EditVolunteer/EditVolunteer.jsp");
        }
    }
}