import java.util.Objects;

public class Student implements Comparable<Student>{
    private int sno;
    private String name;
    private int age;
    private double score;


    public Student(int sno, String name, int age, double score) {
        this.sno = sno;
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public int getSno() {
        return sno;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getScore() {
        return score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return sno == student.sno && age == student.age && Double.compare(student.score, score) == 0 && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sno, name, age, score);
    }

    @Override
    public String toString() {
        return "Student{" +
                "sno=" + sno +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Student other) {
        return -(this.sno-other.sno);
    }
}
