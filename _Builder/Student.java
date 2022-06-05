package _Builder;

public class Student {
  private String name;
  private int age;
  private int grade;


  public Student(String name, int age, int grade) {
    this.name = name;
    this.age = age;
    this.grade = grade;
  }


  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return this.age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getGrade() {
    return this.grade;
  }

  public void setGrade(int grade) {
    this.grade = grade;
  }


  @Override
  public String toString() {
    return "{" +
      " name='" + getName() + "'" +
      ", age='" + getAge() + "'" +
      ", grade='" + getGrade() + "'" +
      "}";
  }
  
}
