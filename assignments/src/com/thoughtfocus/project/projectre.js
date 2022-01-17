function validation(){
var firstname = document.getElementById('firstname').value;
var lastname = document.getElementById('lastname').value;
var username = document.getElementById('user').value;
var password = document.getElementById('pass').value;
var contactno = document.getElementById('contactno').value;

if((firstname.length <= 2)|| (firstname.length >20)){
    return false;
}
if((lastname.length <= 2)|| (lastname.length >20)){
    return false;
}
if((username.length <= 2)|| (username.length >20)){
    return false;
}
if((password.length <= 2)|| (password.length >20)){
    return false;
}
if((contactno.length <= 10)|| (firstname.length >12)){
    return false;
}

}