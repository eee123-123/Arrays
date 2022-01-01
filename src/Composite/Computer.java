package Composite;

//代码的组合
public class Computer {
    private Cpu cpu=new Cpu();
    private Memory memory=new Memory();
    private MainBoard mainBoard=new MainBoard();

    public void work(){
        cpu.calc();
        cpu.control();
        memory.store();
        mainBoard.connect();
    }

    public static void main(String[] args) {
        Computer com=new Computer();
        com.work();
    }
}
