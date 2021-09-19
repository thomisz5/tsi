var copa = new Date("2022,11,21 13:00:00").getTime();

var count = setInterval(function () {
    var hoje = new Date().getTime();
    var diff = copa - hoje;

    var days = Math.floor(diff / (1000 * 60 * 60 * 24));
    var hours = Math.floor((diff % (1000 * 60 * 60 * 24)) / (1000 * 60 * 60));
    var minutes = Math.floor((diff % (1000 * 60 * 60)) / (1000 * 60));
    var seconds = Math.floor((diff % (1000 * 60)) / 1000);

    document.getElementById("copa").innerHTML = "Faltam " + days + " dias, " + hours + " horas, " + minutes + " minutos e " + seconds + " segundos para a próxima Copa do Mundo";

    if (diff < 0) {
        clearInterval(x);
        document.getElementById("copa").innerHTML = "EXPIRADO";
    }
}, 1000);