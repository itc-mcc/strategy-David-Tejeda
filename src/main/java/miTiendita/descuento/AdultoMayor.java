package miTiendita.descuento;

import miTiendita.venta.Venta;

public class AdultoMayor implements IDesctoStrategy {
    @Override
    public float getDescto(Venta v) {
        double total = 0;

        for (LineaDeDetalle a : v.getLd()) {
            total+=(a.getCtd()*a.getP().getPutin())*.05;            
        }
        return total;
    }    
}