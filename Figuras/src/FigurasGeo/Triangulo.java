package FigurasGeo;

public class Triangulo extends Figuras{
    public Triangulo(){
        super();
    }
    public void CalcularArea(){
        super.imprimir();
        System.out.println("el area del triangulo es: " + (alto*ancho)/100);
    }
}
