package basic.designPattern.Mediator;

/**
 * Created by MSI-PC on 2018/5/6.
 */
public abstract class Mediator {
    protected ConcreteColleague concreteColleague;
    protected ConcreteColleague concreteColleagueTwo;
    abstract void signAggremeng();//到店签合同
    abstract void seeLicense();//看营业执照
}
