package basic.designPattern.strategy;

/**
 * Created by MSI-PC on 2018/5/14.
 */
public class ADD extends Calculator {
    @Override
    public int exec(int a, int b) {
        return a+b;
    }
}
class SUB extends Calculator{
    @Override
    public int exec(int a, int b) {
        return a-b;
    }
}
