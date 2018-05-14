package basic.designPattern.strategy;

/**
 * Created by MSI-PC on 2018/5/14.
 */
public enum CalculatorContainer {
    ADD("+"){//相当于SUB extends 当前枚举类
        @Override
        public int exec(int a, int b) {
            return a+b;
        }
    },
    SUB("-"){//相当于SUB extends 当前枚举类
        @Override
        public int exec(int a, int b) {
            return a-b;
        }
    };
    String result = "";
    private CalculatorContainer(String result){
       // this.result = result;
    }
    public abstract int exec(int a,int b);

    public static void main(String[] args) {
      int c =  CalculatorContainer.ADD.exec(1,2);
        System.out.println(c);
    }
}
