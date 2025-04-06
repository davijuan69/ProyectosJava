import Personajes.Mago;
import Personajes.Personaje;

public class Main {
    public static void main(String[] args) {
        Mago mago = new Mago("juan", "humano", 10, 20, 100, 100, new String[]{"", "", "", ""});

        Personaje objetivo = new Personaje("Pedro", "humano", 10, 20, 100, 100);

        mago.imprimir();

        mago.AprenderHechizo("helado");

        mago.lanzaHechizo(objetivo);

        objetivo.imprimir();

        mago.imprimir();

    }
}