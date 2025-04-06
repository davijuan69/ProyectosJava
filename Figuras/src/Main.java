import FigurasGeo.*;

public class Main {
    public static void main(String[] args) {
        Figuras obj = new Figuras();
        Triangulo t = new Triangulo();
        Cuadrado c = new Cuadrado();

        obj.setAncho(10);
        obj.setAlto(10);
        obj.imprimir();

        t.setAlto(40);
        t.setAncho(10);
        t.CalcularArea();

        c.setAlto(50);
        c.setAncho(10);
        c.CalcularArea();




    }




}