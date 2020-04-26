var request;
var id;
function Delete(x)
{
    id = x;
    var url = "../../DeleteVolunteerId";
    if (window.XMLHttpRequest) {
        request = new XMLHttpRequest();
    } else if (window.ActiveXObject) {
        request = new ActiveXObject("Microsoft.XMLHTTP");
    }
    try
    {
        request.onreadystatechange = getInfod;
        request.open("POST", url, true);
        request.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
        request.send("id=" + id);
    } catch (e)
    {
        alert("Unable to connect to server");
    }
}
function getInfod() {
    if (this.readyState == 4 && this.status == 200) {
        var val = this.responseText;
        if (val == "success") {
            location.replace("../../view/Life Makers.html");
        }
    }
}