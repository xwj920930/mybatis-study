package com.xwj.point;

public class ProxyMain {
    public static void main(String[] args) {
        HelloServiceProxy helloServiceProxy=new HelloServiceProxy();
        HelloService service= (HelloService) helloServiceProxy.bind(new HelloServiceImp());
        service.sayHello("xwj");

        HelloServiceCglib cglib=new HelloServiceCglib();
        HelloServiceImp service1= (HelloServiceImp) cglib.getInstance(new HelloServiceImp());
        service1.sayHello("123");

    }
}
