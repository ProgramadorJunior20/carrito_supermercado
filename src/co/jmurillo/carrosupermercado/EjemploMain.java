package co.jmurillo.carrosupermercado;

import co.jmurillo.carrosupermercado.genericos.BolsaSupermercado;
import co.jmurillo.carrosupermercado.repositorio.Fruta;
import co.jmurillo.carrosupermercado.repositorio.Limpieza;

public class EjemploMain {
    public static void main(String[] args) {
        BolsaSupermercado<Fruta> bolsaFruta = new BolsaSupermercado<>();
        bolsaFruta.addProducto(new Fruta("Manzana", 1.5, 0.3, "Roja"));
        bolsaFruta.addProducto(new Fruta("Plátano", 0.35, 1.2, "Verde"));
        bolsaFruta.addProducto(new Fruta("Banano", 1.0, 1.22, "Amarillo"));
        bolsaFruta.addProducto(new Fruta("Naraja", 1.2, 0.35, "Naranja"));
        bolsaFruta.addProducto(new Fruta("Pera", 1.3, 0.32, "Verde"));

        BolsaSupermercado<Limpieza> bolsaLimpieza = new BolsaSupermercado<>();
        bolsaLimpieza.addProducto(new Limpieza("Detergente", 3.50, "Quimicos Varios", 1.5));
        bolsaLimpieza.addProducto(new Limpieza("Jábon", 0.50, "Glicerina", 0.5));
        bolsaLimpieza.addProducto(new Limpieza("Desinfectante", 2.8, "Alcohol", 1.0));
        bolsaLimpieza.addProducto(new Limpieza("Limpiavidrios", 2.0, "Amoniaco", 0.75));
        bolsaLimpieza.addProducto(new Limpieza("Suavizante", 3.0, "Fragancia", 2.0));

        // Mostrando el contenido de cada bolsa en consola
        System.out.println("Frutas: ");
        for (Fruta fruta: bolsaFruta.getProductos()){
            System.out.println(fruta.getNombre() + " - Precio: $" + fruta.getPrecio() +
                    " - Peso: " + fruta.getPeso() + "kg - Color: " + fruta.getColor());
        }
    }
}
