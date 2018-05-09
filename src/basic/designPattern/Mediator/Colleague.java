package basic.designPattern.Mediator;

/**
 * Created by MSI-PC on 2018/5/6.
 */
public abstract class Colleague {
    protected Mediator mediator;//同事必须有中介

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
}
