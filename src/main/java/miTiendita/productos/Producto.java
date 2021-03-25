package miTiendita.productos;

public class Producto {
    int clave;
    String descripcion;
    double punit;
    int ctd;

    Producto(int clave, String descripcion, double punit)
    {
        this.clave = clave;
        this.descripcion = descripcion;
        this.punit = punit;
    }

    public double getPunit()
    {
        return punit;
    }

    public int getCtd()
    {
        return ctd;
    }

    public String toString()
    {
        return descripcion;
    }

    public int getClave() {
        return clave;
    }
}
