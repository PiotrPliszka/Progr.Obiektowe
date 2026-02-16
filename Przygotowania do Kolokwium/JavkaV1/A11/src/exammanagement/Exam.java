package exammanagement;

import java.util.Objects;

public class Exam {
    private int examId;
    private String examTitle;
    private double passingScore;

    public Exam(int examId, String examTitle, double passingScore) {
        setExamId(examId);
        setExamTitle(examTitle);
        setPassingScore(passingScore);
    }


    public Exam(Exam obj){
        this.examId = obj.examId;
        this.examTitle = obj.examTitle;
        this.passingScore = obj.passingScore;
    }

    public void setExamId(int examId) {
        if (examId < 0){
            this.examId = 0;
        }
        else {
            this.examId = examId;
        }
    }

    public void setExamTitle(String examTitle) {
        if (examTitle == null){
            this.examTitle = "";
        }
        else {
            this.examTitle = examTitle;
        }
    }

    public void setPassingScore(double passingScore) {
        if (passingScore < 0.0){
            this.passingScore = 0.0;
        }
        else{
            this.passingScore = passingScore;
        }
    }

    public int getExamId() {
        return examId;
    }

    public String getExamTitle() {
        return examTitle;
    }

    public double getPassingScore() {
        return passingScore;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Exam exam = (Exam) o;
        return getExamId() == exam.getExamId() && Double.compare(getPassingScore(), exam.getPassingScore()) == 0 && Objects.equals(getExamTitle(), exam.getExamTitle());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getExamId(), getExamTitle(), getPassingScore());
    }

    @Override
    public String toString() {
        return "Exam{" +
                "examId=" + examId +
                ", examTitle='" + examTitle + '\'' +
                ", passingScore=" + passingScore +
                '}';
    }
}
