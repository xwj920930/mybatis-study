package com.xwj.designIntercept;

/**
 * @Description TODO
 * @Author yuki
 * @Date 2018/11/29 10:09
 * @Version 1.0
 **/
public class TargetImp implements Target {
    @Override
    public void execute() {
        System.err.println("execute");
    }

    @Override
    public void execute2() {

    }
}
