package zepeda.ricardo.com.ejemplos.models;

/**
 * Created by Titanium on 12/03/16.
 */
public class car {
    int imagen;
    String nombre,descripcion;
    int rating;

    public car(int imagen, String nombre, String descripcion, int rating) {
        this.imagen = imagen;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.rating = rating;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
