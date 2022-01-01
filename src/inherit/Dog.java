package inherit;

public class Dog extends Animal{
    private String nickname;
    public Dog(){
        super();
    }
    public Dog(String color,int age,String nickname){
        super(color,age);
        this.nickname=nickname;
    }
    public void setnickname(String nickname){
        this.nickname=nickname;
    }
    public String getnickname(){
        return nickname;
    }
    public void guard(){
        System.out.println("Dog Guarding...");
    }
    public void introduce(){
        super.introduce();
        System.out.println("nickname="+nickname);
    }
}
