
function checkEmptyfields()
{
    var fname=document.getElementById("name").value;
    var birth=document.getElementById("birth").value;
    var email=document.getElementById("email").value;
    var mob=document.getElementById("mob").value;
    var picInput=document.getElementById("image-upload");
    var pic=picInput.files[0];

    if(fname=="")
    {
        alert('plz select name');
        document.getElementById("name").focus();
        return true;
    }

    else if(birth=="")
    {
        alert('select birth date');
        document.getElementById("birth").focus();
        return true
    }
    else if(email=="")
    {
alert('Enter email id');
document.getElementById("email").focus();
return true;
    }

    else if(mob=="")
    {
alert('enter mobile number');
document.getElementById("mob").focus();
return true;
    }

    else if(!pic)
    {
        alert('plz select image file ');
        //document.getElementById("image-upload");
        return true;
    }else if(!validateImageUpload())
    {
        return true;
    }
   
    return false;
}




function loadImage() {
    document
    .getElementById("image-upload")
    .addEventListener("change", function (e) {
    // Get the selected file
    const file = e.target.files[0];
    if (file) {
    // Create a FileReader
    const reader = new FileReader();
    // Set a callback function to run when the image is loaded
    reader.onload = function (e) {
    // Get the image data URL
    const imageUrl = e.target.result;
    // Display the image preview
    const imagePreview = document.getElementById("photo");
    imagePreview.innerHTML = `<img src="${imageUrl}" alt="Image
    Preview">`;
    imagePreview.style.width = "80%";
    imagePreview.style.height = "100%";
    };
    // Read the image file as a data URL
    reader.readAsDataURL(file);
    }
    });
    }

// this functio can be used  for to validate the image and its size ,The size is less thsn 2 mb


function validateImageUpload(){
    var imgupload = document.getElementById("image-upload");
    var validExt = ["jpeg","png","jpg"];
    if(imgupload.value !="")
    {
    var imgExt =imgupload.value.substring(imgupload.value.lastIndexOf('.')+1);
    var result=validExt.includes(imgExt);
    if(result==false)
    {
    alert('Selected file is not an image');
    return false;
    }
    else
    {
    if(parseFloat(imgupload.files[0].size/(1024 * 1024))>=2)
    {
    alert('image size must be less then 2MB, The current size of image is ='+imgupload.files[0].size/(1024 * 1024));
    return false;
    }
    }
    }
    else
    {
    alert('No image is selected..');
    return false;
    }
    return true;
    }
    

// write function for adding ow into table

function addRowToTable()
{
var table=document.getElementById('table');
if(!checkEmptyfields())
{
var addNewRow=table.insertRow(table.rows.length),
cell1=addNewRow.insertCell(0),
cell2=addNewRow.insertCell(1),
cell3=addNewRow.insertCell(2),
cell4=addNewRow.insertCell(3),
cell5=addNewRow.insertCell(4),

fname=document.getElementById('name').value,
birth=document.getElementById('birth').value,
email=documet.getElementById('email').value,
mob=document.getElementById('mob').value,

picInput=document.getElementById('image-upload'),
pic=picInput.files[0];

cell1.innerHTML=fname;
cell2.innerHTML=birth;
cell3.innerHTML=email;
cell4.innerHTML=mob;


if(pic)
{
var imagElement=document.createElement('img');
imagElement.src=URL.createObjectURL(pic);
imagElement.style.width="50px";
imagElement.style.height="50px";

cell5.appendChild(imagElement);

}
selectRowInputFields();
}

}




function selectRowInputFields()
{

    var rIndex;
    table1document.getElementBy('table');

    for(var i=1;i<table1.rows.length;i++)
    {
        table.rows[i].onclick=function()
        {
            rIndex=this.rowIndex;
            document.getElementById('name').value=this.cells[0].innerHTML;

            document.getElementById('birth').value=this.cells[1].innerHTML;
            document.getElementById('email').value=this.cells[2].innerHTML;
            document.getElementById('mob').value=this.cells[3].innerHTML;
           var imgElement= document.getElementById('photo').value=this.cells[0].innerHTML;
           imgElement.src=this.cell[4].querySelector('img').src;

        };
    }
}
