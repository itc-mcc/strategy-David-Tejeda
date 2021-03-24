package miTiendita.descuento;

import miTiendita.venta.LineaDeDetalle;
import miTiendita.venta.Venta;

public class EmbutidosLacteos implements IDesctoStrategy {

    @Override
    public double getDescto(Venta v) {
        double total=0;

        for (LineaDeDetalle a :
                v.getLd()) {
            if(a.getP().getClave()==4){
                total+=(a.getCtd()*a.getP().getPunit())*.05;
            }
            if(a.getP().getClave()==(1)){
                total+=(a.getCtd()*a.getP().getPunit())*.15;
            }
            if(a.getP().getClave()==(2)){
                total+=(a.getCtd()*a.getP().getPunit())*.15;
            }
            if(a.getP().getClave()==(3)){
                total+=(a.getCtd()*a.getP().getPunit())*.15;
            }
            if(a.getP().getClave()==(5)){
                total+=(a.getCtd()*a.getP().getPunit())*.15;
            }
        }

        return total;
    }
}
