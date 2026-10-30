package com.example.demo.Factory.Ejercicio03;

public class MascotaFactory {
    
    public Mascota hablarConHumano(String type){
        
    if("perro".equalsIgnoreCase(type)){
        return new Perro();
    } else if("gato".equalsIgnoreCase(type)){
        return new Gato();
    } else{
        return null;
    }
    }
}

