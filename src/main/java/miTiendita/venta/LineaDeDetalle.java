package miTiendita.venta;

import miTiendita.productos.Producto;

public class LineaDeDetalle {
    double ctd;
    Producto p;

    public  LineaDeDetalle(Producto p, double ctd)
    {
        this.p = p;
        this.ctd = ctd;
    }
}
