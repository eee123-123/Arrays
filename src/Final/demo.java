package Final;

/*常用的final类：System  Math  String等，自定义public final xx xxx(){},其中所有方法变量都不可改变重写啥的
  修饰变量：被final修饰的变量无法被改变，如final int a=10;
  修饰方法：该方法不可被子类重写，但可以被重载,如final void study(){}
  修饰类：修饰的类不可被继承，如public final class xx{}

  final不能修饰构造方法
  final修饰引用数据类型，如final Dog dog=new Dog("kk");,不能变化是引用变量的值（可以理解为地址）,可以变化的是对象的属性
 */

public class demo {
    public static void main(String[] args) {
        System.out.println(Math.random());
        System.out.println(Math.PI);


    }
}
