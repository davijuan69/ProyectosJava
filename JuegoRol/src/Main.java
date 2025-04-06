import Personajes.Mago;

public class Main {
    public static void main(String[] args) {
        Mago mago = new Mago("juan", "humano", 10, 20, 100, 100, new String[]{"fuego", "agua", "hielo", "penne"}, new String[]{"fuego", "agua", "hielo", "penne"});
        mago.imprimir();
    }
}