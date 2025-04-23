package models;

public class Boook {
    //Clase que representa a un libro con dos atributos: `name` (nombre del libro) y `year` (año de publicación), 
    //ambos de encapsulamiento privado. Incluye constructor con todos los argurmentos, getters, setters y el método `toString()`.
    private String name;
    private int year;

    public Boook(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Boook [Nombre=" + name + ", Año " + year + "]";
    }

    

    
}
