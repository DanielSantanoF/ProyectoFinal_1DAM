function calcularAleatorio() {
    numeroAleatorio();
    numeroAleatorio2();
}

function numeroAleatorio() {
    var x = Math.floor((Math.random() * 200) + 50);
    console.log(x)
    document.getElementById("demo").innerHTML = x;
}

function numeroAleatorio2() {
    var x = Math.floor((Math.random() * 500) + 200);
    console.log(x)
    document.getElementById("demo2").innerHTML = x;
}