package trgol.ex5;

public class Student_Q4 {

  private String name;
  private int id;
  private int[] courses;

  public Student_Q4(String name, int id) {
    this.name = name;
    this.id = id;
    courses = new int[5];
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

  public int[] getCourses() {
    return courses;
  }

  public void setCourses(int[] courses) {
    this.courses = courses;
  }

  public void printDetails() {
    System.out.println("Name: " + name);
    System.out.println("ID: " + id);
    System.out.println("Courses: " + courses);
  }

  public void addCourse(int num) {
    for (int i = 0; i < 5; i++) {
      if (courses[i] == 0) {
        courses[i] = num;
      }
    }
  }

  // 343 66 88 0 0
  public void printCoursesAmount() {
    int sumi = 0;
    for (int i = 0; i < 5; i++) {
      if (courses[i] != 0) {
        sumi++;
      }
    }
    System.out.println(
      "The amount of the courses that the student have is :" + sumi
    );
  }
}
