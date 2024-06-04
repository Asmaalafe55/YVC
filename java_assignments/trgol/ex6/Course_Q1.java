package trgol.ex6;

import java.util.ArrayList;

public class Course_Q1 {

  private String name;
  private int id;
  private ArrayList students = new ArrayList();
  private final int maxNum = 30;

  public Course_Q1(String name, int id) {
    this.name = name;
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return "Course_Q1 [name=" + name + ", id=" + id + "]";
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + id;
    return result;
  }

  public boolean equals(Course_Q1 course) {
    if (course == null) return false;
    else if (course.getId() == this.id) {
      return true;
    } else {
      return false;
    }
  }

  public void addStudent(Student_Q1 newStudent) {
    if (students.size() < 30) {
      students.add(newStudent);
    }
  }

  public boolean getStudent(int id) {
    for (int i = 0; i < students.size(); i++) {
      Student_Q1 s = (Student_Q1) students.get(i);
      if (s.getId() == id) {
        return true;
      }
    }
    return false;
  }

  public void printStudents() {
    for (int i = 0; i < students.size(); i++) {
      System.out.println(students.get(i));
    }
  }
}
