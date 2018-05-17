package basic.test;

/**
 * Created by MSI-PC on 2018/5/14.
 */
class RootMan{
    public void supper(){
        System.out.println("super");
    }
    //和小孩玩游戏
    public Child playChildGame(Child child){
        System.out.println("super_game_child");
        return null;
    }
    //获取药量
    public Parent getDrug(RootMan parent){
        System.out.println("root_6片药");
        return null;
    }
    public RootMan talk(Parent parent){
        System.out.println("parent_"+this.getClass());
        return null;
    }
}
abstract class Parent extends  RootMan{
    public Parent() {
        System.out.println("parent");
    }
    //@Override 报错 不是重写
    public RootMan getDrug(Parent parent){
        System.out.println("parent_4片药");
        return null;
    }
    @Override
    public Parent talk(Parent parent){
        System.out.println("parent_"+this.getClass());
        return null;
    }
    public Child talkParaSmall(Child parent){
        System.out.println("test_child"+this.getClass());
        return null;
    }
}
public class Child extends Parent {
    Child(){
        System.out.println("child");
    }

    //@Override 不是重写加此标识会报错 只有自己类的句柄会调用
    public RootMan getDrug(Child child){
        System.out.println("test_child:1片药");
        return null;
    }
    //@Override
    public Parent talkParaSmall(RootMan parent){
        System.out.println("test_child"+this.getClass());
        return null;
    }
    //对小孩来说，大人就是父母  不是重写
    public RootMan playChildGame(Parent parent){
        System.out.println("test_child");
        return null;
    }
    @Override//真正的重写 返回参数虽不同但也算是 返回结果不能扩大
    public Child talk(Parent parent){
        System.out.println("test_child"+this.getClass());
        return null;
    }

    public static void main(String[] args) {
        //子类实例
        RootMan rootMan = new RootMan();
        Parent parent = new Child();
        Child child = new Child();//小参数
        parent.getDrug(child);//要拿小孩的药量，经果拿到了大人的药量
        parent.getDrug(parent);
        parent.playChildGame(child);//执行的方法从基类开始选择
       // parent.playChildGame(parent); 报错 因为parent是子类特有的方法
        child.talkParaSmall(child);//子类句柄调用 子类方法
        parent.talk(parent);//假大人执行重写的子类方法
        child.talk(parent);//子类方法
    }
}
