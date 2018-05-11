package basic.designPattern.decorator;

/**
 * Created by MSI-PC on 2018/5/11.
 */
public abstract class Decorator extends Book{
    private Book book = null;
    public Decorator(Book book) {
        this.book = book;
    }
    @Override
    public void readBook() {
        this.book.readBook();
    }
}
class TagBookDecorator extends Decorator{
    private void selfTagPost(){
        System.out.println("贴上自己的标签");
    }

    @Override
    public void readBook() {
        System.out.println("书的侧面写上自己的名字");
        super.readBook();
    }

    public TagBookDecorator(Book book) {
        super(book);
    }
}
class MathBookDecorator extends Decorator{
    private void bookClothes(){
        System.out.println("给数学书包上书皮");
    }
    public MathBookDecorator(Book book) {
        super(book);
    }
    @Override
    public void readBook() {
        bookClothes();//包上书皮再读书
        super.readBook();
    }
}