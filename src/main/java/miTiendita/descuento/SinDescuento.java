package miTiendita.descuento;

import miTiendita.venta.Venta;

public class SinDescuento implements IDesctoStrategy {

    @Override
    public float getDescto(Venta v) {
        // TODO Auto-generated method stub
        System.out.println("Sin descuento...");
        return 0;
    }    
}
