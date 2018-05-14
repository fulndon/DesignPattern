package basic.designPattern.strategy;

/**
 * Created by MSI-PC on 2018/5/14.
 */
    public abstract class Calculator {
        public abstract int exec(int a,int b);
        public static void main(String[] args) {
            Container container = new Container(1);
            int result = container.exec(1,2);
            System.out.println(result);
        }
    }
