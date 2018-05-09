package basic.designPattern.builder;

import java.util.List;

/**
 * Created by MSI-PC on 2018/4/11.
 */
public abstract class MoveBuilder {
    public abstract void setSequence(List<String> sequence);
    public abstract Move getMove();
}
