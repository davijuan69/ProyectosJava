package Main;

import Personajes.Clerigo;
import Personajes.Mago;
import Personajes.Personaje;

public class Main {
    public static void main(String[] args) {
        Mago mago = new Mago("juan", "humano", 10, 20, 100, 100, new String[]{"", "", "", ""});

        Mago mago2 = new Mago("pablo", "orco", 10, 20, 100, 100, new String[]{"", "", "", ""});

        Personaje objetivo = new Personaje("Pedro", "humano", 10, 20, 100, 100);

        Clerigo personaje = new Clerigo("pepe", "humano", 19, 15, 100, 100, "omniman");

        mago.AprenderHechizo("helado");
        mago.AprenderHechizo("fuegardo");

        mago2.AprenderHechizo("helado");

        mago.imprimir();
        mago2.imprimir();

        mago.lanzaHechizo(mago2);
        mago2.lanzaHechizo(mago);

        personaje.curar(mago2);

        mago.lanzaHechizo(mago2);

        personaje.imprimir();
        mago.imprimir();
        mago2.imprimir();






    }
}