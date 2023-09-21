package CentroDeAdopcion;

public class Loro {
    int edad, peso, id;
    String nombre;

    public Loro(){

    }

    public Loro(int edad, int peso, int id, String nombre) {
        this.edad = edad;
        this.peso = peso;
        this.id = id;
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
