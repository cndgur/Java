package test240718.object1;

public class PersonController {
    private Person[] persons = new Person[20]; // 학생과 직원을 모두 담을 배열
    private int studentCount = 0; // 학생 수 카운트 변수
    private int employeeCount = 0; // 직원 수 카운트 변수

    // 학생과 직원의 수를 반환하는 메서드
    public int[] personCount() {
        int[] counts = new int[2]; // 학생 수와 직원 수를 담을 배열 [0] = 학생 수, [1] = 직원 수
        counts[0] = studentCount;
        counts[1] = employeeCount;
        return counts;
    }

    // 새로운 학생을 추가하는 메서드
    public void insertStudent(String name, int age, double height, double weight, int grade, String major) {
        if (studentCount < persons.length) {
            persons[studentCount] = new Student(name, age, height, weight, grade, major);
            studentCount++;
        } else {
            System.out.println("학생 배열이 가득 찼습니다. 더 이상 학생을 추가할 수 없습니다.");
        }
    
    }        
    // 모든 학생을 출력하는 메서드
    public Student[] printStudents() {
        Student[] students = new Student[studentCount];
        for (int i = 0; i < studentCount; i++) {
            students[i] = (Student) persons[i];
        }
        return students;
    }

    // 새로운 직원을 추가하는 메서드
    public void insertEmployee(String name, int age, double height, double weight, int salary, String dept) {
        if (employeeCount < persons.length) {
            persons[studentCount + employeeCount] = new Employee(name, age, height, weight, salary, dept);
            employeeCount++;
        } else {
            System.out.println("직원 배열이 가득 찼습니다. 더 이상 직원을 추가할 수 없습니다.");
        }
    }

    // 모든 직원을 출력하는 메서드
    public Employee[] printEmployees() {
        Employee[] employees = new Employee[employeeCount];
        for (int i = 0; i < employeeCount; i++) {
            employees[i] = (Employee) persons[studentCount + i];
        }
        return employees;
    }
}
