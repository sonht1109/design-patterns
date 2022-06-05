package _Builder;

/**
 * creational
 * Dùng để xây dựng một đối tượng phức tạp bằng cách sử dụng các đối tượng đơn
 * giản và tiếp cận từng bước
 * Các thành phần chính: Director(Client), Builder, ConcreteBuilder, Product
 */

public class Main {
  public static void main(String[] args) {
    StudentBuilder builder = new ConcreteStudentBuilder();
    builder.setAge(2).setName("Lem");
    System.out.println(builder.build());
  }
}