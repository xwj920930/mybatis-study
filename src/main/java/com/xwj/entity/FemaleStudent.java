package com.xwj.entity;

public class FemaleStudent extends Student {
    private String female;

    public String getFemale() {
        return female;
    }

    public void setFemale(String female) {
        this.female = female;
    }

    @Override
    public String toString() {
        return "FemaleStudent{" +
                "female='" + female + '\'' +
                '}';
    }
}
