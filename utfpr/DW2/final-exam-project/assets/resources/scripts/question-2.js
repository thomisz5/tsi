/*
->  O pedido de uma pizza deve ser representado por um objeto pizza.
          
-> O cliente precisa ser representado por um objeto cliente, sendo
            que o objeto pizza deve ter referência ao objeto cliente.
          
->   Os pedidos de pizza precisam ser armazenados em um vetor chamado
            pedidos.
          
-> O vetor pedidos precisa ser armazenado no WebStorage.
          
->O campo telefone precisa ser validado via REGEX e apresentar
            máscara via algum plugin do JQuery.
          
->A página relatório deve listar todos os pedidos de pizza
            armazenados no WebStorage em uma lista ou tabela, devendo
            apresentar os seguintes dados por pizza: tamanho, sabores e nome
            do cliente.
          */
$(document).ready(function () {

    const pizza = {
        tamanho: "",
        preco: 0,
        sabores: [],
        bordaRecheada: false
    }

    const tamanhoPizzaElement = $('#tamanho-pizza');
    const saborPizzaInput = $('#sabor-cliente');
    const adicionaSaborBtn = $('#botao-adiciona-sabor');

    adicionaSaborBtn.addClass('disabled')

    $('#tamanho-pizza').on('change', () => {
        switch (tamanhoPizzaElement.val()) {
            case '1':
                pizza.tamanho = 'Pequena';
                pizza.preco = 20;
                adicionaSaborBtn.removeClass('disabled')
                break;
            case '2':
                pizza.tamanho = 'Média';
                pizza.preco = 25;
                adicionaSaborBtn.removeClass('disabled')
                break;
            case '3':
                pizza.tamanho = 'Grande';
                pizza.preco = 30;
                adicionaSaborBtn.removeClass('disabled')
                break;
            default:
                adicionaSaborBtn.addClass('disabled')
                alert('seleciona um tamanho!')
                return
        }
    })

    adicionaSaborBtn.on('click', () => {
        switch (pizza.tamanho) {
            case 'Pequena':

                if (pizza.sabores.length < 1 && saborPizzaInput.val()) {
                    pizza.sabores.push(saborPizzaInput.val());
                }

                break;
            case 'Média':

                if (pizza.sabores.length < 2 && saborPizzaInput.val()) {
                    pizza.sabores.push(saborPizzaInput.val())
                }

                break;
            case 'Grande':

                if (pizza.sabores.length < 3 && saborPizzaInput.val()) {
                    pizza.sabores.push(saborPizzaInput.val())
                }

                break;
        }
    })

    const validaNome = () => {
        const regexCaracter = /[A-Za-z]/g;
        let carac = $('#nome-cliente').val();

        if (!regexCaracter.test(carac)) {
            alert('o valor informado não contem apenas caracteres')
            return false;
        }
        return true;
    }
    $('#nome-cliente').on('blur', () => validaNome())


    $('#telefone-cliente').mask('0000-0000');
    const validaTelefone = () => {
        const regexTelefone = /[0-9]/;
        let tel = $('#telefone-cliente').val();

        if (!regexTelefone.test(tel)) {

            return false;
        } else {
            return true;
        }
    }
    $('#telefone-cliente').on('load', () => validaTelefone())

    $('#borda-pizza').on('change', () => {
        pizza.bordaRecheada = $('#borda-pizza').is(':checked');
        console.log(pizza);
    })


    $('#botao-envia-pedido').on('click', () => {

        let cliente = {
            nome: $('#nome-cliente').val(),
            telefone: $('#telefone-cliente').val(),
            endereço: $('#endereco-cliente').val(),
        }

        let pedido = {
            cliente,
            pizza
        };

        if (localStorage.getItem('pedidos')) {
            let array = JSON.parse(localStorage.getItem('pedidos'));
            console.log(array);

            array.push(pedido)

            localStorage.setItem('pedidos', JSON.stringify(array));
        } else {
            let array = [];

            array.push(pedido);

            localStorage.setItem('pedidos', JSON.stringify(array));
        }

    })


    let arrayPedidos = localStorage.getItem('pedidos');
    arrayPedidos = JSON.parse(arrayPedidos);

    arrayPedidos.forEach(pedido => {
        console.log(pedido);
        $('#relatorio').append(`<p class="bordered"> Tamanho: ${pedido.pizza.tamanho} - Sabores: ${pedido.pizza.sabores.join(', ')} - Cliente: ${pedido.cliente.nome}`)
    });


})