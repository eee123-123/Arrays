package Interface1;

public class Test {
    public static void main(String[] args) {
        System.out.println(Flyable.pi);
        Bird bird=new Bird();
        fly(bird);
        Flyable plane=new Plane();
        fly(plane);
        Flyable superman=new Superman();
        fly(superman);

    }
    /*形参是一个接口，实参可以是该接口的任意一个实现类的对象*/


    public static void fly(Flyable flyable){
        flyable.fly();
    }
/*
    public void fly(Bird bird){
        bird.fly();
    }

    public void fly(Plane plane){
        plane.fly();
    }

    public void fly(Superman sm){
        sm.fly();
    }
    */
}
