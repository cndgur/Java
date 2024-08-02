package test240716.object3;

public class StudentTest {

    public static void main(String[] args) {
        Student[] stu = new Student[3];

        stu[0] = new Student("홍길순", 25, 171, 81, "201401", "영어영문학");
        stu[1] = new Student("한사랑", 23, 183, 72, "201402", "건축학");
        stu[2] = new Student("임꺽정", 26, 175, 65, "201403", "체육학");

        for (Student student : stu) {
            System.out.println(student.toString());
        }
    }

}
