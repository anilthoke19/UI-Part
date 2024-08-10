
function login()
{
var id=document.getElementById("luser").value;
var pass=document.getElementById("lpass") .value;
var idr=document.getElementById("ruser").value;
var passr=document.getElementById("rpass").value;

if(id==idr&& pass==passr)
{
  

    let name2=document.getElementById("ruser").value;
    let mail=document.getElementById("remail").value;

    document.getElementById("n").innerHTML=name2;
    document.getElementById("e").innerHTML=mail;

    alert("login successful !")
}

}

document.getElementById("check").innerHTML="Hi i am anil";






