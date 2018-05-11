package basic.designPattern.decorator;

/**
 * Created by MSI-PC on 2018/5/11.
 */
public abstract class Book {
    public abstract void readBook();
}
class MathBook extends Book{
    @Override
    public void readBook() {
        System.out.println("读数学书");
    }
}
