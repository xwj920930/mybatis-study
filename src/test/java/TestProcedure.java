import com.xwj.dao.ProcedureDao;
import com.xwj.dao.UserDao;
import com.xwj.entity.City;
import com.xwj.entity.Procedure;
import com.xwj.entity.User;
import com.xwj.utils.DBTools;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class TestProcedure {
    @Test
    public void pro(){
        SqlSession session=DBTools.getSession();
        ProcedureDao procedureDao=session.getMapper(ProcedureDao.class);
        Procedure procedure=new Procedure();
        procedure.setId(1);
        procedureDao.sel(procedure);
        System.out.println(procedure.getName());
    }
}
