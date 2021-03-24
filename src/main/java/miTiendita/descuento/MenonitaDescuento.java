package miTiendita.descuento;

import miTiendita.venta.LineaDeDetalle;
import miTiendita.venta.Venta;

public class MenonitaDescuento implements IDesctoStrategy {

    @Override
    public double getDescto(Venta v) {
        double total=0;

        for (LineaDeDetalle a :
                v.getLd()) {
            if(a.getP().getClave()==(1)){
                total+=(a.getCtd()*a.getP().getPunit())*.10;
            }
            if(a.getP().getClave()==(2)){
                total+=(a.getCtd()*a.getP().getPunit())*.10;
            }
            if(a.getP().getClave()==(3)){
                total+=(a.getCtd()*a.getP().getPunit())*.10;
            }
            if(a.getP().getClave()==(5)){
                total+=(a.getCtd()*a.getP().getPunit())*.10;
            }
        }

        return total;
    }
}
