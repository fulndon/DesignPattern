package basic.designPattern.Mediator;

/**
 * Created by MSI-PC on 2018/5/6.
 */
public class ConcreteMediator extends Mediator {
    @Override
    void signAggremeng() {
        super.concreteColleague.talk();
    }
    void seeLicense(){
        System.out.println("看营业执照");
    }
}
