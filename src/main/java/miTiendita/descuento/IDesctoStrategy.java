package miTiendita.descuento;

import miTiendita.venta.Venta;

public interface IDesctoStrategy
{
    float getDescto(Venta v);
}