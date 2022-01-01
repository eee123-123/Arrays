package InnerClass;

public class OutClass {
    static int num=10;

    class InnerClass{
       int num=20;

        public void method(){
            int num=30;
            System.out.println(OutClass.num);
            System.out.println(this.num);
            System.out.println(num);
        }
    }

    static class Inner{
        static int num=40;

        public void method(){
            //System.out.println(OutClass.this.num);报错
            System.out.println(OutClass.num);
            System.out.println(num);
        }
    }

    public void method(){
        InnerClass in=new InnerClass();
        in.method();
    }
}
