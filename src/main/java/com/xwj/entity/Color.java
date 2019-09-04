package com.xwj.entity;

public enum Color {
    RED(1,"红"),
    YELLOW(2,"黄"),
    BLUE(3,"蓝");
    private int code;
    private String name;

    Color(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public static Color getByCode(int code){
        for (Color color : Color.values()) {
            if(color.code==code){
                return color;
            }
        }
        return null;
    }
}
