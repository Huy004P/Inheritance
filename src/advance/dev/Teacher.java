package advance.dev;

class Teacher extends Person {
    String teacherId;
    double salaryCoefficient;

    public Teacher(String name, int age, String phoneNumber, String teacherId, double salaryCoefficient) {
        super(name, age, phoneNumber);
        this.teacherId = teacherId;
        this.salaryCoefficient = salaryCoefficient;
    }

    public double tinhLuong() {
        return 1500000 * salaryCoefficient;
    }
}