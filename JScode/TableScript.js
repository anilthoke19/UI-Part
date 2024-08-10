
function sum()
{
    var a=1;
    var b=10;
    var summ=0;
   
 for(var i=0;i<b;i++)
 {
    summ=summ+i;
 }
    document.querySelector("#res").value=summ;
}


var student=[1,"anil",3,"thoke"];

for(var i=0;i<student.length;i++)
{
 document.write(student[i]+"<br>");
}
student.push("sunil");
for(var i=0;i<student.length;i++)
{
 document.write(student[i]+"<br>");
}


student.pop();
for(var i=0;i<student.length;i++)
{
 document.write(student[i]+"<br>");
}
