console.log('ggg')

function validate(){
    let user = document.querySelector('.text');
    let password = document.querySelector('.textpass');
    let notification = document.getElementById('#msg');
    let pattern = /@[A-Za-z]{0,9}$/;
    if(user.value===''|| user.length.value<3 || user.length.value>9||password.value===''|| password.value.length<3 || password.value.length>9 ||password.value==(pattern)){
        notification.innerHTML='Not Valid'
        return false;
    }
    return true;

}

