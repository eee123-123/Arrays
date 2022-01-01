import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {
    //Collection、List、Set可以用Iterator遍历，Map不行（实质是未提供Iterator方法）
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        //java.util.ConcurrentModificationException多线程并发错误
//        for(String elem:list){
//            if (elem.equals(elem)){
//                list.remove(elem);
//            }
//        }

        Iterator<String> it=list.iterator();
        while(it.hasNext()){
            String elem= it.next();
            if ("c".equals(elem)){
//                list.remove(elem);
                it.remove();
            }
            System.out.println(elem);
        }
        System.out.println(list);
        //for-each循环遍历集合时，底层使用的是迭代器
        //迭代器只能遍历集合，for-each还能遍历数组
        //for-each遍历集合时不能删除元素，会抛出异常，使用迭代器遍历可以删除
        int [] arr={10,50,30};
        for (int elem:arr) {
            System.out.println(elem);
        }//底层使用for-each实现


    }
}
