package trgol.ex6;

public class Course_Q1 {

  private String name;
  private int id;

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
}
