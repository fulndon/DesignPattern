package basic.designPattern.template;

/**
 * Created by MSI-PC on 2018/4/10.
 */
public abstract  class BuySthTemplate {
    public abstract void goToOut();
    public abstract void chat();
    public abstract void pay();
    public abstract void gotSth();
    final void buySthTem(){
        this.goToOut();
        this.chat();
        if(needPay()){
            this.pay();
        }
        gotSth();
    }
    protected boolean needPay(){
        return true;
    }
}
