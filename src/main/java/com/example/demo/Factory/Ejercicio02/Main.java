package com.example.demo.Factory.Ejercicio02;

public class Main {
    public static void main(String[] args) {

        FactoryKpop factoryKpop = new FactoryKpop();

        Kpop b1a4 = factoryKpop.agregarGrupo("B1A4");
        Kpop bigbang = factoryKpop.agregarGrupo("BigBang");

        b1a4.escucharGrupo();
        bigbang.escucharGrupo();

    }
}
