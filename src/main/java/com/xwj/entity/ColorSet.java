package com.xwj.entity;

/**
 * @Description TODO
 * @Author yuki
 * @Date 2018/8/6 10:01
 * @Version 1.0
 **/
public class ColorSet {
    private Color color;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "ColorSet{" +
                "color=" + color +
                '}';
    }
}
