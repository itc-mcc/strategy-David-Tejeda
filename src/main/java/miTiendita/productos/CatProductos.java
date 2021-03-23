package miTiendita.productos;

import java.util.*;

public class CatProductos {
    List<Producto> productos = new ArrayList<Producto>();

    public CatProductos()
    {
        productos.add(new Producto(1, "Leche", 15.50));
        productos.add(new Producto(2, "Crema", 10.00));
        productos.add(new Producto(3, "Mantequilla", 4.50));
        productos.add(new Producto(4, "Jamon", 35.00));
        productos.add(new Producto(5, "Queso", 10.00));
        productos.add(new Producto(6, "Platano", 14.00));
        productos.add(new Producto(7, "Manzana", 13.00));
    }

    public Producto getProducto(int clave)
    {
        return productos.get(clave);
    }
}