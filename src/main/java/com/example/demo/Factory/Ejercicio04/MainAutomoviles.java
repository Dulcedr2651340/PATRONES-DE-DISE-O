package com.example.demo.Factory.Ejercicio04;

public class MainAutomoviles {
    
    public static void main(String[] args) {
        
            AutomovilFactory automovilFactory = new AutomovilFactory();

    Automovil carro = automovilFactory.listaDeAutomovil("carro");
    Automovil camion = automovilFactory.listaDeAutomovil("camion");

    carro.ventaDeAuto();
    camion.ventaDeAuto();
    }

}
