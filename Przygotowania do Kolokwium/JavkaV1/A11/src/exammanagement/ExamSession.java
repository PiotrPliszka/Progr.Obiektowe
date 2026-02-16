package exammanagement;

import java.util.Objects;

public class ExamSession {
    private String studentName;
    private Exam exam;
    private int examScore;

    public ExamSession(String studentName, Exam exam, int examScore) {
        setStudentName(studentName);
        setExam(exam);
        setExamScore(examScore);
    }

    public void setStudentName(String studentName) {
        if (studentName == null){
            this.studentName = "";
        }
        else{
            this.studentName = studentName;
        }
    }

    public void setExam(Exam exam) {
        if (exam == null){
            this.exam = new Exam(0, "", 0.0);
        }
        else {
            this.exam = new Exam(exam);
        }
    }

    public void setExamScore(int examScore) {
        if (examScore < 0){
            this.examScore = 0;
        }
        else{
            this.examScore = examScore;
        }
    }

    public String getStudentName() {
        return studentName;
    }

    public Exam getExam() {
        return new Exam(this.exam);
    }

    public int getExamScore() {
        return examScore;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ExamSession that = (ExamSession) o;
        return getExamScore() == that.getExamScore() && Objects.equals(getStudentName(), that.getStudentName()) && Objects.equals(getExam(), that.getExam());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStudentName(), getExam(), getExamScore());
    }

    @Override
    public String toString() {
        return "ExamSession{" +
                "studentName='" + studentName + '\'' +
                ", exam=" + exam +
                ", examScore=" + examScore +
                '}';
    }
}
