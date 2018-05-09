package basic.designPattern.proxyPattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by MSI-PC on 2018/1/17.
 */
public class Client {
    public static void main(String[] args) {
        TicketBuyer bean =  new TicketBuyer("张三");
        TicketBuyerService myProxy = bean.getMyProxy();
        myProxy.getCar();
       // TicketBuyerService ticketBuyerProxy = BuyTicketDynamicProxy.newProxyInstance(bean);
        //ticketBuyerProxy.setCarIndex("1");//哪俩火车
       // ticketBuyerProxy.setCount(2);//几张票
       // ticketBuyerProxy.getCar();//获得火车票

     /*   InvocationHandler invocation = new TicketBuyIH(bean);
        Class<?> cls = bean.getClass();

        // 生成代理实例---1 代理目标的类加载器  代理目标的业务动作  代理类要实现的功能
        TicketBuyerService ticketBuyerProxy =
                (TicketBuyerService) Proxy.newProxyInstance(cls.getClassLoader(),cls.getInterfaces(), invocation);
        ticketBuyerProxy.setCarIndex("1");//哪俩火车
        ticketBuyerProxy.setCount(2);//几张票
        ticketBuyerProxy.getCar();//获得火车票*/
    }
}
