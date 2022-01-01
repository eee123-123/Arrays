package inherit;

public class Test {
    public static void main(String[] args) {
        Dog d=new Dog("黑色",8,"旺财");
        d.eat();
        d.sleep();
        d.introduce();//父类方法无法满足子类，需重写
        d.guard();
    }
}
/*
某些方法用final修饰，无法被重写
静态方法无法被重写，添加@override注解会报错
 */