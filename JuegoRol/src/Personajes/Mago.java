package Personajes;

public class Mago extends Personaje{
    String[] memorizados = new String[4];

    public Mago() {
        super();

        if(inteligencia < 17){
            throw new IllegalArgumentException("No puedes ser mago con menos de 17 de inteligencia");
        }
        if(fuerza > 15){
            throw new IllegalArgumentException("No puedes ser mago con mas de 15 de fuerza");
        }
    }

    public Mago(String nombre, String raza, int fuerza, int inteligencia, int HPactual, int HPmaximo) {
        super(nombre, raza, fuerza, inteligencia, HPactual, HPmaximo);

        if(inteligencia < 17){
            throw new IllegalArgumentException("No puedes ser mago con menos de 17 de inteligencia");
        }
        if(fuerza > 15){
            throw new IllegalArgumentException("No puedes ser mago con mas de 15 de fuerza");
        }
    }

    

}
