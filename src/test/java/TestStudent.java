import com.xwj.dao.StudentDao;
import com.xwj.entity.Student;
import com.xwj.utils.DBTools;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class TestStudent {
    @Test
    public void getById(){
        SqlSession session=DBTools.getSession();
        StudentDao studentDao=session.getMapper(StudentDao.class);
        Student student=studentDao.getStudentById(1);
        session.commit();
        System.out.println(student.toString());
    }
    @Test
    public void getStudent(){
        SqlSession session=DBTools.getSession();
        StudentDao studentDao=session.getMapper(StudentDao.class);
        List<Student> students=studentDao.getStudent(1);
        session.commit();
        System.out.println(students.toString());
    }
}
