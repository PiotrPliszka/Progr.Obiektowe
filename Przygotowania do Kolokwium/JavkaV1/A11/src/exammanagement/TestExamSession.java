package exammanagement;

public class TestExamSession {
    static void main(String[] args) {
        Exam e1 = new Exam(1,"Analiza", 50.5);
        Exam e2 = new Exam(2,"Propabilistyka", 30.1);
        ExamSession s1 = new ExamSession("Piotr", e1, 70);
        ExamSession s2 = new ExamSession("Piotr", e2, 80);
        ExamSession s3 = new ExamSession("Piotr", e1, 70);
        System.out.println(e1);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.hashCode() == s3.hashCode());
    }
}
