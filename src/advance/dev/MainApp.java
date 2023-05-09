package advance.dev;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {
        Person[] persons = new Person[10];

        // Nhập thông tin cho mảng persons
        input(persons);

        // Xuất thông tin cho mảng persons
        print(persons);

        // Tìm giáo viên có lương cao nhất
        Teacher teacher = findTeacher(persons);
        System.out.println("Giáo viên có lương cao nhất: " + teacher.name);
    }

    private static Teacher findTeacher(Person[] persons) {
		// TODO Auto-generated method stub
		return null;
	}

	public static void input(Person[] persons) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < persons.length; i++) {
            System.out.println("Nhập thông tin cho người thứ " + (i + 1));

            System.out.print("Tên: ");
            String name = scanner.nextLine();

            System.out.print("Tuổi: ");
            int age = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Số điện thoại: ");
            String phoneNumber = scanner.nextLine();

            if (i < 4) {
                System.out.print("Mã giáo viên: ");
                String teacherId = scanner.nextLine();

                System.out.print("Hệ số lương: ");
                double salaryCoefficient = scanner.nextDouble();
                scanner.nextLine();

                persons[i] = new Teacher(name, age, phoneNumber, teacherId, salaryCoefficient);
            } else {
                System.out.print("Điểm toán: ");
                double mathScore = scanner.nextDouble();
                scanner.nextLine();

                System.out.print("Điểm lý: ");
                double physicsScore = scanner.nextDouble();
                scanner.nextLine();

                System.out.print("Điểm hóa: ");
                double chemistryScore = scanner.nextDouble();
                scanner.nextLine();

                System.out.print("Mã sinh viên: ");
                String studentId = scanner.nextLine();

                System.out.print("Lớp: ");
                String className = scanner.nextLine();

                persons[i] = new Student(name, age, phoneNumber, mathScore, physicsScore, chemistryScore, studentId,
                        className);
            }
        }

        scanner.close();
    }
    public static void print(Person[] persons) {
        System.out.println("Danh sách các giáo viên");
}
}