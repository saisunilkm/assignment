var employees=[
    {name:'sunil',id:'1',skill:'java',salary:'10000',emailid:'saisunil@thoughtfocus.com'},
    {name:'chaitu',id:'2',skill:'java',salary:'10500',emailid:'chaitu@thoughtfocus.com'},
    {name:'prasad',id:'3',skill:'java',salary:'10450',emailid:'prasad@thoughtfocus.com'},
    {name:'venkatesh',id:'4',skill:'Sql',salary:'10450',emailid:'venkatesh@thoughtfocus.com'},
    {name:'tamil',id:'5',skill:'web',salary:'10600',emailid:'tamil@thoughtfocus.com'},
]
console.log(employees);
for(let index in employees)
    console.log(employees[index]);

function sortbyname(a,b){
    let nameA = a.name.toLowerCase();
    let nameB = b.name.toLowerCase();
    if(nameA<nameB)return -1;
    else if(nameA>nameB) return 1;
    return 0;
}
function sortbutton(){
    console.log(employees.sort(sortbyname));
}
