package com.xwj.dao;

import com.xwj.entity.TFile;
import org.apache.ibatis.annotations.Param;

public interface TFileDao {
    int insertTFile(TFile tFile);

    TFile getTFile(@Param("id") int id);
}
