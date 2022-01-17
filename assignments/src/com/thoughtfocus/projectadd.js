function savedata(){
let employeeid,name,salary;    
 employeeid= document.getElementById("employeeid").value;
 name= document.getElementById("name").value;
 salary= document.getElementById("salary").value;
 department = document.getElementById("department").value;
 skill = document.getElementById("skill").value;
let data = new Array();
data=JSON.parse(localStorage.getItem("employeedetails"))?JSON.parse(localStorage.getItem("employeedetails")):[];
data.push({
    "employeeid":employeeid,
    "name":name,
    "salary":salary,
    "department":department,
    "skill":skill
    
})
localStorage.setItem('employeedetails',JSON.stringify(data));
}




