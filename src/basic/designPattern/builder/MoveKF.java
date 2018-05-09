package basic.designPattern.builder;

/**
 * Created by MSI-PC on 2018/4/11.
 */
public class MoveKF extends Move {
    @Override
    protected void insertPreStory() {
        System.out.println("KF式旁白");
    }

    @Override
    protected void insertKillPeople() {
        System.out.println("KF式杀人");
    }

    @Override
    protected void funStory() {
        System.out.println("KF式fun");
    }

    @Override
    protected void fightEveryOne() {
        System.out.println("KF式fight");
    }
}
