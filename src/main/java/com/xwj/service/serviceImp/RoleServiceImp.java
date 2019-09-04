package com.xwj.service.serviceImp;

import com.xwj.dao.RoleDao;
import com.xwj.entity.Role;
import com.xwj.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RoleServiceImp implements RoleService {
    @Autowired
    RoleDao roleDao;
    @Override
    @Transactional
    public Role getRole(int id) {
        return roleDao.getRole(id);
    }
}
