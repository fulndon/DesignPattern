package basic.designPattern.Command;

/**
 * Created by MSI-PC on 2018/5/7.
 */
public abstract class Receiver {
    public abstract void doSomething();
}
class ConcreteReceiver extends Receiver{

    @Override
    public void doSomething() {
        System.out.println("执行者执行任务");
    }
}
