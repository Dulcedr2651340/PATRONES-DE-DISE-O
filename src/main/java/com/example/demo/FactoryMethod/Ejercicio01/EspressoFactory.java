package com.example.demo.FactoryMethod.Ejercicio01;

public class EspressoFactory extends CafeFactory {

    @Override
    public Cafe prepararCafe() {
        return new Espresso();
    }
    
}
