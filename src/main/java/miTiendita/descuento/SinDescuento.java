package miTiendita.descuento;

import miTiendita.venta.Venta;

public class SinDescuento implements IDesctoStrategy {

    @Override
    public double getDescto(Venta v) {
        return 0;
    }    
}
