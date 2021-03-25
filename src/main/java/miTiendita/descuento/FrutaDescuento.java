package miTiendita.descuento;

import miTiendita.venta.LineaDeDetalle;
import miTiendita.venta.Venta;

public class FrutaDescuento implements IDesctoStrategy {

    @Override
    public double getDescto(Venta v) {
       double total=0;

        for (LineaDeDetalle a : v.getLd()) {
            if(a.getP().getClave()==(6))
                total+=(a.getCtd()*a.getP().getPunit())*.15;
            
            if(a.getP().getClave()==(7))
                total+=(a.getCtd()*a.getP().getPunit())*.15;

        }   return total;
    }
}
