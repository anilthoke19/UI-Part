function countChar()
{
var val=document.getElementById("string2").value;
 
var name=val.split('');
var count=0;
for(let i=0;i<name.length;i++)
{
    if((name[i]>='A'&&name[i]<='Z')||(name[i]>='a' &&name[i]<='z'))
    {
        count++;
    }
   
}

var str=val.trim().split(' ');
var countt=str.length; 
for(var i=0;i<val.size;i++)
{
    if(val(i)===" ")
    {
//countt++;
    }
}

document.getElementById("char").value=count;
document.getElementById('word').value=countt;

}

