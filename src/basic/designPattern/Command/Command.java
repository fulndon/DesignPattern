package basic.designPattern.Command;

/**
 * Created by MSI-PC on 2018/5/7.
 */
public abstract class Command {
    protected final Receiver receiver;

    protected Command(Receiver receiver) {
        this.receiver = receiver;
    }
    public abstract void execute();
}
class ConcreteCommand extends Command{
    //具体命令指定接收者
    protected ConcreteCommand() {
        super(new ConcreteReceiver());
        System.out.println("准备好命令和接收人");
    }
    @Override
    public void execute() {
        super.receiver.doSomething();
    }
}