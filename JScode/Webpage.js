
function RegisterData(){
var name=document.getElementById("username1").value;
var email=document.getElementById("email").value;
var password=document.getElementById("password1").value;

console.log(name+" "+email+" "+password)

}

function loginCheck()
{
//Register username &password
var uname1=document.getElementById("username1").value;
var upassword1=document.getElementById("password1").value;

// login username & password
    var lname2=document.getElementById("username2").value;
    var lpassword2=document.getElementById("password2").value;

    if(uname1==lname2&&upassword1==lpassword2)
    {
console.log("true")
    }else
    {
        console.log("false")
    }
    

  

}