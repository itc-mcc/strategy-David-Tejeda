package miTiendita.descuento;

import miTiendita.venta.Venta;

public interface IDesctoStrategy
{
    double getDescto(Venta v);
}