package Interface1;

public class Plane extends Machine implements Flyable{

    @Override
    public void fly() {
        System.out.println("飞机在平流层飞行");
    }
}
