import com.xwj.dao.RoleDao;
import com.xwj.entity.Role;
import com.xwj.utils.DBTools;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TestRole {
    @Test
    public void insert(){
        SqlSession session=DBTools.getSession();
        RoleDao roleDao=session.getMapper(RoleDao.class);
        Role role=new Role("xwj","cd");
        int i=roleDao.insertRole(role);
        //session.insert("com.xwj.dao.RoleDao.insertRole",role);
        session.commit();
        System.out.println(role.getId()+"..."+i);
    }
    @Test
    public void update(){
        SqlSession session=DBTools.getSession();
        RoleDao roleDao=session.getMapper(RoleDao.class);
        int i=roleDao.updateRole(48);
        session.commit();
        System.out.println(i);
    }
    @Test
    public void getRole(){
        SqlSession session=DBTools.getSession();
        RoleDao roleDao=session.getMapper(RoleDao.class);
        Role role=roleDao.getRole(2);
        session.commit();
        System.out.println(role.toString());
    }
    @Test
    public void delete(){
        SqlSession session=DBTools.getSession();
        RoleDao roleDao=session.getMapper(RoleDao.class);
        int i=roleDao.deleteRole(57,1);
        session.commit();
        System.out.println(i);
    }
    @Test
    public void getRoles(){
        SqlSession session=DBTools.getSession();
        RoleDao roleDao=session.getMapper(RoleDao.class);
        List<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(3);
        List<Role> role=roleDao.getRoles(list);
        session.commit();
        System.out.println(role.toString());
    }
}
