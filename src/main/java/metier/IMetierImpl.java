package metier;

import dao.IDao;

public class IMetierImpl implements IMetier {

    private IDao dao;
    @Override

   public double calcul() {
        double d =dao.getData();
        double res= d*13;
        return res;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
    public IMetierImpl(IDao dao) {
        this.dao = dao;
    }
}
