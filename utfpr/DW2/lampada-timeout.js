document.querySelector("body>img").onclick = function () {
    this.src = "img/griffith.jpg";
    setTimeout(turnOff, 5000);
}

function turnOff() {
    document.querySelector("body>img").src = "img/griffith2.jpg";
}