const form = document.querySelector("form");

const msg = () => {

    let nome = document.querySelector("nome").value;

    resultado.innerHTML = nome;


}

form.addEventListener("input", function(){
    msg();

});