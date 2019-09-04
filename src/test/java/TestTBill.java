import com.xwj.dao.TBillDao;
import com.xwj.dao.TFileDao;
import com.xwj.entity.TBill;
import com.xwj.entity.TFile;
import com.xwj.utils.DBTools;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.*;
import java.util.List;

public class TestTBill {
    @Test
    public void get(){
        SqlSession session=DBTools.getSession();
        TBillDao tBillDao=session.getMapper(TBillDao.class);
        TBill tBill=tBillDao.getTBill(2017,2);
        session.commit();
        System.err.println(tBill.getBillName());
    }
    @Test
    public void getRows(){
        SqlSession session=DBTools.getSession();
        TBillDao tBillDao=session.getMapper(TBillDao.class);
        List<TBill> tBills=tBillDao.getTBill2018(new RowBounds(6,5));
        session.commit();
        System.err.println(tBills.toString());
    }
}
