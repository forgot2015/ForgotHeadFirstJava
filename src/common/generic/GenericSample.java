package common.generic;

/**
 * Created by forgot on 2017/7/8.
 */
public class GenericSample {
    public static void main(String[] args) {
        GenericSample genericSample = new GenericSample();
        genericSample.print(1);
        genericSample.print(1.2);
        genericSample.print(1.3F);
        genericSample.print("wtf");
        printGeneric(1.3);
    }

    //方法重载的实现方式
    public void print(String s) {
        System.out.println(s);
    }

    public void print(int i) {
        System.out.println(i);
    }

    public void print(float f) {
        System.out.println(f);
    }

    public void print(double d) {
        System.out.println(d);
    }

    //泛型的实现方式
    public static <E> void printGeneric(E e) {
        System.out.println(e);

    }


}