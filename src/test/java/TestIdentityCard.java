import com.xwj.dao.IdentityCardDao;
import com.xwj.dao.UserDao;
import com.xwj.entity.City;
import com.xwj.entity.IdentityCard;
import com.xwj.entity.User;
import com.xwj.utils.DBTools;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class TestIdentityCard {
    @Test
    public void get(){
        SqlSession session=DBTools.getSession();
        IdentityCardDao identityCardDao=session.getMapper(IdentityCardDao.class);
        IdentityCard card=identityCardDao.getCardByStudentId(1);
        session.commit();
        System.out.println(card.toString());
    }
}
