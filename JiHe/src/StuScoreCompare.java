import java.util.Comparator;

public class StuScoreCompare implements Comparator<Student> {

    @Override
    public int compare(Student stu1,Student stu2) {
        double score1=stu1.getScore();
        double score2=stu2.getScore();
        if(score1>score2){
            return -1;
        }else if (score1<score2){
            return 1;
        }else {
            return stu1.getSno()-stu2.getSno();//相等则按学号
        }
    }
}
