package basic.designPattern.decorator;

/**
 * Created by MSI-PC on 2018/5/11.
 */
public class Client {
    public static void main(String[] args) {
        Book book = new MathBook();//拿到一本书
        Decorator writeName = new TagBookDecorator(book);//写上自己的名字
        Decorator clothesBook = new MathBookDecorator(writeName);//包上书皮
        //此刻装饰的对象是tag装饰  这个读书方法属于书皮装饰的方法
        clothesBook.readBook();//读书  先弄的书皮，再写的名字
    }
}
