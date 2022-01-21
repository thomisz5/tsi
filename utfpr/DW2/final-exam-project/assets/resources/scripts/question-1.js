/* ->O evento de blur no campo nome deve ser usado para validar o nome. Apenas pode conter
    caracteres. Caso seja inválido, apresentar a mensagem em um alert.
->    O evento de blur no campo quantidade deve ser usado para validar se a quantidade realmente é
        um número. Caso seja inválido, apresentar a mensagem em um alert.
->  O total deve ser calculado pelo evento de clique no botão "Calcular Total", considerando a
        existência de um código promocional válido.
->  Ao clicar no botão "Comprar", validar novamente os campos de entrada por meio do evento
                            onsubmit. Mostrar um alerta de sucesso ou falha.*/
$(document).ready(function () {

    const validaNome = () => {
        const regexCaracter = /[A-Za-z]/g;
        let carac = $('#nome-completo-show').val();

        if (!regexCaracter.test(carac)) {
            alert('o valor informado não contem apenas caracteres')
            return false;
        }
        return true;
    }
    $('#nome-completo-show').on('blur', () => validaNome())



    const validaQuantidade = () => {
        let qntd = $('#quantidade-show').val()

        if (isNaN(qntd)) {
            alert('o valor informado não é um numero')
            return false;
        }
        return true;
    }
    $('#quantidade-show').on('blur', () => validaQuantidade())



    $('#calcula-total-show').on('click', function () {
        let qntd = $('#quantidade-show').val()
        const promo = $('#codigo-show').val()
        let total = 0;
        if (promo == 'SRGP') {
            total = (100 * qntd) * 0.9
        } else {
            total = 100 * qntd;
        }
        $('#total-pagar-show').val(total);
        $('#total-pagar-show-label').addClass('active'); //problema no html
    })

    $('#compra').on('submit', function (e) {

        if (validaNome() && validaQuantidade()) {
            alert('Sucesso')
        } else {
            e.preventDefault();
            alert('Falha na compra')
        }
    })


})