package Personajes;

public class Mago extends Personaje{
    String[] hechizos;
    String[] memorizados = new String[4];

    public Mago() {
        super();
        this.memorizados = new String[]{" "," "," "," "};
        this.hechizos = new String[]{"fuego","agua","hielo","penne"};

        if(inteligencia < 17){
            throw new IllegalArgumentException("No puedes ser mago con menos de 17 de inteligencia");
        }
        if(fuerza > 15){
            throw new IllegalArgumentException("No puedes ser mago con mas de 15 de fuerza");
        }
    }

    public Mago(String nombre, String raza, int fuerza, int inteligencia, int HPactual, int HPmaximo, String[] memorizados, String[] hechizos) {
        super(nombre, raza, fuerza, inteligencia, HPactual, HPmaximo);

        this.memorizados = memorizados;
        this.hechizos = hechizos;

        if(inteligencia < 17){
            throw new IllegalArgumentException("No puedes ser mago con menos de 17 de inteligencia");
        }
        if(fuerza > 15){
            throw new IllegalArgumentException("No puedes ser mago con mas de 15 de fuerza");
        }

    }

    public void AprenderHechizo(String hechizo){
        for(int i = 0; i < memorizados.length; i++){
            if(memorizados[i].isEmpty()){
                memorizados[i] = hechizo;
                return;
            }
        }
        System.out.println("No puedes memorizar mas hechizos");
    }

    public void lanzaHechizo(Personaje objetivo) {
        for (int i = 0; i < memorizados.length; i++) {
            if (!memorizados[i].isEmpty()) {
                System.out.println("Lanzando el hechizo: " + memorizados[i] + " sobre " + objetivo.getNombre());
                objetivo.setHPactual(objetivo.getHPactual() - 10);
                memorizados[i] = " ";
                return;
            }
        }
        System.out.println("No hay hechizo memorizado para lanzar.");
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Hechizos memorizados:");
        for (String hechizo : memorizados) {
            System.out.println(hechizo.isEmpty() ? "Vacío" : hechizo);
        }

    }


    

}
