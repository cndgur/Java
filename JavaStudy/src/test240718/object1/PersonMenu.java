package test240718.object1;

import java.util.Scanner;

public class PersonMenu {
    private Scanner sc = new Scanner(System.in);
    private PersonController pc = new PersonController();

    public void mainMenu() {
        while (true) {
            int[] countArr = pc.personCount();
            int studentCount = countArr[0]; // 현재 저장된 학생 수
            int employeeCount = countArr[1]; // 현재 저장된 직원 수

            System.out.println("\n=== 메인 메뉴 ===");
            System.out.println("1. 학생 메뉴");
            System.out.println("2. 사원 메뉴");
            System.out.println("9. 종료");
            System.out.print("메뉴 번호 : ");
            int num = sc.nextInt();
            switch (num) {
                case 1:
                    studentMenu();
                    break;
                case 2:
                    employeeMenu();
                    break;
                case 9:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
            }
        }
    }

    public void studentMenu() {
        while (true) {
            System.out.println("\n=== 학생 메뉴 ===");
            System.out.println("1. 학생 추가");
            System.out.println("2. 학생 목록 보기");
            System.out.println("9. 메인으로");
            System.out.print("메뉴 번호 : ");
            int num = sc.nextInt();
            switch (num) {
                case 1:
                    insertStudent();
                    break;
                case 2:
                    printStudents();
                    break;
                case 9:
                    System.out.println("메인 메뉴로 돌아갑니다.");
                    return;
                default:
                    System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
            }
        }
    }

    public void employeeMenu() {
        while (true) {
            System.out.println("\n=== 사원 메뉴 ===");
            System.out.println("1. 사원 추가");
            System.out.println("2. 사원 목록 보기");
            System.out.println("9. 메인으로");
            System.out.print("메뉴 번호 : ");
            int num = sc.nextInt();
            switch (num) {
                case 1:
                    insertEmployee();
                    break;
                case 2:
                    printEmployees();
                    break;
                case 9:
                    System.out.println("메인 메뉴로 돌아갑니다.");
                    return;
                default:
                    System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
            }
        }
    }

    public void insertStudent() {
        while (true) {
            System.out.print("학생 이름 : ");
            String name = sc.next();
            System.out.print("학생 나이 : ");
            int age = sc.nextInt();
            System.out.print("학생 키 : ");
            double height = sc.nextDouble();
            System.out.print("학생 몸무게 : ");
            double weight = sc.nextDouble();
            System.out.print("학생 학년 : ");
            int grade = sc.nextInt();
            System.out.print("학생 전공 : ");
            String major = sc.next();

            pc.insertStudent(name, age, height, weight, grade, major);
            System.out.print("계속해서 추가하시겠습니까? (Y/N): ");
            char ch = sc.next().charAt(0);
            if (ch != 'Y' && ch != 'y') {
                break;
            }
        }
    }

    public void printStudents() {
        Student[] students = pc.printStudents();
        System.out.println("\n=== 등록된 학생 목록 ===");
        for (Student student : students) {
            if (student == null) {
                break;
            }
            System.out.println(student.toString());
        }
    }

    public void insertEmployee() {
        while (true) {
            System.out.print("사원 이름 : ");
            String name = sc.next();
            System.out.print("사원 나이 : ");
            int age = sc.nextInt();
            System.out.print("사원 키 : ");
            double height = sc.nextDouble();
            System.out.print("사원 몸무게 : ");
            double weight = sc.nextDouble();
            System.out.print("사원 연봉 : ");
            int salary = sc.nextInt();
            System.out.print("사원 부서 : ");
            String dept = sc.next();

            pc.insertEmployee(name, age, height, weight, salary, dept);
            System.out.print("계속해서 추가하시겠습니까? (Y/N): ");
            char ch = sc.next().charAt(0);
            if (ch != 'Y' && ch != 'y') {
                break;
            }
        }
    }

    public void printEmployees() {
        Employee[] employees = pc.printEmployees();
        System.out.println("\n=== 등록된 사원 목록 ===");
        for (Employee employee : employees) {
            if (employee == null) {
                break;
            }
            System.out.println(employee.toString());
        }
    }
}
