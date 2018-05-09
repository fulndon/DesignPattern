package basic.designPattern.Mediator;

/**
 * Created by MSI-PC on 2018/5/6.
 */
public class ConcreteColleague extends Colleague {
    public ConcreteColleague(Mediator mediator) {
        super(mediator);
    }
    //同事私有
    public void talk(){
        System.out.println("商讨");
    }
    //委拖中介处理
    public void trust(){
        mediator.seeLicense();
    }
}
