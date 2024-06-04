package trgol.ex6;

public class Application_Q1 {

  public static void main(String[] args) {
    Student_Q1 s1 = new Student_Q1("Asma", 23);
    Student_Q1 s2 = new Student_Q1("Laila", 56);

    Course_Q1 course1 = new Course_Q1("math", 928);

    course1.addStudent(s1);
    course1.addStudent(s2);

    course1.printStudents();
  }
}
