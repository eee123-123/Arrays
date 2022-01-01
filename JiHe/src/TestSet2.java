import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestSet2 {
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

    }
}
