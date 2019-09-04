package com.xwj.utils;

import com.xwj.entity.City;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MyEnumHandler implements TypeHandler<City>{
    @Override
    public void setParameter(PreparedStatement preparedStatement, int i, City city, JdbcType jdbcType) throws SQLException {
        preparedStatement.setInt(i,city.getCode()+10);
    }
    @Override
    public City getResult(ResultSet resultSet, String s) throws SQLException {
        int i=resultSet.getInt(s)-10;
        return City.getCity(i);
    }
    @Override
    public City getResult(ResultSet resultSet, int i) throws SQLException {
        int j=resultSet.getInt(i)-10;
        return City.getCity(j);
    }
    @Override
    public City getResult(CallableStatement callableStatement, int i) throws SQLException {
        int id=callableStatement.getInt(i)-10;
        return City.getCity(id);
    }
}
