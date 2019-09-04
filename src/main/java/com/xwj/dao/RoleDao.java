package com.xwj.dao;

import com.xwj.entity.Role;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface RoleDao {
    int insertRole(Role role);

    int updateRole(int i);

    Role getRole(int id);

    int deleteRole(int id,int nomean);

    List<Role> getRoles(@Param("ids") List<Integer> ids);
}
