package basic.designPattern.strategy;

/**
 * Created by MSI-PC on 2018/5/14.
 */
public class Container {
    private Calculator calculator;
    public Container(int calculatorType){
        if(calculatorType == 0){
            this.calculator = new SUB();
        }else {
            this.calculator = new ADD();
        }
    }
    public int exec(int a,int b){
      return calculator.exec(a,b);
    }
}
