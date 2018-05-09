package basic.designPattern.template;

/**
 * Created by MSI-PC on 2018/4/10.
 */
public class BuySth extends BuySthTemplate {
    @Override
    public void goToOut() {
        System.out.println("A号人出去了");
    }

    @Override
    public void chat() {
        System.out.println("A号人在聊天");
    }

    @Override
    public void pay() {
        System.out.println("A号人付钱了");
    }

    @Override
    public void gotSth() {
        System.out.println("A号人拿到东西了");
    }

    //不重写该方法，默认是付钱的
    protected boolean needPay(){
        System.out.println("一系列的逻辑判断，不用付钱了");
        return false;
    }
    public static void main(String[] args) {
        BuySth buySth = new BuySth();
        buySth.buySthTem();
    }
}
