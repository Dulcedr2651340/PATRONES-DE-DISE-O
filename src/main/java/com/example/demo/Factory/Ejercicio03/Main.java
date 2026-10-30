package com.example.demo.Factory.Ejercicio03;

public class Main {
    public static void main(String[] args) {
        
        MascotaFactory mascotaFactory = new MascotaFactory();

        Mascota gato = mascotaFactory.hablarConHumano("gato");
        Mascota perro = mascotaFactory.hablarConHumano("perro");

        gato.hacerSonido();
        perro.hacerSonido();
    }
}
