function display(val){

    document.getElementById('result').value += val

    return val

}

function solve(){

    let x = document.getElementById('result').value

    let y = eval(x);

    if(y=="Infinity"){
        alert("Divide by zero not possible");
        document.getElementById('result').value = ''
        return ''
    }

    document.getElementById('result').value = y

    return y

}

function clearScreen(){

    document.getElementById('result').value = ''

}
