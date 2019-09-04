package com.xwj.entity;

public enum City {
    CD("cd",1),SC("sc",2);

    City(String name, int code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", code=" + code +
                '}';
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    private String name;
    private int code;

    public static City getCity(int i){
        if(i==1){
            return City.CD;
        }else {
            return  City.SC;
        }
    }
}
