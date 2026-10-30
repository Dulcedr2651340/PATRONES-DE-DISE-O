package com.example.demo.Factory.Ejercicio04;

import com.example.demo.Factory.Ejercicio03.Mascota;

public class AutomovilFactory {
    
    public Automovil listaDeAutomovil(String type){

            if("carro".equalsIgnoreCase(type)){
        return new Carro();
    } else if("Camion".equalsIgnoreCase(type)){
        return new Camion();
    } else{
        return null;
    }

    }
}
