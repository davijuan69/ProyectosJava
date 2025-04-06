package FigurasGeo;

public class Cuadrado extends Figuras{
    public Cuadrado() {
        super();
    }

    public void CalcularArea() {
        super.imprimir();
        System.out.println("el area de un cuadrado es: " + (alto * ancho));
    }
}
