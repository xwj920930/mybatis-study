package com.xwj.entity;

public class MaleStudent extends Student{
    private String male;

    public String getMale() {
        return male;
    }

    public void setMale(String male) {
        this.male = male;
    }

    @Override
    public String toString() {
        return super.toString()+"MaleStudent{" +
                "male='" + male + '\'' +
                '}';
    }
}
