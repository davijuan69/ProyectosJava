package FigurasGeo;

import java.security.PublicKey;

public class Figuras {
    protected int alto, ancho;

    public Figuras(){
        this.alto = this.ancho = 0;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }
    public int getAlto(){
        return this.alto;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAncho(){
        return this.ancho;
    }

    public void imprimir(){
        System.out.println("Alto: " + this.alto);
        System.out.println("Ancho: " + this.ancho);
    }

    public void calcularArea(){
        System.out.println("Area no definida");
    }
}
