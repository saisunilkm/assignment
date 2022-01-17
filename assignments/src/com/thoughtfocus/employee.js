var employees=[
    {name:'sunil',id:'1',skill:'java',salary:'10000',emailid:'saisunil@thoughtfocus.com'},
    {name:'chaitu',id:'2',skill:'java',salary:'10500',emailid:'chaitu@thoughtfocus.com'},
    {name:'prasad',id:'3',skill:'java',salary:'10450',emailid:'prasad@thoughtfocus.com'},
    {name:'venkatesh',id:'4',skill:'Sql',salary:'10450',emailid:'venkatesh@thoughtfocus.com'},
    {name:'tamil',id:'5',skill:'web',salary:'10600',emailid:'tamil@thoughtfocus.com'},
]
employees.sort();
console.log(employees);
let filter= employees.filter(name=>name.id>3);
console.log(filter);

const numbers = [55,44,28,91,58,60]
numbers.sort();
console.log(numbers)

function info(){
    for(i=0;i<employees.length;i++){
        if(name!=null){
            if(name==employees.name){
            document.getElementById('res').innerHTML='Result'+info;
            }else{
            console.log(employees);
            }
        }
    }
}