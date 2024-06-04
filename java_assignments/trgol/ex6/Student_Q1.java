package trgol.ex6;

public class Student_Q1 {

  private String name;
  private int id;

  public Student_Q1(String name, int id) {
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
    return "Student_Q1 [name=" + name + ", id=" + id + "]";
  }

  public boolean equals(Student_Q1 student) {
    if (student == null) return false;
    else if (student.getId() == this.id) {
      return true;
    } else {
      return false;
    }
  }
}
