package basic.designPattern.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MSI-PC on 2018/4/11.
 */
public class Director {
    private List<String > sequence = new ArrayList<String>();
    private MoveKFBuilder moveKFBuilder = new MoveKFBuilder();
    public MoveKF getMoveKF(){
        sequence.clear();
        ///练功，打架 练功 打架 奇遇 无敌手
        //将这些剧情放进sequence中
        sequence.add("1");
        sequence.add("2");
        moveKFBuilder.setSequence(sequence);
        return (MoveKF)moveKFBuilder.getMove();
    }
    //恐布片，鬼杀人， 灵异事件
    public static void main(String[] args) {
        Director director = new Director();
        Move move = director.getMoveKF();
        move.playMove();
    }
}
