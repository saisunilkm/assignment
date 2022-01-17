function add(){
    let a = parseInt( document.getElementById('box1').value)
    let b = parseInt(document.getElementById('box2').value)
    let total = (a+b);
    document.getElementById('res').innerHTML= 'Result:'+total;
}
function sub(){
    let a = parseInt( document.getElementById('box1').value)
    let b = parseInt(document.getElementById('box2').value)
    let total = (a-b);
    document.getElementById('res').innerHTML= 'Result:'+total;
}
function mul(){
    let a = parseInt( document.getElementById('box1').value)
    let b = parseInt(document.getElementById('box2').value)
    let total = (a*b);
    document.getElementById('res').innerHTML= 'Result:'+total;
}
function div(){
    let a = parseInt( document.getElementById('box1').value)
    let b = parseInt(document.getElementById('box2').value)
    let total = (a/b);
    document.getElementById('res').innerHTML= 'Result:'+total;
}