let buttonids = [];
var editbutton;

function createrow(employee,i){
    let tr = document.createElement("tr");
    tableid.appendchild(tr);
    tr.classList.add("tabledata");

    let slno = document.createElement("td");
    let id = document.createElement("td");
    let name= document.createElement("td");
    let department= document.createElement("td");
    let skill = document.createElement("td");
    let salary = document.createElement("td");g
    editbutton = document.createElement("button");

    editbutton.textContent = "edit";
    editbutton.classList.add("editbutton")
    editbutton.setAttribute("id","button"+i);
    buttonids.push(editbutton.id)

    tr.appendChild(slno);
    tr.appendChild(id);
    tr.appendChild(name);
    tr.appendChild(department);
    tr.appendChild(skill);
    tr.appendChild(salary);

    tr.appendChild(editbutton);

    slno.textContent = i;
    id.textContent= employee.employeeid;
    name.textContent=employee.name;
    department.textContent = employee.department;
    skill.textContent = employee.skill;
    salary.textContent=employee.salary;
}
    
    


