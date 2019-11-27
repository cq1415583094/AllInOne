package com.hz;

public class Client {
    public static void main(String[] args) {
        //正常使用
//        Strategy strategy = new MD5Strategy();
//        strategy.encrypt();

        //看起来好像上面的更简单，可是对于客户端的侧重点是不同的
        //上面的做法是客户端直接让加密算法去加密，并关注加密调用者
        //策略模式是指导一个中间人安装这个算法帮我加密，具体加密过程客户端无需关注
        Context context = new Context(new MD5Strategy());
        context.encrypy();
    }
}