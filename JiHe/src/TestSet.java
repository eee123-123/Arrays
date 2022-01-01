import java.util.*;

public class TestSet {

    /*
    * HashSet:唯一，无序
    * LinkedHashSet:唯一，有序（添加顺序）
    * TreeSet：唯一，有序（自然顺序）
    *
    * Set相比于父接口Collection，没有增加任何方法，而List却增加了和索引有关的方法
    * 如add(index,elem)、get(index)、remove(index)
    *
    * */
    public static void main(String[] args) {
        //创建一个set对象
//        Set<String> set=new HashSet<String>();
//        Set<String> set=new LinkedHashSet<String>();
        Set<String> set=new TreeSet<String>();

        //添加元素
        set.add("Java");
        set.add("MySQL");
        set.add("JavaEE");
        set.add("SSM");
        set.add("Java");

        System.out.println(set.size());
        System.out.println(set.toString());

        //遍历1
        for (String elem:set) {
            System.out.println(elem);
        }

        //遍历2
        Iterator<String> it=set.iterator();
        while (it.hasNext()){
            String elem=it.next();
            System.out.println(elem);
        }
    }
}
