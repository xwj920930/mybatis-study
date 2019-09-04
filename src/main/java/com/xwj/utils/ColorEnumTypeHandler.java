package com.xwj.utils;

import com.xwj.entity.Color;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @Description TODO
 * @Author yuki
 * @Date 2018/8/6 9:34
 * @Version 1.0
 **/
public class ColorEnumTypeHandler implements TypeHandler<Color>{
    @Override
    public void setParameter(PreparedStatement preparedStatement, int i, Color color, JdbcType jdbcType) throws SQLException {
        preparedStatement.setInt(i,color.getCode());
    }

    @Override
    public Color getResult(ResultSet resultSet, String s) throws SQLException {
        int res=resultSet.getInt(s);
        return Color.getByCode(res);
    }

    @Override
    public Color getResult(ResultSet resultSet, int i) throws SQLException {
        int res=resultSet.getInt(i);
        return Color.getByCode(res);
    }

    @Override
    public Color getResult(CallableStatement callableStatement, int i) throws SQLException {
        int res=callableStatement.getInt(i);
        return Color.getByCode(res);
    }
}
