package basic.designPattern.Command;

/**
 * Created by MSI-PC on 2018/5/7.
 */
//派分命令
public class AssignCommand {
    private Command command;//收到的命令
    public void assignCommand(){
        command.execute();
    }
    public void setCommand(Command command){
        this.command = command;
    }
    public static void main(String[] args) {
        AssignCommand assignCommand = new AssignCommand();
        Command command = new ConcreteCommand();
        assignCommand.setCommand(command);
        assignCommand.assignCommand();
    }
}
