const form = document.querySelector("form");

//arrow function
const marioridade = () => {
    //declaracao de variaveis
    let nome = document.querySelector("#nome").value;
    let idade = document.querySelector("#idade").value;

    //saide de dados
    if (idade>= 18 ){
        document.querySelector("result").innerHTML = nome + "é maior de dade";

    }
    else{
        document.querySelector("#result").innerHTML = nome + "é menor de dade.";
    }

    form.reset();

}

//evento
form.addEventListener("submit", function(event) {
    //anular o submit
    event.preventDefault();

    //chama arrow function
    marioridade();

})