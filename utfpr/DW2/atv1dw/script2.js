var repeat, pessoa = [];

while (repeat !== 'n') {
    pessoa.push(prompt('insira seu codigo'));
    repeat = prompt('gostaria de cadastrar mais pessoas? s/n');

    document.write(pessoa + "<br />");
}