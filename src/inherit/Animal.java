package inherit;

import com.sun.org.apache.xpath.internal.objects.XString;

public class Animal {
    private String color;
    private int age;
    public Animal(){

    }
    public Animal(String color,int age){
        this.color=color;
        this.age=age;
    }
    public void setColor(String color){
        this.color=color;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getColor(){
        return color;
    }
    public int getAge(){
        return age;
    }
    public void sleep(){
        System.out.println("Sleep");
    }
    public void eat(){
        System.out.println("Eat");
    }
    public void introduce(){
        System.out.println("color="+color+",age="+age);
    }
}
