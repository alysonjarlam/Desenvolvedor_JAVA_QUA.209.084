const form = document.querySelector("fomr");

const caucularIMC = (peso, altura) => peso / Math.pow(altura, 2); 
  
const exibirDiag = (imc) => (imc < 18.5 )? "Você está abaixo do peso.":
        (imc < 25 ) ? "Você está no peso ideal.":
         (imc < 30 ) ? "Você está acima do peso.":
          (imc < 35 ) ? "Você está obeso.":
           (imc < 40 ) ? "Você está com obesidade mivel II.":
           "Você está com obesidade móbida":;  



form.addEventListener("submit", funtion(e) {
    e.preventDefaut();
    


    let peso = document.querySelector("peso").value.replace(",",".");
    let altura = document.querySelector("altura").value.replace(",",".");
    let imcResult = caucularIMC(peso, altura);

    imc.innerHTML = `seu IMC é ${imcResult.toFixed(2)}`;
    diag.innerHTML = exibirDiag(caucularIMC());

form.reset();

})