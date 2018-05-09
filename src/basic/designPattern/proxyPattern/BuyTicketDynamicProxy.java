package basic.designPattern.proxyPattern;

import java.lang.reflect.InvocationHandler;

/**
 * Created by MSI-PC on 2018/5/5.
 */
public class BuyTicketDynamicProxy extends DynamicProxy {
    public static <T> T newProxyInstance(TicketBuyer ticketBuyer){
        InvocationHandler invocation = new TicketBuyIH(ticketBuyer);
        Class<?> cls = ticketBuyer.getClass();
        return newProxyInstance(cls.getClassLoader(),cls.getInterfaces(),invocation);
    }
}
