package basic.designPattern.proxyPattern;

/**
 * Created by MSI-PC on 2018/5/5.
 */
public class BuyTicketProxy implements TicketBuyerService {
    private TicketBuyerService ticketBuyer;

    public BuyTicketProxy(TicketBuyerService ticketBuyer) {
        this.ticketBuyer = ticketBuyer;
    }
    @Override
    public void getCar() {
        ticketBuyer.getCar();
    }
    @Override
    public void setCount(Integer count) {
        ticketBuyer.setCount(count);
    }
    @Override
    public void setCarIndex(String carIndex) {
        ticketBuyer.setCarIndex(carIndex);
    }
}
