package com.xwj.entity;

import java.io.Serializable;

/**
 * @Description 测试分表
 * @Author yuki
 * @Date 2018/8/1 9:11
 * @Version 1.0
 **/
public class TBill{
    private int id;
    private String billName;
    private String note;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBillName() {
        return billName;
    }

    public void setBillName(String billName) {
        this.billName = billName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "TBill{" +
                "id=" + id +
                ", billName='" + billName + '\'' +
                ", note='" + note + '\'' +
                '}';
    }
}
