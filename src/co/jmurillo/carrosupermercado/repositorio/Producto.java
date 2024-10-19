package co.jmurillo.carrosupermercado.repositorio;

public abstract class Producto {
    protected String nombre;
    protected double precio;

    public Producto(String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public Double getPrecio() {
        return precio;
    }
}
