package ext;

import dao.IDao;
import org.springframework.stereotype.Component;
@Component("daoWS")
public class DaoImplV2 implements IDao {
    @Override
    public double getData() {
        System.out.println("Version web service");
        double d = 66;
        return d;
    }
}





