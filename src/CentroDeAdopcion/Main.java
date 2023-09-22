package CentroDeAdopcion;

public class Main {
    public static void main(String[] args) {

        Perro perro1 = new Perro();
        Perro perro2 = new Perro(10, 50, 1, "DOG", "Chiguagua","Blanco");
        perro1.setNombre("firulays");
        System.out.println("El nombre del perro es: " + perro1.getNombre());
        System.out.println("El nombre del perro es: " + perro2.getNombre());

        Gato gato1 = new Gato();
        Gato gato2 = new Gato(8, 30, 2, "CAT", "Angora","Rojo" );
        gato1.setEdad(15);
        System.out.println("La edad del gato 1 es: " + gato1.getEdad());
        System.out.println("El nombre del gato 2 es: " + gato2.getNombre());

        Loro loro1 = new Loro();
        Loro loro2 = new Loro(15, 13, 3, "RINA","Cacique","negro");
        loro1.setPeso(32);
        System.out.println("El peso del loro 1 es: " + loro1.getPeso());
        System.out.println("El nombre del loro 2 es: " + loro2.getId());

    }
}