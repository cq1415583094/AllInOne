package com.hz;

public class Client {
    public static void main(String[] args) {
        //作为客户端我们只会从各个平台去买书  很少直接从出版社去买书 整个买书过程与出版社无任何交集
        ProxySubject proxySubject = new ProxySubject(); //代理
        proxySubject.sailBook();
    }
}