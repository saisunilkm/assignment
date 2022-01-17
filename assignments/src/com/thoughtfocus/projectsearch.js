let searchEmp=document.getElementById("searchEmp");
let idfrominput=document.getElementById("idfrominput");
let tableid=document.getElementById("tableid");


function printdetails(employee){
    let tr=document.createElement("tr");
    tableid.appendChild(tr);
    tr.classList.add("tabledata");

    let id= document.createElement("td");
    let name= document.createElement("td");
    let department= document.createElement("td");
    let skill= document.createElement("td");
    let salary= document.createElement("td");

    tr.appendChild(id);
    tr.appendChild(name);
    tr.appendChild(department);
    tr.appendChild(skill);
    tr.appendChild(salary);

    id.textContent=employee.Eid;
    name.textContent=employee.name;
    department.textContent=employee.department;
    skill.textContent=employee.skill;
    salary.textContent=employee.salary;
}

searchEmp.onclick=function(){
    let  keys = Object.keys(localStorage);

    for (let id of keys){
        if(idfrominput.value===id){
            let stringified_obj=localStorage.getItem(id);
            let parsed_obj=JSON.parse(stringified_obj);
                printdetails(parsed_obj);
        }
    }
} 