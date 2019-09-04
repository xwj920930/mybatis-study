import com.xwj.dao.RoleDao;
import com.xwj.dao.UserDao;
import com.xwj.entity.City;
import com.xwj.entity.Role;
import com.xwj.entity.User;
import com.xwj.utils.DBTools;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class TestUser {
    @Test
    public void insert(){
        SqlSession session=DBTools.getSession();
        UserDao userDao=session.getMapper(UserDao.class);
        User user=new User(3, City.SC);
        userDao.insertUser(user);
        //session.insert("com.xwj.dao.RoleDao.insertRole",role);
        session.commit();
    }
    @Test
    public void get(){
        SqlSession session=DBTools.getSession();
        UserDao userDao=session.getMapper(UserDao.class);
        User user=userDao.getUser(1);
        session.commit();
        System.out.println(user.toString());
    }
}
