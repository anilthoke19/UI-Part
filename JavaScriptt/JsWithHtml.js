

document.write("Good Morning");


let star=()=>
    {
        let xhttp=new XMLHttpRequest();
    	xhttp.onreadystatechange=function(){
    		 if(this.readyState==4 && this.status==200){
    			 document.getElementById("d").innerHTML=this.responseText;
    		 }
    	};
    	xhttp.open("GET","C:/Users/91913/Downloads/Ratio And Proportion.docx",true)
    	xhttp.send();
    }


    