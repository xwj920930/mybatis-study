import com.xwj.dao.TFileDao;
import com.xwj.dao.UserDao;
import com.xwj.entity.City;
import com.xwj.entity.TFile;
import com.xwj.entity.User;
import com.xwj.utils.DBTools;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.*;

public class TestTFile {
    @Test
    public void insert() throws IOException {
        File file=new File("C:\\Users\\yuki\\Documents\\HBuilderProject\\LGH\\test.html");
        InputStream in=new FileInputStream(file);
        ByteArrayOutputStream out=new ByteArrayOutputStream();
        byte[] b=new byte[1024];
        int len=-1;
        while ((len=in.read(b))!=-1){
            out.write(b,0,len);
        }
        byte[] bytes=out.toByteArray();
        in.close();
        out.close();
        SqlSession session=DBTools.getSession();
        TFileDao tFileDao=session.getMapper(TFileDao.class);
        TFile tFile=new TFile();
        tFile.setId(3);
        tFile.setFile(bytes);
        TFile tFile1=new TFile();
        tFile1.setId(4);
        tFile1.setFile(bytes);
        tFileDao.insertTFile(tFile);
        tFileDao.insertTFile(tFile1);
        session.commit();
    }
    @Test
    public void get() throws IOException {
        SqlSession session=DBTools.getSession();
        TFileDao tFileDao=session.getMapper(TFileDao.class);
        TFile tFile=tFileDao.getTFile(1);
        session.commit();
        byte[] bytes=tFile.getFile();
        System.out.println(bytes.length);
        FileOutputStream out=new FileOutputStream(new File("D:\\test.html"));
        out.write(bytes);
    }
}
