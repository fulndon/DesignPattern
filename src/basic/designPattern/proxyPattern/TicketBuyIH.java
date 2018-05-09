package basic.designPattern.proxyPattern;

import java.io.*;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 代理要做的事
 * Created by MSI-PC on 2018/1/16.
 */
public class TicketBuyIH implements InvocationHandler{
    //被代理的对象
    private Object target;
    public TicketBuyIH(Object target) {
        this.target = target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //proxy 为每一个target生成的代理对象
        Object result = method.invoke(target,args);
        if(method.getName().equalsIgnoreCase("getCar")){
            System.out.println("买到票了");
        }
        return result;
    }
}
