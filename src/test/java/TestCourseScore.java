import com.xwj.dao.CourseScoreDao;
import com.xwj.entity.CourseScore;
import com.xwj.utils.DBTools;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class TestCourseScore {
    @Test
    public void get(){
        SqlSession session=DBTools.getSession();
        CourseScoreDao courseScoreDao=session.getMapper(CourseScoreDao.class);
        CourseScore courseScore=courseScoreDao.getCourseScore(1);
        session.commit();
        System.out.println(courseScore.toString());
    }
}
