package pres;

import dao.DaoImpl;
import metier.IMetierImpl;

public class Pres1 {
    public static void main(String[]args) {
        DaoImpl d = new DaoImpl();
        IMetierImpl metier = new IMetierImpl(d);
       // metier.setDao(d);
        System.out.println("RES ="+metier.calcul());
    }

}
