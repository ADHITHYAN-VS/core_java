abstract class StudentEvaluation {
    String studentName;
    int regNo;

    StudentEvaluation(String name, int regNo) {
        this.studentName = name;
        this.regNo = regNo;
    }

    void displayStudent() {
        System.out.println("Student: " + studentName + " | Reg No: " + regNo);
    }

    abstract int calculateTotal();
    abstract void displayGrade();
}

class UGCourseEvaluation extends StudentEvaluation {
    int assignment, internal;

    UGCourseEvaluation(String name, int regNo, int assignment, int internal) {
        super(name, regNo);
        this.assignment = assignment;
        this.internal = internal;
    }

    @Override
    int calculateTotal() {
        return assignment + internal;
    }

    @Override
    void displayGrade() {
        int total = calculateTotal();
        System.out.println("UG Total = " + total + " | Grade: " + (total >= 80 ? "A" : "B"));
    }
}

public class UniversityEvaluation {
    public static void main(String[] args) {
        StudentEvaluation s = new UGCourseEvaluation("Anu", 101, 40, 45);
        s.displayStudent();
        s.displayGrade();
    }
}