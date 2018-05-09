package basic.designPattern.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MSI-PC on 2018/5/6.
 */
public class Prototype implements Cloneable{
    private Integer ref = 3;
    private int i = 2;
    private ArrayList<String> str = new ArrayList<String>();
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Prototype o = (Prototype) super.clone();
        o.str = (ArrayList<String>)this.str.clone();
        return o;
    }

    public static void main(String[] args) {
        Prototype p = new Prototype();
        p.str.add("1");
        try {
           Prototype t = (Prototype) p.clone();
           t.ref = Integer.valueOf(2);
           t.str.add("clone");
            System.out.println(p.ref+p.str.toString());
            System.out.println(t.ref);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
