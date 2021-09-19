var url = window.location.href;
console.log(url);

var altura = window.screen.height;
var largura = window.screen.width;
let altura2 = window.innerHeight;
let largura2 = window.innerWidth;
const TITULO = document.title;


var z = `${largura} ${altura} ${largura2} ${altura2} ${TITULO} ${document.lastModified}`
document.getElementById('div-page').innerHTML = z;


// 
function pixel() {
    var pix = window.prompt('insira a quantidade de pixels na barra de rolagem')
    var scroll = window.scrollTo(0, pix);
    if (pix > 285) {
        pixel();
    }
}
//
function goBack() {
    window.history.back();
}
//
function toUTFPR() {
    var sim = window.confirm('deseja realmente sair da pagina?');
    if (sim == true) {
        window.open("http://semana.tsi.gp.utfpr.edu.br");
    } else {
        window.alert('você não deseja ir');
    }
};