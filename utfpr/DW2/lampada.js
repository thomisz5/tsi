var counter = 0;

function toggle(c) {
    //pega o nome do arquivo img
    var imgName = document.querySelector("body>img").src;
    if (imgName.indexOf("griffit2") > 0) {
        document.querySelector("body>imc").src = "img/griffit.png";
    } else {
        document.querySelector("body>img").src = "img/griffit2.png";
    }
    counter++;
    console.log(counter);
    if (counter >= 10) {
        clearInterval(chave);
        document.querySelector("body>img").src = "img/sano.png";
    }
}
chave = setInterval(toggle, 2000);