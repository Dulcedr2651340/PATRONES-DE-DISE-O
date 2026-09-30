package com.example.demo.Factory.Ejercicio01;

public class CafeFactory {
    
    public Cafe prepararCafe(String type){
        
    if ("espresso".equalsIgnoreCase(type)) {
        return new Espresso();
    } else if ("latte".equalsIgnoreCase(type)) {
        return new Latte();
    }
    return null;
    }
}