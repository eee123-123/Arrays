import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(67);//末尾添加
        list.add(45);//集合的元素必须是对象类型，不能是基本数据类型
        list.add(67);//如果要放入，需使用包装类
        list.add(87);//JDK5之后自动装箱
        list.add(2,99);//向中间添加
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(2));
        System.out.println(list.contains(66));//是否包含

        ArrayList list2=new ArrayList();
        list2.add(59);
        list2.add(89);
        list.addAll(list2);
        list.remove(new Integer(87));//按照内容删除
        list.remove(1);//按照索引删除
        //list.clear();//清除
        list.set(1,56);//修改

        for (int i = 0; i < list.size(); i++) {
            Integer elem=(Integer) list.get(i);
            System.out.println(elem);
        }

        System.out.println("----------------------");
        for(Object elem:list){
            System.out.println(elem);
        }
        System.out.println("-----------------------");

        Iterator it=list.iterator();//迭代器
        while(it.hasNext()){
            int elem=(int)it.next();
            System.out.println(elem);
        }

    }
}
