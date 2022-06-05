package _Builder;

public interface StudentBuilder {
  StudentBuilder setName(String name);

  StudentBuilder setAge(int age);

  StudentBuilder setGrade(int grade);

  Student build();
}
