import com.xwj.dao.ColorDao;
import com.xwj.dao.UserDao;
import com.xwj.entity.City;
import com.xwj.entity.Color;
import com.xwj.entity.ColorSet;
import com.xwj.entity.User;
import com.xwj.utils.DBTools;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class TestColor {
    @Test
    public void get(){
        SqlSession session=DBTools.getSession();
        ColorDao colorDao=session.getMapper(ColorDao.class);
        ColorSet color=colorDao.getColor();
        session.commit();
        System.out.println(color.toString());
    }
}
