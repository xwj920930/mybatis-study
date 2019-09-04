package com.xwj.controller;

import com.xwj.entity.Role;
import com.xwj.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RoleController {
    @Autowired
    RoleService roleService;
    @RequestMapping("/role/getRole")
    @ResponseBody
    public Role getRole(@RequestParam("id") int id){
        System.out.println(roleService.getRole(id).toString());
        return  roleService.getRole(id);
    }
}
