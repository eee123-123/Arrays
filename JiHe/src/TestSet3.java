import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
//一般定义外部比较器或者Compare的接口，都是放在TreeSet(即底层实现是红黑树的)才实现
public class TestSet3 {
    public static void main(String[] args) {
        //Set <Student>set=new HashSet<Student>();
        //Set <Student>set=new LinkedHashSet<Student>();
        Set <Student>set=new TreeSet<Student>();
        Student stu1=new Student(1,"a",22,80);
        Student stu2=new Student(2,"b",24,87);
        Student stu3=new Student(3,"c",23,85);
        Student stu4=new Student(4,"d",20,83);
        Student stu5=new Student(5,"e",22,90);
        Student stu6=new Student(1,"a",22,80);
        set.add(stu1);
        set.add(stu2);
        set.add(stu3);
        set.add(stu4);
        set.add(stu5);
        set.add(stu6);
        System.out.println(set.size());
        for(Student stu:set){
            System.out.println(stu);
        }
        System.out.println("--------------------------");
        Comparator comp1=new StuScoreCompare();
        Set <Student>set2=new TreeSet(comp1);
        set2.add(stu1);
        set2.add(stu2);
        set2.add(stu3);
        set2.add(stu4);
        set2.add(stu5);
        set2.add(stu6);
        for(Student stu:set2){
            System.out.println(stu);
        }
        System.out.println("----------------");
//        class StuNameCompare implements Comparator<Student>{
//
//            @Override
//            public int compare(Student stu1, Student stu2) {
//                return stu1.getName().compareTo(stu2.getName());
//            }
//        }
//        Comparator comp2=new StuNameCompare();
        Comparator comp3=new Comparator<Student>() {
            @Override
            public int compare(Student stu1, Student stu2) {
                return stu1.getName().compareTo(stu2.getName());
            }
        };
        Set <Student>set3=new TreeSet(comp3);
        set3.add(stu1);
        set3.add(stu2);
        set3.add(stu3);
        set3.add(stu4);
        set3.add(stu5);
        set3.add(stu6);
        for(Student stu:set3){
            System.out.println(stu);
        }
    }
}
