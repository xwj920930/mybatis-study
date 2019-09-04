package com.xwj.dao;

import com.xwj.entity.Color;
import com.xwj.entity.ColorSet;
import com.xwj.entity.User;
import org.apache.ibatis.annotations.Param;

public interface ColorDao {

    ColorSet getColor();
}
