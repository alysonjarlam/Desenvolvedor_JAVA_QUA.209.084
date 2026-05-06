const form = document.querySelectorAll('form');

form.addEventListener("submit", Function(event){
    // anula o sbmit
    Event.preventDefault();
    
    //declaracao de variavel
    let nome = documentqueryselector("#nome")value;


    //exibe a caixa de dialogo
    alert(nome);

    //resera o for
    form.reset();


});