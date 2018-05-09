package basic.designPattern.proxyPattern;

import java.io.Serializable;

/**
 * Created by MSI-PC on 2018/1/17.
 */
class Constants{
     static int getCar = 1;
     static int setCount = 2;
}
public class TicketBuyer implements TicketBuyerService,Serializable
{
    private String carIndex;
    private Integer count;
    private boolean forceProxy = true;
    private TicketBuyerService myProxy;
    public boolean forceProxyRun(){
        boolean execute = false;
        if(forceProxy && myProxy == null){
            System.out.println("请用代理访问");
        }else if(forceProxy){
            System.out.println("走的强制代理逻辑");
            execute = true;
        }else{
            System.out.println("走的普通代理逻辑");
            execute = true;
        }
        return execute;
    }
    @Override
    public void getCar() {
        if(forceProxyRun()){
            System.out.println(carIndex+"号车: "+count+"票");
        }
    }
    public TicketBuyerService getMyProxy(){
        this.myProxy = new BuyTicketProxy(this);
        return myProxy;
    }
    public TicketBuyer(String name) {
        System.out.println(name+"来买票了");
    }

    public void setCarIndex(String carIndex) {
        this.carIndex = carIndex;
    }
    public void setCount(Integer count) {
        this.count = count;
    }
    public String getCarIndex() {
        return carIndex;
    }
    public Integer getCount() {
        return count;
    }
}
