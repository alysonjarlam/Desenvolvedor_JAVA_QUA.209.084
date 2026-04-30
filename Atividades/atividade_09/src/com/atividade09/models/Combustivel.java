package com.atividade09.models;

import com.atividade09.repository.ICombustivel;


            //classe 
public class Combustivel implements ICombustivel {

    private double etanol;
    private double gasolina;

        //constructor
    public Combustivel(double etanol, double gasolina) {
        this.etanol = etanol;
        this.gasolina = gasolina;
    }
        // getters & setters
    public double getEtanol() {
        return this.etanol;
    }

    public void setEtanol(double etanol) {
        this.etanol = etanol;
    }

    public double getGasolina() {
        return this.gasolina;
    }

    public void setGasolina(double gasolina) {
        this.gasolina = gasolina;
    }
    @Override
    public String melhorCombustivel() {
        //
        return (this.etanol <= 0.7*this.gasolina) ? "Melhor abastecer com etanol " : "Melhor abastecer com gasolina";
    }
    

}
