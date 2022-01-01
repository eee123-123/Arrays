import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestMap2 {
    public static void main(String[] args) {
        Map<Integer,Student> map=new HashMap<Integer,Student>();
        Student stu1=new Student(1,"a",22,80);
        Student stu2=new Student(2,"b",24,87);
        Student stu3=new Student(3,"c",23,85);
        Student stu4=new Student(4,"d",20,83);
        Student stu5=new Student(5,"e",22,90);
        map.put(stu1.getSno(),stu1);
        map.put(stu2.getSno(),stu2);
        map.put(stu3.getSno(),stu3);
        map.put(stu4.getSno(),stu4);
        map.put(stu5.getSno(),stu5);

        //map.clear();
        //map.remove(3);
        //map.isEmpty();
        System.out.println(map.containsKey(9));


        System.out.println(map.size());
        System.out.println(map.get(3));
        Set<Map.Entry<Integer,Student>> entrySet= map.entrySet();
        Iterator <Map.Entry<Integer,Student>>it=entrySet.iterator();
        while(it.hasNext()) {
            Map.Entry<Integer, Student> entry = it.next();
            System.out.println(entry);
            //Student stu = entry.getValue();
            //System.out.println(stu);
        }
    }
}
