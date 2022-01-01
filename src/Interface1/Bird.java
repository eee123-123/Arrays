package Interface1;

public class Bird extends Animal implements Flyable{
    @Override
    public void fly() {
        System.out.println("鸟儿在天上飞翔");
    }

}
