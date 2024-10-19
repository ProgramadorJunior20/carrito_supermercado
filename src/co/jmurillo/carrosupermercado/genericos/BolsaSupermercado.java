package co.jmurillo.carrosupermercado.genericos;

import java.util.ArrayList;
import java.util.List;

public class BolsaSupermercado<T> {
    private List<T> productos;
    private static final int MAX_PRODUCTOS = 5;

    public BolsaSupermercado() {
        this.productos = new ArrayList<>();
    }

    public void addProducto(T producto){
        if (productos.size() < MAX_PRODUCTOS){
            productos.add(producto);
        }else {
            System.out.println("La bolsa está llena. No se puede agregar más productos.");
        }
    }

    public List<T> getProductos() {
        return productos;
    }
}
