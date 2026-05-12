const { useCallback } = require("react");

const form = document.querySelector("form");
const maskCpf = document.querySelector("#cpf");
const maskTel = document.querySelector("#telefone");
const maskCep = document.querySelector("#cep");
const pesquisaCep = document.querySelector('#cep');

//máscaras de entrada

maskCpf.addEventListener('input', function() {
    this.value = this.value.replace(/\D/g, '')
    .replace(/(\d{3})(\d)/, '$1.$2')
    .replace(/(\d{3})(\d)/, '$1.$2')
    .replace(/(\d{3})(\d{1,2})$/, '$1-$2');
    
});

maskTel.addEventListener('input', function() {
   this.value = this.value.replace(/\D/g,'')
   .replace(/(\d{2})(\d)/, '($1) $2')
   .replace(/(\d{4,5})(\d)/, '$1-$2')
   .replace(/(\d({4})\d+?$/, '$1');

});

maskCep.addEventListener('input', function() {
    this.value = this.value.replace(/\D/g, '')
    .replace(/(\d{5})(\d)/, '$1-$2')
    .replace(/(-\d{3})\d+?$/, '$1');

});


const limparFormularioCep = () => {
    document.querySelector('#estado').value = ('');
    document.querySelector('#cidade').value = ('');
    document.querySelector('#bairro').value = ('');
    document.querySelector('#logradouro').value = ('');
    document.querySelector('#complemento').value = ('');
}

const meucallback = (conteudo) => {
    if (!("erro" in conteudo)) {
        document.querySelector('#estado').value = (conteudo.estado);
        document.querySelector('#cidade').value = (conteudo.cidade);
        document.querySelector('#bairro').value = (conteudo.bairro);
        document.querySelector('#logradouro').value = (conteudo.logradouro);
        document.querySelector('#complemento').value = (conteudo.complemento);


    }
    else{
    limparFormularioCep();
    alert("cep não encontrado.");
    }
}

pesquisaCep.addEventListener('blur', function(){
    let cep = document.querySelector('#cep').value.replace(/\D/g, '');

    if(cep !=''){
        let validaCep = /^[0-9]{8}$/;

        if (validaCep.test(cep)){
        document.querySelector('#estado').value = "buscando..."
        document.querySelector('#cidade').value = "buscando..."
        document.querySelector('#bairro').value = "buscando..."
        document.querySelector('#logradouro').value = "buscando..."
        document.querySelector('#complemento').value = "buscando..."

        let script = document.createElement('script');

        script.src = 'https://viacep.com.br/ws/' + cep + '/json/? callback=meucallback';

        document.body.appendChild(script);

        }
        else {
            limparFormularioCep();
            alert("Formato do CEP inválido.");
        }
    }
    else{
        limparFormularioCep();
    }
})

form.addEventListener('submit', function(e){
    e.preventDefault();

    let nome = document.querySelector('#nome').value;
    let nome = document.querySelector('#email').value;
    let nome = document.querySelector('#cpf').value;
    let nome = document.querySelector('#telefone').value;
    let nome = document.querySelector('#cep').value;
    let nome = document.querySelector('#estado').value;
    let nome = document.querySelector('#cidade').value;
    let nome = document.querySelector('#bairro').value;
    let nome = document.querySelector('#logradouro').value;
    let nome = document.querySelector('#numero').value;
    let nome = document.querySelector('#complemento').value;

    dados.innerHTML = `<b>Nome:</b> ${nome}<br>
        <b>Nome:</b> ${Nome:}<br>
        <b>E-mail:</b> ${E-mail:}<br>
        <b>CPF:</b> ${CPF:}<br>
        <b>Telefone:</b> ${telefone}<br>
        <b>CEP:</b> ${cep}<br>
        <b>ESTADO:</b> ${estado}<br>
        <b>Cidade:</b> ${Cidade}<br>
        <b>Bairro:</b> ${Bairro}<br>
        <b>Logradouro:</b> ${Logradouro}<br>
        <b>Numero:</b> ${numero}<br>
        <b>Complemento:</b> ${complemento}`;

        form.reset
        

})



