package Interface1;

public interface Flyable {
    //接口中所有变量都是全局静态常量
    /*省略了public static fianl*/double pi=3.14;

    //接口不能new，也没有抽象方法，也不会自动继承某个类

    //接口中所有成员方法都是全局抽象方法
    /*省略了public abstract*/ void fly();

}
