import java.util.*;

public class CollectionTest {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<Integer>();
        System.out.println(list);
        Collections.addAll(list,15,20,36,98,46);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);
        int index=Collections.binarySearch(list,98);//折半查找，必须有序
        System.out.println(index);

        Collections.max(list);
        Collections.min(list);
        //Collections.fill(list,100);//填充
        //System.out.println(list);
        List list1=new ArrayList();
        Collections.addAll(list1,1,2,3,4,5,6,7,8,9);
        System.out.println(list1);
        Collections.copy(list1,list);
        System.out.println(list1);





    }
}
