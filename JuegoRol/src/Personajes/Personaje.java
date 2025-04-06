package Personajes;

public class Personaje {
    protected String nombre;
    protected String raza = "Humano, Elfo, Enano, Orco";
    protected int fuerza;
    protected int inteligencia;
    protected int HPactual;
    protected int HPmaximo;

    public Personaje (){
        this.nombre = "Sin nombre";
        this.fuerza = 20;
        this.inteligencia = 20;
        this.HPactual = 100;
        this.HPmaximo = 100;
    }

    public Personaje(String nombre, String raza, int fuerza, int inteligencia, int HPactual, int HPmaximo) {
        this.nombre = nombre;
        this.raza = raza;
        this.fuerza = fuerza;
        this.inteligencia = inteligencia;
        this.HPactual = HPactual;
        this.HPmaximo = HPmaximo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getHPactual() {
        return HPactual;
    }

    public void setHPactual(int HPactual) {
        this.HPactual = HPactual;
    }

    public int getHPmaximo() {
        return HPmaximo;
    }

    public void setHPmaximo(int HPmaximo) {
        this.HPmaximo = HPmaximo;
    }

    public void imprimir() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Raza: " + raza);
        System.out.println("Fuerza: " + fuerza);
        System.out.println("Inteligencia: " + inteligencia);
        System.out.println("HP actual: " + HPactual);
        System.out.println("HP maximo: " + HPmaximo);
    }

}