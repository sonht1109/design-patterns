package _Builder;

public class ConcreteStudentBuilder implements StudentBuilder {

  private String name;
  private int age;
  private int grade;

  @Override
  public StudentBuilder setName(String name) {
    this.name = name;
    return this;
  }

  @Override
  public StudentBuilder setAge(int age) {
    this.age = age;
    return this;
  }

  @Override
  public StudentBuilder setGrade(int grade) {
    this.grade = grade;
    return this;
  }

  @Override
  public Student build() {
    return new Student(name, age, grade);
  }
  
}
