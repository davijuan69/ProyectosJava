package Personajes;

public class Clerigo extends Personaje{
    String dios;


    public Clerigo() {
        super();
        if(fuerza < 18){
            throw new IllegalArgumentException("No se puede tener la fuerza menor que 18");
        }
        if(inteligencia < 12 || inteligencia > 16){
            throw new IllegalArgumentException("No se puede tener la inteligencia menor que 12 ni mayor que 16");
        }
        this.dios = "";

    }

    public Clerigo(String nombre, String raza, int fuerza, int inteligencia, int HPactual, int HPmaximo, String dios) {
        super(nombre, raza, fuerza, inteligencia, HPactual, HPmaximo);
        this.dios = dios;
        if(fuerza < 18){
            throw new IllegalArgumentException("No se puede tener la fuerza menor que 18");
        }
        if(inteligencia < 12 || inteligencia > 16){
            throw new IllegalArgumentException("No se puede tener la inteligencia menor que 12 ni mayor que 16");
        }

    }

    public void curar(Personaje objetivo){
        if(objetivo.getHPactual() < objetivo.getHPmaximo()) {
            objetivo.setHPactual(objetivo.getHPactual() + 10);
            System.out.println("Se ha curado a " + objetivo.getNombre() + " 10 puntos de vida");
        }else{
            System.out.println("No se puede curar a " + objetivo.getNombre() + " porque tiene la vida llena");
        }
    }

    public void imprimir(){
        super.imprimir();
        System.out.println("Dios: " + dios);
    }



}
