import com.xwj.dao.CourseDao;
import com.xwj.dao.IdentityCardDao;
import com.xwj.entity.Course;
import com.xwj.entity.IdentityCard;
import com.xwj.utils.DBTools;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class TestCourse {
    @Test
    public void get(){
        SqlSession session=DBTools.getSession();
        CourseDao courseDao=session.getMapper(CourseDao.class);
        Course course=courseDao.getCourse(1);
        session.commit();
        System.out.println(course.toString());
    }
}
