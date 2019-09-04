package com.xwj.point;

public class HelloServiceImp implements HelloService{
    @Override
    public void sayHello(String name) {
        System.out.println("hello "+name);
    }
}
