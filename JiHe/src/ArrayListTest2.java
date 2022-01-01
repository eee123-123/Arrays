import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();//泛型编程,简单，不再需要强制转换
        list.add(67);//末尾添加
        list.add(45);//集合的元素必须是对象类型，不能是基本数据类型
        list.add(67);//如果要放入，需使用包装类
        list.add(87);//JDK5之后自动装箱
        list.add(2,99);//向中间添加
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(2));


        for (int i = 0; i < list.size(); i++) {
            Integer elem=(Integer) list.get(i);
            System.out.println(elem);
        }

        System.out.println("----------------------");
        for(int elem:list){
            System.out.println(elem);
        }
        System.out.println("-----------------------");

        Iterator<Integer> it=list.iterator();//迭代器
        while(it.hasNext()){
            int elem=it.next();
            System.out.println(elem);
        }

    }
}
