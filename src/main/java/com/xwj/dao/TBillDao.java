package com.xwj.dao;

import com.xwj.entity.TBill;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface TBillDao {
    TBill getTBill(@Param("year") int year,@Param("id") int id);

    List<TBill> getTBill2018(RowBounds rowBounds);
}
