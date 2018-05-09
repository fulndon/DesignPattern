package basic.designPattern.builder;

import java.util.List;

/**
 * Created by MSI-PC on 2018/4/11.
 */
public class MoveKFBuilder extends MoveBuilder {
    private MoveKF moveKF = new MoveKF();
    @Override
    public void setSequence(List<String> sequence) {
        moveKF.setSequence(sequence);
    }

    @Override
    public Move getMove() {
        return moveKF;
    }
}
