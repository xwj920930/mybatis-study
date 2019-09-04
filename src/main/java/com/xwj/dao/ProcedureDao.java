package com.xwj.dao;

import com.xwj.entity.Procedure;
import com.xwj.entity.User;
import org.apache.ibatis.annotations.Param;

public interface ProcedureDao {
    void sel(@Param("procedure") Procedure procedure);
}
