package com.example.demo.Factory.Ejercicio02;

public class FactoryKpop {
    
    public Kpop agregarGrupo(String type){

    if("b1a4".equalsIgnoreCase(type)){
        return new B1A4();
    } else if("BigBang".equalsIgnoreCase(type)){
        return new BigBang();
    } else {
        return null;
    }

    }

}
