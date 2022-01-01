package inherit;

public class Cat extends Animal{
    private double eyesight;
    public Cat(){
        super();
    }
    public Cat(String color,int age,double eyesight){
        super(color,age);
        this.eyesight=eyesight;
    }
    public void seteyesight(double eyesight){
        this.eyesight=eyesight;
    }
    public double geteyesight(){
        return eyesight;
    }
    public void catchfish(){
        System.out.println("Cat Catching Fish...");
    }
}
