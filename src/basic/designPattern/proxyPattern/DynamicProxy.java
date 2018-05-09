package basic.designPattern.proxyPattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by MSI-PC on 2018/5/5.
 */
public class DynamicProxy {
    public static <T> T newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h){
        System.out.println("动态即将代理执行");
        return (T) Proxy.newProxyInstance(loader,interfaces,h);
    }
}
