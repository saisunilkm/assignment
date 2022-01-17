let  remove = document.getElementById("remove");
let deleteemp = document.getElementById("delete");
let input = document.getElementById("input");

deleteemp.onclick = function(){
    let keys = Object.keys(localStorage);

    for (let employeeid of keys){
        if (input.value===employeeid){
            localStorage.removeItem(employeeid);
            remove.textContent = "employee deleted";
            remove.style.color = "Blue";

        }
    }
}
