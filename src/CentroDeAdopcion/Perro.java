package CentroDeAdopcion;

public class Perro {
    int edad, peso, id;
    String nombre, raza, color;

    public Perro(){

    }
    public Perro (int edad, int peso, int id, String nombre, String raza, String color) {
        this.edad = edad;
        this.peso = peso;
        this.id = id;
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;

    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
