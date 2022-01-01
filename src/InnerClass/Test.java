package InnerClass;

public class Test {
    public static void main(String[] args) {
        //创建一个内部类对象，必须首先创建一个外部类对象
        OutClass o=new OutClass();
        OutClass.InnerClass i=o.new InnerClass();
        i.method();
        OutClass.InnerClass ic=new OutClass().new InnerClass();
        ic.method();
        //就像非静态变量num是属于每个对象一样，非静态成员内部类也是属于每个对象的

        //内部类可以直接访问外部类的成员
        //外部类不能直接访问内部类对象，必须创建对象再通过对象名访问
        //内部类访问外部类同名成员变量：OutClass.this.num

        //静态内部类只能访问外部类的静态成员，不能访问非静态成员

        //创建一个静态内部类对象
        OutClass.Inner in=new OutClass.Inner();
        //就像static的num是属于一个类的，而不是属于某个对象的，静态成员内部类也是属于所属类的
        in.method();
    }
}

