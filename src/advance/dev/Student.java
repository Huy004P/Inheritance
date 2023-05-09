package advance.dev;

class Student extends Person {
    double mathScore;
    double physicsScore;
    double chemistryScore;
    String studentId;
    String className;

    public Student(String name, int age, String phoneNumber, double mathScore, double physicsScore,
            double chemistryScore, String studentId, String className) {
        super(name, age, phoneNumber);
        this.mathScore = mathScore;
        this.physicsScore = physicsScore;
        this.chemistryScore = chemistryScore;
        this.studentId = studentId;
        this.className = className;
    }

    public double diemTrungBinh() {
        return (mathScore + physicsScore + chemistryScore) / 3;
    }
}